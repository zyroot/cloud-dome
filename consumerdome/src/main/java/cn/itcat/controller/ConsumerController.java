package cn.itcat.controller;

import cn.itcat.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Administrator on 2019/2/19.
 */


@RestController
@RequestMapping("/consumer")
//全类，指定熔断方法，
@DefaultProperties(defaultFallback = "queryByIdFallback")
public class ConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private UserFergnClient userFergnClient;


    @GetMapping("/{id}")
//    @HystrixCommand  指定该方法是启动熔断机制的
    @HystrixCommand
    public String queryById(@PathVariable("id")Integer id){
        if(id % 2 == 0){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        User userById = userFergnClient.getUserById(id);
        return userById.toString();
    }

//熔断后降级方法，注意全局时，入参为空。局部时入参和返回值需要与局部方法相同
    public String queryByIdFallback(){
        return  "服务器已饱满！！！0.0";
    }


}

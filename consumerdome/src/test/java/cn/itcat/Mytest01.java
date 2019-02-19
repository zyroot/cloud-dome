package cn.itcat;

import cn.itcat.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2019/2/19.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Mytest01 {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void test01(){
        User user = restTemplate.getForObject("http://localhost:8081/user/1", User.class);
        System.out.println(user.toString());
    }
}

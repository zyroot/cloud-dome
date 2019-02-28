package cn.itcat.controller;

import cn.itcat.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Zy on 2019/2/28.
 */
@FeignClient("user-service")
public interface UserFergnClient {

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable("id")Integer id);
}

package cn.ticast.book.controller;

import cn.ticast.book.pojo.User;
import cn.ticast.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Zy on 2019/2/19.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userMapper;


    @GetMapping("/{id}")
    public User getUser(@PathVariable(name = "id")int id){
        User user = userMapper.getUser(id);
        System.out.println(user.toString());
        return user;
    }
}

package cn.ticast;

import cn.ticast.book.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by Zy on 2019/2/19.
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyTest {

    @Autowired
    private UserService service;

    @Test
    public void test01(){
//        List<User> users = m.selectAll();
//        System.out.println(users.toString());
    }
}

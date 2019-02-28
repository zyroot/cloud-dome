package cn.ticast;

import cn.ticast.book.pojo.User;
import cn.ticast.book.service.UserService;
import io.netty.util.internal.SocketUtils;
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
        User user = service.getUser(1);
        System.out.println(user.toString());
    }

    public static void main(String[] args) {
        int i = 12;
//        System.out.println(i+=i);
//        System.out.println(i);
//        System.out.println(i+=i-=i);
//        System.out.println(i);
//        System.out.println(i+=i-=i*=i);
//        System.out.println(i);
        System.out.println(i*=i);
        System.out.println(i);


    }
}

package cn.ticast.book.service;

import cn.ticast.book.dao.UserDao;
import cn.ticast.book.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Zy on 2019/2/19.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(int i){
        return userDao.getOne(i);
    }
}

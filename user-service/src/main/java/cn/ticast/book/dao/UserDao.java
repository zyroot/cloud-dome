package cn.ticast.book.dao;

import cn.ticast.book.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Zy on 2019/2/19.
 */
public interface UserDao extends JpaRepository<User,Integer>{
}

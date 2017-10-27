package com.lanou.dao.impl;

import com.lanou.dao.UserDao;
import com.lanou.domain.User;
import com.lanou.util.TxQueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * Created by dllo on 17/10/24.
 */
public class UserDaoImpl implements UserDao {
    private TxQueryRunner tqr = new TxQueryRunner();

    @Override
    public User login(User user) {
        //数据库查询
        String sql = "select * from table_user where username=? and password=?";
        Object[] obj = {user.getUsername(),user.getPassword()};
        try {
            return tqr.query(sql, new BeanHandler<>(User.class),obj);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User register(User user) {
        //数据库插入
        String sql = "insert into table_user(username,password,gender,hobbies,email) values(?,?,?,?,?)";
        Object [] obj = {user.getUsername(),user.getPassword(),user.getGender()
                        ,user.getHobbies(),user.getEmail()};
        try {
            int i = tqr.update(sql,obj);
            if (i>0){
                return user;
            }else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

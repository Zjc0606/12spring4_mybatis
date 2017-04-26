package com.zjc.sm.daoimpl;

import com.zjc.sm.dao.UserDao;
import com.zjc.sm.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zjc on 2017/4/26.
 *
 */
public class UserDaoImplTest {
    private ApplicationContext applicationContext;

    //在setUp这个方法得到spring容器
    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testFindUserById() throws Exception {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        //调用userDao的方法
        User user = userDao.findUserById(1);

        System.out.println(user);
    }
}
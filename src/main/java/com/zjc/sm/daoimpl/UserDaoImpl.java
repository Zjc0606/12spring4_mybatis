package com.zjc.sm.daoimpl;


import com.zjc.sm.dao.UserDao;
import com.zjc.sm.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by zjc on 2017/4/19.
 *
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    //SqlSessionDaoSupport有setSqlSessionFactory方法
    public User findUserById(int id) throws Exception {
        //继承SqlSessionDaoSupport，通过 this.getSqlSession()得到sqlSession
        SqlSession sqlSession = this.getSqlSession();
        User user = sqlSession.selectOne("test.findUserById", id);
        return user;
    }


}

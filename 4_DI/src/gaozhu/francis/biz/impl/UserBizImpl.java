package gaozhu.francis.biz.impl;

import gaozhu.francis.biz.UserBiz;
import gaozhu.francis.dao.UserDao;

/**
 * 用户业务逻辑实现
 * @author: FrancisGaozhu
 * @date: 2018/9/11 14:34
 * @mail: francisgaozhu@foxmail.com
 */
public class UserBizImpl implements UserBiz
{
    /**
     * 用户接口
     */
    private UserDao userDao;

    @Override
    public void say()
    {
        userDao.say();
        System.out.println("UserBiz say Hello!");
    }

    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }
}

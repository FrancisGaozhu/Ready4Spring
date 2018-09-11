package gaozhu.francis.dao.impl;

import gaozhu.francis.dao.UserDao;

/**
 * 用户实现类
 * @author: FrancisGaozhu
 * @date: 2018/9/11 13:40
 * @mail: francisgaozhu@foxmail.com
 */
public class UserDaoImpl implements UserDao
{
    @Override
    public void say()
    {
        System.out.println("userDao say hello Word!");
    }
}

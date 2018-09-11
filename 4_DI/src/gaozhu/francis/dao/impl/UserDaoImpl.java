package gaozhu.francis.dao.impl;

import gaozhu.francis.dao.UserDao;

/**
 * 用户数据访问层接口实现类
 * @author: FrancisGaozhu
 * @date: 2018/9/11 14:37
 * @mail: francisgaozhu@foxmail.com
 */
public class UserDaoImpl implements UserDao
{

    @Override
    public void say()
    {
        System.out.println("UserDao say hello!");
    }
}

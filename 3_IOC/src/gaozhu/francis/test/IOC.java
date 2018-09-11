package gaozhu.francis.test;

import gaozhu.francis.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 控制反转的展示示例
 * @author: FrancisGaozhu
 * @date: 2018/9/11 13:29
 * @mail: francisgaozhu@foxmail.com
 */
public class IOC
{

    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.say();
    }

}

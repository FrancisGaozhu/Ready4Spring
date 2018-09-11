package gaozhu.francis.test;

import gaozhu.francis.biz.UserBiz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入的展示
 * @author: FrancisGaozhu
 * @date: 2018/9/11 14:29
 * @mail: francisgaozhu@foxmail.com
 */
public class DIDemo
{

    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserBiz userBiz = (UserBiz)applicationContext.getBean("userBiz");
        userBiz.say();
    }

}

package gaozhu.francis.test;

import gaozhu.francis.model.Bean3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 展示通过实例化工厂创建一个Bean的方式
 * @author: FrancisGaozhu
 * @date: 2018/9/11 15:15
 * @mail: francisgaozhu@foxmail.com
 */
public class CreateByFactory
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean3 bean3 = (Bean3)applicationContext.getBean("bean3");
        System.out.println(bean3);
    }
}

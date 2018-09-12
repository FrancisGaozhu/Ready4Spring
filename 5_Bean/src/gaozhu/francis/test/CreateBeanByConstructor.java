package gaozhu.francis.test;

import gaozhu.francis.model.Bean1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 构造器实例化的代码演示
 * @author: FrancisGaozhu
 * @date: 2018/9/11 15:03
 * @mail: francisgaozhu@foxmail.com
 */
public class CreateBeanByConstructor
{

    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean1 = (Bean1)applicationContext.getBean("bean1");
        System.out.println(bean1);
    }

}
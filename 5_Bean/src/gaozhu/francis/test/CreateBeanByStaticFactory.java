package gaozhu.francis.test;

import gaozhu.francis.model.Bean2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 通过静态工厂实例化Bean的展示代码
 * @author: FrancisGaozhu
 * @date: 2018/9/11 15:13
 * @mail: francisgaozhu@foxmail.com
 */
public class CreateBeanByStaticFactory
{

    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 bean2 = (Bean2)applicationContext.getBean("bean2");
        System.out.println(bean2);
    }


}


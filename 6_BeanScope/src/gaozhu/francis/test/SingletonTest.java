package gaozhu.francis.test;

import gaozhu.francis.model.SingletonScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * singleton作用域的展示
 * @author: FrancisGaozhu
 * @date: 2018/9/12 9:13
 * @mail: francisgaozhu@foxmail.com
 */
public class SingletonTest
{

    public static void main(String[] args)
    {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SingletonScope singletonTest1 = (SingletonScope)applicationContext.getBean("singletonScope");
        SingletonScope singletonTest2 = (SingletonScope)applicationContext.getBean("singletonScope");

        /*
        从如下的代码中，你会发现两行输出语句的内容完全一样，这意味着两次获取的Bean来自于同一个对象的引用。
         */

        System.out.println(singletonTest1);
        System.out.println(singletonTest2);

    }

}

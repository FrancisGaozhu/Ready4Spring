package gaozhu.francis.test;

import gaozhu.francis.model.PrototypeScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 原型作用域的代码示例
 * @author: FrancisGaozhu
 * @date: 2018/9/12 9:29
 * @mail: francisgaozhu@foxmail.com
 */
public class PrototypeTest
{

    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        PrototypeScope prototypeScope1 = (PrototypeScope)applicationContext.getBean("prototypeScope");
        PrototypeScope prototypeScope2 = (PrototypeScope)applicationContext.getBean("prototypeScope");

        /*
        从如下的输出语句中，你会发现输出的两条内容并不相同，这意味着两次所获取的Bean分别是两个对象。
         */
        System.out.println(prototypeScope1);
        System.out.println(prototypeScope2);
    }

}

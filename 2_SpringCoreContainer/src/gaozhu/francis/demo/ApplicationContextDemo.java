package gaozhu.francis.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 创建上下文实例的展示
 * @author: FrancisGaozhu
 * @date: 2018/9/11 11:40
 * @mail: francisgaozhu@foxmail.com
 */
@SuppressWarnings("unused")
public class ApplicationContextDemo
{
    public static void main(String[] args)
    {
        /*
        创建上下文对象的方法有两种，其实不难理解。
        Spring容器的配置文件可以在项目的构建路径范围内，百分之90以上的项目都会这么做。
        但是如果希望Spring容器配置文件放在其他的人和物理路径也没有任何问题。
         */

        //如果配置文件放置于其他任何物理路径下，那么这样创建上下文对象。双引号中的内容是配置文件路径
        ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("");

        //如果配置文件放置于当前项目的构架目录范围内，那么可以通过这种方式创建上下文对象。双引号中放置配置文件路径。
        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("");
    }
}

package gaozhu.francis.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Spring核心容器之BeanFacotry
 * @author: FrancisGaozhu
 * @date: 2018/9/11 11:16
 * @mail: francisgaozhu@foxmail.com
 */
public class BeanFactoryDemo
{
    public static void main(String[] args)
    {
        /*
        这里即将展示的是创建一个BeanFactory的方法，BeanFactory在实际开发工作中使用到的几率不超过百分之五。所以了解即可。
        下文代码中的双引号内容为配置文件的物理路径
         */
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource(""));//如此创建了一个BeanFactory对象。
    }
}

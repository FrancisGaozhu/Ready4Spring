package gaozhu.francis.factory;

import gaozhu.francis.model.Bean2;

/**
 * Bean静态工厂
 * @author: FrancisGaozhu
 * @date: 2018/9/11 15:10
 * @mail: francisgaozhu@foxmail.com
 */
public final class BFactory
{
    /**
     * 创建Bean2方法
     * @return 对象
     */
    public static Bean2 getBean()
    {
        return new Bean2();
    }
}

package cn.hxw.jof.study.factory.factory;

/**
 * 工厂模式扩展性提高了
 * 但是不能解决产品族与产品等级问题
 * Created by huangxiaowei on 2018/4/19.
 */
public class Client {

    public static void main(String[] args) {
        IFactory af = new FactoryA();
        IFactory bf = new FactoryB();
        IFactory cf = new FactoryC();

        af.producePrd().showMyName();
        bf.producePrd().showMyName();
        cf.producePrd().showMyName();
    }
}

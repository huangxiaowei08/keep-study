package cn.hxw.jof.study.factory.abstractfactory;

/**
 * Created by huangxiaowei on 2018/4/19.
 */
public class Client {
    public static void main(String[] args) {
        IFactory bf= new FactoryBeijing();
        bf.produceBike().showBikeName();
        bf.produceTV().showTVName();

        IFactory sf = new FactoryShanghai();
        sf.produceBike().showBikeName();
        sf.produceTV().showTVName();
    }

}

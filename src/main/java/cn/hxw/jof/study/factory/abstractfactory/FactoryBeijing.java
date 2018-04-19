package cn.hxw.jof.study.factory.abstractfactory;

/**
 * Created by huangxiaowei on 2018/4/19.
 */
public class FactoryBeijing implements IFactory{
    @Override
    public IBike produceBike() {
        return new BeijingBike();
    }

    @Override
    public ITV produceTV() {
        return new BeijingTV();
    }
}

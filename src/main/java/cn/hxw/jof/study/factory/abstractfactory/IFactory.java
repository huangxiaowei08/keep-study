package cn.hxw.jof.study.factory.abstractfactory;

import cn.hxw.jof.study.factory.IProduct;

/**
 * 抽象工厂，解决产品族的问题
 * Created by huangxiaowei on 2018/4/19.
 */
public interface IFactory {
    IBike produceBike();
    ITV produceTV();
}

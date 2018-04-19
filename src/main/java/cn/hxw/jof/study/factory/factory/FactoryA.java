package cn.hxw.jof.study.factory.factory;

import cn.hxw.jof.study.factory.IProduct;
import cn.hxw.jof.study.factory.ProductA;

/**
 * Created by huangxiaowei on 2018/4/19.
 */
public class FactoryA implements IFactory{
    @Override
    public IProduct producePrd() {
        return new ProductA();
    }
}

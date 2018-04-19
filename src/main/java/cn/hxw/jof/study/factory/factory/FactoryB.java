package cn.hxw.jof.study.factory.factory;

import cn.hxw.jof.study.factory.IProduct;
import cn.hxw.jof.study.factory.ProductB;

/**
 * Created by huangxiaowei on 2018/4/19.
 */
public class FactoryB implements IFactory {

    @Override
    public IProduct producePrd() {
        return new ProductB();
    }
}

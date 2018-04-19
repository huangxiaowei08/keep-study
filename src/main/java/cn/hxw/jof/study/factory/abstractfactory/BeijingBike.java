package cn.hxw.jof.study.factory.abstractfactory;

import cn.hxw.jof.study.factory.IProduct;

/**
 * Created by huangxiaowei on 2018/4/19.
 */
public class BeijingBike implements IBike{
    @Override
    public void showBikeName() {
        System.out.println("I am BeijingBike");
    }
}

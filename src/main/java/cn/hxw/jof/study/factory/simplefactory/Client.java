package cn.hxw.jof.study.factory.simplefactory;

import cn.hxw.jof.study.factory.IProduct;

/**
 * Created by huangxiaowei on 2018/4/19.
 */
public class Client {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        IProduct prdA = simpleFactory.producePrd("A");
        IProduct prdB = simpleFactory.producePrd("B");
        IProduct prdC = simpleFactory.producePrd("C");
        simpleFactory.producePrd("D");

        prdA.showMyName();
        prdB.showMyName();
        prdC.showMyName();
    }
}

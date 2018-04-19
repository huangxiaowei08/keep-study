package cn.hxw.jof.study.factory.simplefactory;

import cn.hxw.jof.study.factory.IProduct;
import cn.hxw.jof.study.factory.ProductA;
import cn.hxw.jof.study.factory.ProductB;
import cn.hxw.jof.study.factory.ProductC;

/**
 * 简单工厂
 * 解耦 需求 工厂 产品
 * 缺点：扩展性差，比如如果要增加D产品，就需要调整代码，所以耦合性还是高
 * Created by huangxiaowei on 2018/4/19.
 */
public class SimpleFactory {

    // 产品编码
    private String prdNO;

    /**
     * 构造方法传参
     */
    public SimpleFactory(){
        this.prdNO = prdNO;
    }

    /**
     * 生产产品
     * @param prdNO
     */
    public IProduct producePrd(String prdNO){
        IProduct prd = null;
        switch (prdNO){
            case "A":
                prd = new ProductA();
                break;
            case "B":
                prd = new ProductB();
                break;
            case "C":
                prd = new ProductC();
                break;
            default:
                System.out.println("我是简单共产，还不能生产产品"+prdNO);
        }
        return prd;
    }
}

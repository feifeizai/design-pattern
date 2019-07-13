package com.xhf.pattern.abstractfactory.test;

import com.xhf.pattern.abstractfactory.bean.TV;
import com.xhf.pattern.abstractfactory.factory.AbstractFactory;
import com.xhf.pattern.abstractfactory.factory.HairFactory;

/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-7-13 22:20
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {

        AbstractFactory hairFactory = new HairFactory();

        TV tv = hairFactory.createTV();
        tv.watch();
    }
}

package com.xhf.pattern.factorymethod.test;

import com.xhf.pattern.factorymethod.bean.Animal;
import com.xhf.pattern.factorymethod.factory.DogFactory;
import com.xhf.pattern.factorymethod.factory.IFactory;

/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-7-13 22:06
 */
public class FactoryMethodTest {
    public static void main(String[] args) {

        IFactory factory = new DogFactory();

        Animal animal = factory.create();
        animal.cry();
    }
}

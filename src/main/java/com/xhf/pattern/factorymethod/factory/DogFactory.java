package com.xhf.pattern.factorymethod.factory;

import com.xhf.pattern.factorymethod.bean.Animal;
import com.xhf.pattern.factorymethod.bean.Dog;

/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-7-13 22:05
 */
public class DogFactory implements IFactory{
    public Animal create() {
        return new Dog();
    }
}

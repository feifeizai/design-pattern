package com.xhf.pattern.factorymethod.factory;

import com.xhf.pattern.factorymethod.bean.Animal;
import com.xhf.pattern.factorymethod.bean.Cat;

/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-7-13 22:06
 */
public class CatFactory implements IFactory {
    public Animal create() {
        return new Cat();
    }
}

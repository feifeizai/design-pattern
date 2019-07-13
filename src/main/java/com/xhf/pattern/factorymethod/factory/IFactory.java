package com.xhf.pattern.factorymethod.factory;

import com.xhf.pattern.factorymethod.bean.Animal;

/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-7-13 22:03
 */
public interface IFactory {
    public Animal create();
}

package com.xhf.pattern.abstractfactory.factory;

import com.xhf.pattern.abstractfactory.bean.Conditioner;
import com.xhf.pattern.abstractfactory.bean.TV;

/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-7-13 22:17
 */
public interface AbstractFactory {

    public TV createTV();

    public Conditioner createConditioner();

}

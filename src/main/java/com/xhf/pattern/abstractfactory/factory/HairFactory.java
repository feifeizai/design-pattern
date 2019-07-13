package com.xhf.pattern.abstractfactory.factory;

import com.xhf.pattern.abstractfactory.bean.Conditioner;
import com.xhf.pattern.abstractfactory.bean.HairConditioner;
import com.xhf.pattern.abstractfactory.bean.HairTV;
import com.xhf.pattern.abstractfactory.bean.TV;

/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-7-13 22:19
 */
public class HairFactory implements AbstractFactory {
    public TV createTV() {
        return new HairTV();
    }

    public Conditioner createConditioner() {
        return new HairConditioner();
    }
}

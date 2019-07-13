package com.xhf.pattern.abstractfactory.factory;

import com.xhf.pattern.abstractfactory.bean.Conditioner;
import com.xhf.pattern.abstractfactory.bean.MiConditioner;
import com.xhf.pattern.abstractfactory.bean.MiTV;
import com.xhf.pattern.abstractfactory.bean.TV;

/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-7-13 22:18
 */
public class MiFactory implements AbstractFactory {
    public TV createTV() {
        return new MiTV();
    }

    public Conditioner createConditioner() {
        return new MiConditioner();
    }
}

package com.xhf.pattern.simplefactory.factory;

import com.xhf.pattern.simplefactory.bean.Human;

/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-7-13 21:50
 */
public class SimpleFactory {

    public static Human create(Class clazz){

        try {
            Human o = (Human)clazz.newInstance();
            return o;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}

package com.xhf.pattern.abstractfactory.bean;

/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-7-13 22:16
 */
public class HairConditioner implements Conditioner {
    public void open() {
        System.out.println("打开hair空调");
    }
}

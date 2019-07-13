package com.xhf.pattern.abstractfactory.bean;

/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-7-13 22:15
 */
public class GreeConditioner implements Conditioner {
    public void open() {
        System.out.println("打开Gree空调");
    }
}

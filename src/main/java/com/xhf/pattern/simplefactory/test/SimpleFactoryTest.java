package com.xhf.pattern.simplefactory.test;

import com.xhf.pattern.simplefactory.bean.Human;
import com.xhf.pattern.simplefactory.bean.Man;
import com.xhf.pattern.simplefactory.bean.Woman;
import com.xhf.pattern.simplefactory.factory.SimpleFactory;

/**
 * @author 谢红飞
 * @Title:
 * @Package
 * @Description:
 * @date 2019-7-13 21:55
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {

        Human human = SimpleFactory.create(Woman.class);
        human.work();

    }
}

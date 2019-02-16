package main.adapter.clazz;

import main.adapter.Adaptee;
import main.adapter.Target;

/**
 * Author : axiao
 * Description : 类适配器模式
 * User : axiao
 * Date : Created in 2019/2/16 16:57
 * Modified By :
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.requestA();
    }
}

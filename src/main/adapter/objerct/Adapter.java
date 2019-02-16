package main.adapter.objerct;

import main.adapter.Adaptee;
import main.adapter.Target;

/**
 * Author : axiao
 * Description : 对象适配器
 * User : axiao
 * Date : Created in 2019/2/16 16:47
 * Modified By :
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.requestA();
    }
}

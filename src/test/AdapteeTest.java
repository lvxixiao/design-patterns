package test;

import main.adapter.Adaptee;
import main.adapter.objerct.Adapter;
import main.adapter.Target;

/**
 * Author : axiao
 * Description :
 * User : axiao
 * Date : Created in 2019/2/16 16:52
 * Modified By :
 */
public class AdapteeTest {

    public static void main(String[] args) {
        // 需要被适配的对象
        Adaptee adaptee = new Adaptee();
        // 适配器
        Adapter adapter = new Adapter(adaptee);
        request(adapter);

        // 类适配器模式
        main.adapter.clazz.Adapter cAdapter = new main.adapter.clazz.Adapter();
        request(cAdapter);
    }

    public static void request(Target target) {
        target.request();
    }
}

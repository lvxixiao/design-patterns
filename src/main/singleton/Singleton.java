package main.singleton;

/**
 * Author : axiao
 * Description : 静态内部类单例模式(懒加载)
 * User : axiao
 * Date : Created in 2019/2/15 19:55
 * Modified By :
 */
public class Singleton {

    private Singleton() {}

    public static Singleton getInstance() {
        return Singleton.SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }
}

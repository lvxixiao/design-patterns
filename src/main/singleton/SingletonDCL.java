package main.singleton;

/**
 * Author : axiao
 * Description : 双重检查模式(DCL)
 * User : axiao
 * Date : Created in 2019/2/15 19:51
 * Modified By :
 */
public class SingletonDCL {

    private volatile static SingletonDCL instance = null;

    private SingletonDCL(){}

    public static SingletonDCL getInstance() {
        if(instance == null) {
            synchronized (SingletonDCL.class) {
                if(instance == null) {
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}

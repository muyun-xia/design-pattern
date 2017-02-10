package pattern.creational.singletonPattern;

/**
 * 饿汉模式
 * Created by muyun on 2017/2/10.
 */
public class HungrySingleton {

    //构造方法私有化，禁止外界创造实例
    private HungrySingleton() {

    }

    //创建单例
    private static HungrySingleton ourInstance = new HungrySingleton();

    //提供get()方法
    public static HungrySingleton getInstance() {
        return ourInstance;
    }
}

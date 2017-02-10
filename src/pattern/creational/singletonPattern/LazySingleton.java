package pattern.creational.singletonPattern;

/**
 * 懒汉模式
 * Created by muyun on 2017/2/10.
 */
public class LazySingleton {

    //构造方法私有化，禁止外界创造实例
    private LazySingleton() {

    }

    //创建单例
    private static LazySingleton ourInstance;

    //提供get()方法
    public static LazySingleton getInstance() {
        if(ourInstance == null){
            ourInstance = new LazySingleton();
        }
        return ourInstance;
    }

}

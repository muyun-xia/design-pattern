package pattern.behavior.observerPattern;

import java.util.*;

/**
 * 具体的天气观察者
 * Created by muyun on 2017/2/10.
 */
public class ConcreteWeatherObserver implements java.util.Observer {

    //观察者名称
    private String observerName;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(Observable o, Object arg) {
        //推模型
        System.out.println(observerName + "收到了消息，目标推送过来的是："+ arg);
        //拉模型
        System.out.println(observerName + "收到了消息，主动到目标对象中获取的拉取的内容内容是："+
                ((ConcreteWeatherSubject)o).getContent() );
    }
}

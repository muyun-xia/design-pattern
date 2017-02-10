package pattern.behavior.observerPattern;

import java.util.Observable;

/**
 * 天气目标的具体实现类
 * Created by muyun on 2017/2/10.
 */
public class ConcreteWeatherSubject extends Observable {

    //天气情况的内容
    private String content;

    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
        //天气有变化，要通知所有的观察者
        //注意：在使用java的观察者模式的时候，下面这句代码不可少。
        this.setChanged();
        //然后主动通知
        //推模式
        this.notifyObservers(content);
        //拉模式
        //this.notifyObservers();

    }
}

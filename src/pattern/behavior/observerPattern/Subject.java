package pattern.behavior.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *  目标对象，它知道它的观察者，并提供注册（添加）和删除观察者的接口
 * Created by muyun on 2017/2/10.
 */
public class Subject {

    //用来保存注册的观察者对象
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 添加观察者
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除集合中制定的观察者
     * @param observer
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * 向所有注册的观察者更新信息
     */
    protected void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    protected void notifyObservers(String content) {
        for(Observer observer : observers){
            observer.update(content);
        }
    }



}

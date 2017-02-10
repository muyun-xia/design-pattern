package pattern.behavior.observerPattern;

/**
 * 具体的目标对象，负责把有关状态存入相应 的观察者对象。
 * Created by muyun on 2017/2/10.
 */
public class ConcreteSubject extends Subject {

    private String subjectState;//目标对象的状态

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        //通知观察者
        this.notifyObservers();
    }


}

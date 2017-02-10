package pattern.behavior.observerPattern;

/**
 * 具体的观察者方法，实现更新的方法，使自身的状态和目标的状态保持一致
 * Created by muyun on 2017/2/10.
 */
public class ConcreteObserver implements Observer {

    private String observerState; //观察者状态

    /**
     * 获取目标状态同步到观察者状态中
     */
    @Override
    public void update(Subject subject) {
        String subjectState = ((ConcreteSubject)subject).getSubjectState();
        observerState = subjectState;
    }

    @Override
    public void update(String content) {
        observerState = content;
    }
}

package pattern.behavior.observerPattern;

/**
 * 观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 * Created by muyun on 2017/2/10.
 */
public interface Observer {

    /**
     * 更新的接口
     * @param subject 传入的目标对象方便获取相应的目标对象的状态
     */
    public void update(Subject subject);//拉模型

    public void update(String content);//推模型


}

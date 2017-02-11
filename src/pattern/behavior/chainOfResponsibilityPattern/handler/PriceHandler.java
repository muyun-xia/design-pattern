package pattern.behavior.chainOfResponsibilityPattern.handler;

/**
 * 价格处理人，负责处理客户折扣的申请
 * Created by muyun on 2017/2/12.
 */
public abstract class PriceHandler {

    //直接后继，用于传递请求
    protected PriceHandler successor;

    public PriceHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理折扣请求
     * @param discount
     */
    public abstract void processDiscount(float discount);




}

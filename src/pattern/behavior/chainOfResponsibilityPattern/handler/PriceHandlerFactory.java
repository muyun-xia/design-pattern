package pattern.behavior.chainOfResponsibilityPattern.handler;

/**
 * PriceHandler的工厂类
 * Created by muyun on 2017/2/12.
 */
public class PriceHandlerFactory {

    /**
     * 创建PriceHandler的工厂方法
     * @return
     */
    public static PriceHandler createPriceHandler(){

        PriceHandler sales = new Sales();
        PriceHandler leader = new Leader();
        PriceHandler manager = new Manager();
        PriceHandler director = new Director();
        PriceHandler vicePresident = new VicePresident();
        PriceHandler ceo = new CEO();

        sales.setSuccessor(leader);
        leader.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(ceo);

        return sales;

    }
}

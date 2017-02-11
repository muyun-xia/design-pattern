package pattern.behavior.chainOfResponsibilityPattern;

import pattern.behavior.chainOfResponsibilityPattern.handler.PriceHandler;
import pattern.behavior.chainOfResponsibilityPattern.handler.PriceHandlerFactory;

import java.util.Random;

/**
 * 客户，申请折扣
 * Created by muyun on 2017/2/12.
 */
public class Customer {

    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount){

        priceHandler.processDiscount(discount);

    }

    public static void test (){

        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());

        Random random = new Random();

        for(int i=1; i<=100;i++){

            System.out.println(i);

            customer.requestDiscount(random.nextFloat());
        }






    }
}

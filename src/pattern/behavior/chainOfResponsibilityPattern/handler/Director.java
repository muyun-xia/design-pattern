package pattern.behavior.chainOfResponsibilityPattern.handler;

/**
 * 销售总监，可以批准 40% 以内的折扣
 * Created by muyun on 2017/2/12.
 */
public class Director extends  PriceHandler {

    @Override
    public void processDiscount(float discount) {

        if(discount <= 0.4){
            System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),discount);
        }else{
            //将请求转发给直接后继
            successor.processDiscount(discount);
        }

    }
}

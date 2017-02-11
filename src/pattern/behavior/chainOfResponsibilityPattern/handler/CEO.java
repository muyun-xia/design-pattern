package pattern.behavior.chainOfResponsibilityPattern.handler;

/**
 * CEO 可以批准55%以内的折扣
 * 超出55%就拒绝请求
 * Created by muyun on 2017/2/12.
 */
public class CEO extends PriceHandler {


    @Override
    public void processDiscount(float discount) {

        if(discount <= 0.55){
            System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),discount);
        }else{
            System.out.format("%s拒绝了折扣：%.2f%n",this.getClass().getName(),discount);
        }

    }
}

package 行为型模式.策略模式;

/**
 * 策略实现类
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元一下商品");
    }
}

package behavioral.templatemethod;

/**
 * @author tianxing
 */
public class Main {

    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        // 调用模板方法
        concreteClass.templateMethod();
    }
}

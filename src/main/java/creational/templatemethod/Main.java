package creational.templatemethod;

public class Main {

    public static void main(String[] args) {
        ConcreteTemplate concreteTemplate = new ConcreteTemplate();
        // 调用模板方法
        concreteTemplate.templateMethod();
    }
}

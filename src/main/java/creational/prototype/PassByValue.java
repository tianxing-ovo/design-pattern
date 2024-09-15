package creational.prototype;

/**
 * 值传递
 */
public class PassByValue {
    public static void main(String[] args) {
        int a = 1;
        String s1 = "hello";
        modify(a, s1);
        // a = 1  s1 = "hello"
        System.out.printf("a = %d\ns1 = %s\n", a, s1);
    }

    public static void modify(int b, String s2) {
        b = 2;
        s2 = "world";
    }
}

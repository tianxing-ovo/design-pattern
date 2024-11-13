package creational.prototype;

import java.util.Arrays;

/**
 * 值传递: 实参的值复制一份传递给形参(形参修改不影响实参)
 */
public class PassByValue {
    public static void main(String[] args) {
        int a = 1;
        String s1 = "hello";
        Student student = new Student("张三");
        int[] arr = {1};
        modify(a, s1, student, arr);
        // a = 1
        System.out.println("a = " + a);
        // s1 = hello
        System.out.println("s1 = " + s1);
        // student.name = 李四
        System.out.println("student.name = " + student.getName());
        // arr = [2]
        System.out.println("arr = " + Arrays.toString(arr));
    }

    /**
     * 基本数据类型: 传递值的副本
     * 引用类型(数组/对象): 传递引用的副本
     */
    public static void modify(int b, String s2, Student student, int[] arr) {
        // 不会改变实参的值
        b = 2;
        s2 = "world";
        // 修改对象的成员变量
        student.setName("李四");
        // 不会改变实参指向的对象
        student = new Student("王五");
        // 修改数组的元素
        arr[0] = 2;
        // 不会改变实参指向的数组
        arr = new int[]{3};
    }
}

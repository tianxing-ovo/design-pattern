package creational.prototype;

/**
 * 浅拷贝: 值类型(基本数据类型)复制值;引用类型(类/接口/数组/枚举)复制引用对象地址
 */
public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建原型对象
        Citation citation = new Citation(1, "三好学生", new Student("张三"));
        // 创建克隆对象
        Citation cloneCitation = citation.clone();
        // false(不是同一个对象)
        System.out.println(citation == cloneCitation);
        // 修改克隆对象基本数据类型和String类型的属性,不会影响原型对象
        cloneCitation.setId(2);
        cloneCitation.setName("优秀干部");
        // 修改克隆对象引用类型的属性,会影响原型对象
        cloneCitation.getStudent().setName("李四");
        System.out.println(citation); // Citation(id=1, name=三好学生, student=Student(name=李四))
        System.out.println(cloneCitation); // Citation(id=2, name=优秀干部, student=Student(name=李四))
    }
}

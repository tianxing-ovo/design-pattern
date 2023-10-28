package 创建型模式.原型模式.浅拷贝;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        citation.setId(1);
        citation.setName("三好学生");
        Student student = new Student("张三");
        citation.setStudent(student);
        Citation cloneCitation = citation.clone();
        System.out.println(citation == cloneCitation); // false,不是同一个对象
        // 修改基本数据类型和String类型的属性,不会影响原来的对象;修改对象类型的属性,会影响原来的对象
        cloneCitation.setId(2);
        cloneCitation.setName("优秀干部");
        cloneCitation.getStudent().setName("李四");
        System.out.println(citation); // Citation(id=1, name=三好学生, student=Student(name=李四))
        System.out.println(cloneCitation); // Citation(id=2, name=优秀干部, student=Student(name=李四))
    }
}
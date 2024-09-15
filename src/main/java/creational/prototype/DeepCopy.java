package creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 深拷贝
 */
public class DeepCopy {
    public static void main(String[] args) throws Exception {
        // 创建原型对象
        Citation citation = new Citation(1, "三好学生", new Student("张三"));
        // 将原型对象写入字节数组
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(citation);
        oos.close();
        // 从字节数组中读取克隆对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Citation copyCitation = (Citation) ois.readObject();
        ois.close();
        // false(不是同一个对象)
        System.out.println(citation == copyCitation);
        // 修改克隆对象基本数据类型和String类型的属性,不会影响原型对象
        copyCitation.setId(2);
        copyCitation.setName("优秀干部");
        // 修改克隆对象引用类型的属性,不会影响原型对象
        copyCitation.getStudent().setName("李四");
        System.out.println(citation); // Citation(id=1, name=三好学生, student=Student(name=张三))
        System.out.println(copyCitation); // Citation(id=2, name=优秀干部, student=Student(name=李四))
    }
}

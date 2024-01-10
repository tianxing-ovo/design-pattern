package 创建型模式.原型模式;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 深拷贝
 */
public class DeepCopy {
    public static void main(String[] args) throws Exception {
        // 创建对象
        Citation citation = new Citation();
        Student student = new Student("张三");
        citation.setId(1);
        citation.setName("三好学生");
        citation.setStudent(student);
        // 将对象写入字节数组
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(citation);
        oos.close();
        // 从字节数组中读取对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Citation copyCitation = (Citation) ois.readObject();
        ois.close();
        // 测试
        System.out.println(citation == copyCitation); // false,不是同一个对象
        copyCitation.setId(2);
        copyCitation.setName("优秀干部");
        copyCitation.getStudent().setName("李四");
        System.out.println(citation); // Citation(id=1, name=三好学生, student=Student(name=张三))
        System.out.println(copyCitation); // Citation(id=2, name=优秀干部, student=Student(name=李四))
    }
}

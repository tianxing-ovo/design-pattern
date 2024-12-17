package creational.prototype;

import util.SerializationUtil;

/**
 * 深拷贝/深克隆: 创建一个独立的副本,不会相互影响
 * 实现方式: 实现Serializable接口,序列化
 *
 * @author tianxing
 */
public class DeepCopy {

    public static void main(String[] args) {
        // 创建原型对象
        Citation citation = new Citation(1, "三好学生", new Student("张三"));
        // 将原型对象写入字节数组
        byte[] bytes = SerializationUtil.serialize(citation);
        // 从字节数组中读取克隆对象
        Citation copyCitation = (Citation) SerializationUtil.deserialize(bytes);
        // false(不是同一个对象)
        System.out.println(citation == copyCitation);
        // 修改克隆对象基本数据类型和String类型的属性,不会影响原型对象
        copyCitation.setId(2);
        copyCitation.setName("优秀干部");
        // 修改克隆对象引用类型的属性,不会影响原型对象
        copyCitation.getStudent().setName("李四");
        // Citation(id=1, name=三好学生, student=Student(name=张三))
        System.out.println(citation);
        // Citation(id=2, name=优秀干部, student=Student(name=李四))
        System.out.println(copyCitation);
    }
}

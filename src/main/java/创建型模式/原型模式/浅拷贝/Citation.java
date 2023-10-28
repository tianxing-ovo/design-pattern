package 创建型模式.原型模式.浅拷贝;

import lombok.Data;

/**
 * 奖状
 */
@Data
public class Citation implements Cloneable {
    private Integer id;
    private String name;
    private Student student;

    /**
     * 子类方法访问修饰符大于等于父类
     */
    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}

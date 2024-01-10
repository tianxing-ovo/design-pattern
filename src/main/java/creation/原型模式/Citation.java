package 创建型模式.原型模式;

import lombok.Data;

import java.io.Serializable;

/**
 * 奖状
 */
@Data
public class Citation implements Cloneable, Serializable {
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

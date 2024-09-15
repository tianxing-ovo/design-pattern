package creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 奖状
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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

package creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 学生
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    // 序列化版本号: 防止类结构改变导致反序列化失败
    private static final long serialVersionUID = 1L;
    private String name;
}

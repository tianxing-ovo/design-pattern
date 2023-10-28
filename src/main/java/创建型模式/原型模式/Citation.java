package com.example.demo.entity;

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

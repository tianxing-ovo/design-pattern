package 创建型模式.建造者模式;

import lombok.Data;
import lombok.ToString;

/**
 * Builder注解实现
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }
    @ToString
    public static class UserBuilder {
        private Integer id;
        private String name;
        private Integer age;

        public UserBuilder() {
        }

        public UserBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(id, name, age);
        }
    }
}

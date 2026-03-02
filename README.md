# 🎨 Design Pattern

> **Java 实现 7 种设计原则 + 设计模式，配合详细注释，适合学习和参考。**

## 📋 技术栈

|  技术   |  版本   |      说明      |
| :-----: | :-----: | :------------: |
|  Java   |   8+    |    核心语言    |
|  Maven  |   3.x   |    构建工具    |
| Lombok  | 1.18.28 | 简化 POJO 代码 |
|  CGLib  |  3.3.0  |    动态代理    |
| JUnit 5 | 5.10.2  |    单元测试    |

## 🚀 快速开始

```bash
# 克隆项目
git clone https://github.com/tianxing-ovo/design-pattern.git

# 进入项目目录
cd design-pattern

# 编译项目
mvn compile

# 运行任意示例（以简单工厂为例）
mvn exec:java -Dexec.mainClass="creational.simplefactory.CoffeeStore"
```

## 📐 设计原则（7 种）

|                    原则                     |              英文               |           说明           |                                      示例                                       |
| :-----------------------------------------: | :-----------------------------: | :----------------------: | :-----------------------------------------------------------------------------: |
| [单一职责原则](src/main/java/principle/SRP) | Single Responsibility Principle |   一个类只负责一项职责   | `DBUtil` 负责连接、`CustomerDAO` 负责数据操作、`CustomerDataChart` 负责图表展示 |
|   [开闭原则](src/main/java/principle/OCP)   |      Open-Closed Principle      |  对扩展开放，对修改关闭  |                搜狗键盘通过 `AbstractSkin` 抽象类支持扩展新皮肤                 |
| [里氏替换原则](src/main/java/principle/LSP) |  Liskov Substitution Principle  | 子类能替换父类且行为一致 |                 正方形不应继承长方形，改用 `Quadrilateral` 接口                 |
| [接口隔离原则](src/main/java/principle/ISP) | Interface Segregation Principle |  接口应最小化，避免臃肿  |          安全门拆分为 `AntiTheft`、`Fireproof`、`Waterproof` 三个接口           |
| [依赖倒置原则](src/main/java/principle/DIP) | Dependency Inversion Principle  |   依赖抽象而非具体实现   |                `Computer` 依赖 `Cpu`、`Memory`、`HardDisk` 接口                 |
|  [迪米特法则](src/main/java/principle/LOD)  |         Law of Demeter          |  最少知识原则，降低耦合  |                明星通过 `Agent` 经纪人与 `Fans`、`Company` 交互                 |
| [合成复用原则](src/main/java/principle/CRP) |    Composite Reuse Principle    |   优先使用组合而非继承   |                         `Car` 使用 `Color` 组合替代继承                         |

## 🏗️ 设计模式

### 创建型模式（Creational）

|                        模式                        |          说明          |                             核心类                              |
| :------------------------------------------------: | :--------------------: | :-------------------------------------------------------------: |
| [简单工厂](src/main/java/creational/simplefactory) | 通过工厂类统一创建对象 |    `SimpleCoffeeFactory` 根据 `CoffeeType` 枚举创建不同咖啡     |
| [工厂方法](src/main/java/creational/factorymethod) |  每种产品对应一个工厂  | `AmericanCoffeeFactory`、`LatteCoffeeFactory` 各自创建对应咖啡  |
|   [单例模式](src/main/java/creational/singleton)   | 确保一个类只有一个实例 |                 5 种实现方式（见下方详细说明）                  |
|   [建造者模式](src/main/java/creational/builder)   |    分步构建复杂对象    | `Director` + `Builder` 构建 `Bike`；手写 `UserBuilder` 链式调用 |
|   [原型模式](src/main/java/creational/prototype)   |    通过克隆创建对象    |           浅拷贝（`Cloneable`）与深拷贝（序列化）对比           |

#### 🔒 单例模式 — 5 种实现

|                                  实现方式                                   | 线程安全 | 懒加载 | 防反射 | 防反序列化 |
| :-------------------------------------------------------------------------: | :------: | :----: | :----: | :--------: |
| [静态成员变量](src/main/java/creational/singleton/hungrystyle/staticmember) |    ✅     |   ❌    |   ❌    |     ❌      |
|  [静态代码块](src/main/java/creational/singleton/hungrystyle/staticblock)   |    ✅     |   ❌    |   ❌    |     ❌      |
|      [枚举](src/main/java/creational/singleton/hungrystyle/enumerate)       |    ✅     |   ❌    |   ✅    |     ✅      |
|          [同步方法](src/main/java/creational/singleton/lazystyle)           |    ✅     |   ✅    |   ❌    |     ❌      |
| [双重检查锁](src/main/java/creational/singleton/lazystyle/doublechecklock)  |    ✅     |   ✅    |   ❌    |     ❌      |
| [静态内部类](src/main/java/creational/singleton/lazystyle/staticinnerclass) |    ✅     |   ✅    |   ❌    |     ✅      |

### 结构型模式（Structural）

|                    模式                    |             说明             |             核心类             |
| :----------------------------------------: | :--------------------------: | :----------------------------: |
| [代理模式](src/main/java/structural/proxy) | 为目标对象提供代理以控制访问 | 3 种实现方式（见下方详细说明） |

#### 🔄 代理模式 — 3 种实现

|                          实现方式                           |                        原理                        |      适用场景      |
| :---------------------------------------------------------: | :------------------------------------------------: | :----------------: |
|   [静态代理](src/main/java/structural/proxy/staticproxy)    |            手动编写代理类，实现相同接口            | 代理类少、接口稳定 |
|   [JDK 动态代理](src/main/java/structural/proxy/jdkproxy)   |  `Proxy.newProxyInstance()` + `InvocationHandler`  |  目标类实现了接口  |
| [CGLib 动态代理](src/main/java/structural/proxy/cglibproxy) | `Enhancer` + `MethodInterceptor`，生成目标类的子类 |   目标类没有接口   |

### 行为型模式（Behavioral）

|                                    模式                                    |            说明            |                         核心类                          |
| :------------------------------------------------------------------------: | :------------------------: | :-----------------------------------------------------: |
|        [责任链模式](src/main/java/behavioral/chainofresponsibility)        |     请求沿处理者链传递     | `GroupLeader` → `Manager` → `GeneralManager` 审批请假条 |
| [责任链-过滤器变体](src/main/java/behavioral/chainofresponsibility/filter) |  模拟 Servlet Filter 机制  |     `ApplicationFilterChain` + `Filter` 前后置处理      |
|               [策略模式](src/main/java/behavioral/strategy)                |  定义算法族，运行时可互换  |    `Strategy` 接口 + `Context` 环境类，支持 SPI 加载    |
|          [模板方法模式](src/main/java/behavioral/templatemethod)           | 定义算法骨架，子类实现细节 |     `AbstractClass` 定义模板，含抽象方法 + 钩子方法     |

## 📁 项目结构

```
design-pattern
├── src/main/java
│   ├── behavioral/                    # 行为型模式
│   │   ├── chainofresponsibility/     # 责任链模式
│   │   │   ├── filter/                # 过滤器变体（模拟Servlet Filter）
│   │   │   ├── Handler.java           # 抽象处理者
│   │   │   ├── GroupLeader.java        # 小组长（1天）
│   │   │   ├── Manager.java           # 经理（≤3天）
│   │   │   └── GeneralManager.java    # 总经理（≤7天）
│   │   ├── strategy/                  # 策略模式
│   │   └── templatemethod/            # 模板方法模式
│   ├── creational/                    # 创建型模式
│   │   ├── builder/                   # 建造者模式
│   │   ├── factorymethod/             # 工厂方法模式
│   │   ├── prototype/                 # 原型模式（浅拷贝/深拷贝）
│   │   ├── simplefactory/             # 简单工厂模式
│   │   └── singleton/                 # 单例模式（6种实现）
│   │       ├── hungrystyle/           # 饿汉式
│   │       └── lazystyle/             # 懒汉式
│   ├── structural/                    # 结构型模式
│   │   └── proxy/                     # 代理模式
│   │       ├── staticproxy/           # 静态代理
│   │       ├── jdkproxy/              # JDK动态代理
│   │       └── cglibproxy/            # CGLib动态代理
│   ├── principle/                     # 设计原则
│   │   ├── SRP/                       # 单一职责原则
│   │   ├── OCP/                       # 开闭原则
│   │   ├── LSP/                       # 里氏替换原则
│   │   ├── ISP/                       # 接口隔离原则
│   │   ├── DIP/                       # 依赖倒置原则
│   │   ├── LOD/                       # 迪米特法则
│   │   └── CRP/                       # 合成复用原则
│   └── util/                          # 工具类
│       └── SerializationUtil.java     # 序列化/反序列化工具
└── src/test/java                      # 单元测试
```

## 📄 License

[MIT](LICENSE)
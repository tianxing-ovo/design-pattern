package util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 序列化工具类
 */
public class SerializationUtil {

    /**
     * 序列化: 对象 -> 字节数组
     *
     * @param obj 对象
     * @return 字节数组
     */
    public static byte[] serialize(Object obj) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream(); ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(obj);
            return bos.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("Failed to serialize object", e);
        }
    }

    /**
     * 序列化: 对象 -> 文件
     *
     * @param obj  对象
     * @param path 文件路径
     */
    public static void serialize(Object obj, Path path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(obj);
        } catch (IOException e) {
            throw new RuntimeException("Failed to serialize object", e);
        }
    }

    /**
     * 反序列化: 字节数组 -> 对象
     *
     * @param bytes 字节数组
     * @return 对象
     */
    public static Object deserialize(byte[] bytes) {
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Failed to deserialize object", e);
        }
    }

    /**
     * 反序列化: 文件 -> 对象
     *
     * @param path 文件路径
     * @return 对象
     */
    public static Object deserialize(Path path) {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Failed to deserialize object", e);
        }
    }
}

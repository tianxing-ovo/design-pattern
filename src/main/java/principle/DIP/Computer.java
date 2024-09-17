package principle.DIP;

import lombok.Data;

/**
 * 电脑
 */
@Data
public class Computer {

    private HardDisk hardDisk;
    private Cpu cpu;
    private Memory memory;

    public void run() {
        hardDisk.save("data");
        System.out.println(hardDisk.get());
        cpu.run();
        memory.save();
    }
}

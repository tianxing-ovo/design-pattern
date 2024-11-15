package behavioral.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 请假条
 */
@Getter
@AllArgsConstructor
public class LeaveRequest {
    // 姓名
    private String name;
    // 请假天数
    private int day;
    // 请假事由
    private String content;
}

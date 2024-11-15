package behavioral.chainofresponsibility;

/**
 * 总经理(具体处理者)
 */
public class GeneralManager extends Handler {
    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getDay() <= NUM_SEVEN) {
            System.out.println("总经理审批通过");
            System.out.println("流程结束");
        } else {
            System.out.println("请假天数超过" + NUM_SEVEN + "天,无法审批");
        }
    }
}

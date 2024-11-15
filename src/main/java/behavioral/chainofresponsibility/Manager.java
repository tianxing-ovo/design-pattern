package behavioral.chainofresponsibility;

/**
 * 经理(具体处理者)
 */
public class Manager extends Handler {
    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getDay() <= NUM_THREE) {
            System.out.println("经理审批通过");
            System.out.println("流程结束");
        } else {
            successor.handleRequest(leaveRequest);
        }
    }
}

package behavioral.chainofresponsibility;

/**
 * 小组长(具体处理者)
 */
public class GroupLeader extends Handler {
    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getDay() + "天," + leaveRequest.getContent());
        if (leaveRequest.getDay() == NUM_ONE) {
            System.out.println("小组长审批通过");
            System.out.println("流程结束");
        } else {
            successor.handleRequest(leaveRequest);
        }
    }
}

package behavioral.chainofresponsibility;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        // 创建请假条
        LeaveRequest zhangSanLeaveRequest = new LeaveRequest("张三", 1, "身体不适");
        LeaveRequest liSiLeaveRequest = new LeaveRequest("李四", 3, "身体不适");
        LeaveRequest wangWuLeaveRequest = new LeaveRequest("王五", 7, "身体不适");
        LeaveRequest zhaoLiuLeaveRequest = new LeaveRequest("赵六", 9, "身体不适");
        // 创建具体处理者
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        // 设置处理者链
        groupLeader.successor = manager;
        manager.successor = generalManager;
        // 处理请假条
        groupLeader.handleRequest(zhangSanLeaveRequest);
        groupLeader.handleRequest(liSiLeaveRequest);
        groupLeader.handleRequest(wangWuLeaveRequest);
        groupLeader.handleRequest(zhaoLiuLeaveRequest);
    }
}

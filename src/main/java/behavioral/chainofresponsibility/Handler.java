package behavioral.chainofresponsibility;

/**
 * 抽象处理者
 */
public abstract class Handler {

    protected static final int NUM_ONE = 1;
    protected static final int NUM_THREE = 3;
    protected static final int NUM_SEVEN = 7;

    // 维持对下家的引用
    protected Handler successor;

    /**
     * 抽象请求处理方法
     *
     * @param leaveRequest 请假条
     */
    public abstract void handleRequest(LeaveRequest leaveRequest);
}

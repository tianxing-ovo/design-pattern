package principle.LOD;

public class Client {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setStar(new Star("薛之谦"));
        agent.setFans(new Fans("谦友"));
        agent.setCompany(new Company("海蝶音乐"));
        agent.meeting();
        agent.business();
    }
}

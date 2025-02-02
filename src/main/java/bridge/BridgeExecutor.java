package bridge;

public class BridgeExecutor {

    public static void main(String[] args) {
        Display dis1 = new Display(new StringDisplayImpl("hello"));
        Display dis2 = new CountDisplay(new StringDisplayImpl("world"));
        CountDisplay dis3 = new CountDisplay(new StringDisplayImpl("friends"));
        dis1.display();
        dis2.display();
        dis3.display();
        dis3.multiDisplay(5);
    }
}

package adapter;

public class ClazzAdapterExecutor {

    public static void main(String[] args) {

        Print p = new PrintBanner("Hello");

        p.printStrong();
        p.printWeak();

    }
}

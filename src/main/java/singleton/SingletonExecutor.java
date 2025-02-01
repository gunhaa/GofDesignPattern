package singleton;

public class SingletonExecutor {

    public static void main(String[] args) {

        System.out.println("start");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if(instance1==instance2){
            System.out.println("instance1 == instance2");
        } else {
            System.out.println("instance1 != instance2");
        }
        System.out.println("end");
    }

}

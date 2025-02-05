package flyweight;

public class FlyweightExecutor {

    // java -cp build/classes/java/main flyweight.FlyweightExecutor 2222222222
    public static void main(String[] args) {

        if(args.length==0){
            System.exit(0);
        }
        BigString bigString = new BigString(args[0]);
        bigString.print();
    }
}

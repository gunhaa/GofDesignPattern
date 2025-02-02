package strategy;

public class StrategyExecutor {

    public static void main(String[] args) {
        Player player1 = new Player("KIM", new WinnningStrategy(314));
        Player player2 = new Player("LEE", new ProbStrategy(15));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if(nextHand1.isStrongerThan(nextHand2)){
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if(nextHand2.isStrongerThan(nextHand1)){
                System.out.println("Winner: "+player2);
                player1.lose();
                player2.win();
            }else {
                System.out.println("Even..");
                player1.even();
                player2.even();
            }
        }

        System.out.println("total result:");
        System.out.println(player1);
        System.out.println(player2);
    }
}

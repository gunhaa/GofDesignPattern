package memento;

public class MementoExecutor {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        // 게임 시작
        for (int i = 0; i < 100; i++) {
            System.out.println("======" + i);
            System.out.println("상태: "+ gamer);
            gamer.bet();

            System.out.println("소지금은 "+ gamer.getMoney()+"원이 되었습니다");
            // Memento 취급 방법 결정
            if(gamer.getMoney()> memento.getMoney()){
                System.out.println("많이 늘었으니 상태 저장");
                memento = gamer.createMemento();
            } else if(gamer.getMoney()< memento.getMoney()/2) {
                System.out.println("반이 되었으니 이전 상태 복원");
                gamer.restoreMemento(memento);
            }

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("");
        }
    }
}

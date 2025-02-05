package memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    // 소지금
    private int money;
    // 과일
    private List<String> fruits = new ArrayList<>();
    // 난수 생성
    private Random random = new Random();

    private static String[] fruitsName = {
            "apple", "orange", "banana", "grape"
    };

    public Gamer(int money){
        this.money = money;
    }

    public int getMoney(){
        return money;
    }

    // 게임 진행
    public void bet(){
        int dice = random.nextInt(6) + 1;
        if(dice == 1){
            money += 100;
            System.out.println("소지금이 증가했습니다.");
        } else if (dice == 2){
            money /= 2;
            System.out.println("소지금이 절반으로 줄었습니다.");
        } else if (dice == 6){
            String fruit = getFruit();
            System.out.println("과일("+fruit+")를 받았습니다.");
            fruits.add(fruit);
        } else {
            System.out.println("변동 사항이 없습니다.");
        }
    }

    public Memento createMemento(){
        Memento memento = new Memento(money);
        for (String fruit : fruits){
            // 과일은 tasty만 저장
            if(fruit.startsWith("tasty ")){
                memento.addFruits(fruit);
            }
        }
        return memento;
    }

    public void restoreMemento(Memento memento){
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString(){
        return "[money = "+ money + ", fruits = "+ fruits+ "]";
    }

    // 과일을 얻는다
    private String getFruit(){
        String fruit = fruitsName[random.nextInt(fruitsName.length)];
        if(random.nextBoolean()){
            return "tasty " + fruit;
        } else {
            return fruit;
        }
    }

}

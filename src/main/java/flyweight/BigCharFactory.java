package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {

    private Map<String, BigChar> pool = new HashMap<>();
    private static BigCharFactory singleton = new BigCharFactory();

    public static BigCharFactory getInstance(){
        return singleton;
    }

    // 인스턴스 생성(공유)
    // 여러 스레드의 동시접근시, 동일 객체를 만들 가능성이 있기 때문이다.
    public synchronized BigChar getBigChar(char charName){
        BigChar bigChar = pool.get(String.valueOf(charName));
        if(bigChar == null){
            // bigChar 인스턴스 결정
            bigChar = new BigChar(charName);
            pool.put(String.valueOf(charName) , bigChar);
        }
        return bigChar;
    }
}

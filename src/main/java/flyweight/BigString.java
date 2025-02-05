package flyweight;

public class BigString {

    private BigChar[] bigChars;

    public BigString(String string) {
        BigCharFactory bigCharFactory = BigCharFactory.getInstance();
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = bigCharFactory.getBigChar(string.charAt(i));
        }
    }

    public void print(){
        for (BigChar bigChar : bigChars) {
            bigChar.print();
        }
    }
}

package decorator;

public class DecoratorExecutor {

    public static void main(String[] args) {
        StringDisplay mainDisplay = new StringDisplay("HELLO, WORLD!");
        SideBorder sideBorder = new SideBorder(mainDisplay, '#');
        FullBorder fullBorder = new FullBorder(sideBorder);
        mainDisplay.show();
        sideBorder.show();
        fullBorder.show();

        Display decoratedDisplay = new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("hihi!!")), '*'))),'/');
        decoratedDisplay.show();
    }

}

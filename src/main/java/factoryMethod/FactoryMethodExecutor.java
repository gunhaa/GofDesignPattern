package factoryMethod;

import factoryMethod.framework.Product;
import factoryMethod.idcard.IdCardFactory;

public class FactoryMethodExecutor {

    public static void main(String[] args) {
        IdCardFactory factory = new IdCardFactory();
        Product card1 = factory.create("minji");
        Product card2 = factory.create("kate");
        Product card3 = factory.create("bill");
        card1.use();
        card2.use();
        card3.use();

    }

}

package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;

public class PrototypeExecutor {

    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen uPen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("strong message", uPen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        System.out.println(p1 == uPen);
        Product p1Clone = uPen.createCopy();
        System.out.println(p1 == p1Clone);
        p1.use("hello, world");
        Product p2 = manager.create("warning box");
        p2.use("hello, world");
        Product p3 = manager.create("slash box");
        p3.use("hello, world");

    }

}

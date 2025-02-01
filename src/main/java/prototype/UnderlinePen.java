package prototype;

import prototype.framework.Product;

public class UnderlinePen implements Product {

    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {
        int ulLen = s.length();
        System.out.println(s);
        for (int i = 0; i < ulLen; i++) {
            System.out.print(ulChar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        Product p = null;
        try{
            p = (Product) this.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}

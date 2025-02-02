package decorator;

public interface Display {

    int getColumns();
    int getRows();
    String getRowText(int row);

    default void show(){
        for (int i = 0; i <getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}

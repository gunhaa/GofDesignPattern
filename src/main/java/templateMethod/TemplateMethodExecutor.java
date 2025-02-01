package templateMethod;

import java.io.IOException;
import java.io.InputStream;

public class TemplateMethodExecutor {

    public static void main(String[] args) {

        AbstractDisplay d1 = new CharDisplay('c');

        AbstractDisplay d2 = new StringDisplay("Hello, world");

        d1.display();
        d2.display();
        
    }
}

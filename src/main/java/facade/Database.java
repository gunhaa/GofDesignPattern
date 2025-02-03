package facade;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database(){}

    public static Properties getProperties(String dbname) throws IOException {
        String fileName = dbname + ".txt";
        Properties prop = new Properties();
        prop.load(new FileReader(fileName));
        return prop;
    }
}

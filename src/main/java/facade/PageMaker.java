package facade;

import abstractfactory.factory.Page;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker () {}

    public static void makeWelcomePage(String mailAddr, String fileName){
        try {

            Properties mailProp = Database.getProperties("maildata");
            String username = mailProp.getProperty(mailAddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title(username + "'s web page");
            writer.paragraph("Welcome to "+ username + "'s webPage!");
            writer.paragraph("Nice to meet you!");
            writer.mailto(mailAddr, username);
            writer.close();
            System.out.println(fileName + " is created for " + mailAddr + " (" + username + ")");

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}

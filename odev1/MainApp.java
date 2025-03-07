package odev1;

import java.util.UUID;

public class MainApp {
    public static void main(String[] args) {


        FileControl2 fileControl2 = new FileControl2("deneme");

        fileControl2.createNewFile();
        fileControl2.writeLine(UUID.randomUUID().toString());
        fileControl2.readFile();


    }
}

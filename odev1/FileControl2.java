package odev1;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileControl2 {

    File file;

    public FileControl2(String filename){
        filename = filename + ".txt";
        file = new File(filename);
    }



    public void createNewFile(){

        try {
            file.createNewFile();
        } catch (Exception e) {
            System.err.println("File Create Error !");

        }

    }


    public void writeLine (String line){
        try{
            FileWriter fw = new FileWriter(file , true);
            fw.write(line);
            String[] satirlar = line.split("\n");
            int satirNumarasi = 1;
            for (String satir : satirlar) {
                fw.write(satirNumarasi + ": " + satir);
                satirNumarasi++;
            }
            fw.write(System.lineSeparator());
            fw.close();
            System.out.println(satirNumarasi);
        }catch (Exception ex){
            System.out.println("writeLine error");
        }



    }
    public void readFile(){
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (Exception ex){
            System.err.println("Read File ERROR");
        }
    }



}

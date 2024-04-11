package lessColl.Serialization;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class projectSerialized {
    private static Product product = new Product(0,"Milk",430,4.6);
    final static Path PATH = Path.of(".\\Serialization\\file\\test1.txt");
    final static String stringPath =".\\Serialization\\file\\test1.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException   {
        if(checkFile()==false){
            try {
                createFile();
            }catch (IOException ioe){
                System.err.println("Error,not directory or file is check");
            }
        }else {
            saveFile();
            System.out.println("Saving file... Next Stage load file and print");
            loadFile();

        }



    }
    private static void createFile() throws IOException {
        Path f = Files.createFile(PATH);
    }
    private static boolean checkFile(){
        return Files.isRegularFile(PATH);
    }
    private static void saveFile()throws IOException{
        FileOutputStream outputStream = new FileOutputStream(stringPath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(product);
        objectOutputStream.close();
    }
    private static void loadFile()throws IOException,ClassNotFoundException{
        FileInputStream fileInputStream = new FileInputStream(stringPath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Product p = (Product) objectInputStream.readObject();
        System.out.println(p);
    }
}

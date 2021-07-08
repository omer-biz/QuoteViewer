import java.io.*;
import java.util.Scanner;

// singleton class
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {}

    public static SingleObject getInstance() {
        return instance;
    }

    public Quote[] getAllQouteFromDB() {
        return testData();
    }

    private Quote[] testData() {
        Quote quotList[] = new Quote[5];

        for(int i = 0; i < 5; ++i) {
            quotList[i] = new Quote("Hello" + i, "author" + i);
        }
        return quotList;
    }
    public int getNumberOfLines(String fileName){
        int numberOfLine =0;
        try{
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
            byte[] byteArray = new byte[(int)file.length()];
            fis.read(byteArray);
            String data = new String(byteArray);
            String[] stringArray = data.split("\n");
            numberOfLine = stringArray.length;
            fis.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return numberOfLine;
    }
    
    public Quote[] reader(String fileName){
        Quote listOfQoutes[];
        try{
            FileInputStream fis = new FileInputStream(fileName);
            Scanner sc = new Scanner(fis);
            listOfQoutes = new Quote[getNumberOfLines(fileName)];


            int counter = 0;
            while(sc.hasNextLine()){
                String[] lineOfString = sc.nextLine().split("[,]",0);
                listOfQoutes[counter] = new Quote(lineOfString[0],lineOfString[1]);
                counter++;

            }

        }
        catch(Exception e){
            listOfQoutes = null;
            System.out.println("Somthing goes wrong: " + e);
        }
        return listOfQoutes;
    }
}

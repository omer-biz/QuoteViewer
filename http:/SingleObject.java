mport java.io.*;
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
}

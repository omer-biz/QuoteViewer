import java.util.Scanner;

public class MainClass {

    public static void main(String arg[]) {
        QuoteList qouteList = new ProxyQuoteList();
        QuoteRepository qouteRepo = new QuoteRepository();

        qouteRepo.setQuotes(qouteList.getQuotes());
    }
}

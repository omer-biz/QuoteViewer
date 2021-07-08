import java.util.Scanner;

public class MainClass {

    public static void main(String arg[]) {
        QuoteList qouteList = new ProxyQuoteList();
        QuoteRepository qouteRepo = new QuoteRepository();

        qouteRepo.setQuotes(qouteList.getQuotes());
        int nexOrPrev = 1; // 1 means next, 0 means previous
        Quote quote = null;
        Scanner input = new Scanner(System.in);

        Iterator iter = qouteRepo.getIterator();
        quote = (Quote)iter.next();
        System.out.println(quote);
    }
}

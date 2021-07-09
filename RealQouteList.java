omer, [08.07.21 21:01]
public class RealQuoteList implements QuoteList {
    private Quote quotes[] = null;

    public RealQuoteList() {
        loadFromDB();
    }

    @Override
    public Quote[] getQuotes() {
        return quotes;
    }

    private void loadFromDB() {
        SingleObject db = SingleObject.getInstance();
        this.quotes = db.getAllQouteFromDB();
    }
}

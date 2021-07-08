public class ProxyQuoteList implements QuoteList {
    private RealQuoteList realQoute;

    public ProxyQuoteList() {}

    @Override
    public Quote[] getQuotes() {
        if(realQoute == null) {
            realQoute = new RealQuoteList();
        }
        return realQoute.getQuotes();
    }
}

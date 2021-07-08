public class Quote {
    private String content;
    private String author;
    private String format = "";

    public Quote(String content, String author) {
        this.content = content;
        this.author = author;

        format += "====================================\n";
        format += "\t" + content + "\n";
        format += "\t\t\tby " + author + "\n";
        format += "====================================\n";
    }

    @Override
    public String toString() {

        // return "\"" + content + "\" " + "by: " + author;
        return format;
    }
}

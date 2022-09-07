package quotes;

import java.util.ArrayList;
import java.util.Random;

public class RandomQuotes {
    public String quoteText;
    public String quoteAuthor;
    private ArrayList<TypeWrapper> types;

    public RandomQuotes(String quoteText, String QuoteAuthor){
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;

    }

    @Override
    public String toString() {
        return "RandomQuotes{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                '}';
    }

    public String getQuoteText(){
        return quoteText;
    }
    public void setQuoteText(String quoteText){
        this.quoteText = quoteText;
    }
    public ArrayList<TypeWrapper> getTypes() {
        return types;
    }
    public void setTypes(ArrayList<TypeWrapper> types) {
        this.types = types;
    }

}

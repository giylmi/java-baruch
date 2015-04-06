package foo.bar.lab02;

import java.util.List;

/**
 * Created by giylmi on 06.04.2015.
 */
public class TerminatorQuoter implements Quoter {
    List<String> quotes;

    public List<String> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<String> quotes) {
        this.quotes = quotes;
    }

    @Override
    public void sayQuote() {
        System.out.println(quotes);
    }
}

package foo.bar.lab02;

import java.util.List;

/**
 * Created by giylmi on 06.04.2015.
 */
public class ShakespeareQuoter implements Quoter {

    String quote;

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public void sayQuote() {
        System.out.println(quote);
    }
}

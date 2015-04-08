package foo.bar.day2.lab03;

import java.util.Random;

/**
 * Created by giylmi on 07.04.2015.
 */
public class RandomQuoter {

    private String randomQuote;

    public RandomQuoter(){
        Random random = new Random();
        randomQuote = Integer.toHexString(random.nextInt());
    }

    public String getRandomQuote() {
        return randomQuote;
    }
}

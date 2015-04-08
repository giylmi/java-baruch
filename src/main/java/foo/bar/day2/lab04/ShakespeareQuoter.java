package foo.bar.day2.lab04;

import org.springframework.stereotype.Component;

/**
 * Created by giylmi on 07.04.2015.
 */
@Component
public class ShakespeareQuoter implements Quoter {

    @Override
    public String sayQuote() {
        return "2b || !2b";
    }
}

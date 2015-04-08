package foo.bar.day2.lab04;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by giylmi on 07.04.2015.
 */
@Component
@TerminatorQuoterQualifier
public class TerminatorQuoter implements Quoter {

    @Override
    public String sayQuote() {
        return "I'll be back";
    }
}

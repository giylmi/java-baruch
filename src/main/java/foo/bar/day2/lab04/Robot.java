package foo.bar.day2.lab04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by giylmi on 07.04.2015.
 */
@Component
public class Robot {

    private Quoter quoter;


    @Autowired
    @TerminatorQuoterQualifier
    public void setQuoter(Quoter quoter) {
        this.quoter = quoter;
    }

    public String talk(){
        return quoter.sayQuote();
    }
}

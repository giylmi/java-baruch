package foo.bar.day2.lab03;

/**
 * Created by giylmi on 07.04.2015.
 */
public abstract class SpeakingRobot implements Robot {

    public String speak(){
        return (getQuoter().getRandomQuote());
    }

    public abstract RandomQuoter getQuoter();
}

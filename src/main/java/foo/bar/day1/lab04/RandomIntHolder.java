package foo.bar.day1.lab04;

/**
 * Created by giylmi on 06.04.2015.
 */
public class RandomIntHolder {

    private int randomInt;

    @InjectRandomInt(max = 50)
    public void setRandomInt(int randomInt) {
        this.randomInt = randomInt;
    }

    public int getRandomInt() {
        return randomInt;
    }
}

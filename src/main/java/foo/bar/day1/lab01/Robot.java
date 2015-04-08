package foo.bar.day1.lab01;

/**
 * Created by giylmi on 06.04.2015.
 */
public class Robot {

    @RunThisMethod(repeat = 5)
    public void dance(){
        System.out.println("I am a dancing robot!");
    }

    @Override
    public String toString() {
        return "I am Robot!";
    }
}

package foo.bar.day2.lab05;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by giylmi on 07.04.2015.
 */
public class FileCreator {

    @Value("${file.path}")
    private String path;

    @PostConstruct
    public void writeToFile() {
        try (PrintWriter pw = new PrintWriter(path)) {
            pw.write("Helloasdfa!");
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

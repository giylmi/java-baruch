package foo.bar.day2.lab05;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;

/**
 * Created by giylmi on 07.04.2015.
 */
public class FileLengthRetriever {

    @Value("${file.path}")
    private String path;

    @PostConstruct
    public void retrieveLength(){
        File file = new File(path);
        System.out.println(file.length());
    }
}

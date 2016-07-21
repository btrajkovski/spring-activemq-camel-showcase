package sample.activemq;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by btrajkovski on 7/20/2016.
 */
@Component
public class MyBean {
    public String doSomething(String body) {
        System.out.println("Processing");
        System.out.println(body);
        return body.toUpperCase();
    }
}

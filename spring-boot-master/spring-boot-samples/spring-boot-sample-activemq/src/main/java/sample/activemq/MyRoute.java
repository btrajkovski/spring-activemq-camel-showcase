package sample.activemq;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by btrajkovski on 7/20/2016.
 */
@Component
public class MyRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("jms:sample.queue").bean(MyBean.class, "doSomething");
    }
}
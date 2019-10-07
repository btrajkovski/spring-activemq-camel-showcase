package sample.activemq;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.JMSException;

import static org.junit.Assert.assertTrue;

/**
 * Created by btrajkovski on 7/21/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleActiveMQApplication.class)
public class ActiveMqTest {
    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Autowired
    private Producer producer;

    @Test
    public void sendSimpleMessage() throws InterruptedException, JMSException {
        this.producer.send("Test message");
        Thread.sleep(1000L);
        assertTrue(this.outputCapture.toString().contains("Test message"));
    }

}

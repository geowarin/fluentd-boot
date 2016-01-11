package fluentd

import groovy.json.JsonSlurper
import groovy.util.logging.Log4j
import org.apache.log4j.Level
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import wslite.rest.RESTClient

@Component
@Log4j
class MainRunner implements CommandLineRunner {

    private static Random random = new Random();

    @Override
    void run(String... args) throws Exception {
        while (true) {
            log.log(randomLevel(), randomMessage())
            sleep 3000
        }
    }

    private Level randomLevel() {
        switch (random.nextInt(3)) {
            case 0:
                return Level.DEBUG;
            case 1:
                return Level.INFO;
            case 2:
                return Level.ERROR;
            default:
                return Level.INFO;
        }
    }

    private String randomMessage() {
        def client = new RESTClient('http://api.icndb.com/jokes/random')
        def response = client.get()
        new JsonSlurper().parse(response.data).value.joke
    }
}

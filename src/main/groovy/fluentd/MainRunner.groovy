package fluentd

import groovy.util.logging.Log4j
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
@Log4j
class MainRunner implements CommandLineRunner {

    @Override
    void run(String... args) throws Exception {
        while (true) {
            log.info('Log message from spring')
            sleep 1000
        }
    }
}

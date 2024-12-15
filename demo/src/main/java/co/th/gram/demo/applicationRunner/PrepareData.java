package co.th.gram.demo.applicationRunner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class PrepareData implements ApplicationRunner {

    private static final Logger logger = LogManager.getLogger(PrepareData.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.debug("Prepare Data !");
    }
}

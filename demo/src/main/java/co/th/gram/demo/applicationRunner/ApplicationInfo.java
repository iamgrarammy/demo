package co.th.gram.demo.applicationRunner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ApplicationInfo implements ApplicationRunner {

    private static final Logger logger = LogManager.getLogger(ApplicationInfo.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("Demo Project Started !");
    }

}

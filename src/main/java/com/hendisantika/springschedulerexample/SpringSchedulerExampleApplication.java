package com.hendisantika.springschedulerexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class SpringSchedulerExampleApplication {

    private Logger LOG = LoggerFactory.getLogger(SpringSchedulerExampleApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringSchedulerExampleApplication.class, args);
    }

    @Scheduled(initialDelay = 3000, fixedDelay = 2000)
    public void takeAction() {
        LOG.info("Running the @Scheduled task..." + new Date());
    }
}

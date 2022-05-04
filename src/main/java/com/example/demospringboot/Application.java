package com.example.demospringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

@SpringBootApplication(
        scanBasePackages = {"com.example.demospringboot"}
)
public class Application extends AsyncConfigurerSupport {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        LOGGER.debug("Classpath: {}", runtimeMXBean.getClassPath());
        LOGGER.debug("Library Path: {}", runtimeMXBean.getLibraryPath());
        for (String argument : runtimeMXBean.getInputArguments()) {
            LOGGER.debug("Input Argument: {}", argument);
        }
    }

}

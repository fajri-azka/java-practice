package com.training.example;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

@Slf4j
public class LoggerLog {
    private static Logger LOGGER = LoggerFactory.getLogger(LoggerLog.class);

    public static void main(String[] args) {
        MDC.put("user", "rafal.kuc@sematext.com");
        LOGGER.info("This is an info level log message!");
        LOGGER.warn("This is an WARN level log");
    }
}

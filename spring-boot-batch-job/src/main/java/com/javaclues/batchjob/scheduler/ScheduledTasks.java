package com.javaclues.batchjob.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Shantnu Kumar on 28-02-2018.
 */
@Component
public class ScheduledTasks {

    /**
     * method will be executed within the given time interval
     */
    @Scheduled(fixedRate=1000)
    public void runkWithFixedInterval() {
        System.out.println(" Executed at    :"+new Date());
    }

    /**
     * Will execute at scheduled time.
     * Below you can find the example patterns from the spring forum:
     0 0 * * * *" = the top of every hour of every day.
     *10 * * * * * = every ten seconds.
     * "0 0 8-10 * * *" = 8, 9 and 10 o'clock of every day.
     "0 0/30 8-10 * * *" = 8:00, 8:30, 9:00, 9:30 and 10 o'clock every day.
     "0 0 9-17 * * MON-FRI" = on the hour nine-to-five weekdays
     "0 0 0 25 12 ?" = every Christmas Day at midnight

     Cron expression is represented by six fields:
     second, minute, hour, day of month, month, day(s) of week
     */

    @Scheduled(cron="0 0/50 * * * *")
    public void runkAtFixedTime() {
        System.out.println(" Fixed Executed at    :"+new Date());
    }


}

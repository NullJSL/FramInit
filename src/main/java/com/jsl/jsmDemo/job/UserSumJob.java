package com.jsl.jsmDemo.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Filename:    com.jsl.jsmDemo.job
 * Copyright:   Copyright (c)2017
 * Company:     冠群驰骋
 *
 * @author: 贾.帅.
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2018-09-03 16:27
 * Description:
 * <p/>
 * Modification History:
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2018-09-03  贾帅      1.0     1.0 Version
 */
@Component
public class UserSumJob {


    private final Logger logger = LoggerFactory.getLogger(UserSumJob.class);

    private Boolean isRun = false;

    @Scheduled(cron = "0/5 * * * * ?")
    public void sumJob(){

        try {
            logger.info("123,上山打老虎");
        }catch (Exception e){
            logger.error(e.getMessage());
        }finally {
            isRun = false;
        }
        if (isRun){
            return;
        }
    }
}

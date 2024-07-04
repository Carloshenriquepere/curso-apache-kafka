package com.v1.str_consumer.listeners;

import com.v1.str_consumer.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
@Log4j2
@Component
public class StrConsumerListener {

    @StrConsumerCustomListener(groupId = "group-1")
    public void created(String message){
        log.info("CREATED ::: Receive message {}", message);

    }

    @StrConsumerCustomListener(groupId = "group-1")
    public void log(String message){
        log.info("LOG ::: Receive message {}", message);

    }
    @StrConsumerCustomListener(groupId = "group-2")
    public void history(String message){
        log.info("HISTORY ::: Receive message {}", message);

    }
}

package br.acbueno.consumer;

import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.vertx.ConsumeEvent;

@ApplicationScoped
public class ConsumerEvent {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerEvent.class);

    @ConsumeEvent(value = "appliation-event", blocking = true)
    void consumerEvent(String message) {
        LOGGER.info("Started consuming bus message={}", message);

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            LOGGER.error(e.getMessage());
        }
        LOGGER.info("Finished Consuming bus message={}", message);
    }

}

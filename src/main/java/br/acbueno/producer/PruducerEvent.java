package br.acbueno.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.runtime.StartupEvent;
import io.vertx.core.eventbus.EventBus;

@ApplicationScoped
public class PruducerEvent {

    private static final Logger LOGGER = LoggerFactory.getLogger(PruducerEvent.class);

    @Inject
    EventBus event;

    void onStart(@Observes StartupEvent start) {
        LOGGER.info("Started event bus");
        for(int i=0;i < 500;i++) {
            event.send("appliation-event", "Event:  " + i);
        }
        LOGGER.info("Finished event bus");
    }

}

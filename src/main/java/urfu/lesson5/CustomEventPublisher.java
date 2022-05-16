package urfu.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CustomEventPublisher implements ApplicationEventPublisherAware
{
    private ApplicationEventPublisher eventPublisher;

    public void publishCustomEvent(String message, String sender)
    {
        System.out.println("Create event with message: " + message + " from " + sender);
        MessageSentEvent event = new MessageSentEvent(this, message, sender);
        eventPublisher.publishEvent(event);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher)
    {
        eventPublisher = applicationEventPublisher;
    }
}

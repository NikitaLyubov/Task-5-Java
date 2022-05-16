package urfu.lesson5;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SimpleEventListener implements ApplicationListener<MessageSentEvent>
{
    @Override
    public void onApplicationEvent(MessageSentEvent event)
    {
        System.out.println(event.getMessageReport());
    }
}

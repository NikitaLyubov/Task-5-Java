package urfu.lesson5;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncEventListener implements ApplicationListener<MessageSentEvent>
{
    @Async
    @Override
    public void onApplicationEvent(MessageSentEvent event)
    {
        System.out.println(event.getMessageReport());
    }
}

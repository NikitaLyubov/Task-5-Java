package urfu.lesson5;

import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
public class MyTransactionalEventListener
{
    @TransactionalEventListener
    public void onApplicationEvent(MessageSentEvent event)
    {
        System.out.println(event.getMessageReport());
    }
}

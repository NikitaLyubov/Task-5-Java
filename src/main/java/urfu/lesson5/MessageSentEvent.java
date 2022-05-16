package urfu.lesson5;

import org.springframework.context.ApplicationEvent;

public class MessageSentEvent extends ApplicationEvent
{
    private final String message;
    private final String sender;

    public MessageSentEvent(Object source, String message, String sender)
    {
        super(source);
        this.message = message;
        this.sender = sender;
    }

    public String getMessageReport()
    {
        return sender + " sent a message: " + message;
    }
}

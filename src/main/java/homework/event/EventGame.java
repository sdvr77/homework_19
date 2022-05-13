package homework.event;

import org.springframework.context.ApplicationEvent;

public class EventGame extends ApplicationEvent {

    public EventGame(Object source) {
        super(source);
    }

    public static EventGame of(String msgEvent) {
        return new EventGame(new EventData(msgEvent));
    }
}

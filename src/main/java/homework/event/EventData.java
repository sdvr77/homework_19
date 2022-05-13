package homework.event;

public class EventData {

    private final String msgEvent;

    public EventData(String msgEvent) {
        this.msgEvent = msgEvent;
    }

    public String getMsgEvent() {
        return msgEvent;
    }

    @Override
    public String toString() {
        return getMsgEvent();
    }
}

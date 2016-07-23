package entity;

/**
 * Created by Kevin Khanda on 7/23/2016.
 * Represents Event Card entity from database.
 */
public class EventCard implements DomainObject {

    // Entity that connects event with particular card.
    private int eventId;
    private int cardId;

    public EventCard(int eventId, int cardId) {
        this.eventId = eventId;
        this.cardId = cardId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
}

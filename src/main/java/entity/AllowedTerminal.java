package entity;

/**
 * Created by Kevin Khanda on 7/23/2016.
 * Represents Allowed_Terminal entity from Database.
 */
public class AllowedTerminal implements DomainObject {

    private int cardId;
    private int terminalId;

    public AllowedTerminal(int cardId, int terminalId) {
        this.cardId = cardId;
        this.terminalId = terminalId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(int terminalId) {
        this.terminalId = terminalId;
    }
}

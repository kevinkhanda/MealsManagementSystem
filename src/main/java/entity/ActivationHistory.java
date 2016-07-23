package entity;

import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by Kevin Khanda on 7/23/2016.
 * Represents Activation_History entity from database.
 */
public class ActivationHistory implements DomainObject {

    private BigInteger id;
    private int cardId;
    private int terminalId;
    private Timestamp timestamp;

    public ActivationHistory(BigInteger id, int cardId,
                             int terminalId, Timestamp timestamp) {
        this.id = id;
        this.cardId = cardId;
        this.terminalId = terminalId;
        this.timestamp = timestamp;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
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

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}

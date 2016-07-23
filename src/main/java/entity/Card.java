package entity;

/**
 * Created by Kevin Khanda on 7/23/2016.
 * Represents Card entity from database.
 */
public class Card implements DomainObject {

    private int id;
    // Discuss foreign keys with Almira
    private int userId;
    private int programId;
    private String barcode;
    private String nfcCode;
    private boolean isBlocked;
    private boolean notificationOn;

    public Card(int userId, int id, int programId, String barcode, String nfcCode,
                boolean isBlocked, boolean notificationOn) {
        this.userId = userId;
        this.id = id;
        this.programId = programId;
        this.barcode = barcode;
        this.nfcCode = nfcCode;
        this.isBlocked = isBlocked;
        this.notificationOn = notificationOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getNfcCode() {
        return nfcCode;
    }

    public void setNfcCode(String nfcCode) {
        this.nfcCode = nfcCode;
    }

    public boolean isNotificationOn() {
        return notificationOn;
    }

    public void setNotificationOn(boolean notificationOn) {
        this.notificationOn = notificationOn;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}

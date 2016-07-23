package entity;

/**
 * Created by Kevin Khanda on 7/23/2016.
 * Represents Quota entity from database.
 */
public class Quota implements DomainObject {

    private int id;
    // Think about adding this parameter.
    private int mealTypeId;
    private int quantity;
    private int timeLimit;
    // Deleted boolean isWeekend from database because it is redundant if isWorkday is false
    private boolean isWorkday;

    public Quota(int id, int mealTypeId, int quantity, int timeLimit, boolean isWorkday) {
        this.id = id;
        this.mealTypeId = mealTypeId;
        this.quantity = quantity;
        this.timeLimit = timeLimit;
        this.isWorkday = isWorkday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMealTypeId() {
        return mealTypeId;
    }

    public void setMealTypeId(int mealTypeId) {
        this.mealTypeId = mealTypeId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public boolean isWorkday() {
        return isWorkday;
    }

    public void setWorkday(boolean workday) {
        isWorkday = workday;
    }
}

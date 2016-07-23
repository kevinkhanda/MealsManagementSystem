package entity;

/**
 * Created by Kevin Khanda on 7/23/2016.
 * Representing Meal_Activation entity from database.
 */
public class MeaActivation implements DomainObject {

    private int activationId;
    private int mealTypeId;

    public MeaActivation(int activationId, int mealTypeId) {
        this.activationId = activationId;
        this.mealTypeId = mealTypeId;
    }

    public int getActivationId() {
        return activationId;
    }

    public void setActivationId(int activationId) {
        this.activationId = activationId;
    }

    public int getMealTypeId() {
        return mealTypeId;
    }

    public void setMealTypeId(int mealTypeId) {
        this.mealTypeId = mealTypeId;
    }
}

package entity;

import java.sql.Time;

/**
 * Created by Kevin Khanda on 7/23/2016.
 * Represents Meal_Type entity from a database.
 */
public class MealType implements DomainObject {

    private int id;
    private String name;
    private Time start_at;
    private Time up_to;

    public MealType(int id, String name, Time start_at, Time up_to) {
        this.id = id;
        this.name = name;
        this.start_at = start_at;
        this.up_to = up_to;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getStart_at() {
        return start_at;
    }

    public void setStart_at(Time start_at) {
        this.start_at = start_at;
    }

    public Time getUp_to() {
        return up_to;
    }

    public void setUp_to(Time up_to) {
        this.up_to = up_to;
    }
}

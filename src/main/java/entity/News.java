package entity;

import java.io.File;
import java.sql.Date;

/**
 * Created by Kevin Khanda on 7/24/2016.
 * Class that represents News entity from database.
 * It allows to save pictures, name and description of news.
 */
public class News implements DomainObject {

    private String name;
    private String description;
    private File photo;
    private Date date;

    public News(String name, String description, File photo, Date date) {
        this.name = name;
        this.description = description;
        this.photo = photo;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

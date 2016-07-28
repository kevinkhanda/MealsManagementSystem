package entity;

import java.io.File;

/**
 * Created by Kevin Khanda on 7/24/2016.
 * Class that represents News entity from database.
 * It allows to save pictures, name and description of news.
 */
public class News implements DomainObject {

    private String name;
    private String description;
    private File photo;

    public News(String name, String description, File photo) {
        this.name = name;
        this.description = description;
        this.photo = photo;
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
}

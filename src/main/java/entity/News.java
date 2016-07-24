package entity;

import java.io.File;

/**
 * Created by Kevin Khanda on 7/24/2016.
 * Class that represents News entity from database.
 * It allows to save pictures, name and description of news.
 */
public class News implements DomainObject {

    private int id;
    private String name;
    private String description;
    private File photo;

    public News(int id, String name, String description, File photo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.photo = photo;
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

package entity;

import java.io.File;
import java.sql.Date;

/**
 * Created by Kevin Khanda on 7/24/2016.
 * Class that represents Menu entity from a database.
 * This cass would allow admin/editor to store menu for current day in a web app.
 */
public class Menu implements DomainObject {

    private int id;
    // I think we wi need one more entity for organisation (Trapeza, department)
    private String organisation;
    private Date date;
    // Doc file with menu will be stored here
    private File menu;

    public Menu(int id, String organisation, Date date, File menu) {
        this.id = id;
        this.organisation = organisation;
        this.date = date;
        this.menu = menu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public File getMenu() {
        return menu;
    }

    public void setMenu(File menu) {
        this.menu = menu;
    }
}

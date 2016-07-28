package entity;

import java.io.File;
import java.sql.Date;

/**
 * Created by Kevin Khanda on 7/24/2016.
 * Class that represents Menu entity from a database.
 * This cass would allow admin/editor to store menu for current day in a web app.
 */
public class Menu implements DomainObject {

    // I think we wi need one more entity for organisation (Trapeza, department)
    private Date date;
    // Doc file with menu will be stored here
    private File menu;

    public Menu(Date date, File menu) {
        this.date = date;
        this.menu = menu;
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

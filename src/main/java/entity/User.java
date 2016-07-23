package entity;

import java.math.BigInteger;

/**
 * Created by Kevin Khanda on 7/23/2016.
 * Entity that represents user data from a database.
 * Will include getters and setters for params.
 */
public class User implements DomainObject {

    private BigInteger id;
    private String name;
    private String lastName;
    private String fatherName;
    private String organisation;
    private String phone;
    private String email;
    private String login;
    private String password;

    // Ask Almira about roles and then decide how to set it here.
    private int roleId;

    public User(BigInteger id, String name, String lastName, String fatherName,
                String organisation, String phone, String email, String login, String password, int roleId) {

        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.organisation = organisation;
        this.phone = phone;
        this.email = email;
        this.login = login;
        this.password = password;
        this.roleId = roleId;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}

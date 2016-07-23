package entity;

import java.math.BigInteger;

/**
 * Created by Kevin Khanda on 7/23/2016.
 * Entity that represents user data from a database.
 * Will include getters and setters for params.
 */
public class User implements DomainObject {

    private BigInteger userId;
    private String userName;
    private String lastName;
    private String fatherName;
    private String userOrganisation;
    private String phone;
    private String userEmail;
    private String login;
    private String password;

    // Ask Amira about roles and then decide how to set it here.
    private int roleId;

    public User(BigInteger userId, String userName, String lastName, String fatherName,
                String userOrganisation, String phone, String userEmail, String login, String password, int roleId) {

        this.userId = userId;
        this.userName = userName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.userOrganisation = userOrganisation;
        this.phone = phone;
        this.userEmail = userEmail;
        this.login = login;
        this.password = password;
        this.roleId = roleId;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getUserOrganisation() {
        return userOrganisation;
    }

    public void setUserOrganisation(String userOrganisation) {
        this.userOrganisation = userOrganisation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
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

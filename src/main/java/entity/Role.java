package entity;

/**
 * Created by Kevin Khanda on 7/23/2016.
 * Represents Role entity from a database.
 * Getters and Setters included.
 */
public class Role implements DomainObject {

    private int roleId;
    private String roleName;

    public Role (int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}

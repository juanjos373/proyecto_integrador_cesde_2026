package co.edu.cesde.ga.model;

public class UserRole {

    private Long userId;
    private String roleId;

    public UserRole() {
    }

    public UserRole(Long userId, String roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userId=" + userId +
                ", roleId='" + roleId + '\'' +
                '}';
    }
}

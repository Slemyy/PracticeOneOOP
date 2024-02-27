import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String username;
    private String password;
    private boolean twoFactorAuthentication;
    private List<String> permissions;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.twoFactorAuthentication = false;
        this.permissions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTwoFactorAuthenticationEnabled() {
        return twoFactorAuthentication;
    }

    public void setTwoFactorAuthenticationEnabled(boolean twoFactorAuthentication) {
        this.twoFactorAuthentication = twoFactorAuthentication;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void addPermissions(String permission) {
        this.permissions.add(permission);
    }

    public void removePermission(String permission) {
        this.permissions.remove(permission);
    }

    public boolean hasPermission(String permission) {
        return this.permissions.contains(permission);
    }
}

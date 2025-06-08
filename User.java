import java.util.UUID;

public abstract class User {
    private UUID id;
    private String username;
    private String password;
    private String role;

    public User(String username, String password, UUID id) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

 
    public User(String username, String password, String role) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }


    public String getPassword(){
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

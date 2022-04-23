package Model.Entity;

public class InfoEntityBuilder {
    private String name;
    private String username;
    private String password;
    private String email;

   // public InfoEntityBuilder objj = new InfoEntityBuilder();
    public InfoEntityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public InfoEntityBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public InfoEntityBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public InfoEntityBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public InfoEntity createInfoEntity() {
        return new InfoEntity(name, username, password, email);
    }
}
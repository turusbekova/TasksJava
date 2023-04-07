package encapsulation;

public class LoginPassword {
    protected String name;
    public String login;
    private String password;

    public LoginPassword(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    // метод Инкапсуляции - Encapsulation
}

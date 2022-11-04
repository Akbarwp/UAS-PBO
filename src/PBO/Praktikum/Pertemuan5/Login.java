package PBO.Praktikum.Pertemuan5;

public class Login {
    // Variable
    private String username, password;
    
    // Constructor pertama
    Login() {
        this.username = "admin";
        this.password = "123";
    }
    
    // Constructor kedua
    Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    // Encapsulation
    // Getter
    String getUsername() {
        return this.username;
    }
    
    String getPassword() {
        return this.password;
    }
    
    // Setter
    void setUsername(String username) {
        this.username = username;
    }
    
    void setPassword(String password) {
        this.password = password;
    }
}

package PBO.Praktikum.Pertemuan5.Tugas;

public class Login {
    
    private String username, password;
    
    // Constructor
    Login() {
        this.username = "admin";
        this.password = "admin";
    }
    
    Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
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

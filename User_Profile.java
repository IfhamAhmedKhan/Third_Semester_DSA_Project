package dsa_quiz_game_project;
//Creating user profile
public class User_Profile extends DSA_Quiz_Game_Project{
    private String username;
    private int age;
    private String gender;
    private String password;
    //setters to set user values
    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //getters to get user values
    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
    
    public String getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }
    
}

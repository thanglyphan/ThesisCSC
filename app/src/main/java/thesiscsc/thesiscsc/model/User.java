package thesiscsc.thesiscsc.model;

/**
 * Created by thangphan on 22.02.2017.
 */

public class User {
    private String firstName, lastName, user_id, pos;

    public User(String firstName, String lastName, String user_id, String pos) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.user_id = user_id;
        this.pos = pos;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUser_id(){
        return user_id;
    }

    public String getPos(){
        return pos;
    }

    public String toString(){
        return firstName + " " + lastName;
    }
}

package thesiscsc.thesiscsc.model;

/**
 * Created by thangphan on 22.02.2017.
 */

public class User {
    private String firstName, lastName, user_id;

    public User(String firstName, String lastName, String user_id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.user_id = user_id;
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

    /*public String getPos(){
        return pos;
    }*/

    public String toString(){
        return firstName + " " + lastName;
    }
}

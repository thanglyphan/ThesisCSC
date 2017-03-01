package thesiscsc.thesiscsc.model;

/**
 * Created by thangphan on 22.02.2017.
 */

public class User {
    private String firstName, lastName, user_Id;

    public User(){}

    public User(String firstName, String lastName, String user_Id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.user_Id = user_Id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUser_Id(){
        return user_Id;
    }

    /*public String getPos(){
        return pos;
    }*/

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setUser_Id(String user_Id){
        this.user_Id = user_Id;
    }

    public String toString(){
        return firstName + " " + lastName + " (" + user_Id + ")";
    }
}

package thesiscsc.thesiscsc.model;

/**
 * Created by thang on 26.01.2017.
 */

public class Task {
    String name;
    int position;
    public Task(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName(){ return name; }
    public int getPosition() { return position; }
}

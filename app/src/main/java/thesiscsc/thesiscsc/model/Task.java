package thesiscsc.thesiscsc.model;

import domain.TaskFindResult;

/**
 * Created by thang on 26.01.2017.
 */

public class Task extends domain.TaskFindResult {
    TaskFindResult task;
    String taskName;
    int position;

    public Task(String taskName, int position){
        this.taskName = taskName;
        this.position = position;
    }

    public Task(TaskFindResult task, int position) {
        this.task = task;
        this.position = position;
    }

    public TaskFindResult getTask(){ return task; }

    public String getTaskName(){
        if (task != null) {
            return task.nlsName;
        } else {
            return taskName;
        }
    }
    public int getPosition() { return position; }

}

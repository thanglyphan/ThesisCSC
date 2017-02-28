package thesiscsc.thesiscsc.model;

import domain.TaskFindResult;

/**
 * Created by thang on 26.01.2017.
 */

public class Task extends domain.TaskFindResult {
    String taskName;
    int position;

    public Task(String taskName, int position){
        this.taskName = taskName;
        this.position = position;
    }

    public Task(TaskFindResult task, int position) {
        super.nlsName = task.nlsName;
        super.actualOwner = task.actualOwner;
        super.internalName = task.internalName;
        super.priority = task.priority;
        super.processIdentifier = task.processIdentifier;
        super.subProcess = task.subProcess;
        super.status = task.status;
        super.lastUpdatedTimeStamp = task.lastUpdatedTimeStamp;

        this.position = position;
    }

    public String getTaskName(){
        if (super.nlsName != null) {
            return super.nlsName;
        } else {
            return taskName;
        }
    }
    public int getPosition() { return position; }
}

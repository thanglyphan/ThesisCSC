package thesiscsc.thesiscsc.model;

import SicsWsDomainSearchEntryPoint.TaskFindResult;

/**
 * Created by thang on 26.01.2017.
 */

public class Task extends SicsWsDomainSearchEntryPoint.TaskFindResult {
    String taskName;
    String noOwner = "";
    String noStatus = "";
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
        super.startActionType = task.startActionType;
        super.processIdentifier = task.processIdentifier;
        super.subProcess = task.subProcess;
        super.status = task.status;
        super.lastUpdatedTimeStamp = task.lastUpdatedTimeStamp;
        super.displayDiscriminator = task.displayDiscriminator;

        this.position = position;
    }

    public String getStatus (){
        if (super.status != null){
            return super.status.code;
        } else {
            return noStatus;
        }
    }

    public String getStartActionType(){
        if (super.startActionType != null){
            return super.startActionType.code;
        } else {
            return noStatus;
        }
    }

    public String getDisplayDiscriminator(){
        if (super.displayDiscriminator != null){
            return super.displayDiscriminator;
        } else {
            return noStatus;
        }
    }

    public String getTaskName(){
        if (super.nlsName != null) {
            return super.nlsName;
        } else {
            return taskName;
        }
    }
    public int getPosition() { return position; }

    public String getActualOwner(){
        if (super.actualOwner != null){
            return super.actualOwner.userId;
        } else {
            return noOwner;
        }
    }
    public String getPID(){
        return super.processIdentifier;
    }
}

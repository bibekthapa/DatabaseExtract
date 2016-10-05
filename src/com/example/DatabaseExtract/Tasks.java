/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.DatabaseExtract;

/**
 *
 * @author HOME
 */
public class Tasks {
    
    private int taskId;
    private String taskDescription;
    private Project projectId;
    private Status taskStatusID;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Project getProjectId() {
        return projectId;
    }

    public void setProjectId(Project projectId) {
        this.projectId = projectId;
    }

    public Status getTaskStatusID() {
        return taskStatusID;
    }

    public void setTaskStatusID(Status taskStatusID) {
        this.taskStatusID = taskStatusID;
    }
    
    
}

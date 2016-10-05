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
public class Status {
    private int projectStatusId;
    private String projectStatus;
    private int taskStatusId;
    private String taskStatus;

    public int getTaskStatusId() {
        return taskStatusId;
    }

    public void setTaskStatusId(int taskStatusId) {
        this.taskStatusId = taskStatusId;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getProjectStatusId() {
        return projectStatusId;
    }

    public void setProjectStatusId(int projectStatusId) {
        this.projectStatusId = projectStatusId;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }
    
    
    
    
}

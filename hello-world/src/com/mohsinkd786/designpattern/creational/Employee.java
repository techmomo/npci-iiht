package com.mohsinkd786.designpattern.creational;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee implements Cloneable {
    private List<String> projects;

    public Employee(){
        this.projects = new ArrayList<>();
    }

    public Employee(List<String> projects){
        this.projects = projects;
    }
    public void loadProjects(){
        // load the data from source
        projects.add("One");
        projects.add("Two");
        projects.add("Three");
    }

    public List<String> getProjects() {
        return projects;
    }

    // approach 1 : using clone

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Employee cloned = (Employee) super.clone();
//        cloned.projects = this.getProjects();
//        return cloned;
//    }

    // approach 2: using new keyword
    // considering only load projects is a heavy operation


    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> projects = new ArrayList<>();
        for (int i = 0; i < this.projects.size() ; i++) {
            // copy projects from current object to nw object
            projects.add(projects.get(i));
        }
        return new Employee(projects);
    }
}

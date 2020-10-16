package ru.x5.java03;

public class Student {
    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getGroup() {

        return group;
    }

    public void setGroup(String group) {

        this.group = group;
    }

    public double getAverageMark() {

        return averageMark;
    }

    public void setAverageMark(Double averageMark) {

        this.averageMark = averageMark;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String firstName, lastName, group;
    private double averageMark;

    public int getScholarship(){
        if (this.averageMark == 5.0) {
            return 100;
        } else {
            return 80;
        }

    }

}

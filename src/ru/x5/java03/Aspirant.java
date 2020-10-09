package ru.x5.java03;

public class Aspirant extends Student {

    private String scientificWork;

    public Aspirant(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        return (100 + super.getScholarship());
    }
}

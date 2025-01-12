package ioprogs;

import java.io.Serializable;

public class Student implements Serializable{
    private int regno;
    private String name;
    transient private int avg;
    public Student(int regno, String name, int avg) {
        this.regno = regno;
        this.name = name;
        this.avg = avg;
    }
    @Override
    public String toString() {
        return "Student [regno=" + regno + ", name=" + name + ", avg=" + avg + "]";
    }
}

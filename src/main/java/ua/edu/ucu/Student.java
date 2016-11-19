package main.java.ua.edu.ucu;


import java.util.Objects;

public class Student {

    private double GPA;
    private int year;
    private String name;
    private String surname;

    public Student(String name, String surname, double GPA, int year) {
        this.GPA = GPA;
        this.year = year;
        this.name = name;
        this.surname = surname;
    }

    public double getGPA() {
        return GPA;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (((Student) obj).getGPA() != this.getGPA()) {
            return false;
        }
        if (((Student) obj).getYear() != this.getYear()) {
            return false;
        }
        if (!((Student) obj).getName().equals(this.getName())) {
            return false;
        }
        if (!((Student) obj).getSurname().equals(this.getSurname())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ", surname=" + surname + ", " + "GPA=" + GPA + ", year=" + year + '}';
    }
    public static String[]getNameList(Student[]students){
        String[]names = new String[students.length];
        int k = 0;
        for(Student s: students){
            names[k] = s.getSurname()+ " " + s.getName();
            k++;
        }
        return names;
    }
}

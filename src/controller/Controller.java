package controller;

import database.Database;
import database.Student;
import gui.FormEvent;

public class Controller {
    private Database database = new Database();
    private Student student;

    public void loadFromFile() {
        database.loadFromFile();
    }

    public Student getStudent() {
        return database.getStudent();
    }

    public void setStudent(FormEvent event) {
        student = new Student(event.getName(), event.getNumber());

        database.setStudent(student);
    }
}

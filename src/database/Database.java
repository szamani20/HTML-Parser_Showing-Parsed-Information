package database;

import java.io.*;

public class Database {
    private Student student;

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void loadFromFile() {
        String fileName = "database.rtd";
        File file = new File(fileName);

        FileInputStream fis;
        ObjectInputStream ois;

        try {

            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            Student[] students = (Student[])ois.readObject();

            for (int i=0; i<students.length; ++i)
                if (students[i] != null&& student.getName().equals(students[i].getName())&& student.getStudentNumber().equals(students[i].getStudentNumber()))
                    student = students[0];

            ois.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }

}

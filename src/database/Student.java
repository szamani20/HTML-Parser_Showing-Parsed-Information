package database;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {
    public static final long serialVersionUID = 416468464;

    private String name;
    private String nickName;
    private String lastName;
    private String studentNumber;
    private String phoneNumber;
    private String id;
    private List<String> description;

    private String lastDescription;

    public Student(String name, String studentNumber) {
        if (name != null)
            this.name = name;
        if (studentNumber != null)
            this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getId() {
        return id;
    }

    public List<String> getDescription() {
        return description;
    }

    public String getLastDescription() {
        return lastDescription;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLastDescription(String lastDescription) {
        this.lastDescription = lastDescription;
    }
}

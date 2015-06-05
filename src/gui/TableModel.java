package gui;

import database.Student;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

    private Student student;
    private Student studentRow;
    private String colNames[] = {"Name", "LastName", "NickName", "PhoneNumber",
    "StudentNumber", "ID", "Description"};

    public TableModel() {

    }

    public String getColumnName(int column) {
        return colNames[column];
    }

    public void setData(Student student) {
        this.student = student;

        studentRow = student;

    }

    @Override
    public int getRowCount() {
        if (student != null)
            return studentRow.getDescription().size();
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        studentRow.setId(student.getId());
        studentRow.setLastDescription(student.getDescription().get(rowIndex));
        studentRow.setLastName(student.getLastName());
        studentRow.setNickName(student.getNickName());
        studentRow.setPhoneNumber(student.getPhoneNumber());

        switch (columnIndex) {
            case 0:
                return studentRow.getName();
            case 1:
                return studentRow.getLastName();
            case 2:
                return studentRow.getNickName();
            case 3:
                return studentRow.getPhoneNumber();
            case 4:
                return studentRow.getStudentNumber();
            case 5:
                return studentRow.getId();
            case 6:
                return studentRow.getLastDescription();
        }

        return null;
    }
}

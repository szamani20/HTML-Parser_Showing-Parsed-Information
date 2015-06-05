package gui;

import database.Student;

import javax.swing.*;
import java.awt.*;

public class TablePanel extends JPanel {
    private JTable table;
    private TableModel tableModel;

    public TablePanel() {

        Dimension dimension = new Dimension(900, 400);
        setSize(dimension);

        tableModel = new TableModel();
        table = new JTable(tableModel);

        setLayout(new BorderLayout());

        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public void refresh() {
        tableModel.fireTableDataChanged();
    }

    public void setData(Student student) {
        tableModel.setData(student);
    }
}

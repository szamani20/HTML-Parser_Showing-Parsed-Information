package gui;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Controller controller;
    private FormPanel formPanel;
    private TablePanel tablePanel;

    public MainFrame() {
        super("Retrieve");

        setLayout(new BorderLayout());

        formPanel = new FormPanel();
        tablePanel = new TablePanel();
        controller = new Controller();

        add(formPanel, BorderLayout.CENTER);

		// lambda only available in java8
        formPanel.setFormListener(event -> {
            controller.setStudent(event);
            controller.loadFromFile();
            tablePanel.setData(controller.getStudent());
            tablePanel.refresh();
        });

        add(formPanel, BorderLayout.WEST);
        add(tablePanel, BorderLayout.CENTER);

        setSize(1300, 400);
        setMinimumSize(new Dimension(1300, 400));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

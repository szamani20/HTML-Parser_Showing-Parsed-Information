package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel{
    private JLabel numberLabel;
    private JLabel nameLabel;

    private JTextField nameField;
    private JTextField numberField;

    private JButton okButton;

    private FormListener listener;

    public FormPanel() {
        Dimension dimension = getPreferredSize();
        dimension.width = 400;
        setPreferredSize(dimension);
        
        numberLabel = new JLabel("Student Number: ");
        nameLabel = new JLabel("Student Name: ");

        nameField = new JTextField(10);
        numberField = new JTextField(10);

        numberField.setText("93");

        okButton = new JButton("OK");

        okButton.addActionListener(e -> {
                FormEvent event = new FormEvent(this, nameField.getText(),
                numberField.getText());

            if (listener != null&& !nameField.getText().equals("")&& !numberField.getText().equals(""))
                listener.formEventOccur(event);
        });

        Border innerBorder = BorderFactory.createTitledBorder("Search Database");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        layoutComponents();

    }

    public void layoutComponents() {
        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        gc.weighty = 0.1;
        gc.weightx = 2;
        gc.gridy = 0;

        /////////////////first row//////////////////
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.fill = GridBagConstraints.NONE;
        gc.insets = new Insets(0, 0, 0, 5);

        add(nameLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);

        add(nameField, gc);

        ////////////////////next row//////////////////
        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.fill = GridBagConstraints.NONE;
        gc.insets = new Insets(0, 0, 0, 5);

        add(numberLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);

        add(numberField, gc);

        ////////////////////next row//////////////////
        gc.gridy++;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.fill = GridBagConstraints.NONE;
        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);

        add(okButton, gc);
    }

    public void setFormListener(FormListener listener) {
        this.listener = listener;
    }
}

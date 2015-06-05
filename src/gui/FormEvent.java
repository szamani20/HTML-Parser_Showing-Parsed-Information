package gui;

import java.util.EventObject;

public class FormEvent extends EventObject {
    private String name;
    private String number;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String name, String number) {
        super(source);
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}

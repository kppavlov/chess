import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Field extends JButton implements ActionListener {
    String fieldName;

    public Field(Icon icon) {
        super(icon);
    }

    public void setFieldName(String name) {
        fieldName = name;
    }

    public String getFieldName() {
        return  fieldName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        System.out.println(e.getModifiers());
        System.out.println(e.paramString());
        System.out.println(this.fieldName);

    }
}

package program4;

import javax.swing.*;
import java.awt.*;

public class EmployeeForm extends JFrame {

  public EmployeeForm(String title, String[] labels, int[] no_of_columns) {
    super(title);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar menuBar = new JMenuBar();

    JMenu filesMenu = new JMenu("Files");
    JMenu editMenu = new JMenu("Edit");
    JMenu searchMenu = new JMenu("Search");

    JMenuItem newItem = new JMenuItem("New", new ImageIcon(getClass().getResource("new.gif")));
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");

    filesMenu.add(newItem);
    filesMenu.add(saveItem);
    filesMenu.add(exitItem);

    menuBar.add(filesMenu);
    menuBar.add(editMenu);
    menuBar.add(searchMenu);

    this.setJMenuBar(menuBar);

    JPanel formPanel = new JPanel(new GridLayout(labels.length, 2, 10, 10));
    formPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

    for (int i = 0; i < labels.length; i++) {
      JLabel label = new JLabel(labels[i]);
      JTextField textField = new JTextField(no_of_columns[i]);
      formPanel.add(label);
      JPanel fieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
      fieldPanel.add(textField);
      formPanel.add(fieldPanel);
    }

    this.add(formPanel, BorderLayout.CENTER);

    this.pack();
    this.setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    int[] no_of_columns = new int[]{7, 20, 20, 10, 20, 20};
    String[] labels = {"ID", "Last Name", "First Name", "Phone", "Department Name", "Job Title"};
    EmployeeForm employeeform = new EmployeeForm("Employee Form", labels, no_of_columns);
  }
}
package program4;

import javax.swing.*;
import java.awt.*;

public class RadioButtonTest extends JFrame {

  private JRadioButton[] radioButtons;
  private JCheckBox[] checkBoxes;
  private JButton[] buttons;
  private JTextField[] textFields;
  private JLabel[] labels;
  private JLabel imageLabel;

  public JCheckBox getCheckBoxAt(int index) {
    return checkBoxes[index];
  }

  public JRadioButton getRadioButtonAt(int index) {
    return radioButtons[index];
  }

  public JButton getButtonAt(int index) {
    return buttons[index];
  }

  public JLabel getLabelAt(int index) {
    return labels[index];
  }

  public JTextField getTextAt(int index) {
    return textFields[index];
  }

  public JLabel getImage() {
    return imageLabel;
  }

  public RadioButtonTest(String str) {
    super(str);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    radioButtons = new JRadioButton[5];
    checkBoxes = new JCheckBox[5];
    buttons = new JButton[3];
    textFields = new JTextField[3];
    labels = new JLabel[3];

    imageLabel = new JLabel(new ImageIcon(getClass().getResource("Bird.gif")));
    imageLabel.setHorizontalAlignment(JLabel.CENTER);

    JPanel centerPanel = new JPanel(new GridLayout(1, 2, 20, 0));
    JPanel radioPanel = new JPanel(new GridLayout(5, 1));
    JPanel checkPanel = new JPanel(new GridLayout(5, 1));

    String[] animalNames = {"Bird", "Cat", "Dog", "Pig", "Rabbit"};
    ButtonGroup radioGroup = new ButtonGroup();

    for (int i = 0; i < 5; i++) {
      radioButtons[i] = new JRadioButton(animalNames[i]);
      radioGroup.add(radioButtons[i]);
      radioPanel.add(radioButtons[i]);

      checkBoxes[i] = new JCheckBox(animalNames[i]);
      checkPanel.add(checkBoxes[i]);
    }

    centerPanel.add(radioPanel);
    centerPanel.add(checkPanel);

    JPanel bottomPanel = new JPanel(new GridLayout(3, 3, 10, 10));
    bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    for (int i = 0; i < 3; i++) {
      labels[i] = new JLabel("Label " + i);
      textFields[i] = new JTextField(10);
      buttons[i] = new JButton("Button " + i);

      bottomPanel.add(labels[i]);
      bottomPanel.add(textFields[i]);
      bottomPanel.add(buttons[i]);
    }

    this.setLayout(new BorderLayout(10, 10));
    this.add(imageLabel, BorderLayout.NORTH);
    this.add(centerPanel, BorderLayout.CENTER);
    this.add(bottomPanel, BorderLayout.SOUTH);

    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new RadioButtonTest("Test 1");
  }
}

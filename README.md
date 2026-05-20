# java-swing-gui-forms

This repository contains two Java Swing GUI applications designed to demonstrate form generation and component management in Java. Both applications are contained within the `program4` package.

## Features

### Part 1: Employee Form
* **Dynamic Generation:** Implements an `EmployeeForm` class extending `JFrame`. The constructor accepts parallel arrays to dynamically generate `JLabel` names and specify the column width for corresponding `JTextField` components.
* **Menu Navigation:** Features a `File` menu (`JMenu`) containing embedded submenus (`JMenuItems`).
* **Layout Management:** Uses column specifications as hints for the LayoutManager to determine the size of the text fields.

### Part 2: Radio Button Test
* **Component Arrays:** Implements a `RadioButtonTest` class that organizes components neatly and symmetrically.
* **Mutually Exclusive Selections:** Features an array of five `JRadioButton` components on the left column where only one can be selected at a time.
* **Multiple Selections:** Features an array of five `JCheckBox` components on the right column allowing multiple selections simultaneously.
* **Structured UI:** Includes arrays of `JButton`, `JTextField`, and `JLabel` components at the bottom of the form, topped with a `JLabel` containing an image.
* **Testing Hooks:** Provides specific getter methods (e.g., `getCheckBoxAt`, `getRadioButtonAt`, `getButtonAt`) to allow external classes to validate the GUI structure.

## Prerequisites & Testing

* **Packaging:** All Java files must remain inside the `program4` package.
* **Execution:** To test the application, compile the source into a `.jar` file.
* **Automated Testers:** The forms are designed to be tested using provided external tester classes (`EmployeeFormTester.class` and `RadioButtonTester.class`) which programmatically activate the GUI components to ensure they meet the specifications. 
* **Batch Scripts:** Use the provided `prog4.bat` (Windows) or `prog4.sh` (Mac) inside a dedicated test folder along with your `.jar` and the tester classes to execute the programmatic tests.

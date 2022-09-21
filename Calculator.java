package project;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    Double num1, num2, result;
    char operator;
    JFrame jf;
    JLabel display, display2;

    JButton sevenButton, eightButton, nineButton, fourButton, fiveButton, sixButton, oneButton, twoButton, threeButton,
            zeroButton;
    JButton clearButton, divButton, multiButton, subButton, plusButton, eqButton, dotButton;
    boolean isDotclicked = false;

    public Calculator() {

        // Frame

        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(480, 620);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jf.setLocation(400, 150);
        jf.setLocation(900, 10);

        // Display

        display = new JLabel("");
        display.setBounds(60, 60, 340, 45);
        display.setBackground(Color.GRAY);
        display.setOpaque(true);
        display.setFont(new Font("Arial", Font.PLAIN, 25));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setForeground(Color.white);

        jf.add(display);
        jf.setVisible(true);

        display2 = new JLabel("");
        display2.setBounds(60, 45, 340, 15);
        display2.setHorizontalAlignment(SwingConstants.RIGHT);
        display2.setBackground(Color.gray);
        display2.setOpaque(true);
        display2.setForeground(Color.PINK);

        jf.add(display2);

        // Buttons

        clearButton = new JButton("C");
        jf.add(clearButton);
        clearButton.setBounds(80, 150, 60, 60);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 25));
        clearButton.setBackground(Color.green);
        clearButton.addActionListener(this);
        clearButton.setFocusable(false);

        divButton = new JButton("/");
        jf.add(divButton);
        divButton.setBounds(160, 150, 60, 60);
        divButton.setFont(new Font("Arial", Font.PLAIN, 25));
        divButton.addActionListener(this);
        divButton.setFocusable(false);

        multiButton = new JButton("*");
        jf.add(multiButton);
        multiButton.setBounds(240, 150, 60, 60);
        multiButton.setFont(new Font("Arial", Font.PLAIN, 25));
        multiButton.setFocusable(false);
        multiButton.addActionListener(this);

        subButton = new JButton("-");
        jf.add(subButton);
        subButton.setBounds(320, 150, 60, 60);
        subButton.setFont(new Font("Arial", Font.PLAIN, 25));
        subButton.addActionListener(this);
        subButton.setFocusable(false);

        sevenButton = new JButton("7");
        jf.add(sevenButton);
        sevenButton.setBounds(80, 230, 60, 60);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 25));
        sevenButton.addActionListener(this);
        sevenButton.setFocusable(false);

        eightButton = new JButton("8");
        jf.add(eightButton);
        eightButton.setBounds(160, 230, 60, 60);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 25));
        eightButton.addActionListener(this);
        eightButton.setFocusable(false);

        nineButton = new JButton("9");
        jf.add(nineButton);
        nineButton.setBounds(240, 230, 60, 60);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 25));
        nineButton.addActionListener(this);
        nineButton.setFocusable(false);

        plusButton = new JButton("+");
        jf.add(plusButton);
        plusButton.setBounds(320, 230, 60, 140);
        plusButton.setFont(new Font("Arial", Font.PLAIN, 25));
        plusButton.addActionListener(this);
        plusButton.setFocusable(false);

        fourButton = new JButton("4");
        jf.add(fourButton);
        fourButton.setBounds(80, 310, 60, 60);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 25));
        fourButton.addActionListener(this);
        fourButton.setFocusable(false);

        fiveButton = new JButton("5");
        jf.add(fiveButton);
        fiveButton.setBounds(160, 310, 60, 60);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 25));
        fiveButton.addActionListener(this);
        fiveButton.setFocusable(false);

        sixButton = new JButton("6");
        jf.add(sixButton);
        sixButton.setBounds(240, 310, 60, 60);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 25));
        sixButton.addActionListener(this);
        sixButton.setFocusable(false);

        oneButton = new JButton("1");
        jf.add(oneButton);
        oneButton.setBounds(80, 390, 60, 60);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 25));
        oneButton.addActionListener(this);
        oneButton.setFocusable(false);

        twoButton = new JButton("2");
        jf.add(twoButton);
        twoButton.setBounds(160, 390, 60, 60);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 25));
        twoButton.addActionListener(this);
        twoButton.setFocusable(false);

        threeButton = new JButton("3");
        jf.add(threeButton);
        threeButton.setBounds(240, 390, 60, 60);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 25));
        threeButton.addActionListener(this);
        threeButton.setFocusable(false);

        eqButton = new JButton("=");
        jf.add(eqButton);
        eqButton.setBounds(320, 390, 60, 140);
        eqButton.setFont(new Font("Arial", Font.PLAIN, 25));
        eqButton.setBackground(Color.RED);
        eqButton.addActionListener(this);
        eqButton.setFocusable(false);

        zeroButton = new JButton("0");
        jf.add(zeroButton);
        zeroButton.setBounds(80, 470, 140, 60);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 25));
        zeroButton.addActionListener(this);
        zeroButton.setFocusable(false);

        dotButton = new JButton(".");
        jf.add(dotButton);
        dotButton.setBounds(240, 470, 60, 60);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 25));
        dotButton.addActionListener(this);
        dotButton.setFocusable(false);

    }

    public static void main(String[] args) {
        new Calculator();

    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {

        if (e.getSource() == clearButton) {
            display.setText("");
            display2.setText("");
            result = num1 = num2 = (double) 0;
            isDotclicked = false;
        }
        if (e.getSource() == sevenButton) {

            display.setText(display.getText() + sevenButton.getText());
        }
        if (e.getSource() == eightButton) {
            display.setText(display.getText() + eightButton.getText());
        }
        if (e.getSource() == nineButton) {
            display.setText(display.getText() + nineButton.getText());
        }
        if (e.getSource() == sixButton) {
            display.setText(display.getText() + sixButton.getText());
        }
        if (e.getSource() == fiveButton) {
            display.setText(display.getText() + fiveButton.getText());
        }
        if (e.getSource() == fourButton) {
            display.setText(display.getText() + fourButton.getText());
        }
        if (e.getSource() == threeButton) {
            display.setText(display.getText() + threeButton.getText());
        }
        if (e.getSource() == twoButton) {
            display.setText(display.getText() + twoButton.getText());
        }
        if (e.getSource() == oneButton) {
            display.setText(display.getText() + oneButton.getText());
        }
        if (e.getSource() == zeroButton) {
            display.setText(display.getText() + zeroButton.getText());
        }
        if (e.getSource() == dotButton) {
            // isDotclicked=true;
            if (isDotclicked == false) {
                if (display.getText() == "") {
                    display.setText("0" + dotButton.getText());
                } else {
                    display.setText(display.getText() + dotButton.getText());

                }
                isDotclicked = true;
            } else {
                display.setText(display.getText());
            }
        }
        if (e.getSource() == plusButton) {
            isDotclicked = false;
            num1 = Double.parseDouble(display.getText());
            operator = '+';
            display2.setText(display2.getText() + display.getText() + operator);
            display.setText("");

        }
        if (e.getSource() == multiButton) {
            isDotclicked = false;
            num1 = Double.parseDouble(display.getText());
            operator = '*';
            display2.setText(display2.getText() + display.getText() + operator);
            display.setText("");
        }
        if (e.getSource() == divButton) {
            isDotclicked = false;
            num1 = Double.parseDouble(display.getText());
            operator = '/';
            display2.setText(display2.getText() + display.getText() + operator);
            display.setText("");
        }
        if (e.getSource() == subButton) {
            isDotclicked = false;
            num1 = Double.parseDouble(display.getText());
            operator = '-';
            display2.setText(display2.getText() + display.getText() + operator);
            display.setText("");
        }
        if (e.getSource() == eqButton) {
            isDotclicked = false;
            num2 = Double.parseDouble(display.getText());
            // operator='=';
            operation();
            display2.setText(display2.getText() + display.getText() + "=");
            display.setText("" + result);

        }

    }

    public void operation() {
        switch (operator) {
            case '+':
                // System.out.println(num1);
                result = num1 + num2;
                // System.out.println(num1);
                num1 = result;
                System.out.println(num1);
                break;
            case '-':
                result = num1 - num2;
                num1 = result;
                break;
            case '/':
                result = num1 / num2;
                num1 = result;
                break;
            case '*':
                result = num1 * num2;
                num1 = result;
                break;

            default:
                break;
        }
    }

}

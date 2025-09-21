package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Payment extends JFrame implements ActionListener {
    JTextField cardNumberField;
    JTextField cardHolderField;
    JTextField expiryDateField;
    JTextField cvvField;
    JTextField upiField;
    JTextField netBankingField;
    JComboBox<String> paymentOptions;

    Payment() {
        setBounds(500, 200, 600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Payment");

        JLabel paymentOptionsLabel = new JLabel("Select Payment Method:");
        String[] options = {"Card Payment", "UPI Payment", "NetBanking"};
        paymentOptions = new JComboBox<>(options);
        paymentOptions.addActionListener(this);

        setLayout(new GridLayout(10, 2, 10, 10));
        add(paymentOptionsLabel);
        add(paymentOptions);

        showCardPaymentFields(); // Default to card payment fields

        setVisible(true);
    }

    private void showCardPaymentFields() {
        clearFields();
        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberField = new JTextField(16);
        JLabel cardHolderLabel = new JLabel("Card Holder:");
        cardHolderField = new JTextField(30);
        JLabel expiryDateLabel = new JLabel("Expiry Date (MM/YY):");
        expiryDateField = new JTextField(5);
        JLabel cvvLabel = new JLabel("CVV:");
        cvvField = new JTextField(3);
        JButton payButton = new JButton("Pay");
        payButton.addActionListener(this);

        add(cardNumberLabel);
        add(cardNumberField);
        add(cardHolderLabel);
        add(cardHolderField);
        add(expiryDateLabel);
        add(expiryDateField);
        add(cvvLabel);
        add(cvvField);
        add(new JLabel()); // empty cell
        add(payButton);

        revalidate();
        repaint();
    }

    private void showUpiPaymentFields() {
        clearFields();
        JLabel upiLabel = new JLabel("UPI ID:");
        upiField = new JTextField(30);
        JButton payButton = new JButton("Pay");
        payButton.addActionListener(this);

        add(upiLabel);
        add(upiField);
        add(new JLabel()); // empty cell
        add(payButton);

        revalidate();
        repaint();
    }

    private void showNetBankingFields() {
        clearFields();
        JLabel netBankingLabel = new JLabel("NetBanking ID:");
        netBankingField = new JTextField(30);
        JButton payButton = new JButton("Pay");
        payButton.addActionListener(this);

        add(netBankingLabel);
        add(netBankingField);
        add(new JLabel()); // empty cell
        add(payButton);

        revalidate();
        repaint();
    }

    private void clearFields() {
        getContentPane().removeAll();
        add(new JLabel("Select Payment Method:"));
        add(paymentOptions);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == paymentOptions) {
            String selectedOption = (String) paymentOptions.getSelectedItem();
            if (selectedOption.equals("Card Payment")) {
                showCardPaymentFields();
            } else if (selectedOption.equals("UPI Payment")) {
                showUpiPaymentFields();
            } else if (selectedOption.equals("NetBanking")) {
                showNetBankingFields();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Payment Successful!");
            setVisible(false);
            // Optionally, navigate to another screen or perform other actions
        }
    }

    public static void main(String[] args) {
        new Payment().setVisible(true);
    }
}

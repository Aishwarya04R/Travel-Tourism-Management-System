package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    
    String username;
    JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkPackages, bookPackages, viewPackages; 
    JButton viewHotels, destinations, bookHotel, viewBookedHotel, Payments, Calculator, notePad, about, deletePersonalDetails;
    
    Dashboard(String username){
        
        this.username = username;
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 =  i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(5, 0, 70, 70);
        p1.add(image);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        heading.setForeground(Color.WHITE);
        heading.setBounds(80, 10, 300, 40);
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.addActionListener(this);
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setBounds(0, 50, 300, 50);
        updatePersonalDetails.addActionListener(this);
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton("delete Personal Details");
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.addActionListener(this);
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        p2.add(deletePersonalDetails);
        
        checkPackages = new JButton("Check Package");
        checkPackages.setBackground(new Color(0, 0, 102));
        checkPackages.setForeground(Color.WHITE);
        checkPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkPackages.setBounds(0, 200, 300, 50);
        checkPackages.addActionListener(this);
        checkPackages.setMargin(new Insets(0, 0, 0, 110));
        p2.add(checkPackages);
        
        bookPackages = new JButton("Book Package");
        bookPackages.setBackground(new Color(0, 0, 102));
        bookPackages.setForeground(Color.WHITE);
        bookPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookPackages.setBounds(0, 250, 300, 50);
        bookPackages.addActionListener(this);
        bookPackages.setMargin(new Insets(0, 0, 0, 120));
        p2.add(bookPackages);
        
        viewPackages = new JButton("View Package");
        viewPackages.setBackground(new Color(0, 0, 102));
        viewPackages.setForeground(Color.WHITE);
        viewPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPackages.setBounds(0, 300, 300, 50);
        viewPackages.addActionListener(this);
        viewPackages.setMargin(new Insets(0, 0, 0, 120));
        p2.add(viewPackages);
        
        viewHotels = new JButton("View Hotels");
        viewHotels.setBackground(new Color(0, 0, 102));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewHotels.setBounds(0, 350, 300, 50);
        viewHotels.addActionListener(this);
        viewHotels.setMargin(new Insets(0, 0, 0, 130));
        p2.add(viewHotels);
        
        bookHotel = new JButton("Book Hotel");
        bookHotel.setBackground(new Color(0, 0, 102));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookHotel.setBounds(0, 400, 300, 50);
        bookHotel.addActionListener(this);
        bookHotel.setMargin(new Insets(0, 0, 0, 140));
        p2.add(bookHotel);
        
        viewBookedHotel = new JButton("View Booked Hotel");
        viewBookedHotel.setBackground(new Color(0, 0, 102));
        viewBookedHotel.setForeground(Color.WHITE);
        viewBookedHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewBookedHotel.setBounds(0, 450, 300, 50);
        viewBookedHotel.addActionListener(this);
        viewBookedHotel.setMargin(new Insets(0, 0, 0, 70));
        p2.add(viewBookedHotel);
                            
        destinations = new JButton("Destinations");
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setBounds(0, 500, 300, 50);
        destinations.addActionListener(this);
        destinations.setMargin(new Insets(0, 0, 0, 125));
        p2.add(destinations);
        
        Payments = new JButton("Payments");
        Payments.setBackground(new Color(0, 0, 102));
        Payments.setForeground(Color.WHITE);
        Payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Payments.setBounds(0, 550, 300, 50);
        Payments.addActionListener(this);
        Payments.setMargin(new Insets(0, 0, 0, 155));
        p2.add(Payments);
        
        Calculator = new JButton("Calculator");
        Calculator.setBackground(new Color(0, 0, 102));
        Calculator.setForeground(Color.WHITE);
        Calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Calculator.setBounds(0, 600, 300, 50);
        Calculator.addActionListener(this);
        Calculator.setMargin(new Insets(0, 0, 0, 155));
        p2.add(Calculator);
        
        notePad = new JButton("Notepad");
        notePad.setBackground(new Color(0, 0, 102));
        notePad.setForeground(Color.WHITE);
        notePad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notePad.setBounds(0, 650, 300, 50);
        notePad.addActionListener(this);
        notePad.setMargin(new Insets(0, 0, 0, 155));
        p2.add(notePad);
        
        about = new JButton("About");
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setBounds(0, 700, 300, 50);
        about.addActionListener(this);
        about.setMargin(new Insets(0, 0, 0, 175));
        p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 =  i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel icon = new JLabel(i6);
        icon.setBounds(0, 0, 1650, 1000);
        add(icon);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 70, 1200, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 55));
        icon.add(text);
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        } else if (ae.getSource() == updatePersonalDetails){
            new UpdateCustomer(username);
        } else if (ae.getSource() == checkPackages){
            new CheckPackage(); 
        } else if (ae.getSource() == bookPackages){
            new BookPackage(username);
        } else if (ae.getSource() == viewPackages){
            new ViewPackage(username);
        } else if (ae.getSource() == viewHotels){
            new CheckHotels();
        } else if (ae.getSource() == destinations){
            new Destinations();
        } else if (ae.getSource() == bookHotel){
            new BookHotel(username);
        } else if (ae.getSource() == viewBookedHotel){
            new ViewBookedHotel(username);
        } else if (ae.getSource() == Payments){
            new Payment();
               
        } else if (ae.getSource() == Calculator){
            try {
               Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == notePad){
            try {
               Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == about){
            new About();
        } else if (ae.getSource() == deletePersonalDetails){
            new DeleteDetails(username);
        }
    
    }
    public static void main(String[] args){
        new Dashboard("");
    }
}

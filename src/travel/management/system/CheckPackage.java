package travel.management.system;

import java.awt.*;
import javax.swing.*; 

public class CheckPackage extends JFrame {
    
    CheckPackage(){
        setBounds(450, 200, 900, 600);  
        
        String[] package1 = {"Adventure Awaits", "--> 7 Days and 6 Nights", "--> Airport Assistance", "--> Half Day City Tour", "--> Daily Buffet", "--> Profesional Guiders", "--> Souvenir Travel Kit", "--> Travel Insurance", "Book Your Adventure!", "(Summer Special)-->", "RS 12000/-", "package1.jpg"};
        String[] package2 = {"Wildlife Wonders", "--> 5 Days and 4 Nights", "--> Safari and Jungle Walks","--> Night Vision Tours","--> Bird Watching","--> Animal Tracking","--> Jungle Lodging","--> Campfire Evenings","Explore Wild Creatures!","(safari Serenity!)-->","RS 18000/-", "package2.jpg"}; 
        String[] package3 = {"Hidden Gems","--> 6 Days and 5 Nights","--> Secret Historical Sites", "--> Hidden Waterfalls","--> Private Beaches","--> Hidden Markets Tour","--> Ancient Ruins Exploration","--> Mystic Forest", "Explore Far and Wide!","(Nature's Bliss)-->","RS 16000/-", "package3.jpg"};
        
        
        
        JTabbedPane tab = new JTabbedPane();
         
        JPanel p1 = createPackage(package1);
        tab.addTab("Package 1", null, p1);
        
        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2", null, p2);
        
        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3", null, p3);
        
        add(tab);
        
        setVisible(true);
        
    }
    
    public JPanel createPackage(String[] pack){
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1 = new JLabel(pack[0]);
        l1.setForeground(Color.GREEN);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        l1.setBounds(50, 5, 300, 30);
        p1.add(l1);
        
        JLabel l2 = new JLabel(pack[1]);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Tahoma", Font.BOLD, 20));
        l2.setBounds(30, 60, 300, 30);
        p1.add(l2);
        
        JLabel l3 = new JLabel(pack[2]);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tahoma", Font.BOLD, 20));
        l3.setBounds(30, 110, 300, 30);
        p1.add(l3);
        
        JLabel l4 = new JLabel(pack[3]);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tahoma", Font.BOLD, 20));
        l4.setBounds(30, 160, 300, 30);
        p1.add(l4);
        
        JLabel l5 = new JLabel(pack[4]);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Tahoma", Font.BOLD, 20));
        l5.setBounds(30, 210, 300, 30);
        p1.add(l5);
        
        JLabel l6 = new JLabel(pack[5]);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Tahoma", Font.BOLD, 20));
        l6.setBounds(30, 270, 300, 30);
        p1.add(l6);
        
        JLabel l7 = new JLabel(pack[6]);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Tahoma", Font.BOLD, 20));
        l7.setBounds(30, 310, 300, 30);
        p1.add(l7);
        
        JLabel l8 = new JLabel(pack[7]);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Tahoma", Font.BOLD, 20));
        l8.setBounds(30, 360, 300, 30);
        p1.add(l8);
        
        JLabel l9 = new JLabel(pack[8]);
        l9.setForeground(Color.GREEN);
        l9.setFont(new Font("Tahoma", Font.BOLD, 25));
        l9.setBounds(60, 430, 300, 30);
        p1.add(l9);
        
        JLabel l10 = new JLabel(pack[9]);
        l10.setForeground(Color.MAGENTA);
        l10.setFont(new Font("Tahoma", Font.BOLD, 25));
        l10.setBounds(80, 480, 300, 30);
        p1.add(l10);
        
        JLabel l11 = new JLabel(pack[10]);
        l11.setForeground(Color.MAGENTA);
        l11.setFont(new Font("Tahoma", Font.BOLD, 25));
        l11.setBounds(500, 480, 300, 30);
        p1.add(l11);
                
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/" + pack[pack.length - 1]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 500, 300);
        p1.add(image);
        
        return p1;
        
    }
        
    
    
    public static void main(String[] args){
        new CheckPackage();
    }
   
}

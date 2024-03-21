//import java.util.Random;

import javax.swing.*;
//import javax.swing.text.AttributeSet.ColorAttribute;
public class form1
{
    JFrame f;
    form1()
    {
        f=new JFrame();
        //label section
        JLabel firstName=new JLabel("fisrt Name");
        JLabel lastName=new JLabel("Last Name");
        firstName.setBounds(10,50,100,20);;
        lastName.setBounds(10,75,100,20);
        f.add(firstName);
        f.add(lastName);
        //textArea section
        JTextArea fname=new JTextArea();
        JTextArea lname=new JTextArea();
        fname.setBounds(120,50,100,20);
        lname.setBounds(120,75,100,20);;
        f.add(lname);
        f.add(fname);
        //checkbox
        JCheckBox bca=new JCheckBox("bca");
        JCheckBox bba=new JCheckBox("bba");
        bca.setBounds(10,100,100,30);
        bba.setBounds(120,100,100,30);
        f.add(bca);
        f.add(bba);

         //radioButton
        JRadioButton Male=new JRadioButton("A) Male");
        JRadioButton Female=new JRadioButton("B) Female");

        Male.setBounds(10,125,100,30);
        Female.setBounds(10,150,100,30);
        f.add(Male);
        f.add(Female);
        //button
        JButton submit=new JButton("Submit");
        submit.setBounds(60,175,100,30);
        f.add(submit);

        
        f.setSize(300,300);
        
        
         f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new form1();
    }
}
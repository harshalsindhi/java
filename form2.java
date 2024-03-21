//mport javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form2 implements ActionListener {
    TextArea text;
    Label l;
    form2(){
       Frame f=new Frame();
       l=new Label("Eneter Your name");
        Button btn=new Button("click me");
        btn.setBounds(100,200,100,20);
        btn.addActionListener(this);
        f.add(btn);
       l.setBounds(10,50,100,30);
       f.add(l);
       text=new TextArea();
       text.setBounds(150,150,100,30);
       f.add(text);
       f.setSize(500,300);
       f.setVisible(true);
       f.setLayout(null);
    }
    public void actionPerformed(ActionEvent e)
    {
        text.setText("click event fire");
    }
    public static void main(String []args)
    {
        new form2();
    }
}

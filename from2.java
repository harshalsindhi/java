import java.awt.*;
import java.awt.event.*;
class  from2 implements ActionListener{
	Label l;
	TextArea t;
	from2(){
		Frame f=new Frame();
		 l=new Label();
		l.setBounds(10,10,100,20);

		 t=new TextArea();
		t.setBounds(100,150,100,20);

		Button btn=new Button("click me");
		btn.setBounds(10,200,50,30);
		btn.addActionListener(this);
		f.add(t);
		f.add(btn);
		f.add(l);
		f.setSize(300,300);
		f.setVisible(true);
		f.setLayout(null);


		}
		public void actionPerformed(ActionEvent e){
			t.setText("Harshal Sindhi");
			}
		public static void main(String args[]){
			from2 r=new from2();
			}

	}
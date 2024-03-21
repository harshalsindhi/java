import java.awt.*;
import java.awt.event.*;
class from implements MouseListener{
	Label l;
	from(){
		Frame f=new Frame();
		l=new Label("enter the name:");
		l.setBounds(20,20,60,20);
		l.addMouseListener(this);
		f.add(l);
		f.setSize(300,300);
		f.setVisible(true);
		f.setLayout(null);

		}
		public void mouseExited(MouseEvent e){
			l.setText("mouse exited");
			}
		public void mouseClicked(MouseEvent e){
					l.setText("mouse clicked");
			}
		public void mouseReleased(MouseEvent e){
					l.setText("mouse released");
			}
			public void mouseEntered(MouseEvent e){
						l.setText("mouse entered");
			}
			public void mousePressed(MouseEvent e){
						l.setText("mouse pressed");
			}
		public static void main(String args[]){
			from o=new from();
			}

	}
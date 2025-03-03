package FirstPrograms;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

	class  Valentine extends JFrame{
    JLabel lblText;
    Valentine(){
    setTitle("Love Celebration");
    setLayout(new BorderLayout());
    setContentPane(new JLabel(new ImageIcon("C:\\Users\\TeeKingTV.Com\\Downloads\\love2.gif")));
    lblText=new JLabel("<html><p style='color:rgb(255, 16, 68); font-family:algerian; font-size:30pt'>I LOVE YOU, YASHIKAAA!</p></html>");
    lblText.setSize(600,70);
    setSize(800,500);
    setResizable(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(lblText);
    setVisible(true);
    doValentine();
 }
    

public void doValentine(){
          int x=0;
          int y=5;
          try{
              while(x<800){
                     lblText.setLocation(x,y);
                    Thread.sleep(200);
                    x+=20;
                    y+=20;
                    if(x>800) x=0;
                    if(y>500) y=5;
 
                    }       
   
           }catch(InterruptedException ie){System.out.println("Interrupted...");}
    }

}

  public class HappyVal{

 public static void main(String args[]){
	 String name = JOptionPane.showInputDialog(null, "Enter your name");
	 JOptionPane.showMessageDialog(null, "May I surprise you, " + name + "?");

	        new Valentine();
  
 }
  
  }
 package notepadapp; 
 
import java.awt.Font;
import java.awt.HeadlessException;
 import javax.swing.*;


public class About extends JFrame {

    private Object textLabel;

   About(){
       
       setBounds(100, 100, 500, 400);
       setTitle("About Notepad Application");
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       setLayout(null);
       
       JLabel iconLabel=new JLabel(new ImageIcon(getClass().getResource("notepad.jpg")));
       iconLabel.setBounds(100, 50, 80, 80);
       add(iconLabel);
       
      JLabel textLabel =new JLabel("<html>Welcome to Notepad<br>Notepad is a simple text editor for Microsoft Windows and basic text editing program which enables computer users to create documents<br></html>");
      textLabel.setBounds(100, 50, 350, 300);
      textLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
      add(textLabel);
       
   }
   
   public static void main(String[]args){
       new About().setVisible(true);
 }
}
package notepadapp;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class NotepadApp extends JFrame implements ActionListener{

    JMenuBar menubar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    JMenu help = new JMenu("Help");

    JMenuItem newFile = new JMenuItem("New");
    JMenuItem openFile = new JMenuItem("open");
    JMenuItem saveFile = new JMenuItem("Print");
    JMenuItem print = new JMenuItem("Save");
    JMenuItem exit = new JMenuItem("Exit");

    JMenuItem cut = new JMenuItem("Cut");
    JMenuItem copy = new JMenuItem("Copy");
    JMenuItem paste = new JMenuItem("Paste");
    JMenuItem selectall = new JMenuItem("Select All");
    
    JMenuItem about=new JMenuItem("About");
    JTextArea textArea=new JTextArea();

    NotepadApp() {

        setTitle("Notepad Application");
        setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("notepad.jpg"));
        setIconImage(icon.getImage());

        setJMenuBar(menubar);
        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);
        
        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);
        file.add(print);
        file.add(exit);
        
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectall);
        
        help.add(about);
        
        JScrollPane scrollPane=new JScrollPane(textArea);
        add(scrollPane);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
        print.addActionListener(this);
        exit.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectall.addActionListener(this);
        about.addActionListener(this);
        about.addActionListener(this);










        
        
        textArea.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        
        



        






    }

    public static void main(String[] args) {

        new NotepadApp().setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("New")){
            textArea.setText(null);
            
            
        }else if(e.getActionCommand().equalsIgnoreCase("Open")){
            
        }else if(e.getActionCommand().equalsIgnoreCase("Save")){   
            
            JFileChooser fileChooser=new JFileChooser();
            FileNameExtensionFilter textFilter=new FileNameExtensionFilter("Only Text Files(.txt)", "txt");
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(textFilter);
            
        }else if(e.getActionCommand().equalsIgnoreCase("Print")){    
            
        }else if(e.getActionCommand().equalsIgnoreCase("Exit")){    
            
        }else if(e.getActionCommand().equalsIgnoreCase("Cut")){  
            
        }else if(e.getActionCommand().equalsIgnoreCase("Copy")){    
            
        }else if(e.getActionCommand().equalsIgnoreCase("Paste")){    
            
        }else if(e.getActionCommand().equalsIgnoreCase("SelectAll")){  
            
        }else if(e.getActionCommand().equalsIgnoreCase("About")){    
    
    
    
    
    


        
    }

}
    
}
    

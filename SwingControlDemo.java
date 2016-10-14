

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class SwingControlDemo {
    
   private JFrame mainFrame;
   private JPanel controlPanel;

   public SwingControlDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      SwingControlDemo  swingControlDemo = new SwingControlDemo();      
      swingControlDemo.showTextFieldDemo();
   }

   private void prepareGUI(){
      mainFrame = new JFrame("Replacer");
      mainFrame.setSize(500,250);
      mainFrame.setLayout(new GridLayout(1, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    

      controlPanel = new JPanel();
      GridLayout experimentLayout = new GridLayout(0,1);
      controlPanel.setLayout(experimentLayout);

      mainFrame.add(controlPanel);
      mainFrame.setVisible(true);  
   }

   private void showTextFieldDemo(){
      JLabel  textContentlabel= new JLabel("Enter the text to replace : ");
      final JTextField textContent = new JTextField(50);
      JLabel  findContentlabel= new JLabel("Find : ");
      final JTextField findContent = new JTextField(50);
      JLabel  replaceWithlabel= new JLabel("Replace with : ");
      final JTextField replaceWith = new JTextField(50);
      JLabel  resultLabel = new JLabel("Result : ");
       final JTextField result = new JTextField(50);
       result.setEditable(false);

      JButton replaceButton = new JButton("replace it");
      replaceButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {   
        	 String cont = textContent.getText();
        	 String find = findContent.getText();
        	 String replace = replaceWith.getText();
        	 result.setText(cont.replaceAll(find, replace));
         }
      }); 

      controlPanel.add(textContentlabel);
      controlPanel.add(textContent);
      controlPanel.add(findContentlabel);       
      controlPanel.add(findContent);
      controlPanel.add(replaceWithlabel);
      controlPanel.add(replaceWith);
      controlPanel.add(replaceWith);
      controlPanel.add(resultLabel);
      controlPanel.add(result);
      controlPanel.add(replaceButton);
      mainFrame.setVisible(true);  
   }
}

 /**
 * User enters a string and the program
 * checks to see if it is a palindrome 
 * 
 * @author GrayKnight
 * @version Assignment,  11/06/03 mods 10/10/10, 9/12/18
   DO NOT MODIFY THIS CLASS*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchGUI extends JPanel
{
    // GUI objects
    private JTextField numberIn;
    private JButton binary, linear;
    private JPanel buttonPanel, topPanel;
    private JLabel nameLabel, numLabel;
    private Searcher pa = new Searcher();    
    
    /**
     * Constructor for objects of class palindromeGUI
     */
    public SearchGUI()
    {
        setLayout(new BorderLayout());
                
        numberIn = new JTextField("Enter 5 digit ID");
        linear = new JButton("Linear Search");
        binary = new JButton("Binary Search");
        nameLabel = new JLabel("Name: Last, First");
        numLabel = new JLabel("");
    
        ButtonListener Listener = new ButtonListener();
        linear.addActionListener(Listener);
        binary.addActionListener(Listener);
        
        topPanel = new JPanel();
        topPanel.add(numberIn);
        topPanel.add(nameLabel);
        
        buttonPanel = new JPanel();
        buttonPanel.add(linear);
        buttonPanel.add(binary);
        
        add(topPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(numLabel, BorderLayout.SOUTH);
        
        setPreferredSize(new Dimension(270, 100));
    }


    /**
     * Private Listener Class.
     * 
     * 
     */
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            int studentNum = Integer.parseInt(numberIn.getText());
            Student gk;
            
            if (event.getSource() == linear) gk = pa.linearSearch(studentNum);

            else  gk = pa.binarySearch(studentNum);


            if (gk != null) nameLabel.setText("Name: " + gk.getStudentName());
            else nameLabel.setText("NOT an active ID number");
                
            numLabel.setText(pa.toString());
        }
           
    }//end of ButtonListener() class
}//end of PalindromeGUI class

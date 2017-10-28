/* This example an adapted version of: https://beginnersbook.com/2015/07/swing-jbutton-class/ */

package jbuttonexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;

public class JButtonExample 
{
    JButtonExample()
    {  
        JFrame frame=new JFrame();      // Our JFrame is the top level window that opens when
                                        // the program is run The frame will contain a button,
                                        // and a confirmation message that will appear when the
                                        // button is clicked.
                                                                       
                                        
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(50,50,90, 50);  
        frame.add(submitButton);                        //Adding our button to the frame

        
        ConfirmationLabel confirmSubmissionLabel = new ConfirmationLabel("Thank you."); 
        confirmSubmissionLabel.setBounds(150,50,90, 50);  
        confirmSubmissionLabel.setVisible(false);
        frame.add(confirmSubmissionLabel);                   //Adding our (initially invisible) label to the frame
        
        
        // Our ConfirmationLabel class is a type of ActionListener now, so we can pass our
        // instance of it straight in here:
        submitButton.addActionListener(confirmSubmissionLabel);
        
        
        frame.setSize(300,200);     // Setting Frame size. This is the window size
        
        frame.setLayout(null);      // We don't want the default layout manager to be used as we are
                                    // providing a custom layout using our setBounds calls above.
        
        frame.setVisible(true);     // We definitely want our application to open with the main window visible!
                  
        // What happens when a user closes the main window? 
        // We want our program to exit which is fairly normal behaviour, but if we wanted our
        // app to continue runnin gin the background when the window is closed we might want to do 
        // something different here.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
              
     public static void main(String[] args) 
	 {  
            new JButtonExample();  
     }  
}

package jbuttonexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/** This class inherits from the JLabel class and implements the ActionListener interface.
 *  
 *  This means that we can say that our ConfirmationLabel class:
 *      -   'is a' type of JLabel
 *      -   'is a' type of ActionListener
 *
 * @author Douglas Barr
 */
public class ConfirmationLabel extends JLabel implements ActionListener
{
    
    ConfirmationLabel(String labelText)
    {
        super(labelText);
        
        // We still want to use all of the code that our super class (JLabel)
        // already has for handling a String as a constructor argument. Here
        // we are just passing the argument to our ConfirmationLabel constructor
        // on to our JLabel(String text) constructor 
        // (https://docs.oracle.com/javase/7/docs/api/javax/swing/JLabel.html#JLabel(java.lang.String))
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        // In this overridden (that's an important word in OOP) method of
        // ActionListener we are just telling the object to make itself visible.
        
        this.setVisible(true); 
    }
    
    
}

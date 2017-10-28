package jbuttonexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

/** This class inherits from the JComponent class and implements the ActionListener interface.
 *  
 *  This means that we can say that our ConfirmationLabel class:
 *      -   'is a' type of JComponent
 *      -   'is a' type of ActionListener
 * 
 *  It will need to own a JLabel, and so we will say that our ConfirmationLabel 
 *  class 'has a' JLabel. This is an example of Composition. 
 *
 * @author Douglas Barr
 */

public class ConfirmationLabel extends JComponent implements ActionListener
{
    private JLabel label;   // our ConfirmationClass owns a JLabel
    
    ConfirmationLabel(String labelText)
    {
        // We need to instantiate our label (and give it some text to display).
        // We also need to add it to this component as a child component.
        
        label = new JLabel(labelText);
        this.add(label);
    }
    
    @Override
    public void setBounds (int x, int y, int width, int height)
    {
        // This overrriden version of setBounds is going to pass on the variables
        // to the version of setBounds inherited from JComponent (because we still
        // want to use all the code that's in there), but also adds a bit of 
        // functionality to it. 
        
        // What we want to add is the line of code that positions the JLabel.
        // Remember that the JLabel will be positioned relative to the top left corner of
        // it's parent component (this one). The x and y coordinates passed in position 
        // this object relative to the main window. 
        
        super.setBounds(x, y, width, height);
        label.setBounds(0, 0, width, height);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        // In this overridden (that's an important word in OOP) method of
        // ActionListener we are just telling the object to make itself visible.
        
        this.setVisible(true); 
    }
    
    
}

import java.awt.*;  //importing all applet related packages
import java.applet.*;
import java.awt.event.*;

public class Convert extends Applet     //defining class 'Convert' to perform conversion operation
{
    Button b1;              //declaring buttons, textfield, labels and checkboxes
    TextField t1,t2,t3;
    Label l1,l2,l3,l4,l5;
    CheckboxGroup cg;
    Checkbox r1,r2;

    public void init()      //defining initialize method of applet
    {
        Frame f = new Frame("Temperature Converter");   //Creating object of 'Frame' class inorder to design a frame around the fields

        setLayout(null);    //no layout manager is assigned and fields can be put on respective x,y coordinates

        l1 = new Label("Enter the Value :- ");      //Taking the temperature input from user        
        t1 = new TextField(10);     //Assigning textfield to receive the inputs
        l2 = new Label("Fahrenheit to Celsius is :- ");     //Displaying the temperature output in Celsius
        t2 = new TextField(10);
        l3 = new Label("Celsius to Fahrenheit is :- ");     //Displaying the temperature output in Fahrenheit
        t3 = new TextField(10);
        cg=new CheckboxGroup();     //Defining Checkboxes
        r1=new Checkbox("Fahrenheit to Celsius",cg,false);      //Defining first checkbox which converts Fahrenheit to Celsius
        r2=new Checkbox("Celsius to Fahrenheit",cg,false);      //Defining second checkbox which converts Celsius to Fahrenheit
        b1=new Button("Clear");

        l1.setBounds(10,50,100,25);         //Defining the coordinates of all labels, textfields, buttons and checkboxes                
        t1.setBounds(110,50,100,25);
        r1.setBounds(10,100,250,25);              
        r2.setBounds(270,100,250,25); 
        l2.setBounds(10,150,130,25);               
        t2.setBounds(160,150,100,25);
        l3.setBounds(10,200,130,25);               
        t3.setBounds(160,200,100,25);
        b1.setBounds(150,250,100,25); 

        b1.addActionListener(new a());      //To handle the clear operation when the button is clicked         
        r1.addItemListener(new aa());       //To handle the conversion operation when the checkbox is clicked  
        r2.addItemListener(new aa());        

        f.add(l1);      //to add all the labels, textfields, buttons and checkboxes in the frame
        f.add(t1);  
        f.add(r1);  
        f.add(r2);  
        f.add(b1);  
        f.add(l2);  
        f.add(t2);  
        f.add(l3);  
        f.add(t3); 

        f.setLayout(null);      //defining default frame layout
        f.setSize(430, 300);    //defining the size of the frame
        f.setVisible(true);     //to show the frame
    }

    class aa implements ItemListener      //defining a class which inherits 'ItemListener' class to notified whenever we click on a checkbox
    { 
        double a1,a2,a3;                         //defining variables required for conversion operation
        public void itemStateChanged(ItemEvent ie)      //this method gets invoked when checkbox is clicked or unclicked
        {  
            a1 = Double.parseDouble(t1.getText());
            if(ie.getSource()==r1)      //to check whether 1st checkbox is selected or not
            {
                a2 = ((a1-32)*5)/9;          //mathematical calculation required to convert from Celsius to Fahrenheit    
                t2.setText(String.valueOf(a2));           
            }

            if(ie.getSource()==r2)      //to check whether 1st checkbox is selected or not
            {     
               a3 = (((a1*9)/5)+32);     //mathematical calculation required to convert from Fahrenheit to Celsius               
               t3.setText(String.valueOf(a3));           
            }
        }       
    }

    class a implements ActionListener       //defining a class which inherits 'ActionListener' class to notified whenever we click on a button
    {
        public void actionPerformed(ActionEvent e)      //this method gets invoked when button is clicked
        {
            if(e.getSource()==b1)       //to check whether 'clear' button is clicked or not
            {
                t1.setText("");         //to clear all the text field when 'clear' button is clicked
                t2.setText("");
                t3.setText("");   
            } 
        }
    }
}

package SoftwareProject;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

public class ScrollableTest {
	
	//Datamembers
	//-------------------------
	
	//window
	JFrame frame;	
	//panels
	JScrollPane myScrollPane;
	JPanel panelInsideScrollPane;
	//layout for panelInsideScrollPane
	SpringLayout layout;
	//components
	JButton buttonTest;	
	//used to store last created component;
	JComponent CalculateNextOffsetFromThisComponent;
	
	JScrollBar verticalScrollBar;


	
	
	//----------------------------------------------------
	
	//Constructor
	public ScrollableTest() {
		
		//create window
		createWindow();
		
		//create panels
		createPanels();
		CalculateNextOffsetFromThisComponent = panelInsideScrollPane;
	    
		//set size for the pannels
		panelInsideScrollPane.setPreferredSize(new Dimension(300,300));
		myScrollPane.setPreferredSize(new Dimension(300,400));

	   
		//add button
		buttonTest = new JButton("add component");
		panelInsideScrollPane.add(buttonTest);
		
		
		layout.putConstraint(SpringLayout.SOUTH, buttonTest,-25,SpringLayout.SOUTH, CalculateNextOffsetFromThisComponent);
		layout.putConstraint(SpringLayout.EAST, buttonTest,-25,SpringLayout.EAST, CalculateNextOffsetFromThisComponent);

		
		//button interaction
		buttonTest.addActionListener(new ActionListener() {
			
			//when clicked
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//create new label
				JLabel newElement = new JLabel("Bla");
            	layout.putConstraint(SpringLayout.NORTH, newElement,25,SpringLayout.NORTH, CalculateNextOffsetFromThisComponent);
            	CalculateNextOffsetFromThisComponent = newElement;
            	
            	
            	//add label to the inner pannel (pannel within the scrollpane)
               	panelInsideScrollPane.add(newElement);
            	panelInsideScrollPane.validate();


            	
            	//resize if needed
            	//debug numbers
            	//System.out.println("bottom of new element = " + (newElement.getLocation().y + newElement.getHeight()));
            	//System.out.println("top of button = " + buttonTest.getLocation().y);
            	

            	//current preferred panel size
            	int x = (int) panelInsideScrollPane.getPreferredSize().getWidth();
            	int y = (int) panelInsideScrollPane.getPreferredSize().getHeight();
            	
            	//if next elements is outside preferred bounds --> grow pannel
            	if((newElement.getLocation().y + (newElement.getHeight() * 2)) >= (buttonTest.getLocation().y - 60))
            	{
            		panelInsideScrollPane.setPreferredSize(new Dimension(x,y + newElement.getHeight() + 10));
            		if(verticalScrollBar != null ){
            			verticalScrollBar.setValue( verticalScrollBar.getMaximum() );
            		}
            		else{
            			verticalScrollBar = myScrollPane.getVerticalScrollBar();
            		}
            	}
            
            	frame.pack();
				
			}
		});

		


	    
	    
	    //show window
		frame.pack();
	    frame.setVisible(true);
		
		
	}
	public void createWindow(){
		
		frame = new JFrame("Test");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(300, 400);
	}
	
	public void createPanels(){
		//create scrollpane
	    myScrollPane = new JScrollPane();
	    
	    //create  panel with spring layout(for inside the scrollpane)
	    panelInsideScrollPane = new JPanel();
	    layout = new SpringLayout();
		panelInsideScrollPane.setLayout(layout);
	    
		//add panel to the scrollpane
		myScrollPane.setViewportView(panelInsideScrollPane);
		JScrollBar verticalScrollBar = myScrollPane.getVerticalScrollBar();
		
	    //add scrollpane to window
		frame.add(myScrollPane);
		
	
	}

	
	
	//entry point
	public static void main(String args[]){
		System.out.println("ScrollableTest start");
		ScrollableTest test = new ScrollableTest();
	}

}

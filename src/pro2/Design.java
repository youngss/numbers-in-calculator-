package pro2;

import javax.script.*;


import java.util.EmptyStackException;
import java.util.Stack;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Design extends Application{

	public static void main(String[] args) {
	
		Application.launch(args);

	}
	Button [] arr = new Button[10];
	TextField text = new TextField();
	String res="";
	 static int size=0;   
	@Override
	public void start(Stage st) throws Exception {
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	
	text.setPrefHeight(70);
	text.setPrefWidth(300);
	GridPane g = new  GridPane();
	g.add(text,0,0,6,2);	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	 
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	 
	
	
	  for(int i =1; i<10 ;i++){
		  arr[i]= new Button(Integer.toString(i));
    	  
		  arr[i].setPrefSize(50,40);
		  
	  }
	            int k=9;
		     for(int i =2 ;i<=4 ;i++)
		    	 for(int j=2;j>=0;j--)
		    		g.add(arr[k--], j, i);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    
	 
		    	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			       g.setHgap(3);
                   g.setVgap(3);		
		st.setScene(new Scene(g,300,200));
		st.setResizable(false);
	
	st.show();



   }
}
   
   ////////////////////////////////////////////
	
    	 	 
  	 

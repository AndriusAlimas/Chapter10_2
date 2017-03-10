package com.example.tag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;

import java.io.IOException;

public class SimpleTagTest3 extends SimpleTagSupport{
	// Private Fields:
	private String[] movies = {"Monsoon Wedding", "Saved!", "Fahrenheit 9/11" };
	
	// Override One important method
    public void doTag()throws IOException,JspException{
    	// we know that we can easy to get PageContext object:	
    	PageContext page_context =(PageContext) getJspContext();
      for(int i = 0; i < movies.length; i++){
      	page_context.setAttribute("movie", movies[i]); // every time set a new next element when you iterating
      	getJspBody().invoke(null); // this jsp body will excecute several time depands on loop
      } // end for loop	
    }
}

package com.example.tag;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

// For the simple tags we need import, extend this class:
public class SimpleTagTest extends SimpleTagSupport {

	// override the doTag() method:
	public void doTag() throws IOException, JspException{
		// you can get JspContext , which PageContext extends and when you have JspContext
		// you can ask to get JspWriter calling getOut() method:
		getJspContext().getOut().print("This is lamest use of a custom tag");
	}
	
}

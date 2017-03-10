package com.example.tag;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class SimpleTagTest2 extends SimpleTagSupport{
	public void doTag()throws JspException, IOException{
		// This says, Process the body of the tag and print it to the response. The null argument means
		// the output goes to the response rather than some OTHER writer you pass in
		 getJspBody().invoke(null);
	}
}

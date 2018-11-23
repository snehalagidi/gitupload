package org.cap.demo;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DisplayDate  extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		
		JspWriter out= getJspContext().getOut();
		
		
			out.println("<h1>"+LocalDate.now()+"</h1>");
	}

	
	
}

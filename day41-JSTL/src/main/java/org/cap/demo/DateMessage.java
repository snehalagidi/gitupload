package org.cap.demo;

import java.io.IOException;
import java.io.StringWriter;
import java.time.LocalDate;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateMessage extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out= getJspContext().getOut();
		StringWriter writer=new StringWriter();
		getJspBody().invoke(writer);
		out.println("<h1>Date:"+LocalDate.now() +"Message:"+writer+"</h1>");
		
		
	}

	
	
}

package org.cap.demo;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Format extends SimpleTagSupport{

	
	private String format;

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void doTag() throws JspException, IOException {
		
		 JspWriter out= getJspContext().getOut();
		LocalDate date=LocalDate.now();
		DateTimeFormatter formatters=DateTimeFormatter.ofPattern(this.format);
		String text=date.format(formatters);
		out.println("<h1>"+text+"</h1>");
		
	}

	
	
	
}

package com.cloud.servlet;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Document Object
import com.itextpdf.text.Document;
//For adding content into PDF document
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.DocumentException;
/**
 * Servlet implementation class GeneratePDF
 */
@WebServlet("/GeneratePDF")
public class GeneratePDF extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException 
	{
        response.setContentType("application/pdf");        
        OutputStream out=response.getOutputStream();
        try 
        {
            Document document = new Document();
            
            String name="By Heera Babu";
            PdfWriter.getInstance(document, out);
            document.open();
            document.add(new Paragraph("Programmingshifts is an online tutorial. "));
            document.add(new Paragraph("This report PDF Created Using Servlet."));
            document.add(new Paragraph(name));
            document.close();
        }
        catch (DocumentException exc)
        {
             throw new IOException(exc.getMessage());
        }
        finally 
        {            
            out.close();
		}
}}

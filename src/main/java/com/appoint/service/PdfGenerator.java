package com.appoint.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Iterator;

import com.itextpdf.text.List;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
 
import com.appoint.domain.Appointment;

public class PdfGenerator {

	public void generatePdf(java.util.List<Appointment> appoint) {
		 
		
		try {
			
			
	        OutputStream file = new FileOutputStream(new File("/home/aby/Documents/javapdf/appointment.pdf"));
	        Document document = new Document();
	        PdfWriter.getInstance(document, file);
	        
	      
		     PdfPTable table=new PdfPTable(8);

	                PdfPCell cell = new PdfPCell (new Paragraph ("Appointment Registration"));

			      cell.setColspan (8);
			      cell.setHorizontalAlignment (Element.ALIGN_CENTER);
			      cell.setPadding (5.0f);
			      cell.setBackgroundColor (new BaseColor (140, 221, 8));					               

			      table.addCell(cell);						               
			      
			      table.addCell("Sr No.");
			      table.addCell("Name");
			      table.addCell("Age");
			      table.addCell("Date of birth");
			      table.addCell("blood Group");
			      table.addCell("mobile");
			      table.addCell("email");
			      table.addCell("Date Of Appointment");
			      
			       
			      
			      Iterator itr = appoint.iterator();
			      
			      while(itr.hasNext()) {
			    	   Appointment row = (Appointment) itr.next();
			    	   
			    	  table.addCell(String.valueOf(row.getId())); 
			    	  table.addCell(row.getName());
			    	  table.addCell(String.valueOf(row.getAge())); 
			    	  table.addCell(row.getDob());
			    	  table.addCell(row.getBloodGroup());
			    	  table.addCell(row.getMobile());
			    	  table.addCell(row.getEmail());
			    	  table.addCell(row.getDoa());
			    	  
			      }
			    		  
			    		  
			     
	             
			      
			      
			      table.setSpacingBefore(30.0f);        
			      table.setSpacingAfter(30.0f);         							          

					 
	        document.open(); 			       

	        document.add(table);
			
	        document.close();

		             file.close();

	   System.out.println("Pdf created successfully..");

	} catch (Exception e) {
	   e.printStackTrace();
	}
		
	}

	 
	
	

}

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
			
			
	        OutputStream file = new FileOutputStream(new File("/home/aby/Documents/javapdf/d.pdf"));
	        Document document = new Document();
	        PdfWriter.getInstance(document, file);
	        
	      //Inserting Table in PDF
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
			    		  
			    		  
			     
	             
			      
			      
			      table.setSpacingBefore(30.0f);       // Space Before table starts, like margin-top in CSS
			      table.setSpacingAfter(30.0f);        // Space After table starts, like margin-Bottom in CSS								          

					/*
					 * //Inserting List in PDF List list=new List(true,30); list.add(new
					 * ListItem("Java4s")); list.add(new ListItem("Php4s")); list.add(new
					 * ListItem("Some Thing..."));
					 */

					/*
					 * //Text formating in PDF Chunk chunk=new
					 * Chunk("Welecome To Java4s Programming Blog...");
					 * chunk.setUnderline(+1f,-2f);//1st co-ordinate is for line width,2nd is space
					 * between Chunk chunk1=new Chunk("Php4s.com"); chunk1.setUnderline(+4f,-8f);
					 * chunk1.setBackground(new BaseColor (17, 46, 193));
					 */    

		 //Now Insert Every Thing Into PDF Document
	        document.open();//PDF document opened........			       

	        document.add(table);
				//document.add(image);
	//////
				/*
				 * document.add(Chunk.NEWLINE); //Something like in HTML
				 * 
				 * document.add(new Paragraph("Dear Java4s.com")); document.add(new
				 * Paragraph("Document Generated On - "+new Date().toString()));
				 * 
				 * document.add(table);
				 * 
				 * document.add(chunk); document.add(chunk1);
				 * 
				 * document.add(Chunk.NEWLINE); //Something like in HTML
				 * 
				 * document.newPage(); //Opened new page document.add(list); //In the new page
				 * we are going to add list
				 */
	        document.close();

		             file.close();

	   System.out.println("Pdf created successfully..");

	} catch (Exception e) {
	   e.printStackTrace();
	}
		
	}

	 
	
	

}

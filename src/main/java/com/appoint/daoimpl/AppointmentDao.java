package com.appoint.daoimpl;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.appoint.domain.Appointment;
import com.appoint.service.PdfGenerator;

@Component
public class AppointmentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	@Transactional
	public void createAppointment(Appointment appointment) {
		System.out.println("inside create product method :: "+appointment);
		this.hibernateTemplate.save(appointment);

	}
	
	
	public List<Appointment> getAppointments() {
		List<Appointment> appoint = this.hibernateTemplate.loadAll(Appointment.class);
		
		
		System.out.println("All data in list formate :: "+appoint );
		
		PdfGenerator pdf = new PdfGenerator();
		pdf.generatePdf(appoint);
		
		
		
		
		
		return appoint;
	}
}

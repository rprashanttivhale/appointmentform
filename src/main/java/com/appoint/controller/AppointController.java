package com.appoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.appoint.daoimpl.AppointmentDao;
import com.appoint.domain.Appointment;

@Controller
public class AppointController {
	
	
	@Autowired
	private AppointmentDao appointmentDao;
	
	
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	@RequestMapping(path = "/appointaction", method=RequestMethod.POST)
	public String formhandler(@ModelAttribute Appointment appointment) {
		
		 
		
		appointmentDao.createAppointment(appointment);
		appointmentDao.getAppointments();
		return "about";
		
		
	}

}

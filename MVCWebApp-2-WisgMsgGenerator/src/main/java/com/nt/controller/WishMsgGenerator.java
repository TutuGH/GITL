package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WishMsgGenerator implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Calendar cal = null;
		int hour = 0;
		String msg;

		// get system date
		cal = Calendar.getInstance();
		// get system time
		hour = cal.get(Calendar.HOUR_OF_DAY);

		if (hour < 12)
			msg = "Good Morning";
		else if (hour < 17)
			msg = "Good Afternoon";
		else if (hour < 20)
			msg = "Good Evening";
		else
			msg = "Good Night";
		return new ModelAndView("wish", "viewMsg", msg);
	}

}

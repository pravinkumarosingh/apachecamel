package com.sugarglider.apachecamelpracticea.routes.a;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class GetCurrentTimeBean {
	public String getCurrentTime() {
		return "Time now is "+ LocalDateTime.now();
	}

}

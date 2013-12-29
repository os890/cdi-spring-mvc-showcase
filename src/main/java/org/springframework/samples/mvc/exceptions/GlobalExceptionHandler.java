package org.springframework.samples.mvc.exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.enterprise.context.RequestScoped;

@RequestScoped
@Controller //needed due to hardcoded annotation-check in RequestMappingHandlerMapping#isHandler
public class GlobalExceptionHandler {

	@ExceptionHandler
	public @ResponseBody String handleBusinessException(BusinessException ex) {
		return "Handled BusinessException";
	}

}

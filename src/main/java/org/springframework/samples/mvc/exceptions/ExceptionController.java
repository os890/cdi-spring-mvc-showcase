package org.springframework.samples.mvc.exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.enterprise.context.RequestScoped;

@RequestScoped
@Controller //needed due to hardcoded annotation-check in RequestMappingHandlerMapping#isHandler
public class ExceptionController {

	@RequestMapping("/exception")
	public @ResponseBody String exception() {
		throw new IllegalStateException("Sorry!");
	}

	@RequestMapping("/global-exception")
	public @ResponseBody String businessException() throws BusinessException {
		throw new BusinessException();
	}

	@ExceptionHandler
	public @ResponseBody String handle(IllegalStateException e) {
		return "IllegalStateException handled!";
	}

}

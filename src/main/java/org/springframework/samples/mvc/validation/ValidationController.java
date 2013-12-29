package org.springframework.samples.mvc.validation;

import javax.enterprise.context.RequestScoped;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestScoped
@Controller //needed due to hardcoded annotation-check in RequestMappingHandlerMapping#isHandler
public class ValidationController {

	// enforcement of constraints on the JavaBean arg require a JSR-303 provider on the classpath

	@RequestMapping("/validate")
	public @ResponseBody String validate(@Valid JavaBean bean, BindingResult result) {
		if (result.hasErrors()) {
			return "Object has validation errors";
		} else {
			return "No errors";
		}
	}

}

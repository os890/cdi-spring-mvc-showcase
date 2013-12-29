package org.springframework.samples.mvc.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.enterprise.context.RequestScoped;

@RequestScoped
@Controller //needed due to hardcoded annotation-check in RequestMappingHandlerMapping#isHandler
public class SimpleController {

	@RequestMapping("/simple")
	public @ResponseBody String simple() {
		return "Hello world!";
	}

}

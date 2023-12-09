package ai.initializ.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@SpringBootApplication
public class SimpleApplication {

	private static final Logger logger = LogManager.getLogger(SimpleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}

	@GetMapping("/initz")
	public String getInitializ()
	{
		logger.info("AI-Driven Unified DevSecOps Application Platform to run any Apps");
		return "AI-Driven Unified DevSecOps Application Platform to run any Apps";
	}

}

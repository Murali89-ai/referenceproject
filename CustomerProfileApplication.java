package com.wu.brwallet.customer.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAsync
@RestController
@SpringBootApplication(scanBasePackages = {"com.wu.era.library.*", "com.wu.brwallet.*","com.wu.era.kafka.*","com.wu.onep.kafka.*" })
public class CustomerProfileApplication {

	private static final Logger logger = LoggerFactory.getLogger(CustomerProfileApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CustomerProfileApplication.class, args);

	}

	@GetMapping("/")
	public String home() {
		logger.info("Home method called CustomerProfileApplication");
		return "CustomerProfileApplication - customer_profilelt_v2_svc";
	}

}

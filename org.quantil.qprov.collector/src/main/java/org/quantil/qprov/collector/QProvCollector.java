package org.quantil.qprov.collector;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication(scanBasePackages = "org.quantil.qprov.*")
@OpenAPIDefinition(info = @Info(title = "QProv Collector", version = "0.0", license = @License(name = "Apache 2.0", url = "http://www.apache.org/licenses/LICENSE-2.0.html"), contact = @Contact(url = "https://github.com/UST-QuAntiL/QProv", name = "GitHub Repository")))
public class QProvCollector {
	public static void main(String[] args) { SpringApplication.run(QProvCollector.class, args); }
}

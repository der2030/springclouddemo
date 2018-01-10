package der.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
* @FileName:EurekaServerDemoApplication
* @Description: 
* @Author: Derrick Ye
*/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerDemoApplication.class, args);
	}
}

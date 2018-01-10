package der.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
* @FileName:EurekaProviderDemoApplication
* @Description: 
* @Author: Derrick Ye
*/
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProviderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderDemoApplication.class, args);
	}
}

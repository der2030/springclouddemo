package der.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
* @FileName:EurekaCustomerDemoApplication
* @Description: 
* @Author: Derrick Ye
*/
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class EurekaCustomerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCustomerDemoApplication.class, args);
	}
}

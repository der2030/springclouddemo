package der.feignconfig;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* @FileName:FeignConfig
* @Description:
* @Author: Derrick Ye
*/
@Configuration
public class FeignConfig {
    @Bean
    public Contract feignContract(){
        return new Contract.Default();
    }
}

package javatpoint.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages="javatapoint.Spring")

public class AppConfig {

//	@Bean
//	public Samsung getPhone()
//	{
//		return new Samsung();
//	}
//	@Bean
//	public MobileProcesser getProcesser()
//	{
//		return new Snapdragon();
//	}
}

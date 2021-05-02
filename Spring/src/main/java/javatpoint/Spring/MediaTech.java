package javatpoint.Spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTech implements MobileProcesser {
	public void process()
	{
		System.out.println("2nd best");
	}

}

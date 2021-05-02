package javatpoint.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component //Non qualified and de capitalized
public class Samsung {
	@Autowired
	@Qualifier("mediaTech")// here mediatech class will take priority and process methos will execute from media tech.
    MobileProcesser cpu;
    
	public MobileProcesser getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcesser cpu) {
		this.cpu = cpu;
	}

	public void config()
	{
		System.out.println("4 gb ram , 17Mpx camera");
		cpu.process();
	}
}

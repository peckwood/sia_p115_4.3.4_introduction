package concert;

import org.springframework.stereotype.Component;

@Component
public class Concert implements Performance{

	@Override
	public void perform() {
		System.out.println("Performing Concert");
	}

}

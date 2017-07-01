package concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import concert.ConcertConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ConcertConfig.class})
public class ConcertTest {
	
	@Autowired
	concert.Performance performance;
	
	@Test
	public void testConcert(){
		performance.perform();
		Encoreable encoreablePerformance = (Encoreable) performance; 
		encoreablePerformance.encore();
	}
}

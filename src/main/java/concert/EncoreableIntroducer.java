package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
//the mixin(stitcher)
//mixes interface Performance (I1) and Encoreable(I2)
//I1 is the interface you create objects under (I1)
//I2 is the interface you introduce
public class EncoreableIntroducer {
	//value: the kinds of beans should be introduced with the interface, 
	//"+" means any subtype of I1, as opposed to Performance itself
	
	//defaultImpl: the implementation of I2
	@DeclareParents(value="concert.Performance+", defaultImpl=DefaultEncoreable.class)
	//I2
	//note it is static
	public static Encoreable encoreable;
}

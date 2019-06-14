import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class Test1 {
	@Test
	public void testAdd() throws InterruptedException {
	    assertEquals(42, Integer.sum(19, 23));
	    Thread.sleep(Duration.ofSeconds(10).toMillis());
	}
}

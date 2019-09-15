
  package java.learning.enums;
  
  import org.junit.Test;
  
  import static org.junit.Assert.assertEquals; public class
  SimpleEnumExampleTest {
  
  @Test public void simpleEnumExampleTest() { Days day = Days.SUNDAY;
  assertEquals(Days.valueOf("SUNDAY"), day); } }
 
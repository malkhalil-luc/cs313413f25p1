package hw;


import java.util.List;
/*import java.util.ArrayList;
*import java.util.Arrays;
*/
import static org.junit.Assert.*;
import java.util.Collections;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld {

  private HelloWorld fixture;
  private List<HelloWorld> list;

  @Before
  public void setUp() throws Exception {
    fixture = new HelloWorld();
    list = Collections.singletonList(fixture);
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }

  @Test
  public void initialization() { // this test is OK as-is, it should pass with no problem
    assertNotNull(fixture);
  }

  @Test
  public void getMessage() { // this test is OK as-is, it should pass with no problem
    assertNotNull(fixture);
    assertEquals("hello world", fixture.getMessage());
  }

  @Test
  public void getYear() { // this test is OK, fix HelloWorld.java to make it pass! -> Done
    assertNotNull(fixture);
    assertEquals(2025, fixture.getYear());
  }

  @Test
  public void getMessageInList() { // this test is broken - fix it! -> DONE
    /*var list = Arrays.asList(fixture);
     * Arrays.asList() can be replaced with a Collections.singletonList() this will return an immutable list
     * with only one single element
     * performance wise it is more efficient...
     **/
    //var list = Collections.singletonList(fixture); >>>> better alternative in this scenario
    assertEquals("hello world", list.get(0).getMessage());
  }

  @Test
  public void getYearInList() { // this test is broken - fix it! -> Done
    //var list = Collections.singletonList(fixture); >>> better alternative in this scenario
    assertEquals(2025, list.get(0).getYear());
  }
}

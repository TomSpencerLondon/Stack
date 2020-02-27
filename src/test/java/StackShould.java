import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import static junit.framework.Assert.assertEquals;


public class StackShould {
  private TestableStack testableStack;
  private Object object;

  @BeforeEach
  void setUp(){
    testableStack = new TestableStack();
    object = new Object();
  }

  @Test
  void push_an_item() {
    testableStack.push(object);
    assertEquals(1, testableStack.size());
  }

  @Test
  void pop_an_item(){
    testableStack.push(object);
    testableStack.pop(object);
    assertEquals(0, testableStack.size());
  }

  public class TestableStack extends Stack {
    public int size(){
      return objects.size();
    }
  }
}


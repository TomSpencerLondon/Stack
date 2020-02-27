import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
  void pop_an_item() throws EmptyCustomStackException {
    testableStack.push(object);
    testableStack.push(object);
    testableStack.pop(object);
    assertEquals(1, testableStack.size());
  }

  @Test
  void empty_stack_throws_exception() throws EmptyCustomStackException {
    assertThrows(EmptyCustomStackException.class, () -> {
      testableStack.pop(object);
    });
  }

  public class TestableStack extends Stack {
    public int size(){
      return objects.size();
    }
  }
}


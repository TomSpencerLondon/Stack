import java.util.ArrayList;

public class Stack {
  ArrayList<Object> objects;

  public Stack(){
    this.objects = new ArrayList<>();
  }

  public void push(Object object){
    objects.add(object);
  }

  public void pop(Object object) throws EmptyCustomStackException {

    if(objects.isEmpty()){
      throw new EmptyCustomStackException();
    }
    objects.remove(object);
  }
}

import java.util.ArrayList;

public class Stack {
  ArrayList<Object> objects;

  public Stack(){
    this.objects = new ArrayList<>();
  }

  public void push(Object object){
    objects.add(object);
  }

  public Object pop(Object object) throws EmptyCustomStackException {

    if(objects.isEmpty()){
      throw new EmptyCustomStackException();
    }
    Object o = (Object) objects.get(objects.size() - 1);
    objects.remove(object);

    return o;
  }
}

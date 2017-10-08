package Wave20.Assignment3;
public interface results<T>{
  T marks(T obj);
  String pass(T obj);
}
class Students implements results<T>{
  T obj;
  T marks(T obj){
    T x=obj/400;
    return x;
  }
  String pass(T x){
    if (x>50){
      return "pass";
    }
    else{
    return "fail";
    }
  }
//System.out.println("hello");
}
public class ParamLocal {
  public static void main(String args[]){
    Students s = new Students();
    s.marks(350);
    System.out.println("main");
  }

}

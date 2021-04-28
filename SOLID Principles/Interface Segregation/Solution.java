public interface Animal {
    void feed();

}

public interface Pet extends Animal{
    void groom();
}

public class Dog implements Pet{
  void feed(){

  }

  void groom(){

  }
}


public class Tiger implements Animal {
  void feed() {

  }
}

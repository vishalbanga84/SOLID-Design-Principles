public interface Animal {
    void feed();
    void groom();

}

public class Dog implements Animal{
  void feed(){

  }

  void groom(){

  }
}


public class Tiger implements Animal {
  void feed() {

  }

  void groom() {
    // Dummy implementation to keep the complier happy
  }
}

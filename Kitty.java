public class Kitty {
  private int age;
  private String name = "";

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void changeName(String n) {
    name = n;
  }

  public void makeOlder() {
    age += 1;
  }

  public String toString() {
    return "The amazing " + this.name;
  }

  public Kitty() {
    age = 2;
    name = "Mittens";
  }

  public Kitty(String n, int a) {
    age = a;
    name = n;
  }
}

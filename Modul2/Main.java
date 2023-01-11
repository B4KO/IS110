import java.util.jar.Attributes.Name;


class Person {
  public String name;
  public int age;

  public Person(String Iname, int Iage) {
    name = Iname;
    age = Iage;
  }

  @Override
  public String toString() {
    return "Hei jeg heter "+ name;
  }
}

class Produkt {

  private String name;
  private int prodYear;
  private boolean inStock;
  public int amount;
  public Person eier;

  public Produkt(String Iname,int IprodYear, boolean IInStock,int Iamount, Person Ieier) {
    name = Iname;
    prodYear = IprodYear;
    inStock = IInStock;
    amount = Iamount;
    eier = Ieier;
  }

  public void setNewName(String newName) {
    name = newName;
  }

  public String getName() {

    return name;
  }

  public void checkAge() {
    if (prodYear > (2022 - eier.age)) {
      System.out.println("Du er eldre enn produktet");
    } else {
      System.out.println("Produktet er eldre enn eieren");
    }
  }

}


class Main {
  public static void main(String[] args){
      System.out.println("Hei fra main");

      Person Kjetil = new Person("Kjetil", 20);
      Produkt Cola = new Produkt("Cola", 2001, true, 6, Kjetil);

      System.out.println(Cola.getName());
      System.out.println(Cola.amount);
      System.out.println(Cola.eier);
      Cola.checkAge();




    }
}
package Day1;

//Interfaces
interface Vegetables {
 void type();
}

interface Fruits {
 void freshness();
}

interface GroceryStore extends Vegetables, Fruits {
 void storeDetails();
}


class CityStore {
 void location() {
     System.out.println("Located in central market area");
 }
}


class MyGrocery extends CityStore implements GroceryStore {
 public void type() {
     System.out.println("Available vegetables: Tomato, Carrot, Spinach");
 }

 public void freshness() {
     System.out.println("Fruits like Apple and Banana are fresh and organic");
 }

 public void storeDetails() {
     System.out.println("Store opens at 8 AM and closes at 9 PM");
 }


}


public class Practice9 {
 public static void main(String[] args) {
     MyGrocery store = new MyGrocery();
     store.location();
     store.type();
     store.freshness();
     store.storeDetails();
     
 }
}
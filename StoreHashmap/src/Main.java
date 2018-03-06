import java.util.Map;

public class Main {
   public static void main(String[] args){

       Product NatureValley = new Product("Nature Valley", "Granola bar", 2.99);
       Product Iphone6 = new Product("Iphone 6", "Cell phone", 200.00);
       Product Olay = new Product("Olay", "Bar soap", 4.00);
       Product Samsung8 = new Product("Samsung s8", "cell phone", 799.99);
       Product Plates = new Product("Plates", "eat from it", 2.00);


       Product Axe = new Product("Axe", "deodorant", 12.99);
       Product Iphone8 = new Product("Iphone 8", "Cell Phone", 2222.99);
       Product Sanitizer = new Product("Hand Sanitizer", "Sanitizes your hand", 50000.99);
       Product SamsungEdge = new Product("Samsung Edge", "Cell Phone", 800.99);
       Product Voss = new Product("Voss", "WATER From Norway", 2.99);

       Product hp = new Product("hp", "laptop", 512.99);
       Product lg = new Product("lg", "Cell Phone", 322.99);
       Product lysolWipes = new Product("lysol disinfecting wipes", "disinfecting wipes", 5.99);
       Product basketball = new Product("basketball", "ball is life", 200.99);
       Product TrashBag = new Product("Trash Bag", "place your trash", 2.99);

       Store shaharMart = new Store("shaharMart");
       Store bobMart = new Store("bobMart");
       Store rossMart = new Store("rossMart");

       bobMart.addToStore(Olay,5);
       bobMart.addToStore(hp,5);
       bobMart.addToStore(Plates,5);
       bobMart.addToStore(Samsung8,5);
       bobMart.addToStore(Axe,5);

      Map<Product,Integer> storeProd =  bobMart.displayStoreProducts();

       System.out.println("The store products are :" );
       for(Map.Entry<Product,Integer> entry : storeProd.entrySet()){
           System.out.println("Product :"+ entry.getKey().getName()+", available Items : "+entry.getValue());
       }

       bobMart.addToCart(Olay,2);
       bobMart.addToCart(Plates,4);
       System.out.println(bobMart.numOfProductsInStore(Olay));

       /*
       for(Map.Entry<Product,Integer> entry : storeProd.entrySet()){
           System.out.println("Product :"+ entry.getKey().getName()+", available Items : "+entry.getValue());
       }*/

       Map<Product,Integer> cart = bobMart.getCart();
       System.out.println("Items available in the cart :");


       bobMart.removeProdcutAndNumOfProdFromCart(Olay,1);
       for(Map.Entry<Product,Integer> entry : cart.entrySet()){
           System.out.println("Product :"+ entry.getKey().getName()+", price : $"+entry.getKey().getPrice() +" num available :" +entry.getValue());
       }

       System.out.println(bobMart.numOfProductsInStore(Olay));
   }


}

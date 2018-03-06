import java.util.HashMap;
import java.util.Map;

public class Store {
    private Map<Product, Integer> cart;
    private Map<Product, Integer> availItems;
    private  String storeName;

    public Store(){}

    public Store(String storeName){
        cart = new HashMap<Product,Integer>();
        availItems = new HashMap<Product, Integer>();
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public Map<Product, Integer> getCart() {
        return cart;
    }
    public double checkOut(){
        double total = 0;
        for(Map.Entry<Product,Integer> entry : cart.entrySet()){
           total+= entry.getValue() * entry.getKey().getPrice();
        }
        return total;
    }
     public void removeProdcutAndNumOfProdFromCart(Product product,Integer numToremove){
      Integer num =   cart.get(product);
      Integer numleft = num - numToremove;
      cart.put(product,numleft);
      Integer numInStore = availItems.get(product) + numToremove;
      availItems.put(product,numInStore);

     }
    public void addToCart(Product product, Integer value){
        if(availItems.get(product) == null || availItems.get(product) == 0){
            System.out.println(product.getName()+" is not in the store or is out of stock");
        }else {
            cart.put(product, value);
            Integer i = availItems.get(product);

            Integer numOfItemsLeftInStore = i - value;
            availItems.put(product,numOfItemsLeftInStore);
        }


    }

    public void addToStore(Product product, Integer numOfProducts){
        availItems.put(product,numOfProducts);
    }

    public int getNumberOfItemsInCart(){
        return cart.size();
    }

    public Integer getItemCountFromCart(Product key){
        return cart.get(key);
    }

    public int numOfProductsInStore(Product product){
       return availItems.get(product);
        //return availItems.size();
    }

    public Map<Product,Integer> displayStoreProducts(){
        return  availItems;
    }
}

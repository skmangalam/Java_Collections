package IteratingCollections;

import java.util.*;

public class CollectionConcepts
{
    public static void main(String[] args)
    {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();

        products.add(door);
        products.add(floorPanel);
        products.add(window);

        final Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()){
            Product product = iterator.next();
            if(product.getWeight()>20){
                System.out.println(product);
            }
            else {
                iterator.remove();
            }
        }

        // for each loop can be used to modify the list.
        // ConcurrentModification exception will be thrown.
        /*for(Product product : products){
            System.out.println(product);
        }*/

        Collection<Product> otherProducts = new ArrayList<>();
        otherProducts.add(window);
        otherProducts.add(floorPanel);
        otherProducts.add(new Product("Bike", 100));

        // this will remove all the products from products list which is in otherproducts list.
        products.removeAll(otherProducts);

        System.out.println(products);

    }
}

import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Haydn Roberts 
 * @version 2021.11.10
 */
public class StockList
{
    // A list of the products.
    public ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The product item to be added.
     */
    public void add(Product item)
    {
        stock.add(item);
    }

    /**
     * Remove a product from the list by ID
     */
    public void remove(int productID)
    {
        Product product = findProduct(productID);
        
        if (product != null)
        {
        stock.remove(product);
        System.out.println("Product " + productID + " removed ");
        }
        else
        {
        System.out.println("Product ID Invalid"); 
        }
    }
    
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }

    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param productID The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void buyProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        product.increaseQuantity(amount);
        System.out.println("Bought " + amount + " of Product ID " + productID);
    }

    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    {
        for(Product product : stock)
        {
            if(product.getID() == productID)
            {
                return product;
            }   
        }
        return null;
    }

    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProductByName(String productName)
    {
        boolean matchFound=false;
        
        for(Product product : stock)
        {
            if(product.getName().contains(productName))
            {
                matchFound=true;
                System.out.println(product);
            } 
            if (matchFound=false)
            {
                System.out.println("Product Name Not Recognised");
            }
        }    
        return null;
    }

    /**
     * A method to sell a single quantity of the product
     */
    public void sellProduct(int productID)
    {
        sellProduct(productID, 1);
    }

    /**
     * Sell a given amount of the given product.
     * Show the before and after status of the product.
     * @param productID The ID of the product being sold.
     * Restock levels if less than 4 of purchased product in stocklist.
     */
    public void sellProduct(int productID, int amount)
    {
        Product product = findProduct(productID);

        if(product != null) 
        {
            if(product.getQuantity() > 0)
            {
                product.decreaseQuantity(amount);
                System.out.println("Sold " + amount + " of product ID " + productID);
            }
            else
            {
                System.out.println("Product is out of stock");
            }
        }
        else
        {
            System.out.println("Invalid Product ID");
        }

        if(product.getQuantity() < 4)
        {
            product.increaseQuantity(10 - amount);
            System.out.println("Product restocked");
        }
        else
        {
            System.out.println("Product stock levels okay");
        }
    }    

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param productID The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int productID)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param productID The ID of the product to look for.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);

        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }

    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();

        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }

    public void printHeading()
    {
        System.out.println();
        System.out.println(" Haydn's Stock List");
        System.out.println(" ====================");
        System.out.println();
    }

    /**
     * List all products with stock levels below a given number
     */
    public void listLowStock()
    {
        printHeading();
        for (Product product : stock)
        {
            if (product.getQuantity() < 8)
            {
                System.out.println(product);
            }
        }
    }
}

/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * Modified by Haydn Roberts
 * @version 2021.11.10
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Triumph Spitfire"));
        stock.add(new Product(102, "Vauxhall Astra"));
        stock.add(new Product(103, "Lotus Elan"));
        stock.add(new Product(104, "Vauxhall VX220"));
        stock.add(new Product(105, "BMW Z4"));
        stock.add(new Product(106, "Smart Roadster"));
        stock.add(new Product(107, "TVR Griffith"));
        stock.add(new Product(108, "Lotus Elise"));
        stock.add(new Product(109, "Porsche Carrera"));
        stock.add(new Product(110, "TVR Tamora"));
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();  
    }
    
    /**
     * Buy 10 products by ID and Quantity
     */
    private void buyProducts()
    {
        stock.buyProduct(101, 7);
        stock.buyProduct(102, 5);
        stock.buyProduct(103, 6);
        stock.buyProduct(104, 4);
        stock.buyProduct(105, 5);
        stock.buyProduct(106, 6);
        stock.buyProduct(107, 5);
        stock.buyProduct(108, 7);
        stock.buyProduct(109, 8);
        stock.buyProduct(110, 4);
    }

    /**
     * Sell 10 products by ID and Quantity
     */
    private void sellProducts()
    {
        stock.sellProduct(101, 1);
        stock.sellProduct(102, 2);
        stock.sellProduct(103, 1);
        stock.sellProduct(104, 4);
        stock.sellProduct(105, 6);
        stock.sellProduct(106, 3);
        stock.sellProduct(107, 2);
        stock.sellProduct(108, 3);
        stock.sellProduct(109, 2);
        stock.sellProduct(110, 5);
    }    
    
}
import java.util.ArrayList;

/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Haydn Roberts
 * @version 23 November 2021
 */
public class StockApp {
    private InputReader reader;
    private StockList stock;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp() {
        reader = new InputReader();
        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    /**
     * Display a list of menu choices and execute
     * the user's choice.
     */
    public void run() {
        boolean finished = false;

        while (!finished) {
            printHeading();
            printMenuChoices();

            String choice = reader.getString("Please enter your choice > ");

            finished = executeChoice(choice.toLowerCase());
        }
    }

    private boolean executeChoice(String choice) {
        if (choice.equals("quit")) {
            return true;
        } else if (choice.equals("add")) {
            addProduct();
        } else if (choice.equals("remove")) {
            int id = reader.getInt("Please enter the product ID to remove:  ");
            stock.remove(id);
        } else if (choice.equals("print")) {
            stock.print();
        } else if (choice.equals("run demo"))
            stockDemo();
        return false;
    }
    private void addProduct()
    {
    int id = reader.getInt("Please enter the new product ID:  ");
    String name = reader.getString("Please enter the new product name:  ");
    Product product = new Product(id, name);
    stock.add(product);
    System.out.println("Product"+ id + "("+ name + ")" + "added");
    }

    public void stockDemo()
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

    /**
     * List all products with stock levels below a given number
     */
    public void listLowStock()
    {
        printHeading();
        for (Product product : stock) {
            if (product.getQuantity() < 8) {
                System.out.println(product);
            }
        }
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Haydn Roberts");
        System.out.println("********************************");
    }
}
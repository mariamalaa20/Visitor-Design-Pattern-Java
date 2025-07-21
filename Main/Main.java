public class Main {
    public static void main(String[] args) {
        // Create products
        IProduct electronics = new Electronics();
        IProduct clothing = new Clothing();
        IProduct food = new Food();

        // Create visitor
        IVisitor priceVisitor = new ProductPriceVisitor();

        // Accept the visitor for each product
        electronics.accept(priceVisitor);  // Warranty fee will be added
        clothing.accept(priceVisitor);    // Discount will be applied
        food.accept(priceVisitor);       // Tax will be calculated
    }
}

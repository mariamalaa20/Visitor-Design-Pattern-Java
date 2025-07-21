// Concrete Visitor (Product Price Visitor)
class ProductPriceVisitor implements IVisitor {
    @Override
    public void visitElectronics(Electronics electronics) {
        System.out.println("Electronics Product: Warranty fee added.");
    }

    @Override
    public void visitClothing(Clothing clothing) {
        System.out.println("Clothing Product: Discount applied.");
    }

    @Override
    public void visitFood(Food food) {
        System.out.println("Food Product: Tax calculated.");
    }
}

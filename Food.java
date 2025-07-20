// Food Product
class Food implements IProduct {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visitFood(this);
    }
}

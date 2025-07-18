// Clothing Product
class Clothing implements IProduct {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visitClothing(this);
    }
}

// Electronics Product
class Electronics implements IProduct {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visitElectronics(this);
    }
}

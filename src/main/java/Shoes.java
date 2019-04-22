class Shoes implements ItemsElement {
    private int shoeSize;
    private int price;

    public Shoes(int cost, int size)
    {
        this.shoeSize = size;
        this.price = cost;
    }

    public int getPrice()
    {
        return price;
    }

    public int getShoeSize()
    {
        return shoeSize;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor)
    {
        return visitor.visit(this);
    }
}

class Shoe implements ItemsElement
{
    private int price;
    private String name;

    public Shoe(int cost, String brand)
    {
        this.price = cost;
        this.name = brand;
    }

    public int getPrice()
    {
        return price;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor)
    {
        return visitor.visit(this);
    }

} 
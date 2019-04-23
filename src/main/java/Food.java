class Food implements ItemsElement
{
    private int pricePerlbs;
    private int weight;
    private String name;

    public Food(int pricelbs, int wt, String nme)
    {
        this.pricePerlbs=pricelbs;
        this.weight=wt;
        this.name = nme;
    }

    public int getPricePerKg()
    {
        return pricePerlbs;
    }

    public int getWeight()
    {
        return weight;
    }

    public String getName()
    {
        return this.name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor)
    {
        return visitor.visit(this);
    }

}



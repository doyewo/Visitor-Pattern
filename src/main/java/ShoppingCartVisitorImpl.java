class ShoppingCartVisitorImpl implements ShoppingCartVisitor
{

    @Override
    public int visit(Shoe shoe)
    {
        int cost=0;
        //apply 5$ discount if shoe price is greater than 50
        if(shoe.getPrice() > 50)
        {
            cost = shoe.getPrice()-5;
        }
        else
            cost = shoe.getPrice();

        System.out.println("Shoe Brand: "+ shoe.getName() + " cost = "+cost);
        return cost;
    }

    @Override
    public int visit(Food food)
    {
        int cost = food.getPricePerKg()* food.getWeight();
        System.out.println(food.getName() + " cost = "+ cost);
        return cost;
    }

}


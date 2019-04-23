class CartClient
{

    public static void main(String[] args)
    {
        ItemsElement[] items = new ItemsElement[]{new Shoe(189, "Nike"),
                new Shoe(160, "Adidas"), new Food(2, 4, "Banana"),
                new Food(3, 5, "Apple")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(ItemsElement[] items)
    {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for(ItemsElement item : items)
        {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}


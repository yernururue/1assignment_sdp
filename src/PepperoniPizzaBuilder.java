public class PepperoniPizzaBuilder implements PizzaBuilder {
    private static final String pizzaName = "Pepperoni";

    private final int size;
    private boolean extraCheese;
    private boolean sausage;

    public PepperoniPizzaBuilder(int size) {
        this.size = size;
    }

    @Override
    public PizzaBuilder extraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
        return this;
    }

    @Override
    public PizzaBuilder addMainTopping() {
        this.sausage = true;
        return this;
    }

    @Override
    public Pizza build() {
        if (!sausage) {
            throw new IllegalStateException("Pepperoni topping must be added before building");
        }

        return new Pizza(size,pizzaName, extraCheese, sausage, false);
    }
}
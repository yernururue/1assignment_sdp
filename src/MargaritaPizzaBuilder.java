public class MargaritaPizzaBuilder implements PizzaBuilder {
    private static final String pizzaName = "Margarita";

    private final int size;
    private boolean extraCheese;
    private boolean tomato;

    public MargaritaPizzaBuilder(int size) {
        this.size = size;
    }

    @Override
    public PizzaBuilder extraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
        return this;
    }

    @Override
    public PizzaBuilder addMainTopping() {
        this.tomato = true;
        return this;
    }

    @Override
    public Pizza build() {
        if (!tomato) {
            throw new IllegalStateException("Tomato topping must be added before building");
        }

        return new Pizza(size, pizzaName, extraCheese, false, tomato);
    }
}
public interface PizzaBuilder {
    PizzaBuilder extraCheese(boolean extraCheese);

    PizzaBuilder addMainTopping();

    Pizza build();
}
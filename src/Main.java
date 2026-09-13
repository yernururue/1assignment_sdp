public class Main {
    public static void main(String[] args) {
        PizzaBuilder pepperoniBuilder = new PepperoniPizzaBuilder(30);

        Pizza pepperoni = pepperoniBuilder
                .extraCheese(true)
                .addMainTopping()
                .build();

        PizzaBuilder pepperoniBuilder2 = new PepperoniPizzaBuilder(25);

        Pizza pepperoni2 = pepperoniBuilder2
                .extraCheese(false)
                .addMainTopping()
                .build();

        PizzaBuilder margaritaBuilder = new MargaritaPizzaBuilder(25);

        Pizza margarita = margaritaBuilder
                .extraCheese(false)
                .addMainTopping()
                .build();

        System.out.println(pepperoni);
        System.out.println(pepperoni2);
        System.out.println(margarita);
    }
}
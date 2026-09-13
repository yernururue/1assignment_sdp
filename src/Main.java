public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(25, "Pepperoni")
                .cheese(true)
                .sausage(true)
                .tomato(false)
                .build();

        System.out.println(pizza.toString());
    }
}
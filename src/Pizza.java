public final class Pizza {
    private final int size;
    private final String name;
    private final boolean extraCheese;
    private final boolean sausage;
    private final boolean tomato;

    Pizza(int size, String name, boolean extraCheese, boolean sausage, boolean tomato) {
        if (size < 15 || size > 45) {
            throw new IllegalArgumentException("The size must be between 15 and 45 cm");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be empty");
        }

        this.size = size;
        this.name = name;
        this.extraCheese = extraCheese;
        this.sausage = sausage;
        this.tomato = tomato;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public boolean hasExtraCheese() {
        return extraCheese;
    }

    public boolean hasSausage() {
        return sausage;
    }

    public boolean hasTomato() {
        return tomato;
    }

    @Override
    public String toString() {
        return "Pizza " +
                "size=" + size + " cm" +
                " name='" + name +
                " extraCheese=" + extraCheese +
                " sausage=" + sausage +
                " tomato=" + tomato;
    }
}
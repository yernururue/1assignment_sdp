public class Pizza {
    private final int size;
    private final String name;
    private final boolean cheese;
    private final boolean sausage;
    private final boolean tomato;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.name = builder.name;
        this.cheese = builder.cheese;
        this.sausage = builder.sausage;
        this.tomato = builder.tomato;
    }
    public static class Builder {
        private final int size;
        private final String name;
        private boolean cheese;
        private boolean sausage;
        private boolean tomato;


        public Builder(int size, String name) {
            this.size = size;
            this.name = name;
        }

        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder sausage(boolean sausage) {
            this.sausage = sausage;
            return this;
        }

        public Builder tomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}

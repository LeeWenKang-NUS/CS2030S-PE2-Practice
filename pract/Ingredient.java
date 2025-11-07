public class Ingredient {
    private String name;
    private boolean isFresh;
    private boolean isCooked = false;
    
    public Ingredient(String name, boolean isFresh) {
        this.name = name;
        this.isFresh = isFresh;
    }

    public Ingredient cook() {
        this.isCooked = true;
        return this;
    }

    public boolean isFresh() {
        return this.isFresh;
    }

    public boolean isCooked() {
        return this.isCooked;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String cook = this.isCooked ? "Cooked" : "Uncooked";
        return cook + " " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ingredient in)) {
            return false;
        }
        return this.name.equals(in.name);
    }

    
}
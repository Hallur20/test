
class TTagpakken {

    private String name;
    private int amount;
    private String unit;
    private String description;

    public TTagpakken(String name, int amount, String unit, String description) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public String getDescription() {
        return description;
    }
    
    

    @Override
    public String toString() {
        return "{" + "name = " + name + ", amount = " + amount + ", unit = " + unit + ", description = " + description + '}';
    }
}

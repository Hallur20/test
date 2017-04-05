
class FTræogTagplader {

    private String name;
    private int length;
    private int amount;
    private String unit;
    private String description;

    public FTræogTagplader(String name, int length, int amount, String unit, String description) {
        this.name = name;
        this.length = length;
        this.amount = amount;
        this.unit = unit;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
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
        return "{" + "name = " + name + ", length = " + length + ", amount = " + amount + ", unit = " + unit + ", description = " + description + '}';
    }
}

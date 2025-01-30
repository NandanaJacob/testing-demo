package mod8.Sandwich_BuilderPattern;

public class Sandwich_Product {
    private String bread;
    private String vegetables;
    private String meats;
    private String sauces;

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public void setMeats(String meats) {
        this.meats = meats;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    @Override
    public String toString() {
        return "Sandwich [Bread=" + bread + ", Vegetables=" + vegetables + ", Meats=" + meats + ", Sauces=" + sauces + "]";
    }
}


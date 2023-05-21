public class Product {
    private String name;
    private  String place;
    private  String type;
    private  int warranty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }


    public Product(String name, String place, String type, int warranty) {
        this.name = name;
        this.place = place;
        this.type = type;
        this.warranty = warranty;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", type='" + type + '\'' +
                ", warranty=" + warranty +
                '}';
    }
}

package day13_practice_tasks.phone_task;

public class Samsung {

    private String brand;
    private String  model;
    private String  size;
    private double price;
    private String  color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand != null && !brand.trim().isEmpty()){
            this.brand = brand;
        }else {
            System.err.println("The brand must not be null, empty, or blank.");
            System.exit(1);
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        if(model != null && !model.trim().isEmpty()){
            this.model = model;
        }else {
            System.err.println("The model must not be null, empty, or blank.");
            System.exit(1);
        }

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if(price> 0){
            this.price = price;
        }else{
            System.err.println("The price must be greater than zero.");
            System.exit(1);
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if(color != null && !color.trim().isEmpty()){
            this.color = color;
        }else {
            System.err.println("The color must not be null, empty, or blank.");
            System.exit(1);
        }

    }

    public Samsung(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public void call(String phoneNumber){
        System.out.println("calling the number " + phoneNumber);
    }

    public void text(String phoneNumber){
        System.out.println("texting to the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

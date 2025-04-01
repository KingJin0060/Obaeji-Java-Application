// Program 4: Watch.java
public class Watch {
    // Attributes (fields)
    private String brand;
    private String color;
    private double size;

    // Constructor
    public Watch(String brand, String color, double size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    // Methods (behaviors)
    public void showTime() {
        System.out.println("The time is: 10:30 AM");
    }

    public void setAlarm() {
        System.out.println("Alarm set for 6:00 AM");
    }

    // Getters and setters for attributes
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Watch myWatch = new Watch("Rolex", "Silver", 42);
        System.out.println("Brand: " + myWatch.getBrand());
        System.out.println("Color: " + myWatch.getColor());
        System.out.println("Size: " + myWatch.getSize() + "mm");
        myWatch.showTime();
        myWatch.setAlarm();
    }
}

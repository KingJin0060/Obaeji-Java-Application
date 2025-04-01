// Program 6: AlarmClock.java
class Watch {
    private String brand;

    public Watch(String brand) {
        this.brand = brand;
    }

    public void showTime() {
        System.out.println("The time is 12:00 PM.");
    }

    public String getBrand() {
        return brand;
    }
}

class AlarmClock extends Watch {
    public AlarmClock(String brand) {
        super(brand);
    }

    public void setAlarm() {
        System.out.println("Alarm set for 6:30 AM.");
    }

    public static void main(String[] args) {
        AlarmClock myClock = new AlarmClock("Casio");
        System.out.println("Brand: " + myClock.getBrand());
        myClock.showTime();
        myClock.setAlarm();
    }
}

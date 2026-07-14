 class Car {
    String brand;
    int year;
    public Car(String carBrand, int carYear) {
        brand = carBrand; 
        year = carYear;
    }
    public void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Year: " + year);
    }
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2026);
        myCar.displayDetails();
    }
} 

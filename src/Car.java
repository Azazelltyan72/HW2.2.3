public class Car {
    String brand;
    String model;
    String productionYear;
    String productionCountry;
    String color;
    String engineVolume;

    public Car(String brand, String model, String productionYear, String productionCountry, String color, String engineVolume) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear == null) {
            this.productionYear = "2000";
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (engineVolume == null) {
            this.engineVolume = "1,5 л";
        } else {
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                '}';
    }

}

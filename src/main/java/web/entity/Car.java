package web.entity;

import java.util.Objects;

public class Car {
    private final String model;
    private final String type;
    private final int gosnomer;
    public Car (String model, String type, int gosnomer) {
        this.gosnomer = gosnomer;
        this.type = type;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getGosnomer() {
        return gosnomer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", gosnomer=" + gosnomer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return gosnomer == car.gosnomer && Objects.equals(model, car.model) && Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, gosnomer);
    }
}

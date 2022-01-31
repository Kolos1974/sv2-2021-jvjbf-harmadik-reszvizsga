package vehiclerental;

import java.time.LocalTime;
import java.util.Objects;

public class Car implements Rentable{
    private String Id;
    private LocalTime rentingTime;
    private int price;

    public Car(String id, int price) {
        Id = id;
        this.price = price;
    }

    @Override
    public int calculateSumPrice(long minutes) {
        return (int) minutes*price;
    }

    @Override
    public LocalTime getRentingTime() {
        return rentingTime;
    }

    @Override
    public void rent(LocalTime time) {
        rentingTime = time;
    }

    @Override
    public void closeRent() {
        rentingTime = null;
    }


    @Override
    public int compareTo(Rentable o) {
        return getRentingTime().compareTo(o.getRentingTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(Id, car.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, price);
    }
}

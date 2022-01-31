package vehiclerental;

import java.time.LocalTime;
import java.util.Objects;

public class Bike implements Rentable{
    private String id;
    private LocalTime rentingTime;

    public Bike(String Id) {
        this.id = Id;
    }

    @Override
    public int calculateSumPrice(long minutes) {
        return (int) minutes*15;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return Objects.equals(id, bike.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Rentable o) {
        return getRentingTime().compareTo(o.getRentingTime());
    }
}

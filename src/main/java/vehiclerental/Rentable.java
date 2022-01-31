package vehiclerental;

import java.time.LocalTime;
import java.util.Comparator;

public interface Rentable extends Comparable<Rentable>{

    int calculateSumPrice(long minutes);

    LocalTime getRentingTime();

    void rent(LocalTime time);

    void closeRent();

}

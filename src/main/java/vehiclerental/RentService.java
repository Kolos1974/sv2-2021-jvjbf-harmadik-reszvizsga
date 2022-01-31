package vehiclerental;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentService {
    private List<Rentable> rentables = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private Map<Rentable,User> actualRnting = new HashMap<>();


    public void registerUser(User user){
        if (user== null){
            throw new IllegalArgumentException("User is null");
        }
        if (users.contains(user)){
            throw new IllegalArgumentException("user is used");
        }
        users.add(user);
    }

    public void addRentable(Rentable vehicle){
        if (vehicle == null){
            throw new IllegalArgumentException("Vechicle is null");
        }
        rentables.add(vehicle);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Rentable> getRentables() {
        return rentables;
    }

    public void rent(User user, Rentable rentable, LocalTime time){
        rentable.rent(time);
        getActualRenting().put(rentable, user);


    }

    public void closeRent(Rentable rentable, int minutes){



    }

    public Map<User, Rentable> getActualRenting() {
        return actualRnting;
    }
}

package com.example.pr14;

import java.util.ArrayList;
import java.util.Objects;

public class Service {
    public static ArrayList<Building> buildings = new ArrayList<>();
    public static ArrayList<Address> addresses = new ArrayList<>();

    public static boolean deleteBuilding(String type){
        for (Building building:buildings){
            if (Objects.equals(building.getType(), type)){
                return buildings.remove(building);
            }
        }
        return false;
    }
    public static boolean deleteAddress(String addressText){
        for (Address address:addresses){
            if (Objects.equals(address.getAddressText(), addressText)){
                return addresses.remove(addressText);
            }
        }
        return false;
    }

    public static boolean add(Building temp){
        for (Building building:buildings)
        {
            if(Objects.equals(building,temp));
            return false;
        }
        return buildings.add(temp);
    }
    public static boolean add(Address temp){
        for (Address address:addresses)
        {
            if(Objects.equals(address,temp));
            return false;
        }
        return addresses.add(temp);
    }

    public static Building findBuilding(String type){
        for (Building building:buildings){
            if (Objects.equals(building.getType(), type)){
                return building;
            }
        }
        return null;
    }
    public static Address findAddress(String addressText){
        for (Address address:addresses){
            if (Objects.equals(address.getAddressText(), addressText)){
                return address;
            }
        }
        return null;
    }
}

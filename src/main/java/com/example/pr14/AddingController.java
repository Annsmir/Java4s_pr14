package com.example.pr14;

import org.springframework.web.bind.annotation.*;
import java.sql.Date;


@RestController
@RequestMapping("/add")
public class AddingController {
    @GetMapping("/building/{typeDate}")
    public String addDeparture(@PathVariable String typeDate){
        String[] splitparameters=typeDate.split("_");
        Building building = new Building(splitparameters[0],new Date(Integer.parseInt(splitparameters[1]),Integer.parseInt(splitparameters[2]),Integer.parseInt(splitparameters[3])));
        boolean check = Service.add(building);
        if (check){
            System.out.println("Building " + building.getType() + " created");
            return "Building " + building.getType() + " created";
        } else {
            System.out.println("Building with this name already exists");
            return "Building with this name already exists";
        }
    }
    @GetMapping("/address/{addr}")
    public String addAddress(@PathVariable String addr){
        String[] splitparameters=addr.split("_");
        Address address = new Address(splitparameters[0], splitparameters[1]);
        boolean check = Service.add(address);
        if (check){
            System.out.println("Address with name " + address.getAddressText() + " created");
            return "Address with name " + address.getAddressText() + " created";
        } else {
            System.out.println("Address with this name already exists");
            return "Address with this name already exists";
        }
    }

}
package com.example.pr14;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/show")
public class ShowingController {
    @GetMapping("/all/building")
    public String allBuildings(){
        System.out.println("All buildings are shown");
        return Service.buildings.toString();
    }
    @GetMapping("/all/address")
    public String allAddresses(){
        System.out.println("All addresses are shown");
        return Service.addresses.toString();
    }

    @GetMapping("building/{type}")
    public String showBuilding(@PathVariable String type){
        Building building = Service.findBuilding(type);
        if (building == null){
            System.out.println("Building " + type + " not found");
            return "Building " + type + " not found";
        }
        System.out.println("Building " + building.getType() + " is shown");
        return building.toString();
    }
    @GetMapping("address/{name}")
    public String showAddress(@PathVariable String name){
        Address address = Service.findAddress(name);
        if (address== null){
            System.out.println("Address " + name + " not found");
            return "Address " + name + " not found";
        }
        System.out.println("Address " + address.getAddressText() + " is shown");
        return address.toString();
    }
}

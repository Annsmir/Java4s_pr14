package com.example.pr14;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/remove")
public class RemovingController {
    @GetMapping("/all/building")
    public String removeAllBuildings(){
        Service.buildings = new ArrayList<>();
        System.out.println("All buildings removed");
        return "All buildings removed";
    }
    @GetMapping("/all/address")
    public String removeAllAddresses(){
        Service.addresses = new ArrayList<>();
        System.out.println("All addresses removed");
        return "All addresses removed";
    }

    @GetMapping("building/{type}")
    public String removeBuilding(@PathVariable String type){
        boolean check = Service.deleteBuilding(type);
        if (check){
            System.out.println("Building " + type + " has been removed");
            return "Building " + type + " has been removed";
        } else {
            System.out.println("Building with name " + type + " not found");
            return "Building with name " + type + " not found";
        }
    }
    @GetMapping("address/{type}")
    public String removeAddress(@PathVariable String type){
        boolean check = Service.deleteAddress(type);
        if (check){
            System.out.println("Address " + type + " has been removed");
            return "Address " + type + " has been removed";
        } else {
            System.out.println("Address with name " + type + " not found");
            return "Address with name " + type + " not found";
        }
    }
}

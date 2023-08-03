package com.encoredev.kokorobundle.Controller;

import com.encoredev.kokorobundle.Entity.Rooster;
import com.encoredev.kokorobundle.Service.RoosterService;
import com.encoredev.kokorobundle.dto.RoosterRequest;
import com.encoredev.kokorobundle.dto.RoosterResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooster")
@RequiredArgsConstructor
public class RoosterController {

    private final RoosterService roosterService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody RoosterRequest roosterRequest){
        roosterService.createRooster(roosterRequest);
        System.out.println("Creaste un gallo! ");

    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Rooster> getAllRoosters(){
        return roosterService.getAllRoosters();
    }



}

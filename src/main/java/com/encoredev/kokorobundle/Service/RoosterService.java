package com.encoredev.kokorobundle.Service;

import com.encoredev.kokorobundle.Entity.Rooster;
import com.encoredev.kokorobundle.Repository.RoosterRepository;
import com.encoredev.kokorobundle.dto.RoosterRequest;
import com.encoredev.kokorobundle.dto.RoosterResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class RoosterService {
    private final RoosterRepository roosterRepository;

    //Create a rooster
    public void createRooster(RoosterRequest roosterRequest){
        Rooster rooster = Rooster.builder()
                .name(roosterRequest.getName())
                .tag(roosterRequest.getTag())
                .color(roosterRequest.getColor())
                .feather_color(roosterRequest.getFeather_color())
                .age(roosterRequest.getAge())
                .weight(roosterRequest.getWeight())
                .line(roosterRequest.getLine())
                .markup(roosterRequest.getMarkup())
                .isAlive(roosterRequest.getIsAlive())
                .type(roosterRequest.getType())
                .price(roosterRequest.getPrice())
                .createdAt(roosterRequest.getCreatedAt())
                .status(roosterRequest.getStatus())
                .build();

        roosterRepository.save(rooster);
        log.info("Rooster is created successfully", rooster.getId());
    }

    //Get all Roosters
    public List<Rooster> getAllRoosters(){

        List<Rooster> roosters = roosterRepository.findAll();

        return roosters;
    }



}

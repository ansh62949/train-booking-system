package com.train.booking.com.train.booking.Controller;



import com.train.booking.com.train.booking.Entity.Train;
import com.train.booking.com.train.booking.Service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trains")
public class TrainController {
    @Autowired
    private TrainService trainService;

    @GetMapping
    public List<Train> getAllTrains() {
        return trainService.getAllTrains();
    }

    @PostMapping
    public Train addTrain(@RequestBody Train train) {
        return trainService.addTrain(train);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrain(@PathVariable Long id) {
        trainService.deleteTrain(id);
        return ResponseEntity.noContent().build();
    }

    // Add more endpoints for update and search
}

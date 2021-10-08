package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.service.ScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScreeningController {
    @Autowired
    ScreeningService screeningService;

    @GetMapping("/screenings")
    public List<Screening> getScreenings(){
       return this.screeningService.getScreeningDatabase();
    }
}

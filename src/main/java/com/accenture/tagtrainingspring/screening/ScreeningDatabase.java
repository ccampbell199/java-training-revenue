package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Component
public class ScreeningDatabase {

    public List<Screening> screenings(){
        Patient cahir = new Patient("Cahir", 1, LocalDate.of(2000, Month.JANUARY, 1), Gender.MALE);
        Patient paul = new Patient("Paul", 2,LocalDate.of(2000, Month.JANUARY, 1), Gender.FEMALE);
        Patient james = new Patient("james", 3,LocalDate.of(2000, Month.JANUARY, 1), Gender.MALE);



        Screening s1 = new Screening(01, cahir, LocalDate.of(2021, Month.OCTOBER, 6), true);
        Screening s2 = new Screening(02, paul, LocalDate.of(2021, Month.OCTOBER, 6), false);
        Screening s3 = new Screening(03, james, LocalDate.of(2021, Month.OCTOBER, 6), true);

        List<Screening> screeningList = new ArrayList<Screening>();
        screeningList.add(s1);
        screeningList.add(s2);
        screeningList.add(s3);


        return screeningList;


    }
}

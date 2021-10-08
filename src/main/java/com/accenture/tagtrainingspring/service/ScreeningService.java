package com.accenture.tagtrainingspring.service;

import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningDatabase;
import io.micrometer.core.instrument.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningService {
    @Autowired
    private ScreeningDatabase screeningDatabase;

    //Not needed if autowired
    /*public  ScreeningService(ScreeningDatabase screeningDatabase) {

        this.screeningDatabase = screeningDatabase;
    }*/

    public List<Screening> getScreeningDatabase(){

        return this.screeningDatabase.screenings();
    }

   /* First attempt no longer needed
    public static boolean checkService(Patient patient, Screening screening){
            if(patient.getId() == screening.getPatient().getId()){
                System.out.println("Screening: " + screening.getScreeningId() + " has a match of true with patient: " + patient.getName() );
                return true;
            }else{
                System.out.println("Screening: " + screening.getScreeningId() + " has a match of false with patient: " + patient.getName() );

                return false;
            }
        }

    */

    public boolean isPatientScreening(Screening screening, Patient patient) {
        return screening.getPatient().getId() == patient.getId();
    }

        // doesn't return full screening only a string of the name and result if it matches the input
        public Screening checkScreeningName(String name){
        Screening screenResult = null;
        for(int i=0; i < screeningDatabase.screenings().size(); i++){
            if (screeningDatabase.screenings().get(i).getPatient().getName().equals(name)){
                screenResult = screeningDatabase.screenings().get(i);
                break;
            }
        }return screenResult;
    }
    }



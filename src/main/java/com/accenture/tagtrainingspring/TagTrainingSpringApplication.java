package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.screening.ScreeningDatabase;
import com.accenture.tagtrainingspring.service.ScreeningService;
import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
		printWelcomeMessage();
	}

	private static void printWelcomeMessage() {
		System.out.println("\n" +
				"  _______       _____   _______        _       _             \n" +
				" |__   __|/\\   / ____| |__   __|      (_)     (_)            \n" +
				"    | |  /  \\ | |  __     | |_ __ __ _ _ _ __  _ _ __   __ _ \n" +
				"    | | / /\\ \\| | |_ |    | | '__/ _` | | '_ \\| | '_ \\ / _` |\n" +
				"    | |/ ____ \\ |__| |    | | | | (_| | | | | | | | | | (_| |\n" +
				"    |_/_/    \\_\\_____|    |_|_|  \\__,_|_|_| |_|_|_| |_|\\__, |\n" +
				"                                                        __/ |\n" +
				"                                                       |___/ \n");

		ScreeningDatabase s1 = new ScreeningDatabase();
		List<Screening> screeningList = s1.screenings();

		//ScreeningService service = new ScreeningService(s1);
		//System.out.println(service.checkScreeningName("Cahir"));





		for (int i = 0; i < screeningList.size(); i++){
			System.out.println("Screening for patient " +  screeningList.get(i).getPatient().getName() + ", returned a malignant result of " + screeningList.get(i).getMalignantResult());
		}




	}



}

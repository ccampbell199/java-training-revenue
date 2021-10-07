package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;
import java.time.Month;

import java.time.LocalDate;

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
		printWelcomeMessage();

		Patient patient = new Patient("Joe", 1, LocalDate.of(1994, 1, 1), Gender.MALE);
		Screening screening = new Screening(1, patient, LocalDate.of(2020, 4, 1), false);

		System.out.println("Patient: " + screening.getPatient().getName() + " has a malignant diagnosis of " + screening.isMalignant());
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

		Patient cahir = new Patient("Cahir", 1,LocalDate.of(2000, Month.JANUARY, 1), Gender.MALE);
		Screening S1 = new Screening(01, 11, LocalDate.of(2021, Month.OCTOBER, 6), true);

		System.out.println("Patient: " + cahir.getName() + " has a malignant diagnoses of " + S1.getMalignantResult());
	}

}

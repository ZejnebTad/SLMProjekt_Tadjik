package at.fhtw.bic.slmprojekt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjektController {


    public static void main(String[] args) {
        SpringApplication.run(ProjektController.class, args);
    }

    @GetMapping("/grade/{number}")
    public String getGrade(@PathVariable double number) {
        if (number == 00) return "It's 00:00 AM";
        else if (number <= 11) return "It's" + number + "AM";
        else if (number >= 13) return "It's" + number + "PM";
        else if (number == 12) return "It's 12:00 PM";
        else return "Not definiert";
    }
}

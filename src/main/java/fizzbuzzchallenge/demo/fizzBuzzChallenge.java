package fizzbuzzchallenge.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class fizzBuzzChallenge {


    @RequestMapping("/")
    public String showIndex() {
        char letter_grade ;
        int result_percentage = 0;
        int user_input=0;
        Scanner keyboard = new Scanner(System.in);
        user_input = keyboard.nextInt();
        result_percentage=(user_input/50)*100;

        if (90 < result_percentage && result_percentage<=100)
            letter_grade = 'A';

        else if (80 < result_percentage && result_percentage<=90)
            letter_grade = 'B';
        else if (70 < result_percentage && result_percentage<=80)
            letter_grade = 'C';
        else if (60 < result_percentage && result_percentage<=70)
            letter_grade = 'C';
        else if (50 < result_percentage && result_percentage<=60)
            letter_grade = 'D';
        else
            letter_grade= 'F';

        return "The grade of the student is "+letter_grade;
    }
}
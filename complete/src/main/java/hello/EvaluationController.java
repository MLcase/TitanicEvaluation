package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.io.IOException;

@Controller
public class EvaluationController {

    @GetMapping("/files/{filename:.+}/eval")
    public String getResult(@ModelAttribute Evaluator evaluator, @PathVariable String filename, Model model) {
        evaluator.setPath(filename);
        try {
            evaluator.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "evaluationResultTest";
    }

    @GetMapping("/files/{filename:.+}/deathRate")
    public String getDeathRate(@ModelAttribute Evaluator evaluator, @PathVariable String filename) {
        evaluator.setPath(filename);
        try {
            evaluator.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "evaluationDeathRate";
    }

    @GetMapping("/files/{filename:.+}/passengers")
    public String getPassengers(@ModelAttribute Evaluator evaluator, @PathVariable String filename) {
        evaluator.setPath(filename);
        try {
            evaluator.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "evaluationPassengers";
    }

    @GetMapping("/files/{filename:.+}/age")
    public String getAge(@ModelAttribute Evaluator evaluator, @PathVariable String filename) {
        evaluator.setPath(filename);
        try {
            evaluator.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "evaluationAge";
    }
}

package Cleveland.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {
   @GetMapping ("/weather")
    public String index() {
        return "weather.html";
    }
}
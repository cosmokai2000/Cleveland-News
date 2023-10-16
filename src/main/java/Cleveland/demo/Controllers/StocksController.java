package Cleveland.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StocksController {
   @GetMapping ("/stocks")
    public String index() {
        return "stocks.html";
    }
}

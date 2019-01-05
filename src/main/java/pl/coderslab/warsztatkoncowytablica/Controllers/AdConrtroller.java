package pl.coderslab.warsztatkoncowytablica.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AdConrtroller {

    @GetMapping("/")
  public String test(){
      return "Hello";
    }
}

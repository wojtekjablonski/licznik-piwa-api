package pl.net.japco.licznikpiwaapi.controllers;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping(value = "/")
public class IndexController {


    @GetMapping
    public String index() {
        return "Hello Licznik Piwa Api";
    }
}

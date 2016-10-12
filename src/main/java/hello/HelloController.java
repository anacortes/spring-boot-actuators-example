package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

@RestController
public class HelloController {

    @Autowired
    MyMetricsService myMetricsService;

    @PostConstruct
    public void init() {
        myMetricsService.setServiceNumber(888);
    }

    @RequestMapping("/")
    public String index() {
        myMetricsService.incrementServiceCall();
        return "Greetings from Spring Boot!";
    }
    
}

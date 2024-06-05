package rest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class home {
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "hello world!";
    }
}

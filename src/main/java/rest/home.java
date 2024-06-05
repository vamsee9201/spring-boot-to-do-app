package rest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


@GetMapping("/helloworld")
public class home {
    return "hello world!";
}

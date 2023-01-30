package ru.pereverzev.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello-world")
    //когда пользователь будет набирать на сайте данный URL, запрос будет приходить в этот контролер, в этот метод;
    public String sayHello() {
        return "hello_world";
    }
}

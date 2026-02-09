package atu.ie.sem2lab2;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";

    }
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) {
        return "Hello " + name + " Age " + age;
    }

    @GetMapping("/person")
    public Person getPerson() {
        return new Person("paul",25);
    }
}

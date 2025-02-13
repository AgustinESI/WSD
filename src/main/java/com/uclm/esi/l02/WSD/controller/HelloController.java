import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "Bye Bye!";
    }

    @GetMapping("/bye2")
    public String sayBye() {
        return "Bye Bye2!";
    }
}

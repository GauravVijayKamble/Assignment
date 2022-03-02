import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController2 {
@GetMapping("/test1")
public String test3() {
return "response from test3";
}
@GetMapping("/test2")
public String test4() {
return "response from test4";
}

}
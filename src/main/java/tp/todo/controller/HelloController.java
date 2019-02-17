package tp.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public ModelAndView sayHello(@RequestParam String name) {
        ModelAndView view = new ModelAndView("hello");
        view.addObject("name", name);
        return view;
    }
}

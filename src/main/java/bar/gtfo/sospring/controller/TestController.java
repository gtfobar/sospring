package bar.gtfo.sospring.controller;

import bar.gtfo.sospring.model.Test;
import bar.gtfo.sospring.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping(value={"","/list"})
    public String listTests(Model model) {

        List<Test> allTests = testService.list();
        model.addAttribute("allTests", allTests);
        return "list-tests";
    }

    @GetMapping("/create")
    public String createTest() {
        return "create-test";
    }

    @GetMapping("/test")
    public String showForm() {
        return "";
    }
}

package by.iharantanovich.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-detail-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails() {
//        return "show-emp-detail-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(HttpServletRequest request, Model model) {

        String empName = request.getParameter("employeeName");
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", " - sad man");

        return "show-emp-detail-view";
    }
}

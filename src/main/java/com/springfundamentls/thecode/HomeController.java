package com.springfundamentls.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }

    @RequestMapping(value = "/checkCode", method = RequestMethod.POST)
    public String checkCode(@RequestParam(value = "code") String code, HttpSession session) {
        if (code.equals("bushido"))
            return "redirect:/code";
        return "redirect:/loadErrors";
    }

    @RequestMapping("/code")
    public String code() {
        return "redirect:/code.html";
    }

    @RequestMapping("/loadErrors")
    public String loadErrors(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You must train harder!");
        return "redirect:/";
    }


}

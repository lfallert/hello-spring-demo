package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Chris Bay
 */
@Controller
@ResponseBody
public class HelloController {

    @GetMapping()
    public String reply(@RequestParam String n, @RequestParam String l) {

        String greeting = "";

        if (l.equals("english")) {
            greeting = "Hello";
        }
        else if (l.equals("french")) {
            greeting = "Bonjour";
        }
        else if (l.equals("italian")) {
            greeting = "Bonjourno";
        }
        else if (l.equals("spanish")) {
            greeting = "Hola";
        }
        else if (l.equals("german")) {
            greeting = "Hallo";
        }

        return greeting + " " + n;

    }

    @GetMapping("form")
    public String hello() {
        return  "<html>" +
                "<body>" +
                "<form action='/hello' method='post'>" +
                "<input type='text' name='name' />" +
                "<select name='language'>" +
                "<option value='english'>English</option>" +
                "<option value='french'>French</option>" +
                "<option value='german'>German</option>" +
                "<option value='italian'>Italian</option>" +
                "<option value='spanish'>Spanish</option>" +
                "</select>" +
                "<input type='submit' value='Greet me!' />" +
                "</form>" +
                "</body>" +
                "</html>"
                ;
    }




}

package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Chris Bay
 */
@Controller
<<<<<<< HEAD
=======
@ResponseBody
@RequestMapping("hello")
>>>>>>> origin/class-annotations
public class HelloController {

    //    // Handle request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

<<<<<<< HEAD
    @GetMapping("goodbye")
    @ResponseBody
=======
    // lives at /hello/goodbye
    @GetMapping("goodbye")
>>>>>>> origin/class-annotations
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Handles requests of the form /hello?name=LaunchCode
<<<<<<< HEAD
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @ResponseBody
=======
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
>>>>>>> origin/class-annotations
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // Handles requests of the form /hello/LaunchCode
<<<<<<< HEAD
    @GetMapping("hello/{name}")
    @ResponseBody
=======
    @GetMapping("{name}")
>>>>>>> origin/class-annotations
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

<<<<<<< HEAD

    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'hello' method = 'post'>" + // submit a request to /hello
=======
    // /hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = '/hello' method = 'post'>" + // submit a request to /hello
>>>>>>> origin/class-annotations
                "<input type = 'text' name = 'name' >" +
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}

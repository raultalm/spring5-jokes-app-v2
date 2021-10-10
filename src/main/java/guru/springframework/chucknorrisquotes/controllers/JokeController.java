package guru.springframework.chucknorrisquotes.controllers;

import guru.springframework.chucknorrisquotes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", "", "/chuck"})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return "index"; // index is the name of the template "index.html"
    }
}

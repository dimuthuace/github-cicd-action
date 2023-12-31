package com.example.democicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoCicdActionsApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome CICD test test test!";
    }

    /*echo "# github-cicd-action" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/dimuthuace/github-cicd-action.git
    git push -u origin main*/
    public static void main(String[] args) {
        SpringApplication.run(DemoCicdActionsApplication.class, args);
    }

}

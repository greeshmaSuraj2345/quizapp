package com.greeshma.quizapp.controller;


import com.greeshma.quizapp.entity.Questions;
import com.greeshma.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question1")
public class QuestionController {

    @Autowired
    QuestionService questionservice;

    @GetMapping("allQuestion")
    public List<Questions> getAllQuestions(){
        return questionservice.getAllQuestions();

    }
    @GetMapping("category/{category}")
    public List<Questions>getAllQuestionsByCategory(@PathVariable String category){
        return questionservice.getAllQuestionsByCategory(category);
    }
}

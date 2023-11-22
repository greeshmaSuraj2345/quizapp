package com.greeshma.quizapp.service;

import com.greeshma.quizapp.dao.QuestionDao;
import com.greeshma.quizapp.entity.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Questions> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Questions> getAllQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Questions question) {
         questionDao.save(question);
        return "success" ;
    }
}

package com.spring.SampleSpring.model;

import java.util.List;
import java.util.Map;

public class Question {
    private int id;
    private String name;
    private List<String> answers;
    private Map<String, String> answersWithAuthors;

    // Getter and setter for 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for 'answers' (list-based)
    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    // Getter and setter for 'answersWithAuthors' (map-based)
    public Map<String, String> getAnswersWithAuthors() {
        return answersWithAuthors;
    }

    public void setAnswersWithAuthors(Map<String, String> answersWithAuthors) {
        this.answersWithAuthors = answersWithAuthors;
    }

    // Display method to print question info
    public void displayInfo() {
        System.out.println("Question ID: " + id);
        System.out.println("Question: " + name);
        System.out.println("Answers: " + answers);
        if (answersWithAuthors != null) {
            System.out.println("Answers with authors: " + answersWithAuthors);
        }
    }
}

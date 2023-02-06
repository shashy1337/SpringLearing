package ru.shashy.springVerV2.AspectsMethodModification;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment){
        logger.info("Publishing comment: " + comment.getText());
        return "SUCSESS!";
    }
}
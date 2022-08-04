package com.revature.revvit.usercontent;

import com.revature.revvit.example.ExampleConnection;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/user_content")
@RequiredArgsConstructor
public class UserContentController {

    private final UserContentService userContentService;

    @CrossOrigin
    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Flux<UserContentModel> getAllPosts(){
        return userContentService.getAllUserContent();
    }


    @CrossOrigin
    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping(value = "/test",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Flux<UserContentModel> getAllCommentsOnPost(){
        return userContentService.getAllCommentsByPostSorted();
    }
}

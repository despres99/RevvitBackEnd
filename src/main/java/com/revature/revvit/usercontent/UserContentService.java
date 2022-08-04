package com.revature.revvit.usercontent;

import com.revature.revvit.util.custom_exception.InvalidRequestException;
import com.revature.revvit.util.validators.UserContentValidator;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
@AllArgsConstructor
public class UserContentService {

    private final UserContentRepository userContentRepository;

    //todo validation needed
    //region Edit User Content Services
    public void create(UserContentModel userContentModel){
        userContentModel.setTimestamp(LocalDateTime.now(ZoneOffset.UTC).toString());
        userContentModel.setUpVotes(0);
        UserContentValidator.validate(userContentModel);
        userContentRepository.save(userContentModel).subscribe();
    }

    public void upVote(String userContentId){
        Mono<UserContentModel> mono = userContentRepository.findById(userContentId);
        mono.subscribe(userContentModel -> {
            if(userContentModel != null) {
                userContentModel.setUpVotes(userContentModel.getUpVotes() + 1);
                userContentRepository.save(userContentModel).subscribe();
            }
        });
    }

    public void editUserContent(UserContentModel userContentModel){
        userContentModel.setEdited(true);
        userContentModel.setEditDate(LocalDateTime.now(ZoneOffset.UTC).toString());
        userContentRepository.save(userContentModel).subscribe();
    }
    //endregion

    //region Get User Content Services
    //todo
    public Flux<UserContentModel> getAllUserContent(){
        return null;
    }

    public Flux<UserContentModel> getAllPostsSorted(){
        //todo put in sort
        //Sort sort  = new Sort();
        return userContentRepository.findAll();
    }

    //todo
    public Flux<UserContentModel> getAllCommentsByPostSorted(){
        return null;
        //userContentRepository.
    }

    //todo
    public Flux<UserContentModel> getAllCommentsByUserId(){
        return null;
    }
    //endregion
}

package com.revature.revvit.usercontent;


import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Container(containerName = "user_content")
@Data
@NoArgsConstructor
public class UserContentModel {
    @Id
    @GeneratedValue
    private String id;

    private String title;
    @NotEmpty(message = "Message can't be null")
    @Size(max = 2000, message = "Message can't be longer than 2000 characters")
    private String message;

    @NotNull(message = "Type can't be empty")
    private String type;

    @NotNull
    private String timestamp;

    //todo should be not null but needs user class ready
    private String user_id; //needs user class to be ready

    @NotNull(message = "Upvotes can't be null")
    private int upVotes;

    private boolean edited;

    private String editDate;

    //List of the id strings related to the comments
    private List<String> comment_List;

    private List<String> tags;
}

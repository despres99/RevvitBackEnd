package com.revature.revvit.example;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.*;
import org.springframework.data.annotation.Id;


@Container(containerName = "example_container")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class ExampleConnection {
    @Id
    @GeneratedValue
    private String id;
    @NonNull
    private String exampleText;
    @NonNull
    @PartitionKey
    private String exampleLogicalPartition;

}

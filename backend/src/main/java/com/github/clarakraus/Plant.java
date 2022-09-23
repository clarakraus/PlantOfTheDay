package com.github.clarakraus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "plants")
public class Plant {

    private String picture;
    private String name;
    private Family family;
    private String description;
    private long timestamp;

}

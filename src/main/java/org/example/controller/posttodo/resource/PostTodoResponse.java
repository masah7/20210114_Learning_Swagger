package org.example.controller.posttodo.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value
@ApiModel(value = "PostTodoResponse", description = "Sample model for the documentation")
public class PostTodoResponse {
    @ApiModelProperty(required = true, value = "結果", example = "true", position = 1)
    @JsonProperty("result")
    private final Boolean result;
}

package org.example.controller.resource.postsample;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@ApiModel(value = "PostSampleResponse", description = "Sample model for the documentation")
@Value
public class PostSampleResponse {
    @ApiModelProperty(required = true, value = "結果", example = "true", position = 1)
    @JsonProperty("result")
    private final Boolean result;

}

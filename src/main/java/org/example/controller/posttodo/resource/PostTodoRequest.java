package org.example.controller.posttodo.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value
@ApiModel(value = "PostTodoRequest")
public class PostTodoRequest {
    @ApiModelProperty(value = "タスク名", required = true, example = "〇〇案件", position = 1)
    @JsonProperty("title")
    private final String title;

    @ApiModelProperty(value = "期限（Y/m/d）", required = true, example = "2021/02/01", position = 2)
    @JsonProperty("deadline")
    private final String deadline;

    @ApiModelProperty(value = "優先度\n\n"
            + "`1` - 優先度高 \n\n"
            + "`2` - 優先度中 \n\n"
            + "`3` - 優先度低 \n\n",
            required = true, example = "1", allowableValues = "1,2,3", position = 3)
    @JsonProperty("priority")
    private final int priority;
}

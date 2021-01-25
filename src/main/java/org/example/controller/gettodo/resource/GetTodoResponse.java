package org.example.controller.gettodo.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value
@ApiModel(value = "GetTodoResponse")
public class GetTodoResponse {
    @ApiModelProperty(value = "id\n\n"
            + "API側で自動採番", required = true, example = "1", position = 1)
    @JsonProperty("id")
    private final int id;

    @ApiModelProperty(value = "タスク名", required = true, example = "〇〇案件", position = 2)
    @JsonProperty("title")
    private final String title;

    @ApiModelProperty(value = "期限（Y/m/d）", required = true, example = "2021/02/01", position = 3)
    @JsonProperty("deadline")
    private final String deadline;

    @ApiModelProperty(value = "優先度\n\n"
            + "`1` - 優先度高 \n\n"
            + "`2` - 優先度中 \n\n"
            + "`3` - 優先度低 \n\n",
            required = true, example = "1", allowableValues = "1,2,3", position = 4)
    @JsonProperty("priority")
    private final int priority;

    @ApiModelProperty(value = "着手日（Y/m/d）", example = "2021/01/25", position = 5)
    @JsonProperty("start")
    private final String start;

    @ApiModelProperty(value = "完了日（Y/m/d）", example = "2021/01/30", position = 6)
    @JsonProperty("end")
    private final String end;

    @ApiModelProperty(value = "タスクが完了したか", required = true, example = "true", position = 7)
    @JsonProperty("isDone")
    private final Boolean isDone;
}
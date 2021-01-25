package org.example.controller.posttodo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.example.controller.posttodo.resource.PostTodoRequest;
import org.example.controller.posttodo.resource.PostTodoResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "TODO")
public class PostTodoController {
    @ApiOperation(value = "PostTodo", notes = "TODOを登録するAPI", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "処理結果", response = PostTodoResponse.class),
            @ApiResponse(code = 400, message = "リクエストに必須の項目が不足、または不正な値を指定している。"),
    })
    @PostMapping(path = "/todo", produces = "application/json")
    public PostTodoResponse postTodo(@RequestBody PostTodoRequest postTodoRequest) {
        return new PostTodoResponse(true);
    }
}

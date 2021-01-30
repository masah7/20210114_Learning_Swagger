package org.example.controller.gettodo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import org.example.controller.gettodo.resource.GetTodoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "TODO")
public class GetTodoController {
    @ApiOperation(value = "GetTodo", notes = "TODOを取得するAPI")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "登録したTODO", response = GetTodoResponse.class),
            @ApiResponse(code = 400, message = "リクエストに必須の項目が不足、または不正な値を指定している。"),
            @ApiResponse(code = 404, message = "TOODが存在しない"),
    })
    @GetMapping(path = "/todo", produces = "application/json")
    public List<GetTodoResponse> getTodo() {
        return List.of(
                new GetTodoResponse(
                        1,
                        "Aタスク",
                        "2021/02/01",
                        1,
                        "2021/01/25",
                        "2021/01/30",
                        true
                ), new GetTodoResponse(
                        2,
                        "Bタスク",
                        "2021/02/15",
                        1,
                        null,
                        null,
                        false
                ));
    }
}

package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.example.controller.resource.getsample.GetSampleResponse;
import org.example.controller.resource.postsample.PostSampleRequest;
import org.example.controller.resource.postsample.PostSampleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Sample")
public class SampleController {
    @ApiOperation(value = "GetSample", notes = "Sampleを取得するAPI")
    @ApiResponse(code = 200, message = "レスポンス")
    @GetMapping("/sample")
    public GetSampleResponse getSample(@ApiParam(name = "sampleId", value = "サンプルID", required = true, example = "hogehoge") String userId) {
        return new GetSampleResponse("sampleId", "sampleName", 1);
    }

    @ApiOperation(value = "PostSample", notes = "Sampleを登録するAPI")
    @ApiResponse(code = 200, message = "レスポンス")
    @PostMapping("/sample")
    public PostSampleResponse postSample(PostSampleRequest postSampleRequest) {
        return new PostSampleResponse(true);
    }
}

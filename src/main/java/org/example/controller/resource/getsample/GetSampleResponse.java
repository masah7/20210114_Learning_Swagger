package org.example.controller.resource.getsample;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value
public class GetSampleResponse {
    @ApiModelProperty(required = true, value = "サンプルID", example = "HOGEHOGE", position = 1)
    @JsonProperty("sampleid")
    private final String sampleId;

    @ApiModelProperty(value = "サンプル名", example = "サンプル名", position = 2)
    @JsonProperty("samplename")
    private final String sampleName;

    @ApiModelProperty(required = true, value = "サンプル種別", example = "1", position = 3)
    @JsonProperty("sampletype")
    private final int sampleType;

}

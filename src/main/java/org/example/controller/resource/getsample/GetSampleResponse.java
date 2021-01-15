package org.example.controller.resource.getsample;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value
public class GetSampleResponse {
    @ApiModelProperty(required = true, value = "サンプルID", example = "HOGEHOGE")
    @JsonProperty("sampleid")
    private final String sampleId;

    @ApiModelProperty(required = true)
    @JsonProperty("sampleinfo")
    private final SampleInfo sampleInfo;

    @Value
    public static class SampleInfo {

        @ApiModelProperty(value = "サンプ",
                example = "サンプル名")
        @JsonProperty("samplename")
        private final String sampleName;

        @ApiModelProperty(required = true, value =
                "サンプル種別： \n\n" +
                        "`1` - サンプル種別1 \n\n" +
                        "`2` - サンプル種別2", example = "1", allowableValues = "range[1, 100]")
        @JsonProperty("sampletype")
        private final int sampleType;

    }

}

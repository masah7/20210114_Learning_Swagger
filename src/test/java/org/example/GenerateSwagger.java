package org.example;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import java.io.File;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Application.class)
@SpringBootTest
public class GenerateSwagger {

    @Autowired
    WebApplicationContext context;

    @Test
    public void generateSwagger() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/v2/api-docs").contentType(MediaType.APPLICATION_JSON))

                .andDo(result -> FileUtils.writeStringToFile(
                        new File("docs/swagger.json"),
                        new GsonBuilder().serializeNulls().setPrettyPrinting().create().toJson(
                                JsonParser.parseString(
                                        new String(result.getResponse().getContentAsByteArray(), StandardCharsets.UTF_8)
                                )
                        ),
                        StandardCharsets.UTF_8
                ));

    }
}

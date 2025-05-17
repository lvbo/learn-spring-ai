package io.github.lvbo.learn.spring.server.ai.callback;

import io.github.lvbo.learn.spring.server.ai.service.S3McpServerTools;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author lvbo.lv created on 2025-05-17 16:04
 */
@Component
public class S3McpToolCallback {

    @Bean
    public ToolCallbackProvider obsTools(S3McpServerTools s3McpServerTools) {
        return MethodToolCallbackProvider.builder().toolObjects(s3McpServerTools).build();
    }
}

package io.github.lvbo.learn.spring.server.ai.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

/**
 * @author lvbo.lv created on 2025-05-17 16:03
 */
@Service
public class S3McpServerTools {

    @Tool(name = "queryInfo", description = "test info，return the hello info")
    public String queryInfo() throws Exception {
        return "我的第一个MCP Server!!";
    }

}

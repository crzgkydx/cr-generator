package org.cr.model;

import lombok.Data;

/**
 * 静态模板配置
 */
@Data
public class MainTemplateConfig {

    private String author = "cr"; //（填充值）
    private String outputText = "输出结果";
    private boolean loop; //是否启动循环（开关）。
}

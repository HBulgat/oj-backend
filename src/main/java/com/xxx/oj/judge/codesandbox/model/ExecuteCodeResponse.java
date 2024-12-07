package com.xxx.oj.judge.codesandbox.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExecuteCodeResponse {
    /**
     * 程序输出
     */
    private List<String> outputList;
    /**
     * 接口信息
     */
    private String message;
    /**
     * 判题信息
     */
    private JudgeInfo judgeInfo;
    /**
     * 执行状态
     */
    private Integer status;
}

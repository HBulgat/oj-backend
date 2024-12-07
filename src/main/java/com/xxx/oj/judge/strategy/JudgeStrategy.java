package com.xxx.oj.judge.strategy;

import com.xxx.oj.judge.codesandbox.model.JudgeInfo;

/**
 * 判题策略接口
 */
public interface JudgeStrategy {
    /**
     * 判题执行方法
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}

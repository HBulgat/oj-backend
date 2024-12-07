package com.xxx.oj.judge;

import com.xxx.oj.judge.codesandbox.model.ExecuteCodeRequest;
import com.xxx.oj.judge.codesandbox.model.ExecuteCodeResponse;
import com.xxx.oj.model.entity.QuestionSubmit;
import com.xxx.oj.model.vo.QuestionSubmitVO;

public interface JudgeService {
    QuestionSubmit doJudge(long questionSubmitId);
}

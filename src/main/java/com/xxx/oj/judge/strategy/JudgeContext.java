package com.xxx.oj.judge.strategy;

import com.xxx.oj.model.dto.question.JudgeCase;
import com.xxx.oj.judge.codesandbox.model.JudgeInfo;
import com.xxx.oj.model.entity.Question;
import com.xxx.oj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

@Data
public class JudgeContext {
    private JudgeInfo judgeInfo;
    private List<String> inputList;
    private List<String> outputList;
    private List<JudgeCase>judgeCaseList;
    private Question question;
    private QuestionSubmit questionSubmit;
}

package com.xxx.oj.judge.codesandbox;

import com.xxx.oj.judge.codesandbox.model.ExecuteCodeRequest;
import com.xxx.oj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}

package com.xxx.oj.judge.codesandbox;

import com.xxx.oj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.xxx.oj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.xxx.oj.judge.codesandbox.impl.ThirdPartySandbox;

/**
 * 代码沙箱工厂
 */
public class CodeSandboxFactory {
    /**
     * 创建代码沙箱示例
     *
     * @param type 沙箱类型
     * @return CodeSandbox
     */
    public static CodeSandbox newInstance(String type) {
        switch (type){
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartySandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}

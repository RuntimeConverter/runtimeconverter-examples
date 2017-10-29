package com.project.convertedCode.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;

public class ConvertedProjectRuntimeEnv extends com.runtimeconverter.runtime.RuntimeEnv {

    public ConvertedProjectRuntimeEnv() {
        super(new com.project.convertedCode.main.Project());
    }

    public ConvertedProjectRuntimeEnv(
            HttpServletRequest req,
            HttpServletResponse resp,
            RuntimeFileContextInterface includable) {
        super(new com.project.convertedCode.main.Project(), req, resp, includable);
    }
}

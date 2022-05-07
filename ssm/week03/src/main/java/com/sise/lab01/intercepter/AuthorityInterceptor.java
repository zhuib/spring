package com.sise.lab01.intercepter;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

public class AuthorityInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        ActionContext ctx = actionInvocation.getInvocationContext();
        Map session = ctx.getSession();
        if (session.get("username") != null) {
            System.out.println("用户已登录");
            return actionInvocation.invoke();
        } else {
            ctx.put("tip", "您还没有登录，请登录！");
            return Action.LOGIN;
        }
    }
}

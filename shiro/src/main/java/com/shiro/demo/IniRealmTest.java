package com.shiro.demo;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

/**
 * 内置IniRealm
 */

public class IniRealmTest {
    @Test
    public void testAuthenticationByIniIniRealm(){

        //创建IniRealm对象，模拟从数据库中取用户角色权限数据
        IniRealm iniRealm=new IniRealm("classpath:user.ini"); //传入IniReam文件路径
        //创建SecurityManager环境
        DefaultSecurityManager defaultSecurityManager=new DefaultSecurityManager();
        defaultSecurityManager.setRealm(iniRealm);
        //2.主体提交认证请求（securityUtils获取主体）
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject suject=SecurityUtils.getSubject();
        //3.提交认证
        UsernamePasswordToken token=new UsernamePasswordToken("admin","123456");
        suject.login(token);
        //4.判断是否认证
        System.out.println("Authentication:"+suject.isAuthenticated());
        //5.授权
        suject.checkRole("admin");
        //6.负责人是否具备删除权限
        suject.checkPermission("user:create");

    }
}

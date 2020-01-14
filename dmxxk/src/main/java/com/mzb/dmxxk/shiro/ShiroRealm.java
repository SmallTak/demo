package com.mzb.dmxxk.shiro;

import com.mzb.dmxxk.entity.Account;
import com.mzb.dmxxk.service.AccountService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-13 11:01
 */

public class ShiroRealm extends AuthorizingRealm {

    private Logger logger = LoggerFactory.getLogger(ShiroRealm.class);

    @Autowired
    private AccountService accountService;

    /**
     * 判断用户权限
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /**
     * 判断登录
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String userMobile = usernamePasswordToken.getUsername();
        if(userMobile != null) {
            Account account = accountService.findByMobile(userMobile);
            if(account == null) {
                throw new UnknownAccountException("找不到该账号:" + userMobile);
            } else {

                System.out.println("ok");
                return new SimpleAuthenticationInfo(account,account.getPassword(),getName());
                }
            }
        return null;
    }
}

package com.gcmobile.sign.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.gcmobile.sign.codec.HmacSHA256Utils;


public class StatelessRealm extends AuthorizingRealm {
    @Override
    public boolean supports(AuthenticationToken token) {
        //仅支持StatelessToken类型的Token
        return token instanceof StatelessToken;
    }
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //根据用户名查找角色，请根据需求实现
        String username = (String) principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo =  new SimpleAuthorizationInfo();
        authorizationInfo.addRole("admin");
        return authorizationInfo;
    }
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        StatelessToken statelessToken = (StatelessToken) token;
        String username = statelessToken.getUsername();
        String key = getKey();//根据用户名获取密钥（和客户端的一样）
        //在服务器端生成客户端参数消息摘要
        String serverDigest = HmacSHA256Utils.digest(key, statelessToken.getParams());
        System.out.println(statelessToken.getClientDigest());
        System.out.println(serverDigest);
        //然后进行客户端消息摘要和服务器端消息摘要的匹配
        return new SimpleAuthenticationInfo(
                username,
                serverDigest,
                getName());
    }

    private String getKey() {//得到密钥，此处硬编码一个
        return "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDMz9sFEsSZ2igv4yMVw12bQ71OGb/mVOmIMuHcZdDG/d5ASN/quxCQdCoyJ7+SCIjCeyM2dYUYYGvyAKWWXOQmWX3i1/wkWXvj3NO0Q0BEnV7e2/zY1VaGs89OMEEaoIl1MYl0YzILsHWuJenvaok64D53pjOVaNui/oFmsdQ1rwIDAQAB";
    }
}

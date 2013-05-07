package com.iwt.services.test;

import com.iwt.services.UserInfoDelegate;
import com.iwt.services.UserInfoService;

public class WSTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        UserInfoService userInfoWS = new UserInfoService();
        UserInfoDelegate userInfoDelegate = userInfoWS.getUserInfoPort();
        System.out.println(userInfoDelegate.getUserInfo());
    }

}

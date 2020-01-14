package com.mzb.dmxxk.service.impl;

import com.mzb.dmxxk.entity.Account;
import com.mzb.dmxxk.mapper.AccountMapper;
import com.mzb.dmxxk.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-13 9:37
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account findByMobile(String mobile) {
        Account byMobile = accountMapper.findByMobile(mobile);
        System.out.println(byMobile.getPassword()+byMobile.getMobile());
        return byMobile;

    }
}

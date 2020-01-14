package com.mzb.dmxxk.service;

import com.mzb.dmxxk.entity.Account;

public interface AccountService {
    Account findByMobile(String mobile);
}

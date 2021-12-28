package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;

public interface ControlService {
    Result checkEMail();
    Result checkCellPhone();
}

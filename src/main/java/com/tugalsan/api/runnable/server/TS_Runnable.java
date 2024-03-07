package com.tugalsan.api.runnable.server;

import com.tugalsan.api.callable.client.TGS_Callable;
import com.tugalsan.api.callable.client.TGS_CallableUtils;

@Deprecated //WILL IT WORK ON GWT?
public interface TS_Runnable extends Runnable, TGS_Callable<Void> {

    @Override
    default Void call() {
        run();
        return TGS_CallableUtils.Null();
    }

    @Override
    public void run();
}

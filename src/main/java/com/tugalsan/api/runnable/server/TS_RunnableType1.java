package com.tugalsan.api.runnable.server;

import com.tugalsan.api.callable.client.TGS_CallableType1;
import com.tugalsan.api.callable.client.TGS_CallableUtils;

@Deprecated //WILL IT WORK ON GWT?
public interface TS_RunnableType1<A> extends TGS_CallableType1<Void, A> {

    @Override
    default Void call(A input0) {
        run(input0);
        return TGS_CallableUtils.Null();
    }

    public void run(A input0);
}

package com.tugalsan.api.runnable.server;

import com.tugalsan.api.callable.client.TGS_CallableType3;
import com.tugalsan.api.callable.client.TGS_CallableUtils;

@Deprecated //WILL IT WORK ON GWT?
public interface TS_RunnableType3<A, B, C> extends TGS_CallableType3<Void, A, B, C> {

    @Override
    default Void call(A input0, B input1, C input2) {
        run(input0, input1, input2);
        return TGS_CallableUtils.Null();
    }

    public void run(A input0, B input1, C input2);
}

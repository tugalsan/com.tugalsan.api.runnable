package com.tugalsan.api.runnable.server;

import com.tugalsan.api.callable.client.TGS_CallableType4;
import com.tugalsan.api.callable.client.TGS_CallableUtils;

@Deprecated //WILL IT WORK ON GWT?
public interface TS_RunnableType4<A, B, C, D> extends TGS_CallableType4<Void, A, B, C, D> {

    @Override
    default Void call(A input0, B input1, C input2, D input3) {
        run(input0, input1, input2, input3);
        return TGS_CallableUtils.Null();
    }

    public void run(A input0, B input1, C input2, D input3);
}

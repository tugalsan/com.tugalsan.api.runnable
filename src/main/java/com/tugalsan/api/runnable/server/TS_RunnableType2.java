package com.tugalsan.api.runnable.server;

import com.tugalsan.api.callable.client.TGS_CallableType2;
import com.tugalsan.api.callable.client.TGS_CallableUtils;

@Deprecated //WILL IT WORK ON GWT?
public interface TS_RunnableType2<A, B> extends TGS_CallableType2<Void, A, B> {

    @Override
    default Void call(A input0, B input1) {
        run(input0, input1);
        return TGS_CallableUtils.Null();
    }

    public void run(A input0, B input1);
}

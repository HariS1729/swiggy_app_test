package in.swiggy.android.tejas.feature.discovery.magiccart.transformer;

import in.swiggy.android.commons.exceptions.SwiggyExpiredTokenException;
import in.swiggy.android.tejas.NetworkExceptionTransformer;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.coroutineUtils.FlowExceptionTransformer;
import in.swiggy.android.tejas.error.Error;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: MagicCartExceptionTransformer.kt */
public final class MagicCartExceptionTransformer<M> extends FlowExceptionTransformer<Throwable, M> {
    /* access modifiers changed from: protected */
    public d<Response<M>> execute(Throwable th2) {
        Response.Failure failure;
        Throwable th3 = th2;
        p.j(th3, "parameters");
        if (th3 instanceof SwiggyExpiredTokenException) {
            failure = new Response.Failure(new Error.ExpiredTokenError(th2.getMessage()), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (i) null);
        } else {
            String message = th2.getMessage();
            if (message == null) {
                message = p.s(NetworkExceptionTransformer.MESSAGE_HTTP_EXCEPTION, th3);
            }
            failure = new Response.Failure(new Error.UnhandledExceptionError(th3, message), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (i) null);
        }
        return f.y(failure);
    }
}

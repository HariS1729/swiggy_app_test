package in.swiggy.android.tejas;

import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.coroutineUtils.FlowErrorTransformer;
import in.swiggy.android.tejas.coroutineUtils.FlowExceptionTransformer;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;
import okhttp3.ResponseBody;

/* compiled from: ResponseTransformerManager.kt */
public final class ResponseTransformerManager {
    public static final int ERROR_CODE_INTERNAL = 503;
    public static final int ERROR_CODE_INTERNAL_SECONDARY = 403;
    public static final int ERROR_CODE_THROTTLE = 429;
    public static final ResponseTransformerManager INSTANCE = new ResponseTransformerManager();
    public static final String MESSAGE_NULL_RESPONSE_BODY = "null_response_body";
    public static final String MESSAGE_UNSUCCESSFUL_RESPONSE = "unsuccessful_response";

    private ResponseTransformerManager() {
    }

    public static /* synthetic */ Response.Failure buildFailureResponse$default(ResponseTransformerManager responseTransformerManager, retrofit2.Response response, Object obj, ResponseBody responseBody, String str, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            response = null;
        }
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            responseBody = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        return responseTransformerManager.buildFailureResponse(response, obj, responseBody, str);
    }

    public static /* synthetic */ d buildResponse$default(ResponseTransformerManager responseTransformerManager, d dVar, boolean z11, IErrorChecker iErrorChecker, FlowModelTransformer flowModelTransformer, FlowErrorTransformer flowErrorTransformer, FlowExceptionTransformer flowExceptionTransformer, int i11, Object obj) {
        return responseTransformerManager.buildResponse(dVar, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? null : iErrorChecker, (i11 & 8) != 0 ? null : flowModelTransformer, (i11 & 16) != 0 ? null : flowErrorTransformer, (i11 & 32) != 0 ? null : flowExceptionTransformer);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [okhttp3.ResponseBody] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> in.swiggy.android.tejas.Response.Failure buildFailureResponse(retrofit2.Response<R> r10, R r11, okhttp3.ResponseBody r12, java.lang.String r13) {
        /*
            r9 = this;
            in.swiggy.android.tejas.error.Error$UnhandledError r8 = new in.swiggy.android.tejas.error.Error$UnhandledError
            if (r13 != 0) goto L_0x000d
            if (r11 != 0) goto L_0x000b
            if (r12 != 0) goto L_0x000b
            java.lang.String r13 = "null_response_body"
            goto L_0x000d
        L_0x000b:
            java.lang.String r13 = "unsuccessful_response"
        L_0x000d:
            r1 = r13
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            in.swiggy.android.tejas.Response$Failure r13 = new in.swiggy.android.tejas.Response$Failure
            if (r11 != 0) goto L_0x001f
            r3 = r12
            goto L_0x0020
        L_0x001f:
            r3 = r11
        L_0x0020:
            r11 = 0
            if (r10 != 0) goto L_0x0025
            r4 = r11
            goto L_0x002e
        L_0x0025:
            int r12 = r10.code()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r4 = r12
        L_0x002e:
            if (r10 != 0) goto L_0x0032
            r5 = r11
            goto L_0x0037
        L_0x0032:
            java.lang.String r10 = r10.message()
            r5 = r10
        L_0x0037:
            r0 = r13
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.ResponseTransformerManager.buildFailureResponse(retrofit2.Response, java.lang.Object, okhttp3.ResponseBody, java.lang.String):in.swiggy.android.tejas.Response$Failure");
    }

    public final <R, M> Response<M> buildResponse(retrofit2.Response<R> response, IErrorChecker<R> iErrorChecker, ITransformer<R, M> iTransformer, ITransformer<R, Error> iTransformer2) {
        IErrorChecker<R> iErrorChecker2 = iErrorChecker;
        ITransformer<R, M> iTransformer3 = iTransformer;
        ITransformer<R, Error> iTransformer4 = iTransformer2;
        p.j(response, "response");
        p.j(iErrorChecker2, "errorChecker");
        p.j(iTransformer3, "modelTransformer");
        p.j(iTransformer4, "errorTransformer");
        R body = response.body();
        if (response.code() == 503 || response.code() == 403) {
            return new Response.Failure(new Error.InternalError((String) null, (String) null, (Integer) null, 7, (i) null), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (i) null);
        }
        if (response.code() == 429) {
            return new Response.Failure(new Error.ThrottleError(), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (i) null);
        }
        if (body != null && response.isSuccessful()) {
            if (iErrorChecker2.shouldCheckForErrors(body)) {
                Error transform = iTransformer4.transform(body);
                if (transform != null) {
                    return new Response.Failure(transform, (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (i) null);
                }
            } else {
                M transform2 = iTransformer3.transform(body);
                if (transform2 != null) {
                    return new Response.Success(transform2, (Boolean) null, (Integer) null, 6, (i) null);
                }
            }
        }
        return buildFailureResponse$default(this, response, body, (ResponseBody) null, (String) null, 12, (Object) null);
    }

    public final <R> Response<R> handleResponse(retrofit2.Response<R> response) {
        p.j(response, "response");
        R body = response.body();
        if (response.code() == 503 || response.code() == 403) {
            return new Response.Failure(new Error.InternalError((String) null, (String) null, (Integer) null, 7, (i) null), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (i) null);
        }
        if (response.code() == 429) {
            return new Response.Failure(new Error.ThrottleError(), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (i) null);
        }
        if (body != null && response.isSuccessful()) {
            return new Response.Success(body, (Boolean) null, (Integer) null, 6, (i) null);
        }
        return new Response.Failure(new Error.UnhandledError(body == null ? MESSAGE_NULL_RESPONSE_BODY : MESSAGE_UNSUCCESSFUL_RESPONSE, Integer.valueOf(response.code()), (String) null, (String) null, (Throwable) null, 28, (i) null), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (i) null);
    }

    public final <R, M> d<Response<M>> buildResponse(d<retrofit2.Response<R>> dVar, boolean z11, IErrorChecker<R> iErrorChecker, FlowModelTransformer<? super R, M> flowModelTransformer, FlowErrorTransformer<? super R, Error> flowErrorTransformer, FlowExceptionTransformer<? super Throwable, M> flowExceptionTransformer) {
        p.j(dVar, "call");
        return f.f(f.x(new ResponseTransformerManager$buildResponse$$inlined$transform$1(dVar, (c) null, z11, flowErrorTransformer, iErrorChecker, flowModelTransformer)), new ResponseTransformerManager$buildResponse$4(flowExceptionTransformer, (c<? super ResponseTransformerManager$buildResponse$4>) null));
    }
}

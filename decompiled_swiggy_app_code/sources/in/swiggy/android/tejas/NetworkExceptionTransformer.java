package in.swiggy.android.tejas;

import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.i;

/* compiled from: NetworkExceptionTransformer.kt */
public final class NetworkExceptionTransformer implements ITransformer<Throwable, Error> {
    public static final Companion Companion = new Companion((i) null);
    public static final String MESSAGE_HTTP_EXCEPTION = "exception-transformer-";
    public static final String TAG = "NetworkExceptionTransformer";

    /* compiled from: NetworkExceptionTransformer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [in.swiggy.android.tejas.error.Error$UnhandledExceptionError] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.error.Error transform(java.lang.Throwable r12) {
        /*
            r11 = this;
            java.lang.String r0 = "t"
            kotlin.jvm.internal.p.j(r12, r0)
            boolean r0 = r12 instanceof retrofit2.HttpException
            if (r0 == 0) goto L_0x0037
            r0 = r12
            retrofit2.HttpException r0 = (retrofit2.HttpException) r0
            int r1 = r0.code()
            r2 = 503(0x1f7, float:7.05E-43)
            if (r1 == r2) goto L_0x002b
            int r1 = r0.code()
            r2 = 403(0x193, float:5.65E-43)
            if (r1 != r2) goto L_0x001d
            goto L_0x002b
        L_0x001d:
            int r0 = r0.code()
            r1 = 429(0x1ad, float:6.01E-43)
            if (r0 != r1) goto L_0x0037
            in.swiggy.android.tejas.error.Error$ThrottleError r12 = new in.swiggy.android.tejas.error.Error$ThrottleError
            r12.<init>()
            return r12
        L_0x002b:
            in.swiggy.android.tejas.error.Error$InternalError r12 = new in.swiggy.android.tejas.error.Error$InternalError
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 7
            r5 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r12
        L_0x0037:
            boolean r0 = r12 instanceof java.util.concurrent.CancellationException
            java.lang.String r1 = "exception-transformer-"
            if (r0 == 0) goto L_0x004d
            in.swiggy.android.tejas.error.Error$UnhandledExceptionError r0 = new in.swiggy.android.tejas.error.Error$UnhandledExceptionError
            java.lang.String r2 = r12.getMessage()
            if (r2 != 0) goto L_0x0049
            java.lang.String r2 = kotlin.jvm.internal.p.s(r1, r12)
        L_0x0049:
            r0.<init>(r12, r2)
            goto L_0x0067
        L_0x004d:
            in.swiggy.android.tejas.error.Error$UnhandledError r0 = new in.swiggy.android.tejas.error.Error$UnhandledError
            java.lang.String r2 = r12.getMessage()
            if (r2 != 0) goto L_0x005b
            java.lang.String r1 = kotlin.jvm.internal.p.s(r1, r12)
            r4 = r1
            goto L_0x005c
        L_0x005b:
            r4 = r2
        L_0x005c:
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 14
            r10 = 0
            r3 = r0
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.NetworkExceptionTransformer.transform(java.lang.Throwable):in.swiggy.android.tejas.error.Error");
    }
}

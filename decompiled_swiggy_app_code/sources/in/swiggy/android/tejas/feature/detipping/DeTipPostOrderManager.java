package in.swiggy.android.tejas.feature.detipping;

import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.detipping.api.IDeTipPostOrderApi;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: DeTipPostOrderManager.kt */
public final class DeTipPostOrderManager {
    public static final Companion Companion = new Companion((i) null);
    public static final String TAG = "DeTipPostOrderManager";
    private final IDeTipPostOrderApi deTipApi;
    private final ITransformer<Throwable, Error> exceptionTransformer;

    /* compiled from: DeTipPostOrderManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public DeTipPostOrderManager(IDeTipPostOrderApi iDeTipPostOrderApi, ITransformer<Throwable, Error> iTransformer) {
        p.j(iDeTipPostOrderApi, "deTipApi");
        p.j(iTransformer, "exceptionTransformer");
        this.deTipApi = iDeTipPostOrderApi;
        this.exceptionTransformer = iTransformer;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: in.swiggy.android.tejas.error.Error} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: in.swiggy.android.tejas.error.Error$UnhandledError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: in.swiggy.android.tejas.error.Error$UnhandledError} */
    /* JADX WARNING: type inference failed for: r10v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchCartKeyForDETip1(in.swiggy.android.tejas.feature.detipping.dataType.DeTipPostOrderRequest r10, fp0.c<? super kotlinx.coroutines.flow.d<? extends in.swiggy.android.tejas.Response<in.swiggy.android.tejas.api.models.SwiggyApiResponse<in.swiggy.android.tejas.feature.detipping.dataType.DeTipPostOrderResponse>>>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof in.swiggy.android.tejas.feature.detipping.DeTipPostOrderManager$fetchCartKeyForDETip1$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            in.swiggy.android.tejas.feature.detipping.DeTipPostOrderManager$fetchCartKeyForDETip1$1 r0 = (in.swiggy.android.tejas.feature.detipping.DeTipPostOrderManager$fetchCartKeyForDETip1$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.tejas.feature.detipping.DeTipPostOrderManager$fetchCartKeyForDETip1$1 r0 = new in.swiggy.android.tejas.feature.detipping.DeTipPostOrderManager$fetchCartKeyForDETip1$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r10 = r0.L$0
            in.swiggy.android.tejas.feature.detipping.DeTipPostOrderManager r10 = (in.swiggy.android.tejas.feature.detipping.DeTipPostOrderManager) r10
            bp0.g.b(r11)     // Catch:{ Exception -> 0x002d }
            goto L_0x0048
        L_0x002d:
            r11 = move-exception
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0037:
            bp0.g.b(r11)
            in.swiggy.android.tejas.feature.detipping.api.IDeTipPostOrderApi r11 = r9.deTipApi     // Catch:{ Exception -> 0x0051 }
            r0.L$0 = r9     // Catch:{ Exception -> 0x0051 }
            r0.label = r3     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r11 = r11.getCartKeyForDeTip(r10, r0)     // Catch:{ Exception -> 0x0051 }
            if (r11 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r10 = r9
        L_0x0048:
            retrofit2.Response r11 = (retrofit2.Response) r11     // Catch:{ Exception -> 0x002d }
            in.swiggy.android.tejas.ResponseTransformerManager r0 = in.swiggy.android.tejas.ResponseTransformerManager.INSTANCE     // Catch:{ Exception -> 0x002d }
            in.swiggy.android.tejas.Response r10 = r0.handleResponse(r11)     // Catch:{ Exception -> 0x002d }
            goto L_0x0080
        L_0x0051:
            r11 = move-exception
            r10 = r9
        L_0x0053:
            java.lang.String r0 = "DeTipPostOrderManager"
            os.u.h(r0, r11)
            in.swiggy.android.tejas.Response$Failure r0 = new in.swiggy.android.tejas.Response$Failure
            in.swiggy.android.tejas.transformer.ITransformer<java.lang.Throwable, in.swiggy.android.tejas.error.Error> r10 = r10.exceptionTransformer
            java.lang.Object r10 = r10.transform(r11)
            in.swiggy.android.tejas.error.Error r10 = (in.swiggy.android.tejas.error.Error) r10
            if (r10 != 0) goto L_0x0073
            in.swiggy.android.tejas.error.Error$UnhandledError r10 = new in.swiggy.android.tejas.error.Error$UnhandledError
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 30
            r8 = 0
            java.lang.String r2 = "unsuccessful_response"
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x0073:
            r2 = r10
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 30
            r8 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r10 = r0
        L_0x0080:
            kotlinx.coroutines.flow.d r10 = kotlinx.coroutines.flow.f.y(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.detipping.DeTipPostOrderManager.fetchCartKeyForDETip1(in.swiggy.android.tejas.feature.detipping.dataType.DeTipPostOrderRequest, fp0.c):java.lang.Object");
    }
}

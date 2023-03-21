package in.swiggy.android.tejas.feature.instamart;

import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.instamart.model.ClearCartResponse;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.e;
import retrofit2.Response;

/* compiled from: SafeCollector.common.kt */
public final class InstamartManager$clearInstamartCart$$inlined$map$1 implements d<InstamartResponse<? extends SwiggyApiResponse<ClearCartResponse>>> {
    final /* synthetic */ d $this_unsafeTransform$inlined;

    public InstamartManager$clearInstamartCart$$inlined$map$1(d dVar) {
        this.$this_unsafeTransform$inlined = dVar;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new e<Response<SwiggyApiResponse<ClearCartResponse>>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r11, fp0.c r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof in.swiggy.android.tejas.feature.instamart.InstamartManager$clearInstamartCart$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r12
                    in.swiggy.android.tejas.feature.instamart.InstamartManager$clearInstamartCart$$inlined$map$1$2$1 r0 = (in.swiggy.android.tejas.feature.instamart.InstamartManager$clearInstamartCart$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    in.swiggy.android.tejas.feature.instamart.InstamartManager$clearInstamartCart$$inlined$map$1$2$1 r0 = new in.swiggy.android.tejas.feature.instamart.InstamartManager$clearInstamartCart$$inlined$map$1$2$1
                    r0.<init>(r10, r12)
                L_0x0018:
                    java.lang.Object r12 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    bp0.g.b(r12)
                    goto L_0x0083
                L_0x0029:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L_0x0031:
                    bp0.g.b(r12)
                    kotlinx.coroutines.flow.e r12 = r3
                    retrofit2.Response r11 = (retrofit2.Response) r11
                    java.lang.Object r11 = r11.body()
                    in.swiggy.android.tejas.api.models.SwiggyApiResponse r11 = (in.swiggy.android.tejas.api.models.SwiggyApiResponse) r11
                    if (r11 != 0) goto L_0x0042
                    r11 = 0
                    goto L_0x0067
                L_0x0042:
                    java.lang.Integer r2 = r11.getStatusCode()
                    if (r2 != 0) goto L_0x0049
                    goto L_0x0056
                L_0x0049:
                    int r2 = r2.intValue()
                    if (r2 != 0) goto L_0x0056
                    in.swiggy.android.tejas.feature.instamart.InstamartResponse$Companion r2 = in.swiggy.android.tejas.feature.instamart.InstamartResponse.Companion
                    in.swiggy.android.tejas.feature.instamart.InstamartResponse r11 = r2.success(r11)
                    goto L_0x0067
                L_0x0056:
                    in.swiggy.android.tejas.feature.instamart.InstamartResponse$Companion r11 = in.swiggy.android.tejas.feature.instamart.InstamartResponse.Companion
                    in.swiggy.android.tejas.error.Error$InternalError r2 = new in.swiggy.android.tejas.error.Error$InternalError
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 7
                    r9 = 0
                    r4 = r2
                    r4.<init>(r5, r6, r7, r8, r9)
                    in.swiggy.android.tejas.feature.instamart.InstamartResponse r11 = r11.failure(r2)
                L_0x0067:
                    if (r11 != 0) goto L_0x007a
                    in.swiggy.android.tejas.feature.instamart.InstamartResponse$Companion r11 = in.swiggy.android.tejas.feature.instamart.InstamartResponse.Companion
                    in.swiggy.android.tejas.error.Error$InternalError r2 = new in.swiggy.android.tejas.error.Error$InternalError
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 7
                    r9 = 0
                    r4 = r2
                    r4.<init>(r5, r6, r7, r8, r9)
                    in.swiggy.android.tejas.feature.instamart.InstamartResponse r11 = r11.failure(r2)
                L_0x007a:
                    r0.label = r3
                    java.lang.Object r11 = r12.emit(r11, r0)
                    if (r11 != r1) goto L_0x0083
                    return r1
                L_0x0083:
                    bp0.k r11 = bp0.k.f22762a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.InstamartManager$clearInstamartCart$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, fp0.c):java.lang.Object");
            }
        }, cVar);
        if (collect == b.d()) {
            return collect;
        }
        return k.f22762a;
    }
}

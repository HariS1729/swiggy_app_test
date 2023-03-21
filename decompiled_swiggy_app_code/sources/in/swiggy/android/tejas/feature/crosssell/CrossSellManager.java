package in.swiggy.android.tejas.feature.crosssell;

import com.swiggy.gandalf.widgets.v2.Response;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.crosssell.model.CrossSellResponse;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: CrossSellManager.kt */
public final class CrossSellManager {
    private final ICrossSellResultsAPI api;
    private final ITransformer<Response, CrossSellResponse> crossSellTransformer;
    private final IErrorChecker<Response> errorCheckerLanding;
    private final ITransformer<Response, Error> errorTransformerLanding;
    private final ITransformer<Throwable, Error> exceptionTransformer;

    public CrossSellManager(ICrossSellResultsAPI iCrossSellResultsAPI, ITransformer<Response, CrossSellResponse> iTransformer, ITransformer<Throwable, Error> iTransformer2, IErrorChecker<Response> iErrorChecker, ITransformer<Response, Error> iTransformer3) {
        p.j(iCrossSellResultsAPI, "api");
        p.j(iTransformer, "crossSellTransformer");
        p.j(iTransformer2, "exceptionTransformer");
        p.j(iErrorChecker, "errorCheckerLanding");
        p.j(iTransformer3, "errorTransformerLanding");
        this.api = iCrossSellResultsAPI;
        this.crossSellTransformer = iTransformer;
        this.exceptionTransformer = iTransformer2;
        this.errorCheckerLanding = iErrorChecker;
        this.errorTransformerLanding = iTransformer3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: in.swiggy.android.tejas.error.Error} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: in.swiggy.android.tejas.error.Error$UnhandledError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: in.swiggy.android.tejas.error.Error$UnhandledError} */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getCrossSellCollection(double r9, double r11, in.swiggy.android.tejas.feature.crosssell.model.CrossSellRequestBody r13, fp0.c<? super kotlinx.coroutines.flow.d<? extends in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.crosssell.model.CrossSellResponse>>> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof in.swiggy.android.tejas.feature.crosssell.CrossSellManager$getCrossSellCollection$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            in.swiggy.android.tejas.feature.crosssell.CrossSellManager$getCrossSellCollection$1 r0 = (in.swiggy.android.tejas.feature.crosssell.CrossSellManager$getCrossSellCollection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.tejas.feature.crosssell.CrossSellManager$getCrossSellCollection$1 r0 = new in.swiggy.android.tejas.feature.crosssell.CrossSellManager$getCrossSellCollection$1
            r0.<init>(r8, r14)
        L_0x0018:
            r7 = r0
            java.lang.Object r14 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            java.lang.Object r9 = r7.L$0
            in.swiggy.android.tejas.feature.crosssell.CrossSellManager r9 = (in.swiggy.android.tejas.feature.crosssell.CrossSellManager) r9
            bp0.g.b(r14)     // Catch:{ Exception -> 0x002e }
            goto L_0x004c
        L_0x002e:
            r10 = move-exception
            goto L_0x005d
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            bp0.g.b(r14)
            in.swiggy.android.tejas.feature.crosssell.ICrossSellResultsAPI r1 = r8.api     // Catch:{ Exception -> 0x005b }
            r7.L$0 = r8     // Catch:{ Exception -> 0x005b }
            r7.label = r2     // Catch:{ Exception -> 0x005b }
            r2 = r9
            r4 = r11
            r6 = r13
            java.lang.Object r14 = r1.getCrossSellCollection(r2, r4, r6, r7)     // Catch:{ Exception -> 0x005b }
            if (r14 != r0) goto L_0x004b
            return r0
        L_0x004b:
            r9 = r8
        L_0x004c:
            retrofit2.Response r14 = (retrofit2.Response) r14     // Catch:{ Exception -> 0x002e }
            in.swiggy.android.tejas.ResponseTransformerManager r10 = in.swiggy.android.tejas.ResponseTransformerManager.INSTANCE     // Catch:{ Exception -> 0x002e }
            in.swiggy.android.tejas.api.IErrorChecker<com.swiggy.gandalf.widgets.v2.Response> r11 = r9.errorCheckerLanding     // Catch:{ Exception -> 0x002e }
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Response, in.swiggy.android.tejas.feature.crosssell.model.CrossSellResponse> r12 = r9.crossSellTransformer     // Catch:{ Exception -> 0x002e }
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Response, in.swiggy.android.tejas.error.Error> r13 = r9.errorTransformerLanding     // Catch:{ Exception -> 0x002e }
            in.swiggy.android.tejas.Response r9 = r10.buildResponse(r14, r11, r12, r13)     // Catch:{ Exception -> 0x002e }
            goto L_0x0085
        L_0x005b:
            r10 = move-exception
            r9 = r8
        L_0x005d:
            in.swiggy.android.tejas.Response$Failure r11 = new in.swiggy.android.tejas.Response$Failure
            in.swiggy.android.tejas.transformer.ITransformer<java.lang.Throwable, in.swiggy.android.tejas.error.Error> r9 = r9.exceptionTransformer
            java.lang.Object r9 = r9.transform(r10)
            in.swiggy.android.tejas.error.Error r9 = (in.swiggy.android.tejas.error.Error) r9
            if (r9 != 0) goto L_0x0078
            in.swiggy.android.tejas.error.Error$UnhandledError r9 = new in.swiggy.android.tejas.error.Error$UnhandledError
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            java.lang.String r1 = "unsuccessful_response"
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0078:
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9 = r11
        L_0x0085:
            kotlinx.coroutines.flow.d r9 = kotlinx.coroutines.flow.f.y(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.crosssell.CrossSellManager.getCrossSellCollection(double, double, in.swiggy.android.tejas.feature.crosssell.model.CrossSellRequestBody, fp0.c):java.lang.Object");
    }
}

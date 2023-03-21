package in.swiggy.android.tejas.feature.landing;

import com.swiggy.gandalf.widgets.v2.Response;
import fp0.c;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import in.swiggy.android.tejas.feature.listing.pagination.model.PageOffset;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: LandingManager.kt */
public final class LandingManager {
    private final ILandingResultAPI api;
    private final IErrorChecker<Response> errorCheckerLanding;
    private final ITransformer<Response, Error> errorTransformerLanding;
    private final ITransformer<Throwable, Error> exceptionTransformer;
    private final ITransformer<Response, ListingResponse> landingTransformer;

    public LandingManager(ILandingResultAPI iLandingResultAPI, ITransformer<Response, ListingResponse> iTransformer, ITransformer<Throwable, Error> iTransformer2, IErrorChecker<Response> iErrorChecker, ITransformer<Response, Error> iTransformer3) {
        p.j(iLandingResultAPI, "api");
        p.j(iTransformer, "landingTransformer");
        p.j(iTransformer2, "exceptionTransformer");
        p.j(iErrorChecker, "errorCheckerLanding");
        p.j(iTransformer3, "errorTransformerLanding");
        this.api = iLandingResultAPI;
        this.landingTransformer = iTransformer;
        this.exceptionTransformer = iTransformer2;
        this.errorCheckerLanding = iErrorChecker;
        this.errorTransformerLanding = iTransformer3;
    }

    public static /* synthetic */ Object getFeatureCollection$default(LandingManager landingManager, String str, double d11, double d12, Integer num, PageOffset pageOffset, Object obj, String str2, c cVar, int i11, Object obj2) {
        return landingManager.getFeatureCollection(str, d11, d12, num, (i11 & 16) != 0 ? null : pageOffset, (i11 & 32) != 0 ? null : obj, (i11 & 64) != 0 ? null : str2, cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: in.swiggy.android.tejas.error.Error} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: in.swiggy.android.tejas.error.Error$UnhandledError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: in.swiggy.android.tejas.error.Error$UnhandledError} */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getCollectionV3(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Object r12, fp0.c<? super in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof in.swiggy.android.tejas.feature.landing.LandingManager$getCollectionV3$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            in.swiggy.android.tejas.feature.landing.LandingManager$getCollectionV3$1 r0 = (in.swiggy.android.tejas.feature.landing.LandingManager$getCollectionV3$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.tejas.feature.landing.LandingManager$getCollectionV3$1 r0 = new in.swiggy.android.tejas.feature.landing.LandingManager$getCollectionV3$1
            r0.<init>(r8, r13)
        L_0x0018:
            r6 = r0
            java.lang.Object r13 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            java.lang.Object r9 = r6.L$0
            in.swiggy.android.tejas.feature.landing.LandingManager r9 = (in.swiggy.android.tejas.feature.landing.LandingManager) r9
            bp0.g.b(r13)     // Catch:{ Exception -> 0x002e }
            goto L_0x004d
        L_0x002e:
            r10 = move-exception
            goto L_0x005e
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            bp0.g.b(r13)
            in.swiggy.android.tejas.feature.landing.ILandingResultAPI r1 = r8.api     // Catch:{ Exception -> 0x005c }
            r6.L$0 = r8     // Catch:{ Exception -> 0x005c }
            r6.label = r2     // Catch:{ Exception -> 0x005c }
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r13 = r1.getCollectionV3(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x005c }
            if (r13 != r0) goto L_0x004c
            return r0
        L_0x004c:
            r9 = r8
        L_0x004d:
            retrofit2.Response r13 = (retrofit2.Response) r13     // Catch:{ Exception -> 0x002e }
            in.swiggy.android.tejas.ResponseTransformerManager r10 = in.swiggy.android.tejas.ResponseTransformerManager.INSTANCE     // Catch:{ Exception -> 0x002e }
            in.swiggy.android.tejas.api.IErrorChecker<com.swiggy.gandalf.widgets.v2.Response> r11 = r9.errorCheckerLanding     // Catch:{ Exception -> 0x002e }
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Response, in.swiggy.android.tejas.feature.listing.ListingResponse> r12 = r9.landingTransformer     // Catch:{ Exception -> 0x002e }
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Response, in.swiggy.android.tejas.error.Error> r0 = r9.errorTransformerLanding     // Catch:{ Exception -> 0x002e }
            in.swiggy.android.tejas.Response r9 = r10.buildResponse(r13, r11, r12, r0)     // Catch:{ Exception -> 0x002e }
            goto L_0x0086
        L_0x005c:
            r10 = move-exception
            r9 = r8
        L_0x005e:
            in.swiggy.android.tejas.Response$Failure r11 = new in.swiggy.android.tejas.Response$Failure
            in.swiggy.android.tejas.transformer.ITransformer<java.lang.Throwable, in.swiggy.android.tejas.error.Error> r9 = r9.exceptionTransformer
            java.lang.Object r9 = r9.transform(r10)
            in.swiggy.android.tejas.error.Error r9 = (in.swiggy.android.tejas.error.Error) r9
            if (r9 != 0) goto L_0x0079
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
        L_0x0079:
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
        L_0x0086:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.landing.LandingManager.getCollectionV3(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, fp0.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: in.swiggy.android.tejas.error.Error} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: in.swiggy.android.tejas.error.Error$UnhandledError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: in.swiggy.android.tejas.error.Error$UnhandledError} */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getFavorites(java.lang.String r9, java.lang.String r10, java.lang.Object r11, fp0.c<? super in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof in.swiggy.android.tejas.feature.landing.LandingManager$getFavorites$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            in.swiggy.android.tejas.feature.landing.LandingManager$getFavorites$1 r0 = (in.swiggy.android.tejas.feature.landing.LandingManager$getFavorites$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.tejas.feature.landing.LandingManager$getFavorites$1 r0 = new in.swiggy.android.tejas.feature.landing.LandingManager$getFavorites$1
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r9 = r0.L$0
            in.swiggy.android.tejas.feature.landing.LandingManager r9 = (in.swiggy.android.tejas.feature.landing.LandingManager) r9
            bp0.g.b(r12)     // Catch:{ Exception -> 0x002d }
            goto L_0x0048
        L_0x002d:
            r10 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            bp0.g.b(r12)
            in.swiggy.android.tejas.feature.landing.ILandingResultAPI r12 = r8.api     // Catch:{ Exception -> 0x0057 }
            r0.L$0 = r8     // Catch:{ Exception -> 0x0057 }
            r0.label = r3     // Catch:{ Exception -> 0x0057 }
            java.lang.Object r12 = r12.getFavorites(r9, r10, r11, r0)     // Catch:{ Exception -> 0x0057 }
            if (r12 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r9 = r8
        L_0x0048:
            retrofit2.Response r12 = (retrofit2.Response) r12     // Catch:{ Exception -> 0x002d }
            in.swiggy.android.tejas.ResponseTransformerManager r10 = in.swiggy.android.tejas.ResponseTransformerManager.INSTANCE     // Catch:{ Exception -> 0x002d }
            in.swiggy.android.tejas.api.IErrorChecker<com.swiggy.gandalf.widgets.v2.Response> r11 = r9.errorCheckerLanding     // Catch:{ Exception -> 0x002d }
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Response, in.swiggy.android.tejas.feature.listing.ListingResponse> r0 = r9.landingTransformer     // Catch:{ Exception -> 0x002d }
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Response, in.swiggy.android.tejas.error.Error> r1 = r9.errorTransformerLanding     // Catch:{ Exception -> 0x002d }
            in.swiggy.android.tejas.Response r9 = r10.buildResponse(r12, r11, r0, r1)     // Catch:{ Exception -> 0x002d }
            goto L_0x0081
        L_0x0057:
            r10 = move-exception
            r9 = r8
        L_0x0059:
            in.swiggy.android.tejas.Response$Failure r11 = new in.swiggy.android.tejas.Response$Failure
            in.swiggy.android.tejas.transformer.ITransformer<java.lang.Throwable, in.swiggy.android.tejas.error.Error> r9 = r9.exceptionTransformer
            java.lang.Object r9 = r9.transform(r10)
            in.swiggy.android.tejas.error.Error r9 = (in.swiggy.android.tejas.error.Error) r9
            if (r9 != 0) goto L_0x0074
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
        L_0x0074:
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
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.landing.LandingManager.getFavorites(java.lang.String, java.lang.String, java.lang.Object, fp0.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: in.swiggy.android.tejas.error.Error} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: in.swiggy.android.tejas.error.Error$UnhandledError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: in.swiggy.android.tejas.error.Error$UnhandledError} */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getFeatureCollection(java.lang.String r15, double r16, double r18, java.lang.Integer r20, in.swiggy.android.tejas.feature.listing.pagination.model.PageOffset r21, java.lang.Object r22, java.lang.String r23, fp0.c<? super in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>> r24) {
        /*
            r14 = this;
            r1 = r14
            r0 = r24
            boolean r2 = r0 instanceof in.swiggy.android.tejas.feature.landing.LandingManager$getFeatureCollection$1
            if (r2 == 0) goto L_0x0016
            r2 = r0
            in.swiggy.android.tejas.feature.landing.LandingManager$getFeatureCollection$1 r2 = (in.swiggy.android.tejas.feature.landing.LandingManager$getFeatureCollection$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            in.swiggy.android.tejas.feature.landing.LandingManager$getFeatureCollection$1 r2 = new in.swiggy.android.tejas.feature.landing.LandingManager$getFeatureCollection$1
            r2.<init>(r14, r0)
        L_0x001b:
            r13 = r2
            java.lang.Object r0 = r13.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.d()
            int r3 = r13.label
            r4 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r4) goto L_0x0033
            java.lang.Object r2 = r13.L$0
            in.swiggy.android.tejas.feature.landing.LandingManager r2 = (in.swiggy.android.tejas.feature.landing.LandingManager) r2
            bp0.g.b(r0)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0060
        L_0x0031:
            r0 = move-exception
            goto L_0x0071
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003b:
            bp0.g.b(r0)
            in.swiggy.android.tejas.feature.landing.ILandingResultAPI r3 = r1.api     // Catch:{ Exception -> 0x006f }
            if (r21 != 0) goto L_0x0044
            r0 = 0
            goto L_0x0048
        L_0x0044:
            java.lang.String r0 = r21.getNextOffset()     // Catch:{ Exception -> 0x006f }
        L_0x0048:
            r10 = r0
            r13.L$0 = r1     // Catch:{ Exception -> 0x006f }
            r13.label = r4     // Catch:{ Exception -> 0x006f }
            r4 = r15
            r5 = r16
            r7 = r18
            r9 = r20
            r11 = r22
            r12 = r23
            java.lang.Object r0 = r3.getFeatureCollection(r4, r5, r7, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x006f }
            if (r0 != r2) goto L_0x005f
            return r2
        L_0x005f:
            r2 = r1
        L_0x0060:
            retrofit2.Response r0 = (retrofit2.Response) r0     // Catch:{ Exception -> 0x0031 }
            in.swiggy.android.tejas.ResponseTransformerManager r3 = in.swiggy.android.tejas.ResponseTransformerManager.INSTANCE     // Catch:{ Exception -> 0x0031 }
            in.swiggy.android.tejas.api.IErrorChecker<com.swiggy.gandalf.widgets.v2.Response> r4 = r2.errorCheckerLanding     // Catch:{ Exception -> 0x0031 }
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Response, in.swiggy.android.tejas.feature.listing.ListingResponse> r5 = r2.landingTransformer     // Catch:{ Exception -> 0x0031 }
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Response, in.swiggy.android.tejas.error.Error> r6 = r2.errorTransformerLanding     // Catch:{ Exception -> 0x0031 }
            in.swiggy.android.tejas.Response r0 = r3.buildResponse(r0, r4, r5, r6)     // Catch:{ Exception -> 0x0031 }
            goto L_0x00b4
        L_0x006f:
            r0 = move-exception
            r2 = r1
        L_0x0071:
            in.swiggy.android.tejas.Response$Failure r3 = new in.swiggy.android.tejas.Response$Failure
            in.swiggy.android.tejas.transformer.ITransformer<java.lang.Throwable, in.swiggy.android.tejas.error.Error> r2 = r2.exceptionTransformer
            java.lang.Object r0 = r2.transform(r0)
            in.swiggy.android.tejas.error.Error r0 = (in.swiggy.android.tejas.error.Error) r0
            if (r0 != 0) goto L_0x009a
            in.swiggy.android.tejas.error.Error$UnhandledError r0 = new in.swiggy.android.tejas.error.Error$UnhandledError
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 30
            r8 = 0
            java.lang.String r9 = "unsuccessful_response"
            r15 = r0
            r16 = r9
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
        L_0x009a:
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 30
            r8 = 0
            r15 = r3
            r16 = r0
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r0 = r3
        L_0x00b4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.landing.LandingManager.getFeatureCollection(java.lang.String, double, double, java.lang.Integer, in.swiggy.android.tejas.feature.listing.pagination.model.PageOffset, java.lang.Object, java.lang.String, fp0.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: in.swiggy.android.tejas.error.Error} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: in.swiggy.android.tejas.error.Error$UnhandledError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: in.swiggy.android.tejas.error.Error$UnhandledError} */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getHiddenRestaurants(java.lang.String r9, java.lang.String r10, java.lang.Object r11, fp0.c<? super in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof in.swiggy.android.tejas.feature.landing.LandingManager$getHiddenRestaurants$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            in.swiggy.android.tejas.feature.landing.LandingManager$getHiddenRestaurants$1 r0 = (in.swiggy.android.tejas.feature.landing.LandingManager$getHiddenRestaurants$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.tejas.feature.landing.LandingManager$getHiddenRestaurants$1 r0 = new in.swiggy.android.tejas.feature.landing.LandingManager$getHiddenRestaurants$1
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r9 = r0.L$0
            in.swiggy.android.tejas.feature.landing.LandingManager r9 = (in.swiggy.android.tejas.feature.landing.LandingManager) r9
            bp0.g.b(r12)     // Catch:{ Exception -> 0x002d }
            goto L_0x0048
        L_0x002d:
            r10 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            bp0.g.b(r12)
            in.swiggy.android.tejas.feature.landing.ILandingResultAPI r12 = r8.api     // Catch:{ Exception -> 0x0057 }
            r0.L$0 = r8     // Catch:{ Exception -> 0x0057 }
            r0.label = r3     // Catch:{ Exception -> 0x0057 }
            java.lang.Object r12 = r12.getHiddenRestaurants(r9, r10, r11, r0)     // Catch:{ Exception -> 0x0057 }
            if (r12 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r9 = r8
        L_0x0048:
            retrofit2.Response r12 = (retrofit2.Response) r12     // Catch:{ Exception -> 0x002d }
            in.swiggy.android.tejas.ResponseTransformerManager r10 = in.swiggy.android.tejas.ResponseTransformerManager.INSTANCE     // Catch:{ Exception -> 0x002d }
            in.swiggy.android.tejas.api.IErrorChecker<com.swiggy.gandalf.widgets.v2.Response> r11 = r9.errorCheckerLanding     // Catch:{ Exception -> 0x002d }
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Response, in.swiggy.android.tejas.feature.listing.ListingResponse> r0 = r9.landingTransformer     // Catch:{ Exception -> 0x002d }
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Response, in.swiggy.android.tejas.error.Error> r1 = r9.errorTransformerLanding     // Catch:{ Exception -> 0x002d }
            in.swiggy.android.tejas.Response r9 = r10.buildResponse(r12, r11, r0, r1)     // Catch:{ Exception -> 0x002d }
            goto L_0x0081
        L_0x0057:
            r10 = move-exception
            r9 = r8
        L_0x0059:
            in.swiggy.android.tejas.Response$Failure r11 = new in.swiggy.android.tejas.Response$Failure
            in.swiggy.android.tejas.transformer.ITransformer<java.lang.Throwable, in.swiggy.android.tejas.error.Error> r9 = r9.exceptionTransformer
            java.lang.Object r9 = r9.transform(r10)
            in.swiggy.android.tejas.error.Error r9 = (in.swiggy.android.tejas.error.Error) r9
            if (r9 != 0) goto L_0x0074
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
        L_0x0074:
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
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.landing.LandingManager.getHiddenRestaurants(java.lang.String, java.lang.String, java.lang.Object, fp0.c):java.lang.Object");
    }
}

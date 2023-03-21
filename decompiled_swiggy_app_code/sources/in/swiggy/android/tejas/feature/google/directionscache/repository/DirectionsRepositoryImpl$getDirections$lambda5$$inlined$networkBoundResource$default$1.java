package in.swiggy.android.tejas.feature.google.directionscache.repository;

import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse;
import in.swiggy.android.tejas.feature.google.directionscache.datasource.DirectionsDataSource;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.google.directionscache.repository.DirectionsRepositoryImpl$getDirections$lambda-5$$inlined$networkBoundResource$default$1", f = "DirectionsRepositoryImpl.kt", l = {83, 83, 86, 83, 66, 71}, m = "invokeSuspend")
/* renamed from: in.swiggy.android.tejas.feature.google.directionscache.repository.DirectionsRepositoryImpl$getDirections$lambda-5$$inlined$networkBoundResource$default$1  reason: invalid class name */
/* compiled from: NetworkBoundResource.kt */
public final class DirectionsRepositoryImpl$getDirections$lambda5$$inlined$networkBoundResource$default$1 extends SuspendLambda implements p<e<? super Response<? extends DirectionsResponse>>, c<? super k>, Object> {
    final /* synthetic */ DirectionsRequest $request$inlined;
    final /* synthetic */ DirectionsRequest $request$inlined$1;
    final /* synthetic */ DirectionsRequest $request$inlined$2;
    final /* synthetic */ DirectionsRequest $request$inlined$3;
    final /* synthetic */ DirectionsRequest $request$inlined$4;
    final /* synthetic */ DirectionsDataSource $this_with$inlined;
    final /* synthetic */ DirectionsDataSource $this_with$inlined$1;
    final /* synthetic */ DirectionsDataSource $this_with$inlined$2;
    final /* synthetic */ DirectionsDataSource $this_with$inlined$3;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectionsRepositoryImpl$getDirections$lambda5$$inlined$networkBoundResource$default$1(c cVar, DirectionsDataSource directionsDataSource, DirectionsRequest directionsRequest, DirectionsDataSource directionsDataSource2, DirectionsRequest directionsRequest2, DirectionsDataSource directionsDataSource3, DirectionsRequest directionsRequest3, DirectionsRequest directionsRequest4, DirectionsDataSource directionsDataSource4, DirectionsRequest directionsRequest5) {
        super(2, cVar);
        this.$this_with$inlined = directionsDataSource;
        this.$request$inlined = directionsRequest;
        this.$this_with$inlined$1 = directionsDataSource2;
        this.$request$inlined$1 = directionsRequest2;
        this.$this_with$inlined$2 = directionsDataSource3;
        this.$request$inlined$2 = directionsRequest3;
        this.$request$inlined$3 = directionsRequest4;
        this.$this_with$inlined$3 = directionsDataSource4;
        this.$request$inlined$4 = directionsRequest5;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        DirectionsRepositoryImpl$getDirections$lambda5$$inlined$networkBoundResource$default$1 r02 = new DirectionsRepositoryImpl$getDirections$lambda5$$inlined$networkBoundResource$default$1(cVar, this.$this_with$inlined, this.$request$inlined, this.$this_with$inlined$1, this.$request$inlined$1, this.$this_with$inlined$2, this.$request$inlined$2, this.$request$inlined$3, this.$this_with$inlined$3, this.$request$inlined$4);
        r02.L$0 = obj;
        return r02;
    }

    public final Object invoke(e<? super Response<? extends DirectionsResponse>> eVar, c<? super k> cVar) {
        return ((DirectionsRepositoryImpl$getDirections$lambda5$$inlined$networkBoundResource$default$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.flow.e} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
        r15 = r14.$this_with$inlined.getLocalResponse(new in.swiggy.android.tejas.coroutineUtils.SharedPrefParams(r14.$request$inlined.getDefaultKey(), (java.lang.Object) null, 2, (kotlin.jvm.internal.i) null));
        r14.L$0 = r1;
        r14.label = 2;
        r15 = kotlinx.coroutines.flow.f.u(r15, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (r15 != r0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007a, code lost:
        r1 = (in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse) r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        if (r1 == null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (r1.getLatLngList().isEmpty() != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        if (r14.$this_with$inlined$1.shouldFetchRemote(r1, r14.$request$inlined$1) == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0094, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        os.u.b(in.swiggy.android.tejas.network.utils.NetworkBoundResourceKt.NBR_TAG, kotlin.jvm.internal.p.s("shouldFetchFromRemote ", kotlin.coroutines.jvm.internal.a.a(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a6, code lost:
        if (r1 == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        r15 = r14.$this_with$inlined$2.getRemoteResponse(r14.$request$inlined$2);
        r7 = r14.$request$inlined$3;
        r8 = r14.$this_with$inlined$3;
        r9 = r14.$request$inlined$4;
        r10 = r14.$this_with$inlined;
        r11 = r14.$request$inlined;
        r5 = new in.swiggy.android.tejas.feature.google.directionscache.repository.DirectionsRepositoryImpl$getDirections$lambda5$$inlined$networkBoundResource$default$1.AnonymousClass1();
        r14.L$0 = null;
        r14.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c9, code lost:
        if (r15.collect(r5, r14) != r0) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cb, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cc, code lost:
        if (r15 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ce, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d0, code lost:
        r15 = r14.$this_with$inlined.getLocalDataSource();
        r14.L$0 = r6;
        r14.L$1 = r6;
        r14.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e1, code lost:
        if (in.swiggy.android.tejas.coroutineUtils.ISharedPrefDataSource.DefaultImpls.removeCache$default(r15, (java.lang.String) null, r14, 1, (java.lang.Object) null) != r0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e4, code lost:
        r1 = r6;
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e6, code lost:
        r15 = r14.$this_with$inlined.getLocalResponse(new in.swiggy.android.tejas.coroutineUtils.SharedPrefParams(r14.$request$inlined.getDefaultKey(), (java.lang.Object) null, 2, (kotlin.jvm.internal.i) null));
        r5 = r14.$request$inlined$3;
        r2 = new in.swiggy.android.tejas.feature.google.directionscache.repository.DirectionsRepositoryImpl$getDirections$lambda5$$inlined$networkBoundResource$default$1.AnonymousClass2();
        r14.L$0 = r3;
        r14.L$1 = null;
        r14.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0109, code lost:
        if (kotlinx.coroutines.flow.f.o(r1, r2, r14) != r0) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010c, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010d, code lost:
        r15 = bp0.k.f22762a;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0110, code lost:
        if (r15 != null) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0112, code lost:
        r15 = in.swiggy.android.tejas.ResponseTransformerManager.buildFailureResponse$default(in.swiggy.android.tejas.ResponseTransformerManager.INSTANCE, (retrofit2.Response) null, (java.lang.Object) null, (okhttp3.ResponseBody) null, in.swiggy.android.tejas.ResponseTransformerManager.MESSAGE_UNSUCCESSFUL_RESPONSE, 7, (java.lang.Object) null);
        r14.L$0 = null;
        r14.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0128, code lost:
        if (r6.emit(r15, r14) != r0) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012d, code lost:
        return bp0.k.f22762a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r14.label
            r2 = 2
            r3 = 1
            r4 = 0
            switch(r1) {
                case 0: goto L_0x0045;
                case 1: goto L_0x003d;
                case 2: goto L_0x0034;
                case 3: goto L_0x002f;
                case 4: goto L_0x0022;
                case 5: goto L_0x0019;
                case 6: goto L_0x0014;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0014:
            bp0.g.b(r15)
            goto L_0x012b
        L_0x0019:
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.e) r1
            bp0.g.b(r15)
            goto L_0x010d
        L_0x0022:
            java.lang.Object r1 = r14.L$1
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.e) r1
            java.lang.Object r3 = r14.L$0
            kotlinx.coroutines.flow.e r3 = (kotlinx.coroutines.flow.e) r3
            bp0.g.b(r15)
            goto L_0x00e6
        L_0x002f:
            bp0.g.b(r15)
            goto L_0x012b
        L_0x0034:
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.e) r1
            bp0.g.b(r15)
        L_0x003b:
            r6 = r1
            goto L_0x007a
        L_0x003d:
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.e) r1
            bp0.g.b(r15)
            goto L_0x005e
        L_0x0045:
            bp0.g.b(r15)
            java.lang.Object r15 = r14.L$0
            r1 = r15
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.e) r1
            in.swiggy.android.tejas.feature.google.directionscache.datasource.DirectionsDataSource r15 = r14.$this_with$inlined
            in.swiggy.android.tejas.coroutineUtils.ISharedPrefDataSource r15 = r15.getLocalDataSource()
            r14.L$0 = r1
            r14.label = r3
            java.lang.Object r15 = in.swiggy.android.tejas.coroutineUtils.ISharedPrefDataSource.DefaultImpls.removeCache$default(r15, r4, r14, r3, r4)
            if (r15 != r0) goto L_0x005e
            return r0
        L_0x005e:
            in.swiggy.android.tejas.feature.google.directionscache.datasource.DirectionsDataSource r15 = r14.$this_with$inlined
            in.swiggy.android.tejas.coroutineUtils.SharedPrefParams r5 = new in.swiggy.android.tejas.coroutineUtils.SharedPrefParams
            in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest r6 = r14.$request$inlined
            java.lang.String r6 = r6.getDefaultKey()
            r5.<init>(r6, r4, r2, r4)
            kotlinx.coroutines.flow.d r15 = r15.getLocalResponse(r5)
            r14.L$0 = r1
            r14.label = r2
            java.lang.Object r15 = kotlinx.coroutines.flow.f.u(r15, r14)
            if (r15 != r0) goto L_0x003b
            return r0
        L_0x007a:
            r1 = r15
            in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse r1 = (in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse) r1
            if (r1 == 0) goto L_0x0096
            java.util.ArrayList r5 = r1.getLatLngList()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0096
            in.swiggy.android.tejas.feature.google.directionscache.datasource.DirectionsDataSource r5 = r14.$this_with$inlined$1
            in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest r7 = r14.$request$inlined$1
            boolean r1 = r5.shouldFetchRemote(r1, r7)
            if (r1 == 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r1 = 0
            goto L_0x0097
        L_0x0096:
            r1 = 1
        L_0x0097:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r1)
            java.lang.String r7 = "shouldFetchFromRemote "
            java.lang.String r5 = kotlin.jvm.internal.p.s(r7, r5)
            java.lang.String r7 = "NBR_TAG"
            os.u.b(r7, r5)
            if (r1 == 0) goto L_0x00cc
            in.swiggy.android.tejas.feature.google.directionscache.datasource.DirectionsDataSource r15 = r14.$this_with$inlined$2
            in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest r1 = r14.$request$inlined$2
            kotlinx.coroutines.flow.d r15 = r15.getRemoteResponse(r1)
            in.swiggy.android.tejas.feature.google.directionscache.repository.DirectionsRepositoryImpl$getDirections$lambda-5$$inlined$networkBoundResource$default$1$1 r1 = new in.swiggy.android.tejas.feature.google.directionscache.repository.DirectionsRepositoryImpl$getDirections$lambda-5$$inlined$networkBoundResource$default$1$1
            in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest r7 = r14.$request$inlined$3
            in.swiggy.android.tejas.feature.google.directionscache.datasource.DirectionsDataSource r8 = r14.$this_with$inlined$3
            in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest r9 = r14.$request$inlined$4
            in.swiggy.android.tejas.feature.google.directionscache.datasource.DirectionsDataSource r10 = r14.$this_with$inlined
            in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest r11 = r14.$request$inlined
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r14.L$0 = r4
            r2 = 3
            r14.label = r2
            java.lang.Object r15 = r15.collect(r1, r14)
            if (r15 != r0) goto L_0x012b
            return r0
        L_0x00cc:
            if (r15 != 0) goto L_0x00d0
            r15 = r4
            goto L_0x0110
        L_0x00d0:
            in.swiggy.android.tejas.feature.google.directionscache.datasource.DirectionsDataSource r15 = r14.$this_with$inlined
            in.swiggy.android.tejas.coroutineUtils.ISharedPrefDataSource r15 = r15.getLocalDataSource()
            r14.L$0 = r6
            r14.L$1 = r6
            r1 = 4
            r14.label = r1
            java.lang.Object r15 = in.swiggy.android.tejas.coroutineUtils.ISharedPrefDataSource.DefaultImpls.removeCache$default(r15, r4, r14, r3, r4)
            if (r15 != r0) goto L_0x00e4
            return r0
        L_0x00e4:
            r1 = r6
            r3 = r1
        L_0x00e6:
            in.swiggy.android.tejas.feature.google.directionscache.datasource.DirectionsDataSource r15 = r14.$this_with$inlined
            in.swiggy.android.tejas.coroutineUtils.SharedPrefParams r5 = new in.swiggy.android.tejas.coroutineUtils.SharedPrefParams
            in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest r6 = r14.$request$inlined
            java.lang.String r6 = r6.getDefaultKey()
            r5.<init>(r6, r4, r2, r4)
            kotlinx.coroutines.flow.d r15 = r15.getLocalResponse(r5)
            in.swiggy.android.tejas.feature.google.directionscache.repository.DirectionsRepositoryImpl$getDirections$lambda-5$$inlined$networkBoundResource$default$1$2 r2 = new in.swiggy.android.tejas.feature.google.directionscache.repository.DirectionsRepositoryImpl$getDirections$lambda-5$$inlined$networkBoundResource$default$1$2
            in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest r5 = r14.$request$inlined$3
            r2.<init>(r15, r5)
            r14.L$0 = r3
            r14.L$1 = r4
            r15 = 5
            r14.label = r15
            java.lang.Object r15 = kotlinx.coroutines.flow.f.o(r1, r2, r14)
            if (r15 != r0) goto L_0x010c
            return r0
        L_0x010c:
            r1 = r3
        L_0x010d:
            bp0.k r15 = bp0.k.f22762a
            r6 = r1
        L_0x0110:
            if (r15 != 0) goto L_0x012b
            in.swiggy.android.tejas.ResponseTransformerManager r7 = in.swiggy.android.tejas.ResponseTransformerManager.INSTANCE
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 7
            r13 = 0
            java.lang.String r11 = "unsuccessful_response"
            in.swiggy.android.tejas.Response$Failure r15 = in.swiggy.android.tejas.ResponseTransformerManager.buildFailureResponse$default(r7, r8, r9, r10, r11, r12, r13)
            r14.L$0 = r4
            r1 = 6
            r14.label = r1
            java.lang.Object r15 = r6.emit(r15, r14)
            if (r15 != r0) goto L_0x012b
            return r0
        L_0x012b:
            bp0.k r15 = bp0.k.f22762a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.google.directionscache.repository.DirectionsRepositoryImpl$getDirections$lambda5$$inlined$networkBoundResource$default$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

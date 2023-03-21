package in.swiggy.android.tejas.feature.home.dropboxpersister;

import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.HomeStoreResponse;
import in.swiggy.android.tejas.feature.home.model.HomeResponse;
import in.swiggy.android.tejas.feature.home.model.configs.HomeRequestParams;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.home.dropboxpersister.HomeStorePersister$handleResponse$2", f = "HomeStorePersister.kt", l = {99, 103, 108}, m = "invokeSuspend")
/* compiled from: HomeStorePersister.kt */
final class HomeStorePersister$handleResponse$2 extends SuspendLambda implements p<e<? super Response<? extends HomeResponse>>, c<? super k>, Object> {
    final /* synthetic */ HomeStoreResponse $homeStoreResponse;
    final /* synthetic */ HomeRequestParams $key;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ HomeStorePersister this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeStorePersister$handleResponse$2(HomeStorePersister homeStorePersister, HomeRequestParams homeRequestParams, HomeStoreResponse homeStoreResponse, c<? super HomeStorePersister$handleResponse$2> cVar) {
        super(2, cVar);
        this.this$0 = homeStorePersister;
        this.$key = homeRequestParams;
        this.$homeStoreResponse = homeStoreResponse;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        HomeStorePersister$handleResponse$2 homeStorePersister$handleResponse$2 = new HomeStorePersister$handleResponse$2(this.this$0, this.$key, this.$homeStoreResponse, cVar);
        homeStorePersister$handleResponse$2.L$0 = obj;
        return homeStorePersister$handleResponse$2;
    }

    public final Object invoke(e<? super Response<HomeResponse>> eVar, c<? super k> cVar) {
        return ((HomeStorePersister$handleResponse$2) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e0 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r13.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 == r4) goto L_0x0029
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            bp0.g.b(r14)
            goto L_0x00e1
        L_0x0016:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001e:
            boolean r1 = r13.Z$0
            java.lang.Object r3 = r13.L$0
            kotlinx.coroutines.flow.e r3 = (kotlinx.coroutines.flow.e) r3
            bp0.g.b(r14)
            goto L_0x009c
        L_0x0029:
            boolean r1 = r13.Z$0
            java.lang.Object r3 = r13.L$0
            kotlinx.coroutines.flow.e r3 = (kotlinx.coroutines.flow.e) r3
            bp0.g.b(r14)
            goto L_0x006e
        L_0x0033:
            bp0.g.b(r14)
            java.lang.Object r14 = r13.L$0
            kotlinx.coroutines.flow.e r14 = (kotlinx.coroutines.flow.e) r14
            in.swiggy.android.tejas.feature.home.CacheUtils r1 = in.swiggy.android.tejas.feature.home.CacheUtils.INSTANCE
            in.swiggy.android.tejas.feature.home.dropboxpersister.HomeStorePersister r5 = r13.this$0
            android.content.SharedPreferences r5 = r5.sharedPreferences
            in.swiggy.android.tejas.feature.home.dropboxpersister.HomeStorePersister r6 = r13.this$0
            in.swiggy.android.tejas.feature.home.model.configs.HomeRequestParams r7 = r13.$key
            java.lang.String r6 = r6.getCacheKey(r7)
            boolean r1 = r1.isCached(r5, r6)
            in.swiggy.android.tejas.feature.dropboxStore.models.home.HomeStoreResponse r5 = r13.$homeStoreResponse
            in.swiggy.android.tejas.feature.home.model.HomeResponse r5 = r5.getHomeResponse()
            if (r5 == 0) goto L_0x0082
            in.swiggy.android.tejas.feature.home.dropboxpersister.HomeStorePersister r3 = r13.this$0
            in.swiggy.android.tejas.feature.dropboxStore.models.home.HomeStoreResponse r5 = r13.$homeStoreResponse
            in.swiggy.android.tejas.feature.home.model.HomeResponse r5 = r5.getHomeResponse()
            in.swiggy.android.tejas.feature.home.model.configs.HomeRequestParams r6 = r13.$key
            r13.L$0 = r14
            r13.Z$0 = r1
            r13.label = r4
            java.lang.Object r3 = r3.deleteIfEmptyResponse(r5, r6, r13)
            if (r3 != r0) goto L_0x006d
            return r0
        L_0x006d:
            r3 = r14
        L_0x006e:
            in.swiggy.android.tejas.Response$Companion r4 = in.swiggy.android.tejas.Response.Companion
            in.swiggy.android.tejas.feature.dropboxStore.models.home.HomeStoreResponse r14 = r13.$homeStoreResponse
            in.swiggy.android.tejas.feature.home.model.HomeResponse r5 = r14.getHomeResponse()
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r1)
            r7 = 0
            r8 = 4
            r9 = 0
            in.swiggy.android.tejas.Response r14 = in.swiggy.android.tejas.Response.Companion.success$default(r4, r5, r6, r7, r8, r9)
            goto L_0x00d5
        L_0x0082:
            in.swiggy.android.tejas.feature.dropboxStore.models.home.HomeStoreResponse r4 = r13.$homeStoreResponse
            in.swiggy.android.tejas.error.Error r4 = r4.getError()
            if (r4 == 0) goto L_0x00b3
            in.swiggy.android.tejas.feature.home.dropboxpersister.HomeStorePersister r4 = r13.this$0
            in.swiggy.android.tejas.feature.home.model.configs.HomeRequestParams r5 = r13.$key
            r13.L$0 = r14
            r13.Z$0 = r1
            r13.label = r3
            java.lang.Object r3 = r4.deleteResponse((in.swiggy.android.tejas.feature.home.model.configs.HomeRequestParams) r5, (fp0.c<? super bp0.k>) r13)
            if (r3 != r0) goto L_0x009b
            return r0
        L_0x009b:
            r3 = r14
        L_0x009c:
            in.swiggy.android.tejas.Response$Companion r4 = in.swiggy.android.tejas.Response.Companion
            in.swiggy.android.tejas.feature.dropboxStore.models.home.HomeStoreResponse r14 = r13.$homeStoreResponse
            in.swiggy.android.tejas.error.Error r5 = r14.getError()
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r1)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 28
            r11 = 0
            in.swiggy.android.tejas.Response r14 = in.swiggy.android.tejas.Response.Companion.failure$default(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00d5
        L_0x00b3:
            in.swiggy.android.tejas.Response$Companion r4 = in.swiggy.android.tejas.Response.Companion
            in.swiggy.android.tejas.error.Error$UnhandledError r3 = new in.swiggy.android.tejas.error.Error$UnhandledError
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 30
            r12 = 0
            java.lang.String r6 = "unhandled error"
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r1)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 28
            r11 = 0
            r5 = r3
            in.swiggy.android.tejas.Response r1 = in.swiggy.android.tejas.Response.Companion.failure$default(r4, r5, r6, r7, r8, r9, r10, r11)
            r3 = r14
            r14 = r1
        L_0x00d5:
            r1 = 0
            r13.L$0 = r1
            r13.label = r2
            java.lang.Object r14 = r3.emit(r14, r13)
            if (r14 != r0) goto L_0x00e1
            return r0
        L_0x00e1:
            bp0.k r14 = bp0.k.f22762a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.home.dropboxpersister.HomeStorePersister$handleResponse$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

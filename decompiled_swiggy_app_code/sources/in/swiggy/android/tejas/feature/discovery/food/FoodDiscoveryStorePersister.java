package in.swiggy.android.tejas.feature.discovery.food;

import android.content.SharedPreferences;
import bp0.k;
import com.newrelic.agent.android.instrumentation.Instrumented;
import fp0.c;
import in.swiggy.android.commons.utils.DispatchProviderKt;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.dropboxStore.dagger.FoodDiscoveryFlushManager;
import in.swiggy.android.tejas.feature.dropboxStore.dagger.FoodDiscoveryStoreSharedPreferences;
import in.swiggy.android.tejas.feature.dropboxStore.interfaces.IStorePersister;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.DiscoveryStoreResponse;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL;
import in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import in.swiggy.android.tejas.flush.SharedPrefFlushManager;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;
import wp0.h;

@Instrumented
/* compiled from: FoodDiscoveryStorePersister.kt */
public final class FoodDiscoveryStorePersister implements IStorePersister<FoodDiscoveryRequestParams, d<Response<ListingResponse>>, StoreTTL> {
    public static final String CACHE_PREFIX = "food-discovery-cache-";
    public static final Companion Companion = new Companion((i) null);
    private static final String JSON_PARSING_ERROR = "json parsing error";
    public static final String KEY_PREFIX = "food-discovery-store-";
    private static final String TAG = "FoodDiscoveryStorePersister";
    private static final String UNHANDLED_ERROR = "unhandled error";
    /* access modifiers changed from: private */
    public final SharedPrefFlushManager discoveryStoreFlushManager;
    /* access modifiers changed from: private */
    public final SharedPreferences sharedPreferences;

    /* compiled from: FoodDiscoveryStorePersister.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public FoodDiscoveryStorePersister(@FoodDiscoveryStoreSharedPreferences SharedPreferences sharedPreferences2, @FoodDiscoveryFlushManager SharedPrefFlushManager sharedPrefFlushManager) {
        p.j(sharedPreferences2, "sharedPreferences");
        p.j(sharedPrefFlushManager, "discoveryStoreFlushManager");
        this.sharedPreferences = sharedPreferences2;
        this.discoveryStoreFlushManager = sharedPrefFlushManager;
    }

    /* access modifiers changed from: private */
    public final Object deleteIfEmptyResponse(ListingResponse listingResponse, FoodDiscoveryRequestParams foodDiscoveryRequestParams, c<? super k> cVar) {
        if (!listingResponse.getResults().isEmpty()) {
            return k.f22762a;
        }
        Object deleteResponse = deleteResponse(foodDiscoveryRequestParams, cVar);
        return deleteResponse == b.d() ? deleteResponse : k.f22762a;
    }

    /* access modifiers changed from: private */
    public final String getCacheKey(FoodDiscoveryRequestParams foodDiscoveryRequestParams) {
        return p.s(CACHE_PREFIX, foodDiscoveryRequestParams);
    }

    /* access modifiers changed from: private */
    public final String getFormattedKey(FoodDiscoveryRequestParams foodDiscoveryRequestParams) {
        return p.s(KEY_PREFIX, foodDiscoveryRequestParams);
    }

    /* access modifiers changed from: private */
    public final Object handleResponse(DiscoveryStoreResponse discoveryStoreResponse, FoodDiscoveryRequestParams foodDiscoveryRequestParams, c<? super d<? extends Response<ListingResponse>>> cVar) {
        return f.x(new FoodDiscoveryStorePersister$handleResponse$2(this, foodDiscoveryRequestParams, discoveryStoreResponse, (c<? super FoodDiscoveryStorePersister$handleResponse$2>) null));
    }

    public Object clearCacheIfExpired(c<? super k> cVar) {
        Object g11 = h.g(DispatchProviderKt.a().D(), new FoodDiscoveryStorePersister$clearCacheIfExpired$2(this, (c<? super FoodDiscoveryStorePersister$clearCacheIfExpired$2>) null), cVar);
        return g11 == b.d() ? g11 : k.f22762a;
    }

    public Object deleteAllResponse(c<? super k> cVar) {
        Object g11 = h.g(DispatchProviderKt.a().D(), new FoodDiscoveryStorePersister$deleteAllResponse$2(this, (c<? super FoodDiscoveryStorePersister$deleteAllResponse$2>) null), cVar);
        return g11 == b.d() ? g11 : k.f22762a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object deleteIfExpired(in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL r10, in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams r11, fp0.c<? super java.lang.Boolean> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister$deleteIfExpired$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister$deleteIfExpired$1 r0 = (in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister$deleteIfExpired$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister$deleteIfExpired$1 r0 = new in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister$deleteIfExpired$1
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            bp0.g.b(r12)
            goto L_0x0052
        L_0x002a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0032:
            bp0.g.b(r12)
            if (r10 != 0) goto L_0x0038
            goto L_0x0053
        L_0x0038:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r10.getInsertTimeInMillis()
            long r5 = r5 - r7
            long r7 = r10.getTtl()
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L_0x0053
            r0.label = r4
            java.lang.Object r10 = r9.deleteResponse((in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams) r11, (fp0.c<? super bp0.k>) r0)
            if (r10 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r3 = 1
        L_0x0053:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister.deleteIfExpired(in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL, in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams, fp0.c):java.lang.Object");
    }

    public Object deleteResponse(FoodDiscoveryRequestParams foodDiscoveryRequestParams, c<? super k> cVar) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        p.i(edit, "editor");
        edit.remove(getCacheKey(foodDiscoveryRequestParams));
        edit.remove(getFormattedKey(foodDiscoveryRequestParams));
        edit.apply();
        return k.f22762a;
    }

    public Object insertResponse(FoodDiscoveryRequestParams foodDiscoveryRequestParams, d<? extends Response<ListingResponse>> dVar, c<? super k> cVar) {
        Object collect = f.A(dVar, DispatchProviderKt.a().D()).collect(new FoodDiscoveryStorePersister$insertResponse$$inlined$collect$1(foodDiscoveryRequestParams, this), cVar);
        if (collect == b.d()) {
            return collect;
        }
        return k.f22762a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1 A[PHI: r11 
      PHI: (r11v2 java.lang.Object) = (r11v8 java.lang.Object), (r11v1 java.lang.Object) binds: [B:38:0x00be, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object loadResponse(in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams r10, fp0.c<? super kotlinx.coroutines.flow.d<? extends in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister$loadResponse$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister$loadResponse$1 r0 = (in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister$loadResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister$loadResponse$1 r0 = new in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister$loadResponse$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            bp0.g.b(r11)
            goto L_0x00c1
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            java.lang.Object r10 = r0.L$3
            in.swiggy.android.tejas.feature.dropboxStore.models.home.DiscoveryStoreResponse r10 = (in.swiggy.android.tejas.feature.dropboxStore.models.home.DiscoveryStoreResponse) r10
            java.lang.Object r2 = r0.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r0.L$1
            in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams r6 = (in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams) r6
            java.lang.Object r7 = r0.L$0
            in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister r7 = (in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister) r7
            bp0.g.b(r11)
            goto L_0x009e
        L_0x004a:
            bp0.g.b(r11)
            android.content.SharedPreferences r11 = r9.sharedPreferences
            java.lang.String r2 = r9.getFormattedKey(r10)
            java.lang.String r6 = ""
            java.lang.String r11 = r11.getString(r2, r6)
            if (r11 != 0) goto L_0x005d
            r2 = r6
            goto L_0x005e
        L_0x005d:
            r2 = r11
        L_0x005e:
            java.lang.String r11 = "load from cache : "
            java.lang.String r11 = kotlin.jvm.internal.p.s(r11, r2)
            java.lang.String r6 = "FoodDiscoveryStorePersister"
            os.u.b(r6, r11)
            in.swiggy.android.tejas.feature.dropboxStore.DropboxGsonUtils r11 = in.swiggy.android.tejas.feature.dropboxStore.DropboxGsonUtils.INSTANCE     // Catch:{ Exception -> 0x00c3 }
            com.google.gson.Gson r11 = r11.getListingGson()     // Catch:{ Exception -> 0x00c3 }
            java.lang.Class<in.swiggy.android.tejas.feature.dropboxStore.models.home.DiscoveryStoreResponse> r6 = in.swiggy.android.tejas.feature.dropboxStore.models.home.DiscoveryStoreResponse.class
            boolean r7 = r11 instanceof com.google.gson.Gson     // Catch:{ Exception -> 0x00c3 }
            if (r7 != 0) goto L_0x007a
            java.lang.Object r11 = r11.fromJson((java.lang.String) r2, r6)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x007e
        L_0x007a:
            java.lang.Object r11 = com.newrelic.agent.android.instrumentation.GsonInstrumentation.fromJson((com.google.gson.Gson) r11, (java.lang.String) r2, r6)     // Catch:{ Exception -> 0x00c3 }
        L_0x007e:
            in.swiggy.android.tejas.feature.dropboxStore.models.home.DiscoveryStoreResponse r11 = (in.swiggy.android.tejas.feature.dropboxStore.models.home.DiscoveryStoreResponse) r11     // Catch:{ Exception -> 0x00c3 }
            if (r11 != 0) goto L_0x0084
            r6 = r5
            goto L_0x0088
        L_0x0084:
            in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL r6 = r11.getStoreTTL()
        L_0x0088:
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r2
            r0.L$3 = r11
            r0.label = r4
            java.lang.Object r6 = r9.deleteIfExpired((in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL) r6, (in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams) r10, (fp0.c<? super java.lang.Boolean>) r0)
            if (r6 != r1) goto L_0x0099
            return r1
        L_0x0099:
            r7 = r9
            r8 = r6
            r6 = r10
            r10 = r11
            r11 = r8
        L_0x009e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00a7
            goto L_0x00c2
        L_0x00a7:
            boolean r11 = kotlin.text.o.A(r2)
            r11 = r11 ^ r4
            if (r11 == 0) goto L_0x00c2
            if (r10 == 0) goto L_0x00c2
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r5
            r0.label = r3
            java.lang.Object r11 = r7.handleResponse(r10, r6, r0)
            if (r11 != r1) goto L_0x00c1
            return r1
        L_0x00c1:
            return r11
        L_0x00c2:
            return r5
        L_0x00c3:
            r10 = move-exception
            in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister$loadResponse$2 r11 = new in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister$loadResponse$2
            r11.<init>(r10, r5)
            kotlinx.coroutines.flow.d r10 = kotlinx.coroutines.flow.f.x(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister.loadResponse(in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams, fp0.c):java.lang.Object");
    }
}

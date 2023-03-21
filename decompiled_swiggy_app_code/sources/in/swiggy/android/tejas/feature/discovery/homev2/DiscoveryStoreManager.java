package in.swiggy.android.tejas.feature.discovery.homev2;

import android.content.SharedPreferences;
import bp0.k;
import com.dropbox.android.external.store4.Fetcher;
import com.dropbox.android.external.store4.SourceOfTruth;
import com.newrelic.agent.android.harvest.HarvestTimer;
import com.xiaomi.mipush.sdk.Constants;
import dc.e;
import dc.f;
import in.swiggy.android.tejas.NetworkExceptionTransformer;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.TejasConstants;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.dropboxStore.interfaces.IStoreManager;
import in.swiggy.android.tejas.feature.dropboxStore.interfaces.IStorePersister;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL;
import in.swiggy.android.tejas.feature.home.HomeTransformers;
import in.swiggy.android.tejas.feature.home.IDiscoveryAPI;
import in.swiggy.android.tejas.feature.home.IDiscoveryJsonApi;
import in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import in.swiggy.android.tejas.feature.listing.ListingTransformer;
import in.swiggy.android.tejas.feature.listing.ListingTransformers;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.sync.c;
import os.a;

/* compiled from: DiscoveryStoreManager.kt */
public final class DiscoveryStoreManager implements IStoreManager<IDiscoveryAPI, DiscoveryRequestParams, d<? extends Response<? extends ListingResponse>>> {
    public static final Companion Companion = new Companion((i) null);
    private static final long MAX_TTL_IN_SEC = 300;
    private static final long MIN_TTL_IN_SEC = 60;
    private final a appBuildDetails;
    private e<DiscoveryRequestParams, d<Response<ListingResponse>>> discoveryStore;
    /* access modifiers changed from: private */
    public final IStorePersister<DiscoveryRequestParams, d<Response<ListingResponse>>, StoreTTL> discoveryStorePersister;
    private final IErrorChecker<com.swiggy.gandalf.widgets.v2.Response> errorChecker;
    private ITransformer<com.swiggy.gandalf.widgets.v2.Response, Error> errorTransformer;
    private ITransformer<Throwable, Error> exceptionTransformer;
    private boolean forceEnableCache;
    private final IDiscoveryJsonApi jsonApi;
    private long maxTTLInMillis = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
    private long minTTLInMillis = HarvestTimer.DEFAULT_HARVEST_PERIOD;
    private final c mutex = kotlinx.coroutines.sync.d.b(false, 1, (Object) null);
    private final IDiscoveryAPI protoApi;
    private ITransformer<com.swiggy.gandalf.widgets.v2.Response, ListingResponse> responseTransformer;
    private boolean storageCacheEnabled;

    /* compiled from: DiscoveryStoreManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public DiscoveryStoreManager(IDiscoveryAPI iDiscoveryAPI, IDiscoveryJsonApi iDiscoveryJsonApi, a aVar, IErrorChecker<com.swiggy.gandalf.widgets.v2.Response> iErrorChecker, @ListingTransformers Map<String, ITransformer<?, ?>> map, SharedPreferences sharedPreferences, IStorePersister<DiscoveryRequestParams, d<Response<ListingResponse>>, StoreTTL> iStorePersister) {
        p.j(iDiscoveryAPI, "protoApi");
        p.j(iDiscoveryJsonApi, "jsonApi");
        p.j(aVar, "appBuildDetails");
        p.j(iErrorChecker, "errorChecker");
        p.j(map, "discoveryTransformersMap");
        p.j(sharedPreferences, "sharedPreferences");
        p.j(iStorePersister, "discoveryStorePersister");
        this.protoApi = iDiscoveryAPI;
        this.jsonApi = iDiscoveryJsonApi;
        this.appBuildDetails = aVar;
        this.errorChecker = iErrorChecker;
        this.discoveryStorePersister = iStorePersister;
        setTTLs(sharedPreferences);
        setTransformers(map);
    }

    private final e<DiscoveryRequestParams, d<Response<ListingResponse>>> createStore(IDiscoveryAPI iDiscoveryAPI) {
        return this.storageCacheEnabled ? getStoreWithSourceOfTruth(iDiscoveryAPI) : getStoreWithoutSourceOfTruth(iDiscoveryAPI);
    }

    private final e<DiscoveryRequestParams, d<Response<ListingResponse>>> getStoreWithSourceOfTruth(IDiscoveryAPI iDiscoveryAPI) {
        return f.f38116a.b(Fetcher.f32828a.b(new DiscoveryStoreManager$getStoreWithSourceOfTruth$1(this, iDiscoveryAPI, (fp0.c<? super DiscoveryStoreManager$getStoreWithSourceOfTruth$1>) null)), SourceOfTruth.f32845a.a(new DiscoveryStoreManager$getStoreWithSourceOfTruth$2(this, (fp0.c<? super DiscoveryStoreManager$getStoreWithSourceOfTruth$2>) null), new DiscoveryStoreManager$getStoreWithSourceOfTruth$3(this, (fp0.c<? super DiscoveryStoreManager$getStoreWithSourceOfTruth$3>) null), new DiscoveryStoreManager$getStoreWithSourceOfTruth$4(this, (fp0.c<? super DiscoveryStoreManager$getStoreWithSourceOfTruth$4>) null), new DiscoveryStoreManager$getStoreWithSourceOfTruth$5(this, (fp0.c<? super DiscoveryStoreManager$getStoreWithSourceOfTruth$5>) null))).a().build();
    }

    private final e<DiscoveryRequestParams, d<Response<ListingResponse>>> getStoreWithoutSourceOfTruth(IDiscoveryAPI iDiscoveryAPI) {
        return f.f38116a.a(Fetcher.f32828a.b(new DiscoveryStoreManager$getStoreWithoutSourceOfTruth$1(this, iDiscoveryAPI, (fp0.c<? super DiscoveryStoreManager$getStoreWithoutSourceOfTruth$1>) null))).build();
    }

    private final void setTTLs(SharedPreferences sharedPreferences) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        String string = sharedPreferences.getString(TejasConstants.HOME_V2_MIN_TTL_IN_SEC, "60");
        String str = "";
        if (string == null) {
            string = str;
        }
        this.minTTLInMillis = timeUnit.toMillis(js.c.w(string, 60));
        String string2 = sharedPreferences.getString(TejasConstants.HOME_V2_MAX_TTL_IN_SEC, "300");
        if (string2 != null) {
            str = string2;
        }
        this.maxTTLInMillis = timeUnit.toMillis(js.c.w(str, 300));
    }

    private final void setTransformers(@HomeTransformers Map<String, ITransformer<?, ?>> map) {
        ITransformer<?, ?> iTransformer = map.get(ListingTransformer.TAG);
        Objects.requireNonNull(iTransformer, "null cannot be cast to non-null type in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Response, in.swiggy.android.tejas.feature.listing.ListingResponse>");
        this.responseTransformer = iTransformer;
        ITransformer<?, ?> iTransformer2 = map.get("ErrorTransformer");
        Objects.requireNonNull(iTransformer2, "null cannot be cast to non-null type in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Response, in.swiggy.android.tejas.error.Error>");
        this.errorTransformer = iTransformer2;
        ITransformer<?, ?> iTransformer3 = map.get(NetworkExceptionTransformer.TAG);
        Objects.requireNonNull(iTransformer3, "null cannot be cast to non-null type in.swiggy.android.tejas.transformer.ITransformer<kotlin.Throwable, in.swiggy.android.tejas.error.Error>");
        this.exceptionTransformer = iTransformer3;
    }

    public Object deleteAllResponse(fp0.c<? super k> cVar) {
        e<DiscoveryRequestParams, d<Response<ListingResponse>>> eVar = this.discoveryStore;
        if (eVar != null) {
            Object a11 = eVar.a(cVar);
            return a11 == b.d() ? a11 : k.f22762a;
        } else if (b.d() == null) {
            return null;
        } else {
            return k.f22762a;
        }
    }

    public Object enableCache(long j, fp0.c<? super Boolean> cVar) {
        boolean z11 = true;
        if ((!(j <= this.maxTTLInMillis && this.minTTLInMillis + 1 <= j) || !os.f.a()) && !this.forceEnableCache) {
            z11 = false;
        }
        return kotlin.coroutines.jvm.internal.a.a(z11);
    }

    public Object forceEnableCache(boolean z11, fp0.c<? super k> cVar) {
        this.forceEnableCache = z11;
        return k.f22762a;
    }

    public Object forceEnableStoreCache(boolean z11, fp0.c<? super k> cVar) {
        this.storageCacheEnabled = z11;
        this.discoveryStore = null;
        return k.f22762a;
    }

    public Object deleteResponse(DiscoveryRequestParams discoveryRequestParams, fp0.c<? super k> cVar) {
        e<DiscoveryRequestParams, d<Response<ListingResponse>>> eVar = this.discoveryStore;
        if (eVar != null) {
            Object b11 = eVar.b(discoveryRequestParams, cVar);
            return b11 == b.d() ? b11 : k.f22762a;
        } else if (b.d() == null) {
            return null;
        } else {
            return k.f22762a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c1, code lost:
        if (((java.lang.Boolean) r9).booleanValue() == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c7, code lost:
        if (r2.getClearCache() == false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c9, code lost:
        r0.L$0 = r4;
        r0.L$1 = r2;
        r0.L$2 = r8;
        r0.label = 2;
        r9 = r4.getStore(r8, r2, (fp0.c<? super dc.e<in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams, kotlinx.coroutines.flow.d<in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>>>>) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d6, code lost:
        if (r9 != r1) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        r0.L$0 = r4;
        r0.L$1 = r2;
        r0.L$2 = r8;
        r0.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e8, code lost:
        if (((dc.e) r9).a(r0) != r1) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ea, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00eb, code lost:
        r0.L$0 = r2;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 4;
        r9 = r4.getStore(r8, r2, (fp0.c<? super dc.e<in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams, kotlinx.coroutines.flow.d<in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>>>>) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f8, code lost:
        if (r9 != r1) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fa, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fb, code lost:
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fc, code lost:
        r0.L$0 = null;
        r0.label = 5;
        r9 = com.dropbox.android.external.store4.StoreKt.a((dc.e) r9, r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0107, code lost:
        if (r9 != r1) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0109, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010a, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010b, code lost:
        r0.L$0 = r4;
        r0.L$1 = r2;
        r0.L$2 = r8;
        r0.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0118, code lost:
        if (r4.getStore(r8, r2, (fp0.c<? super dc.e<in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams, kotlinx.coroutines.flow.d<in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>>>>) r0) != r1) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011b, code lost:
        r0.L$0 = r4;
        r0.L$1 = r2;
        r0.L$2 = r8;
        r0.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0128, code lost:
        if (r4.deleteAllResponse(r0) != r1) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012b, code lost:
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 8;
        r9 = r4.getActiveAPIResponse(r8, r2, (fp0.c<? super kotlinx.coroutines.flow.d<? extends in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>>>) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0139, code lost:
        if (r9 != r1) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013c, code lost:
        return r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getAPIResponse(in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams r8, fp0.c<? super kotlinx.coroutines.flow.d<? extends in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getAPIResponse$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getAPIResponse$1 r0 = (in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getAPIResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getAPIResponse$1 r0 = new in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getAPIResponse$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L_0x0092;
                case 1: goto L_0x0082;
                case 2: goto L_0x0072;
                case 3: goto L_0x0061;
                case 4: goto L_0x0058;
                case 5: goto L_0x0053;
                case 6: goto L_0x0042;
                case 7: goto L_0x0031;
                case 8: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x002c:
            bp0.g.b(r9)
            goto L_0x013c
        L_0x0031:
            java.lang.Object r8 = r0.L$2
            in.swiggy.android.tejas.feature.home.IDiscoveryAPI r8 = (in.swiggy.android.tejas.feature.home.IDiscoveryAPI) r8
            java.lang.Object r2 = r0.L$1
            in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams r2 = (in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams) r2
            java.lang.Object r4 = r0.L$0
            in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager r4 = (in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager) r4
            bp0.g.b(r9)
            goto L_0x012b
        L_0x0042:
            java.lang.Object r8 = r0.L$2
            in.swiggy.android.tejas.feature.home.IDiscoveryAPI r8 = (in.swiggy.android.tejas.feature.home.IDiscoveryAPI) r8
            java.lang.Object r2 = r0.L$1
            in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams r2 = (in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams) r2
            java.lang.Object r4 = r0.L$0
            in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager r4 = (in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager) r4
            bp0.g.b(r9)
            goto L_0x011b
        L_0x0053:
            bp0.g.b(r9)
            goto L_0x010a
        L_0x0058:
            java.lang.Object r8 = r0.L$0
            in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams r8 = (in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams) r8
            bp0.g.b(r9)
            goto L_0x00fc
        L_0x0061:
            java.lang.Object r8 = r0.L$2
            in.swiggy.android.tejas.feature.home.IDiscoveryAPI r8 = (in.swiggy.android.tejas.feature.home.IDiscoveryAPI) r8
            java.lang.Object r2 = r0.L$1
            in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams r2 = (in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams) r2
            java.lang.Object r4 = r0.L$0
            in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager r4 = (in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager) r4
            bp0.g.b(r9)
            goto L_0x00eb
        L_0x0072:
            java.lang.Object r8 = r0.L$2
            in.swiggy.android.tejas.feature.home.IDiscoveryAPI r8 = (in.swiggy.android.tejas.feature.home.IDiscoveryAPI) r8
            java.lang.Object r2 = r0.L$1
            in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams r2 = (in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams) r2
            java.lang.Object r4 = r0.L$0
            in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager r4 = (in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager) r4
            bp0.g.b(r9)
            goto L_0x00d9
        L_0x0082:
            java.lang.Object r8 = r0.L$2
            in.swiggy.android.tejas.feature.home.IDiscoveryAPI r8 = (in.swiggy.android.tejas.feature.home.IDiscoveryAPI) r8
            java.lang.Object r2 = r0.L$1
            in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams r2 = (in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams) r2
            java.lang.Object r4 = r0.L$0
            in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager r4 = (in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager) r4
            bp0.g.b(r9)
            goto L_0x00bb
        L_0x0092:
            bp0.g.b(r9)
            os.a r9 = r7.appBuildDetails
            boolean r9 = r9.j()
            if (r9 == 0) goto L_0x00a0
            in.swiggy.android.tejas.feature.home.IDiscoveryAPI r9 = r7.protoApi
            goto L_0x00a2
        L_0x00a0:
            in.swiggy.android.tejas.feature.home.IDiscoveryJsonApi r9 = r7.jsonApi
        L_0x00a2:
            long r4 = r8.getTtl()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r2 = 1
            r0.label = r2
            java.lang.Object r2 = r7.enableCache(r4, r0)
            if (r2 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            r4 = r7
            r6 = r2
            r2 = r8
            r8 = r9
            r9 = r6
        L_0x00bb:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x010b
            boolean r9 = r2.getClearCache()
            if (r9 == 0) goto L_0x00eb
            r0.L$0 = r4
            r0.L$1 = r2
            r0.L$2 = r8
            r9 = 2
            r0.label = r9
            java.lang.Object r9 = r4.getStore((in.swiggy.android.tejas.feature.home.IDiscoveryAPI) r8, (in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams) r2, (fp0.c<? super dc.e<in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams, kotlinx.coroutines.flow.d<in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>>>>) r0)
            if (r9 != r1) goto L_0x00d9
            return r1
        L_0x00d9:
            dc.e r9 = (dc.e) r9
            r0.L$0 = r4
            r0.L$1 = r2
            r0.L$2 = r8
            r5 = 3
            r0.label = r5
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L_0x00eb
            return r1
        L_0x00eb:
            r0.L$0 = r2
            r0.L$1 = r3
            r0.L$2 = r3
            r9 = 4
            r0.label = r9
            java.lang.Object r9 = r4.getStore((in.swiggy.android.tejas.feature.home.IDiscoveryAPI) r8, (in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams) r2, (fp0.c<? super dc.e<in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams, kotlinx.coroutines.flow.d<in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>>>>) r0)
            if (r9 != r1) goto L_0x00fb
            return r1
        L_0x00fb:
            r8 = r2
        L_0x00fc:
            dc.e r9 = (dc.e) r9
            r0.L$0 = r3
            r2 = 5
            r0.label = r2
            java.lang.Object r9 = com.dropbox.android.external.store4.StoreKt.a(r9, r8, r0)
            if (r9 != r1) goto L_0x010a
            return r1
        L_0x010a:
            return r9
        L_0x010b:
            r0.L$0 = r4
            r0.L$1 = r2
            r0.L$2 = r8
            r9 = 6
            r0.label = r9
            java.lang.Object r9 = r4.getStore((in.swiggy.android.tejas.feature.home.IDiscoveryAPI) r8, (in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams) r2, (fp0.c<? super dc.e<in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams, kotlinx.coroutines.flow.d<in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>>>>) r0)
            if (r9 != r1) goto L_0x011b
            return r1
        L_0x011b:
            r0.L$0 = r4
            r0.L$1 = r2
            r0.L$2 = r8
            r9 = 7
            r0.label = r9
            java.lang.Object r9 = r4.deleteAllResponse(r0)
            if (r9 != r1) goto L_0x012b
            return r1
        L_0x012b:
            r0.L$0 = r3
            r0.L$1 = r3
            r0.L$2 = r3
            r9 = 8
            r0.label = r9
            java.lang.Object r9 = r4.getActiveAPIResponse((in.swiggy.android.tejas.feature.home.IDiscoveryAPI) r8, (in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams) r2, (fp0.c<? super kotlinx.coroutines.flow.d<? extends in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>>>) r0)
            if (r9 != r1) goto L_0x013c
            return r1
        L_0x013c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager.getAPIResponse(in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams, fp0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080 A[Catch:{ Exception -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a A[Catch:{ Exception -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getActiveAPIResponse(in.swiggy.android.tejas.feature.home.IDiscoveryAPI r17, in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams r18, fp0.c<? super kotlinx.coroutines.flow.d<? extends in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>>> r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r19
            java.lang.Class<in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager> r2 = in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager.class
            boolean r3 = r0 instanceof in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getActiveAPIResponse$1
            if (r3 == 0) goto L_0x0019
            r3 = r0
            in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getActiveAPIResponse$1 r3 = (in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getActiveAPIResponse$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getActiveAPIResponse$1 r3 = new in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getActiveAPIResponse$1
            r3.<init>(r1, r0)
        L_0x001e:
            r13 = r3
            java.lang.Object r0 = r13.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.d()
            int r4 = r13.label
            r5 = 1
            r14 = 0
            if (r4 == 0) goto L_0x0043
            if (r4 != r5) goto L_0x003b
            java.lang.Object r3 = r13.L$1
            in.swiggy.android.tejas.ResponseTransformerManager r3 = (in.swiggy.android.tejas.ResponseTransformerManager) r3
            java.lang.Object r4 = r13.L$0
            in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager r4 = (in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager) r4
            bp0.g.b(r0)     // Catch:{ Exception -> 0x0039 }
            goto L_0x0078
        L_0x0039:
            r0 = move-exception
            goto L_0x0098
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0043:
            bp0.g.b(r0)
            in.swiggy.android.tejas.ResponseTransformerManager r0 = in.swiggy.android.tejas.ResponseTransformerManager.INSTANCE     // Catch:{ Exception -> 0x0096 }
            double r6 = r18.getLat()     // Catch:{ Exception -> 0x0096 }
            double r8 = r18.getLng()     // Catch:{ Exception -> 0x0096 }
            java.lang.Integer r10 = r18.getPageLimit()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r11 = r18.getPageOffset()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r12 = r18.getSegmentId()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r15 = r18.getSegmentDomain()     // Catch:{ Exception -> 0x0096 }
            r13.L$0 = r1     // Catch:{ Exception -> 0x0096 }
            r13.L$1 = r0     // Catch:{ Exception -> 0x0096 }
            r13.label = r5     // Catch:{ Exception -> 0x0096 }
            r4 = r17
            r5 = r6
            r7 = r8
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r15
            java.lang.Object r4 = r4.getHomeListing(r5, r7, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0096 }
            if (r4 != r3) goto L_0x0075
            return r3
        L_0x0075:
            r3 = r0
            r0 = r4
            r4 = r1
        L_0x0078:
            retrofit2.Response r0 = (retrofit2.Response) r0     // Catch:{ Exception -> 0x0039 }
            in.swiggy.android.tejas.api.IErrorChecker<com.swiggy.gandalf.widgets.v2.Response> r5 = r4.errorChecker     // Catch:{ Exception -> 0x0039 }
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Response, in.swiggy.android.tejas.feature.listing.ListingResponse> r6 = r4.responseTransformer     // Catch:{ Exception -> 0x0039 }
            if (r6 != 0) goto L_0x0086
            java.lang.String r6 = "responseTransformer"
            kotlin.jvm.internal.p.B(r6)     // Catch:{ Exception -> 0x0039 }
            r6 = r14
        L_0x0086:
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Response, in.swiggy.android.tejas.error.Error> r7 = r4.errorTransformer     // Catch:{ Exception -> 0x0039 }
            if (r7 != 0) goto L_0x0090
            java.lang.String r7 = "errorTransformer"
            kotlin.jvm.internal.p.B(r7)     // Catch:{ Exception -> 0x0039 }
            r7 = r14
        L_0x0090:
            in.swiggy.android.tejas.Response r0 = r3.buildResponse(r0, r5, r6, r7)     // Catch:{ Exception -> 0x0039 }
            goto L_0x0133
        L_0x0096:
            r0 = move-exception
            r4 = r1
        L_0x0098:
            java.lang.Class r3 = r4.getClass()
            boolean r3 = r3.isAnonymousClass()
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            java.lang.String r6 = "name"
            r7 = 23
            if (r3 != 0) goto L_0x00c4
            java.lang.String r2 = r2.getSimpleName()
            int r3 = r2.length()
            if (r3 > r7) goto L_0x00b3
            goto L_0x00be
        L_0x00b3:
            kotlin.jvm.internal.p.i(r2, r6)
            r3 = 0
            java.lang.String r2 = r2.substring(r3, r7)
            kotlin.jvm.internal.p.i(r2, r5)
        L_0x00be:
            java.lang.String r3 = "{\n            val name =… first 23 chars\n        }"
            kotlin.jvm.internal.p.i(r2, r3)
            goto L_0x00e7
        L_0x00c4:
            java.lang.String r2 = r2.getName()
            int r3 = r2.length()
            if (r3 > r7) goto L_0x00cf
            goto L_0x00e2
        L_0x00cf:
            kotlin.jvm.internal.p.i(r2, r6)
            int r3 = r2.length()
            int r3 = r3 - r7
            int r6 = r2.length()
            java.lang.String r2 = r2.substring(r3, r6)
            kotlin.jvm.internal.p.i(r2, r5)
        L_0x00e2:
            java.lang.String r3 = "{\n            val name =…/ last 23 chars\n        }"
            kotlin.jvm.internal.p.i(r2, r3)
        L_0x00e7:
            os.u.h(r2, r0)
            in.swiggy.android.tejas.transformer.ITransformer<java.lang.Throwable, in.swiggy.android.tejas.error.Error> r2 = r4.exceptionTransformer
            if (r2 != 0) goto L_0x00f4
            java.lang.String r2 = "exceptionTransformer"
            kotlin.jvm.internal.p.B(r2)
            r2 = r14
        L_0x00f4:
            java.lang.Object r2 = r2.transform(r0)
            r4 = r2
            in.swiggy.android.tejas.error.Error r4 = (in.swiggy.android.tejas.error.Error) r4
            if (r4 != 0) goto L_0x00fe
            goto L_0x010b
        L_0x00fe:
            in.swiggy.android.tejas.Response$Failure r14 = new in.swiggy.android.tejas.Response$Failure
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 30
            r10 = 0
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x010b:
            if (r14 != 0) goto L_0x0132
            in.swiggy.android.tejas.Response$Failure r10 = new in.swiggy.android.tejas.Response$Failure
            in.swiggy.android.tejas.error.Error$UnhandledError r11 = new in.swiggy.android.tejas.error.Error$UnhandledError
            java.lang.String r2 = r0.getMessage()
            if (r2 != 0) goto L_0x011f
            java.lang.String r2 = "exception-transformer-"
            java.lang.String r0 = kotlin.jvm.internal.p.s(r2, r0)
            r3 = r0
            goto L_0x0120
        L_0x011f:
            r3 = r2
        L_0x0120:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 30
            r9 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r2 = r10
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0 = r10
            goto L_0x0133
        L_0x0132:
            r0 = r14
        L_0x0133:
            kotlinx.coroutines.flow.d r0 = kotlinx.coroutines.flow.f.y(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager.getActiveAPIResponse(in.swiggy.android.tejas.feature.home.IDiscoveryAPI, in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams, fp0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[Catch:{ all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getStore(in.swiggy.android.tejas.feature.home.IDiscoveryAPI r5, in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams r6, fp0.c<? super dc.e<in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams, kotlinx.coroutines.flow.d<in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>>>> r7) {
        /*
            r4 = this;
            boolean r6 = r7 instanceof in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getStore$1
            if (r6 == 0) goto L_0x0013
            r6 = r7
            in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getStore$1 r6 = (in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getStore$1) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r6.label = r0
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getStore$1 r6 = new in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getStore$1
            r6.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r6.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 != r3) goto L_0x0038
            java.lang.Object r5 = r6.L$2
            kotlinx.coroutines.sync.c r5 = (kotlinx.coroutines.sync.c) r5
            java.lang.Object r0 = r6.L$1
            in.swiggy.android.tejas.feature.home.IDiscoveryAPI r0 = (in.swiggy.android.tejas.feature.home.IDiscoveryAPI) r0
            java.lang.Object r6 = r6.L$0
            in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager r6 = (in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager) r6
            bp0.g.b(r7)
            r7 = r5
            r5 = r0
            goto L_0x0055
        L_0x0038:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0040:
            bp0.g.b(r7)
            kotlinx.coroutines.sync.c r7 = r4.mutex
            r6.L$0 = r4
            r6.L$1 = r5
            r6.L$2 = r7
            r6.label = r3
            java.lang.Object r6 = r7.a(r2, r6)
            if (r6 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r6 = r4
        L_0x0055:
            dc.e<in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams, kotlinx.coroutines.flow.d<in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.listing.ListingResponse>>> r0 = r6.discoveryStore     // Catch:{ all -> 0x0063 }
            if (r0 != 0) goto L_0x005f
            dc.e r0 = r6.createStore(r5)     // Catch:{ all -> 0x0063 }
            r6.discoveryStore = r0     // Catch:{ all -> 0x0063 }
        L_0x005f:
            r7.c(r2)
            return r0
        L_0x0063:
            r5 = move-exception
            r7.c(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager.getStore(in.swiggy.android.tejas.feature.home.IDiscoveryAPI, in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams, fp0.c):java.lang.Object");
    }
}

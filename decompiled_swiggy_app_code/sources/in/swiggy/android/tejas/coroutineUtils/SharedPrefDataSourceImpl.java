package in.swiggy.android.tejas.coroutineUtils;

import android.content.SharedPreferences;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: SharedPrefDataSourceImpl.kt */
public abstract class SharedPrefDataSourceImpl<REQ, RESP> extends SharedPrefUseCase<RESP> implements ISharedPrefDataSource<REQ, RESP> {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedPrefDataSourceImpl(SharedPreferences sharedPreferences, Class cls, int i11, i iVar) {
        this(sharedPreferences, (i11 & 2) != 0 ? null : cls);
    }

    static /* synthetic */ Object removeCache$suspendImpl(SharedPrefDataSourceImpl sharedPrefDataSourceImpl, String str, c cVar) {
        Object clearData = sharedPrefDataSourceImpl.clearData(str, cVar);
        return clearData == b.d() ? clearData : k.f22762a;
    }

    static /* synthetic */ Object storeData$suspendImpl(SharedPrefDataSourceImpl sharedPrefDataSourceImpl, String str, Object obj, c cVar) {
        Object data = sharedPrefDataSourceImpl.setData(str, obj, cVar);
        return data == b.d() ? data : k.f22762a;
    }

    public d<RESP> getLocalResponse(SharedPrefParams<RESP> sharedPrefParams) {
        p.j(sharedPrefParams, "parameters");
        return f.f(f.x(new SharedPrefDataSourceImpl$getLocalResponse$$inlined$suspendFlow$1((c) null, this, sharedPrefParams)), new SharedPrefDataSourceImpl$getLocalResponse$$inlined$suspendFlow$2((c) null));
    }

    public d<Response<RESP>> getLocalResponseFlow(SharedPrefParams<RESP> sharedPrefParams) {
        p.j(sharedPrefParams, "parameters");
        return f.f(f.x(new SharedPrefDataSourceImpl$getLocalResponseFlow$$inlined$suspendFlow$1((c) null, this, sharedPrefParams)), new SharedPrefDataSourceImpl$getLocalResponseFlow$$inlined$suspendFlow$2((c) null));
    }

    public Object removeCache(String str, c<? super k> cVar) {
        return removeCache$suspendImpl(this, str, cVar);
    }

    public boolean shouldFetchRemote(RESP resp, REQ req) {
        return true;
    }

    public Object storeData(String str, RESP resp, c<? super k> cVar) {
        return storeData$suspendImpl(this, str, resp, cVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedPrefDataSourceImpl(SharedPreferences sharedPreferences, Class<RESP> cls) {
        super(sharedPreferences, cls);
        p.j(sharedPreferences, "sharedPreferences");
    }
}

package in.swiggy.android.tejas.coroutineUtils;

import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import kotlinx.coroutines.flow.d;

/* compiled from: ISharedPrefDataSource.kt */
public interface ISharedPrefDataSource<REQ, RESP> {

    /* compiled from: ISharedPrefDataSource.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object removeCache$default(ISharedPrefDataSource iSharedPrefDataSource, String str, c cVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    str = null;
                }
                return iSharedPrefDataSource.removeCache(str, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeCache");
        }

        public static /* synthetic */ boolean shouldFetchRemote$default(ISharedPrefDataSource iSharedPrefDataSource, Object obj, Object obj2, int i11, Object obj3) {
            if (obj3 == null) {
                if ((i11 & 1) != 0) {
                    obj = null;
                }
                return iSharedPrefDataSource.shouldFetchRemote(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shouldFetchRemote");
        }
    }

    d<RESP> getLocalResponse(SharedPrefParams<RESP> sharedPrefParams);

    d<Response<RESP>> getLocalResponseFlow(SharedPrefParams<RESP> sharedPrefParams);

    Object removeCache(String str, c<? super k> cVar);

    boolean shouldFetchRemote(RESP resp, REQ req);

    Object storeData(String str, RESP resp, c<? super k> cVar);
}

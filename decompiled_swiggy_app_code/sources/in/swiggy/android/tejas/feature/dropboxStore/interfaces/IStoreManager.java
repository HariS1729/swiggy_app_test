package in.swiggy.android.tejas.feature.dropboxStore.interfaces;

import bp0.k;
import dc.e;
import fp0.c;

/* compiled from: IStoreManager.kt */
public interface IStoreManager<API, Key, Output> {
    Object deleteAllResponse(c<? super k> cVar);

    Object deleteResponse(Key key, c<? super k> cVar);

    Object enableCache(long j, c<? super Boolean> cVar);

    Object forceEnableCache(boolean z11, c<? super k> cVar);

    Object forceEnableStoreCache(boolean z11, c<? super k> cVar);

    Object getAPIResponse(Key key, c<? super Output> cVar);

    Object getActiveAPIResponse(API api, Key key, c<? super Output> cVar);

    Object getStore(API api, Key key, c<? super e<Key, Output>> cVar);
}

package in.swiggy.android.tejas.feature.dropboxStore.interfaces;

import bp0.k;
import fp0.c;

/* compiled from: IStorePersister.kt */
public interface IStorePersister<K, R, TTL> {
    Object clearCacheIfExpired(c<? super k> cVar);

    Object deleteAllResponse(c<? super k> cVar);

    Object deleteIfExpired(TTL ttl, K k, c<? super Boolean> cVar);

    Object deleteResponse(K k, c<? super k> cVar);

    Object insertResponse(K k, R r11, c<? super k> cVar);

    Object loadResponse(K k, c<? super R> cVar);
}

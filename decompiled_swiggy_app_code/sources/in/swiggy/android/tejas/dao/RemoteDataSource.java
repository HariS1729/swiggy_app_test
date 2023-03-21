package in.swiggy.android.tejas.dao;

import in.swiggy.android.tejas.Response;
import kotlinx.coroutines.flow.d;

/* compiled from: RemoteDataSource.kt */
public interface RemoteDataSource<T, R> {
    d<Response<R>> getRemoteResponse(T t);
}

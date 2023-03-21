package in.swiggy.android.tejas.dao;

import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.coroutineUtils.ISharedPrefDataSource;
import in.swiggy.android.tejas.coroutineUtils.SharedPrefParams;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;

/* compiled from: SharedPrefDataSource.kt */
public abstract class SharedPrefDataSource<REQ, RESP> implements ISharedPrefDataSource<REQ, RESP>, RemoteDataSource<REQ, RESP> {
    private final ISharedPrefDataSource<REQ, RESP> localDataSource;
    private final RemoteDataSource<REQ, RESP> remoteDataSource;

    public SharedPrefDataSource(ISharedPrefDataSource<REQ, RESP> iSharedPrefDataSource, RemoteDataSource<REQ, RESP> remoteDataSource2) {
        p.j(iSharedPrefDataSource, "localDataSource");
        p.j(remoteDataSource2, "remoteDataSource");
        this.localDataSource = iSharedPrefDataSource;
        this.remoteDataSource = remoteDataSource2;
    }

    public final ISharedPrefDataSource<REQ, RESP> getLocalDataSource() {
        return this.localDataSource;
    }

    public d<RESP> getLocalResponse(SharedPrefParams<RESP> sharedPrefParams) {
        p.j(sharedPrefParams, "parameters");
        return this.localDataSource.getLocalResponse(sharedPrefParams);
    }

    public d<Response<RESP>> getLocalResponseFlow(SharedPrefParams<RESP> sharedPrefParams) {
        p.j(sharedPrefParams, "parameters");
        return this.localDataSource.getLocalResponseFlow(sharedPrefParams);
    }

    public final RemoteDataSource<REQ, RESP> getRemoteDataSource() {
        return this.remoteDataSource;
    }

    public d<Response<RESP>> getRemoteResponse(REQ req) {
        return this.remoteDataSource.getRemoteResponse(req);
    }

    public Object removeCache(String str, c<? super k> cVar) {
        return this.localDataSource.removeCache(str, cVar);
    }

    public boolean shouldFetchRemote(RESP resp, REQ req) {
        return this.localDataSource.shouldFetchRemote(resp, req);
    }

    public Object storeData(String str, RESP resp, c<? super k> cVar) {
        return this.localDataSource.storeData(str, resp, cVar);
    }
}

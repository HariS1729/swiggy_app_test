package in.swiggy.android.tejas.dao;

import kotlin.jvm.internal.i;

/* compiled from: BaseResponse.kt */
public abstract class BaseResponse<T> {
    private Long createdAt;
    private T primaryId;
    private Long ttl;

    public BaseResponse(T t, Long l11, Long l12) {
        this.primaryId = t;
        this.createdAt = l11;
        this.ttl = l12;
    }

    public static /* synthetic */ void updateCache$default(BaseResponse baseResponse, Object obj, long j, Long l11, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 2) != 0) {
                j = System.currentTimeMillis();
            }
            if ((i11 & 4) != 0) {
                l11 = null;
            }
            baseResponse.updateCache(obj, j, l11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCache");
    }

    public final Long getCreatedAt() {
        return this.createdAt;
    }

    public final T getPrimaryId() {
        return this.primaryId;
    }

    public final Long getTtl() {
        return this.ttl;
    }

    public final void setCreatedAt(Long l11) {
        this.createdAt = l11;
    }

    public final void setPrimaryId(T t) {
        this.primaryId = t;
    }

    public final void setTtl(Long l11) {
        this.ttl = l11;
    }

    public final void updateCache(T t, long j, Long l11) {
        this.primaryId = t;
        this.createdAt = Long.valueOf(j);
        if (l11 != null) {
            setTtl(Long.valueOf(l11.longValue()));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseResponse(Object obj, Long l11, Long l12, int i11, i iVar) {
        this(obj, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : l12);
    }
}

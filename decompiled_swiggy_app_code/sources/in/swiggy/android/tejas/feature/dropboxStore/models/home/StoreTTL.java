package in.swiggy.android.tejas.feature.dropboxStore.models.home;

import bs.a;

/* compiled from: HomeStoreResponse.kt */
public final class StoreTTL {
    private final long insertTimeInMillis;
    private final long ttl;

    public StoreTTL(long j, long j11) {
        this.insertTimeInMillis = j;
        this.ttl = j11;
    }

    public static /* synthetic */ StoreTTL copy$default(StoreTTL storeTTL, long j, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j = storeTTL.insertTimeInMillis;
        }
        if ((i11 & 2) != 0) {
            j11 = storeTTL.ttl;
        }
        return storeTTL.copy(j, j11);
    }

    public final long component1() {
        return this.insertTimeInMillis;
    }

    public final long component2() {
        return this.ttl;
    }

    public final StoreTTL copy(long j, long j11) {
        return new StoreTTL(j, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreTTL)) {
            return false;
        }
        StoreTTL storeTTL = (StoreTTL) obj;
        return this.insertTimeInMillis == storeTTL.insertTimeInMillis && this.ttl == storeTTL.ttl;
    }

    public final long getInsertTimeInMillis() {
        return this.insertTimeInMillis;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        return (a.a(this.insertTimeInMillis) * 31) + a.a(this.ttl);
    }

    public String toString() {
        return "StoreTTL(insertTimeInMillis=" + this.insertTimeInMillis + ", ttl=" + this.ttl + ')';
    }
}

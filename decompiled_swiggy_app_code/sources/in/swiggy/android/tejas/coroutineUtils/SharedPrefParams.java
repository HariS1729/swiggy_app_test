package in.swiggy.android.tejas.coroutineUtils;

import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ISharedPrefDataSource.kt */
public final class SharedPrefParams<T> {
    private final T defaultValue;
    private final String key;

    public SharedPrefParams(String str, T t) {
        p.j(str, HttpRequest.HEADER_KEY);
        this.key = str;
        this.defaultValue = t;
    }

    public static /* synthetic */ SharedPrefParams copy$default(SharedPrefParams sharedPrefParams, String str, T t, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sharedPrefParams.key;
        }
        if ((i11 & 2) != 0) {
            t = sharedPrefParams.defaultValue;
        }
        return sharedPrefParams.copy(str, t);
    }

    public final String component1() {
        return this.key;
    }

    public final T component2() {
        return this.defaultValue;
    }

    public final SharedPrefParams<T> copy(String str, T t) {
        p.j(str, HttpRequest.HEADER_KEY);
        return new SharedPrefParams<>(str, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedPrefParams)) {
            return false;
        }
        SharedPrefParams sharedPrefParams = (SharedPrefParams) obj;
        return p.e(this.key, sharedPrefParams.key) && p.e(this.defaultValue, sharedPrefParams.defaultValue);
    }

    public final T getDefaultValue() {
        return this.defaultValue;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        T t = this.defaultValue;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "SharedPrefParams(key=" + this.key + ", defaultValue=" + this.defaultValue + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedPrefParams(String str, Object obj, int i11, i iVar) {
        this(str, (i11 & 2) != 0 ? null : obj);
    }
}

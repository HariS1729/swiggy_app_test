package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: Lazy.android.kt */
final class DefaultLazyKey implements Parcelable {
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f4103b = new b((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f4104a;

    /* compiled from: Lazy.android.kt */
    public static final class a implements Parcelable.Creator<DefaultLazyKey> {
        a() {
        }

        /* renamed from: a */
        public DefaultLazyKey createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new DefaultLazyKey(parcel.readInt());
        }

        /* renamed from: b */
        public DefaultLazyKey[] newArray(int i11) {
            return new DefaultLazyKey[i11];
        }
    }

    /* compiled from: Lazy.android.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    public DefaultLazyKey(int i11) {
        this.f4104a = i11;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f4104a == ((DefaultLazyKey) obj).f4104a;
    }

    public int hashCode() {
        return this.f4104a;
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f4104a + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "parcel");
        parcel.writeInt(this.f4104a);
    }
}

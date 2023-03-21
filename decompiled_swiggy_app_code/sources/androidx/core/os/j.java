package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* compiled from: ParcelableCompat */
public final class j {

    /* compiled from: ParcelableCompat */
    static class a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* renamed from: a  reason: collision with root package name */
        private final k<T> f9312a;

        a(k<T> kVar) {
            this.f9312a = kVar;
        }

        public T createFromParcel(Parcel parcel) {
            return this.f9312a.createFromParcel(parcel, (ClassLoader) null);
        }

        public T[] newArray(int i11) {
            return this.f9312a.newArray(i11);
        }

        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f9312a.createFromParcel(parcel, classLoader);
        }
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> a(k<T> kVar) {
        return new a(kVar);
    }
}

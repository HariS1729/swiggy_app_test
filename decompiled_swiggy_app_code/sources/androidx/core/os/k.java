package androidx.core.os;

import android.os.Parcel;

@Deprecated
/* compiled from: ParcelableCompatCreatorCallbacks */
public interface k<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i11);
}

package androidx.slice;

import android.os.Parcelable;
import androidx.slice.SliceItemHolder;
import androidx.versionedparcelable.VersionedParcel;
import z3.b;

public final class SliceItemHolderParcelizer {
    private static SliceItemHolder.b sBuilder = new SliceItemHolder.b();

    public static SliceItemHolder read(VersionedParcel versionedParcel) {
        SliceItemHolder a11 = sBuilder.a();
        a11.f11721a = versionedParcel.C(a11.f11721a, 1);
        a11.f11722b = versionedParcel.w(a11.f11722b, 2);
        a11.f11724d = versionedParcel.z(a11.f11724d, 3);
        a11.f11725e = versionedParcel.s(a11.f11725e, 4);
        a11.f11726f = versionedParcel.u(a11.f11726f, 5);
        return a11;
    }

    public static void write(SliceItemHolder sliceItemHolder, VersionedParcel versionedParcel) {
        versionedParcel.E(true, true);
        b bVar = sliceItemHolder.f11721a;
        if (bVar != null) {
            versionedParcel.Z(bVar, 1);
        }
        Parcelable parcelable = sliceItemHolder.f11722b;
        if (parcelable != null) {
            versionedParcel.S(parcelable, 2);
        }
        String str = sliceItemHolder.f11724d;
        if (str != null) {
            versionedParcel.V(str, 3);
        }
        int i11 = sliceItemHolder.f11725e;
        if (i11 != 0) {
            versionedParcel.O(i11, 4);
        }
        long j = sliceItemHolder.f11726f;
        if (0 != j) {
            versionedParcel.Q(j, 5);
        }
    }
}

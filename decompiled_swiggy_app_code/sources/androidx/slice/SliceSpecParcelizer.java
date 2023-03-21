package androidx.slice;

import androidx.versionedparcelable.VersionedParcel;

public final class SliceSpecParcelizer {
    public static SliceSpec read(VersionedParcel versionedParcel) {
        SliceSpec sliceSpec = new SliceSpec();
        sliceSpec.f11729a = versionedParcel.z(sliceSpec.f11729a, 1);
        sliceSpec.f11730b = versionedParcel.s(sliceSpec.f11730b, 2);
        return sliceSpec;
    }

    public static void write(SliceSpec sliceSpec, VersionedParcel versionedParcel) {
        versionedParcel.E(true, false);
        versionedParcel.V(sliceSpec.f11729a, 1);
        int i11 = sliceSpec.f11730b;
        if (1 != i11) {
            versionedParcel.O(i11, 2);
        }
    }
}

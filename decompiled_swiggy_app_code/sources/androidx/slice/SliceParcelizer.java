package androidx.slice;

import androidx.versionedparcelable.VersionedParcel;
import java.util.Arrays;

public final class SliceParcelizer {
    public static Slice read(VersionedParcel versionedParcel) {
        Slice slice = new Slice();
        slice.f11705a = (SliceSpec) versionedParcel.C(slice.f11705a, 1);
        slice.f11706b = (SliceItem[]) versionedParcel.i(slice.f11706b, 2);
        slice.f11707c = (String[]) versionedParcel.i(slice.f11707c, 3);
        slice.f11708d = versionedParcel.z(slice.f11708d, 4);
        slice.h();
        return slice;
    }

    public static void write(Slice slice, VersionedParcel versionedParcel) {
        versionedParcel.E(true, false);
        slice.i(versionedParcel.g());
        SliceSpec sliceSpec = slice.f11705a;
        if (sliceSpec != null) {
            versionedParcel.Z(sliceSpec, 1);
        }
        if (!Arrays.equals(Slice.f11704f, slice.f11706b)) {
            versionedParcel.G(slice.f11706b, 2);
        }
        if (!Arrays.equals(Slice.f11703e, slice.f11707c)) {
            versionedParcel.G(slice.f11707c, 3);
        }
        String str = slice.f11708d;
        if (str != null) {
            versionedParcel.V(str, 4);
        }
    }
}

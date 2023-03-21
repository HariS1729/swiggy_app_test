package androidx.slice;

import androidx.versionedparcelable.VersionedParcel;
import java.util.Arrays;

public final class SliceItemParcelizer {
    public static SliceItem read(VersionedParcel versionedParcel) {
        SliceItem sliceItem = new SliceItem();
        sliceItem.f11714a = (String[]) versionedParcel.i(sliceItem.f11714a, 1);
        sliceItem.f11715b = versionedParcel.z(sliceItem.f11715b, 2);
        sliceItem.f11716c = versionedParcel.z(sliceItem.f11716c, 3);
        sliceItem.f11718e = (SliceItemHolder) versionedParcel.C(sliceItem.f11718e, 4);
        sliceItem.n();
        return sliceItem;
    }

    public static void write(SliceItem sliceItem, VersionedParcel versionedParcel) {
        versionedParcel.E(true, true);
        sliceItem.o(versionedParcel.g());
        if (!Arrays.equals(Slice.f11703e, sliceItem.f11714a)) {
            versionedParcel.G(sliceItem.f11714a, 1);
        }
        if (!"text".equals(sliceItem.f11715b)) {
            versionedParcel.V(sliceItem.f11715b, 2);
        }
        String str = sliceItem.f11716c;
        if (str != null) {
            versionedParcel.V(str, 3);
        }
        versionedParcel.Z(sliceItem.f11718e, 4);
    }
}

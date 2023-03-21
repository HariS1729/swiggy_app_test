package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f9244a = versionedParcel.s(iconCompat.f9244a, 1);
        iconCompat.f9246c = versionedParcel.m(iconCompat.f9246c, 2);
        iconCompat.f9247d = versionedParcel.w(iconCompat.f9247d, 3);
        iconCompat.f9248e = versionedParcel.s(iconCompat.f9248e, 4);
        iconCompat.f9249f = versionedParcel.s(iconCompat.f9249f, 5);
        iconCompat.f9250g = (ColorStateList) versionedParcel.w(iconCompat.f9250g, 6);
        iconCompat.f9252i = versionedParcel.z(iconCompat.f9252i, 7);
        iconCompat.j = versionedParcel.z(iconCompat.j, 8);
        iconCompat.u();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.E(true, true);
        iconCompat.v(versionedParcel.g());
        int i11 = iconCompat.f9244a;
        if (-1 != i11) {
            versionedParcel.O(i11, 1);
        }
        byte[] bArr = iconCompat.f9246c;
        if (bArr != null) {
            versionedParcel.K(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f9247d;
        if (parcelable != null) {
            versionedParcel.S(parcelable, 3);
        }
        int i12 = iconCompat.f9248e;
        if (i12 != 0) {
            versionedParcel.O(i12, 4);
        }
        int i13 = iconCompat.f9249f;
        if (i13 != 0) {
            versionedParcel.O(i13, 5);
        }
        ColorStateList colorStateList = iconCompat.f9250g;
        if (colorStateList != null) {
            versionedParcel.S(colorStateList, 6);
        }
        String str = iconCompat.f9252i;
        if (str != null) {
            versionedParcel.V(str, 7);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            versionedParcel.V(str2, 8);
        }
    }
}

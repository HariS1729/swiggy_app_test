package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f8989a = (IconCompat) versionedParcel.C(remoteActionCompat.f8989a, 1);
        remoteActionCompat.f8990b = versionedParcel.o(remoteActionCompat.f8990b, 2);
        remoteActionCompat.f8991c = versionedParcel.o(remoteActionCompat.f8991c, 3);
        remoteActionCompat.f8992d = (PendingIntent) versionedParcel.w(remoteActionCompat.f8992d, 4);
        remoteActionCompat.f8993e = versionedParcel.k(remoteActionCompat.f8993e, 5);
        remoteActionCompat.f8994f = versionedParcel.k(remoteActionCompat.f8994f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.E(false, false);
        versionedParcel.Z(remoteActionCompat.f8989a, 1);
        versionedParcel.M(remoteActionCompat.f8990b, 2);
        versionedParcel.M(remoteActionCompat.f8991c, 3);
        versionedParcel.S(remoteActionCompat.f8992d, 4);
        versionedParcel.I(remoteActionCompat.f8993e, 5);
        versionedParcel.I(remoteActionCompat.f8994f, 6);
    }
}

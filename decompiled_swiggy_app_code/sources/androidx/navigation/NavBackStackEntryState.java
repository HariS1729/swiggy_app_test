package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final UUID f10855a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10856b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f10857c;

    /* renamed from: d  reason: collision with root package name */
    private final Bundle f10858d;

    class a implements Parcelable.Creator<NavBackStackEntryState> {
        a() {
        }

        /* renamed from: a */
        public NavBackStackEntryState createFromParcel(Parcel parcel) {
            return new NavBackStackEntryState(parcel);
        }

        /* renamed from: b */
        public NavBackStackEntryState[] newArray(int i11) {
            return new NavBackStackEntryState[i11];
        }
    }

    NavBackStackEntryState(h hVar) {
        this.f10855a = hVar.f10912f;
        this.f10856b = hVar.b().l();
        this.f10857c = hVar.a();
        Bundle bundle = new Bundle();
        this.f10858d = bundle;
        hVar.g(bundle);
    }

    /* access modifiers changed from: package-private */
    public Bundle a() {
        return this.f10857c;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f10856b;
    }

    /* access modifiers changed from: package-private */
    public Bundle c() {
        return this.f10858d;
    }

    /* access modifiers changed from: package-private */
    public UUID d() {
        return this.f10855a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f10855a.toString());
        parcel.writeInt(this.f10856b);
        parcel.writeBundle(this.f10857c);
        parcel.writeBundle(this.f10858d);
    }

    NavBackStackEntryState(Parcel parcel) {
        this.f10855a = UUID.fromString(parcel.readString());
        this.f10856b = parcel.readInt();
        this.f10857c = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        this.f10858d = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
    }
}

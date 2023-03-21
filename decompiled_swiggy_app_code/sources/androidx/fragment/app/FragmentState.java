package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final String f10379a;

    /* renamed from: b  reason: collision with root package name */
    final String f10380b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f10381c;

    /* renamed from: d  reason: collision with root package name */
    final int f10382d;

    /* renamed from: e  reason: collision with root package name */
    final int f10383e;

    /* renamed from: f  reason: collision with root package name */
    final String f10384f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f10385g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f10386h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f10387i;
    final Bundle j;
    final boolean k;

    /* renamed from: l  reason: collision with root package name */
    final int f10388l;

    /* renamed from: m  reason: collision with root package name */
    Bundle f10389m;

    class a implements Parcelable.Creator<FragmentState> {
        a() {
        }

        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* renamed from: b */
        public FragmentState[] newArray(int i11) {
            return new FragmentState[i11];
        }
    }

    FragmentState(Fragment fragment) {
        this.f10379a = fragment.getClass().getName();
        this.f10380b = fragment.mWho;
        this.f10381c = fragment.mFromLayout;
        this.f10382d = fragment.mFragmentId;
        this.f10383e = fragment.mContainerId;
        this.f10384f = fragment.mTag;
        this.f10385g = fragment.mRetainInstance;
        this.f10386h = fragment.mRemoving;
        this.f10387i = fragment.mDetached;
        this.j = fragment.mArguments;
        this.k = fragment.mHidden;
        this.f10388l = fragment.mMaxState.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f10379a);
        sb2.append(" (");
        sb2.append(this.f10380b);
        sb2.append(")}:");
        if (this.f10381c) {
            sb2.append(" fromLayout");
        }
        if (this.f10383e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f10383e));
        }
        String str = this.f10384f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f10384f);
        }
        if (this.f10385g) {
            sb2.append(" retainInstance");
        }
        if (this.f10386h) {
            sb2.append(" removing");
        }
        if (this.f10387i) {
            sb2.append(" detached");
        }
        if (this.k) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f10379a);
        parcel.writeString(this.f10380b);
        parcel.writeInt(this.f10381c ? 1 : 0);
        parcel.writeInt(this.f10382d);
        parcel.writeInt(this.f10383e);
        parcel.writeString(this.f10384f);
        parcel.writeInt(this.f10385g ? 1 : 0);
        parcel.writeInt(this.f10386h ? 1 : 0);
        parcel.writeInt(this.f10387i ? 1 : 0);
        parcel.writeBundle(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.f10389m);
        parcel.writeInt(this.f10388l);
    }

    FragmentState(Parcel parcel) {
        this.f10379a = parcel.readString();
        this.f10380b = parcel.readString();
        boolean z11 = true;
        this.f10381c = parcel.readInt() != 0;
        this.f10382d = parcel.readInt();
        this.f10383e = parcel.readInt();
        this.f10384f = parcel.readString();
        this.f10385g = parcel.readInt() != 0;
        this.f10386h = parcel.readInt() != 0;
        this.f10387i = parcel.readInt() != 0;
        this.j = parcel.readBundle();
        this.k = parcel.readInt() == 0 ? false : z11;
        this.f10389m = parcel.readBundle();
        this.f10388l = parcel.readInt();
    }
}

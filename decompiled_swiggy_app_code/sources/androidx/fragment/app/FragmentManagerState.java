package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList<FragmentState> f10371a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<String> f10372b;

    /* renamed from: c  reason: collision with root package name */
    BackStackState[] f10373c;

    /* renamed from: d  reason: collision with root package name */
    int f10374d;

    /* renamed from: e  reason: collision with root package name */
    String f10375e = null;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<String> f10376f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    ArrayList<Bundle> f10377g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    ArrayList<FragmentManager.LaunchedFragmentInfo> f10378h;

    class a implements Parcelable.Creator<FragmentManagerState> {
        a() {
        }

        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* renamed from: b */
        public FragmentManagerState[] newArray(int i11) {
            return new FragmentManagerState[i11];
        }
    }

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeTypedList(this.f10371a);
        parcel.writeStringList(this.f10372b);
        parcel.writeTypedArray(this.f10373c, i11);
        parcel.writeInt(this.f10374d);
        parcel.writeString(this.f10375e);
        parcel.writeStringList(this.f10376f);
        parcel.writeTypedList(this.f10377g);
        parcel.writeTypedList(this.f10378h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f10371a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f10372b = parcel.createStringArrayList();
        this.f10373c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f10374d = parcel.readInt();
        this.f10375e = parcel.readString();
        this.f10376f = parcel.createStringArrayList();
        this.f10377g = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f10378h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}

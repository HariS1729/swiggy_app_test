package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableInt extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private int f9684b;

    class a implements Parcelable.Creator<ObservableInt> {
        a() {
        }

        /* renamed from: a */
        public ObservableInt createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        /* renamed from: b */
        public ObservableInt[] newArray(int i11) {
            return new ObservableInt[i11];
        }
    }

    public ObservableInt(int i11) {
        this.f9684b = i11;
    }

    public int describeContents() {
        return 0;
    }

    public int g() {
        return this.f9684b;
    }

    public void j(int i11) {
        if (i11 != this.f9684b) {
            this.f9684b = i11;
            d();
        }
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f9684b);
    }

    public ObservableInt() {
    }

    public ObservableInt(k... kVarArr) {
        super(kVarArr);
    }
}

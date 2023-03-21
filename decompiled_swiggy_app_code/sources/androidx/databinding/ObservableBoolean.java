package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableBoolean extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private boolean f9680b;

    class a implements Parcelable.Creator<ObservableBoolean> {
        a() {
        }

        /* renamed from: a */
        public ObservableBoolean createFromParcel(Parcel parcel) {
            boolean z11 = true;
            if (parcel.readInt() != 1) {
                z11 = false;
            }
            return new ObservableBoolean(z11);
        }

        /* renamed from: b */
        public ObservableBoolean[] newArray(int i11) {
            return new ObservableBoolean[i11];
        }
    }

    public ObservableBoolean(boolean z11) {
        this.f9680b = z11;
    }

    public int describeContents() {
        return 0;
    }

    public boolean g() {
        return this.f9680b;
    }

    public void j(boolean z11) {
        if (z11 != this.f9680b) {
            this.f9680b = z11;
            d();
        }
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f9680b ? 1 : 0);
    }

    public ObservableBoolean() {
    }

    public ObservableBoolean(k... kVarArr) {
        super(kVarArr);
    }
}

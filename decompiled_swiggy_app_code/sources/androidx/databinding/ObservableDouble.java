package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableDouble extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private double f9681b;

    class a implements Parcelable.Creator<ObservableDouble> {
        a() {
        }

        /* renamed from: a */
        public ObservableDouble createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        /* renamed from: b */
        public ObservableDouble[] newArray(int i11) {
            return new ObservableDouble[i11];
        }
    }

    public ObservableDouble(double d11) {
        this.f9681b = d11;
    }

    public int describeContents() {
        return 0;
    }

    public double g() {
        return this.f9681b;
    }

    public void j(double d11) {
        if (d11 != this.f9681b) {
            this.f9681b = d11;
            d();
        }
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeDouble(this.f9681b);
    }

    public ObservableDouble() {
    }
}

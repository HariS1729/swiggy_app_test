package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableFloat extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private float f9683b;

    class a implements Parcelable.Creator<ObservableFloat> {
        a() {
        }

        /* renamed from: a */
        public ObservableFloat createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        /* renamed from: b */
        public ObservableFloat[] newArray(int i11) {
            return new ObservableFloat[i11];
        }
    }

    public ObservableFloat(float f11) {
        this.f9683b = f11;
    }

    public int describeContents() {
        return 0;
    }

    public float g() {
        return this.f9683b;
    }

    public void j(float f11) {
        if (f11 != this.f9683b) {
            this.f9683b = f11;
            d();
        }
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeFloat(this.f9683b);
    }

    public ObservableFloat() {
    }
}

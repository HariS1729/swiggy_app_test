package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableLong extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private long f9685b;

    class a implements Parcelable.Creator<ObservableLong> {
        a() {
        }

        /* renamed from: a */
        public ObservableLong createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        /* renamed from: b */
        public ObservableLong[] newArray(int i11) {
            return new ObservableLong[i11];
        }
    }

    public ObservableLong(long j) {
        this.f9685b = j;
    }

    public int describeContents() {
        return 0;
    }

    public long g() {
        return this.f9685b;
    }

    public void j(long j) {
        if (j != this.f9685b) {
            this.f9685b = j;
            d();
        }
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f9685b);
    }

    public ObservableLong() {
    }
}

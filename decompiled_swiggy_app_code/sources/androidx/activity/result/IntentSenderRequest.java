package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final IntentSender f1432a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f1433b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1434c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1435d;

    class a implements Parcelable.Creator<IntentSenderRequest> {
        a() {
        }

        /* renamed from: a */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        /* renamed from: b */
        public IntentSenderRequest[] newArray(int i11) {
            return new IntentSenderRequest[i11];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private IntentSender f1436a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f1437b;

        /* renamed from: c  reason: collision with root package name */
        private int f1438c;

        /* renamed from: d  reason: collision with root package name */
        private int f1439d;

        public b(IntentSender intentSender) {
            this.f1436a = intentSender;
        }

        public IntentSenderRequest a() {
            return new IntentSenderRequest(this.f1436a, this.f1437b, this.f1438c, this.f1439d);
        }

        public b b(Intent intent) {
            this.f1437b = intent;
            return this;
        }

        public b c(int i11, int i12) {
            this.f1439d = i11;
            this.f1438c = i12;
            return this;
        }
    }

    IntentSenderRequest(IntentSender intentSender, Intent intent, int i11, int i12) {
        this.f1432a = intentSender;
        this.f1433b = intent;
        this.f1434c = i11;
        this.f1435d = i12;
    }

    public Intent a() {
        return this.f1433b;
    }

    public int b() {
        return this.f1434c;
    }

    public int c() {
        return this.f1435d;
    }

    public IntentSender d() {
        return this.f1432a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f1432a, i11);
        parcel.writeParcelable(this.f1433b, i11);
        parcel.writeInt(this.f1434c);
        parcel.writeInt(this.f1435d);
    }

    IntentSenderRequest(Parcel parcel) {
        this.f1432a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f1433b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f1434c = parcel.readInt();
        this.f1435d = parcel.readInt();
    }
}

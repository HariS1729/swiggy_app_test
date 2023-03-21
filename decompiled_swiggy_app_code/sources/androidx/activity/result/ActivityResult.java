package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f1408a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f1409b;

    class a implements Parcelable.Creator<ActivityResult> {
        a() {
        }

        /* renamed from: a */
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        /* renamed from: b */
        public ActivityResult[] newArray(int i11) {
            return new ActivityResult[i11];
        }
    }

    public ActivityResult(int i11, Intent intent) {
        this.f1408a = i11;
        this.f1409b = intent;
    }

    public static String c(int i11) {
        return i11 != -1 ? i11 != 0 ? String.valueOf(i11) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f1409b;
    }

    public int b() {
        return this.f1408a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f1408a) + ", data=" + this.f1409b + '}';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f1408a);
        parcel.writeInt(this.f1409b == null ? 0 : 1);
        Intent intent = this.f1409b;
        if (intent != null) {
            intent.writeToParcel(parcel, i11);
        }
    }

    ActivityResult(Parcel parcel) {
        this.f1408a = parcel.readInt();
        this.f1409b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}

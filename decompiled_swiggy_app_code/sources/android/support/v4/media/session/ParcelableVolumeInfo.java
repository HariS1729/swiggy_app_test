package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f1330a;

    /* renamed from: b  reason: collision with root package name */
    public int f1331b;

    /* renamed from: c  reason: collision with root package name */
    public int f1332c;

    /* renamed from: d  reason: collision with root package name */
    public int f1333d;

    /* renamed from: e  reason: collision with root package name */
    public int f1334e;

    class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i11) {
            return new ParcelableVolumeInfo[i11];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f1330a = parcel.readInt();
        this.f1332c = parcel.readInt();
        this.f1333d = parcel.readInt();
        this.f1334e = parcel.readInt();
        this.f1331b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f1330a);
        parcel.writeInt(this.f1332c);
        parcel.writeInt(this.f1333d);
        parcel.writeInt(this.f1334e);
        parcel.writeInt(this.f1331b);
    }
}

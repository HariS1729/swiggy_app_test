package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f1289a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaDescriptionCompat f1290b;

    class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        a() {
        }

        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i11) {
            return new MediaBrowserCompat$MediaItem[i11];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f1289a = parcel.readInt();
        this.f1290b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f1289a + ", mDescription=" + this.f1290b + '}';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f1289a);
        this.f1290b.writeToParcel(parcel, i11);
    }
}

package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int f1335a;

    /* renamed from: b  reason: collision with root package name */
    final long f1336b;

    /* renamed from: c  reason: collision with root package name */
    final long f1337c;

    /* renamed from: d  reason: collision with root package name */
    final float f1338d;

    /* renamed from: e  reason: collision with root package name */
    final long f1339e;

    /* renamed from: f  reason: collision with root package name */
    final int f1340f;

    /* renamed from: g  reason: collision with root package name */
    final CharSequence f1341g;

    /* renamed from: h  reason: collision with root package name */
    final long f1342h;

    /* renamed from: i  reason: collision with root package name */
    List<CustomAction> f1343i;
    final long j;
    final Bundle k;

    /* renamed from: l  reason: collision with root package name */
    private PlaybackState f1344l;

    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i11) {
            return new PlaybackStateCompat[i11];
        }
    }

    private static class b {
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i11) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i11);
        }

        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static void s(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        static void t(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        static void u(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void x(PlaybackState.Builder builder, int i11, long j, float f11, long j11) {
            builder.setState(i11, j, f11, j11);
        }
    }

    private static class c {
        static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i11, long j11, long j12, float f11, long j13, int i12, CharSequence charSequence, long j14, List<CustomAction> list, long j15, Bundle bundle) {
        this.f1335a = i11;
        this.f1336b = j11;
        this.f1337c = j12;
        this.f1338d = f11;
        this.f1339e = j13;
        this.f1340f = i12;
        this.f1341g = charSequence;
        this.f1342h = j14;
        this.f1343i = new ArrayList(list);
        this.j = j15;
        this.k = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j11 = b.j(playbackState);
        if (j11 != null) {
            ArrayList arrayList2 = new ArrayList(j11.size());
            for (PlaybackState.CustomAction a11 : j11) {
                arrayList2.add(CustomAction.a(a11));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = c.a(playbackState);
            MediaSessionCompat.a(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), bundle);
        playbackStateCompat.f1344l = playbackState;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f1335a + ", position=" + this.f1336b + ", buffered position=" + this.f1337c + ", speed=" + this.f1338d + ", updated=" + this.f1342h + ", actions=" + this.f1339e + ", error code=" + this.f1340f + ", error message=" + this.f1341g + ", custom actions=" + this.f1343i + ", active item id=" + this.j + "}";
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f1335a);
        parcel.writeLong(this.f1336b);
        parcel.writeFloat(this.f1338d);
        parcel.writeLong(this.f1342h);
        parcel.writeLong(this.f1337c);
        parcel.writeLong(this.f1339e);
        TextUtils.writeToParcel(this.f1341g, parcel, i11);
        parcel.writeTypedList(this.f1343i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f1340f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f1345a;

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f1346b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1347c;

        /* renamed from: d  reason: collision with root package name */
        private final Bundle f1348d;

        /* renamed from: e  reason: collision with root package name */
        private PlaybackState.CustomAction f1349e;

        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i11) {
                return new CustomAction[i11];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i11, Bundle bundle) {
            this.f1345a = str;
            this.f1346b = charSequence;
            this.f1347c = i11;
            this.f1348d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle l11 = b.l(customAction);
            MediaSessionCompat.a(l11);
            CustomAction customAction2 = new CustomAction(b.f(customAction), b.o(customAction), b.m(customAction), l11);
            customAction2.f1349e = customAction;
            return customAction2;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f1346b + ", mIcon=" + this.f1347c + ", mExtras=" + this.f1348d;
        }

        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f1345a);
            TextUtils.writeToParcel(this.f1346b, parcel, i11);
            parcel.writeInt(this.f1347c);
            parcel.writeBundle(this.f1348d);
        }

        CustomAction(Parcel parcel) {
            this.f1345a = parcel.readString();
            this.f1346b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1347c = parcel.readInt();
            this.f1348d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f1335a = parcel.readInt();
        this.f1336b = parcel.readLong();
        this.f1338d = parcel.readFloat();
        this.f1342h = parcel.readLong();
        this.f1337c = parcel.readLong();
        this.f1339e = parcel.readLong();
        this.f1341g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1343i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f1340f = parcel.readInt();
    }
}

package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.s;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int[] f10268a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<String> f10269b;

    /* renamed from: c  reason: collision with root package name */
    final int[] f10270c;

    /* renamed from: d  reason: collision with root package name */
    final int[] f10271d;

    /* renamed from: e  reason: collision with root package name */
    final int f10272e;

    /* renamed from: f  reason: collision with root package name */
    final String f10273f;

    /* renamed from: g  reason: collision with root package name */
    final int f10274g;

    /* renamed from: h  reason: collision with root package name */
    final int f10275h;

    /* renamed from: i  reason: collision with root package name */
    final CharSequence f10276i;
    final int j;
    final CharSequence k;

    /* renamed from: l  reason: collision with root package name */
    final ArrayList<String> f10277l;

    /* renamed from: m  reason: collision with root package name */
    final ArrayList<String> f10278m;
    final boolean n;

    class a implements Parcelable.Creator<BackStackState> {
        a() {
        }

        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: b */
        public BackStackState[] newArray(int i11) {
            return new BackStackState[i11];
        }
    }

    public BackStackState(a aVar) {
        int size = aVar.f10516c.size();
        this.f10268a = new int[(size * 5)];
        if (aVar.f10522i) {
            this.f10269b = new ArrayList<>(size);
            this.f10270c = new int[size];
            this.f10271d = new int[size];
            int i11 = 0;
            int i12 = 0;
            while (i11 < size) {
                s.a aVar2 = aVar.f10516c.get(i11);
                int i13 = i12 + 1;
                this.f10268a[i12] = aVar2.f10529a;
                ArrayList<String> arrayList = this.f10269b;
                Fragment fragment = aVar2.f10530b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f10268a;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f10531c;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f10532d;
                int i16 = i15 + 1;
                iArr[i15] = aVar2.f10533e;
                iArr[i16] = aVar2.f10534f;
                this.f10270c[i11] = aVar2.f10535g.ordinal();
                this.f10271d[i11] = aVar2.f10536h.ordinal();
                i11++;
                i12 = i16 + 1;
            }
            this.f10272e = aVar.f10521h;
            this.f10273f = aVar.k;
            this.f10274g = aVar.v;
            this.f10275h = aVar.f10523l;
            this.f10276i = aVar.f10524m;
            this.j = aVar.n;
            this.k = aVar.f10525o;
            this.f10277l = aVar.f10526p;
            this.f10278m = aVar.q;
            this.n = aVar.f10527r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public a a(FragmentManager fragmentManager) {
        a aVar = new a(fragmentManager);
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.f10268a.length) {
            s.a aVar2 = new s.a();
            int i13 = i11 + 1;
            aVar2.f10529a = this.f10268a[i11];
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i12 + " base fragment #" + this.f10268a[i13]);
            }
            String str = this.f10269b.get(i12);
            if (str != null) {
                aVar2.f10530b = fragmentManager.i0(str);
            } else {
                aVar2.f10530b = null;
            }
            aVar2.f10535g = Lifecycle.State.values()[this.f10270c[i12]];
            aVar2.f10536h = Lifecycle.State.values()[this.f10271d[i12]];
            int[] iArr = this.f10268a;
            int i14 = i13 + 1;
            int i15 = iArr[i13];
            aVar2.f10531c = i15;
            int i16 = i14 + 1;
            int i17 = iArr[i14];
            aVar2.f10532d = i17;
            int i18 = i16 + 1;
            int i19 = iArr[i16];
            aVar2.f10533e = i19;
            int i21 = iArr[i18];
            aVar2.f10534f = i21;
            aVar.f10517d = i15;
            aVar.f10518e = i17;
            aVar.f10519f = i19;
            aVar.f10520g = i21;
            aVar.f(aVar2);
            i12++;
            i11 = i18 + 1;
        }
        aVar.f10521h = this.f10272e;
        aVar.k = this.f10273f;
        aVar.v = this.f10274g;
        aVar.f10522i = true;
        aVar.f10523l = this.f10275h;
        aVar.f10524m = this.f10276i;
        aVar.n = this.j;
        aVar.f10525o = this.k;
        aVar.f10526p = this.f10277l;
        aVar.q = this.f10278m;
        aVar.f10527r = this.n;
        aVar.D(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeIntArray(this.f10268a);
        parcel.writeStringList(this.f10269b);
        parcel.writeIntArray(this.f10270c);
        parcel.writeIntArray(this.f10271d);
        parcel.writeInt(this.f10272e);
        parcel.writeString(this.f10273f);
        parcel.writeInt(this.f10274g);
        parcel.writeInt(this.f10275h);
        TextUtils.writeToParcel(this.f10276i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.f10277l);
        parcel.writeStringList(this.f10278m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f10268a = parcel.createIntArray();
        this.f10269b = parcel.createStringArrayList();
        this.f10270c = parcel.createIntArray();
        this.f10271d = parcel.createIntArray();
        this.f10272e = parcel.readInt();
        this.f10273f = parcel.readString();
        this.f10274g = parcel.readInt();
        this.f10275h = parcel.readInt();
        this.f10276i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f10277l = parcel.createStringArrayList();
        this.f10278m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}

package androidx.versionedparcelable;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel */
class a extends VersionedParcel {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f12123d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f12124e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12125f;

    /* renamed from: g  reason: collision with root package name */
    private final int f12126g;

    /* renamed from: h  reason: collision with root package name */
    private final String f12127h;

    /* renamed from: i  reason: collision with root package name */
    private int f12128i;
    private int j;
    private int k;

    a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    public IBinder A() {
        return this.f12124e.readStrongBinder();
    }

    public void D(int i11) {
        a();
        this.f12128i = i11;
        this.f12123d.put(i11, this.f12124e.dataPosition());
        N(0);
        N(i11);
    }

    public void H(boolean z11) {
        this.f12124e.writeInt(z11 ? 1 : 0);
    }

    public void J(byte[] bArr) {
        if (bArr != null) {
            this.f12124e.writeInt(bArr.length);
            this.f12124e.writeByteArray(bArr);
            return;
        }
        this.f12124e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    public void L(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f12124e, 0);
    }

    public void N(int i11) {
        this.f12124e.writeInt(i11);
    }

    public void P(long j11) {
        this.f12124e.writeLong(j11);
    }

    public void R(Parcelable parcelable) {
        this.f12124e.writeParcelable(parcelable, 0);
    }

    public void U(String str) {
        this.f12124e.writeString(str);
    }

    public void W(IBinder iBinder) {
        this.f12124e.writeStrongBinder(iBinder);
    }

    public void a() {
        int i11 = this.f12128i;
        if (i11 >= 0) {
            int i12 = this.f12123d.get(i11);
            int dataPosition = this.f12124e.dataPosition();
            this.f12124e.setDataPosition(i12);
            this.f12124e.writeInt(dataPosition - i12);
            this.f12124e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    public VersionedParcel b() {
        Parcel parcel = this.f12124e;
        int dataPosition = parcel.dataPosition();
        int i11 = this.j;
        if (i11 == this.f12125f) {
            i11 = this.f12126g;
        }
        int i12 = i11;
        return new a(parcel, dataPosition, i12, this.f12127h + "  ", this.f12119a, this.f12120b, this.f12121c);
    }

    public boolean j() {
        return this.f12124e.readInt() != 0;
    }

    public byte[] l() {
        int readInt = this.f12124e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f12124e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public CharSequence n() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f12124e);
    }

    public boolean p(int i11) {
        while (this.j < this.f12126g) {
            int i12 = this.k;
            if (i12 == i11) {
                return true;
            }
            if (String.valueOf(i12).compareTo(String.valueOf(i11)) > 0) {
                return false;
            }
            this.f12124e.setDataPosition(this.j);
            int readInt = this.f12124e.readInt();
            this.k = this.f12124e.readInt();
            this.j += readInt;
        }
        if (this.k == i11) {
            return true;
        }
        return false;
    }

    public int r() {
        return this.f12124e.readInt();
    }

    public long t() {
        return this.f12124e.readLong();
    }

    public <T extends Parcelable> T v() {
        return this.f12124e.readParcelable(getClass().getClassLoader());
    }

    public String y() {
        return this.f12124e.readString();
    }

    private a(Parcel parcel, int i11, int i12, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f12123d = new SparseIntArray();
        this.f12128i = -1;
        this.k = -1;
        this.f12124e = parcel;
        this.f12125f = i11;
        this.f12126g = i12;
        this.j = i11;
        this.f12127h = str;
    }
}

package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import e0.a1;
import e0.y0;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: ParcelableSnapshotMutableState.kt */
public final class ParcelableSnapshotMutableState<T> extends y0<T> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final b f6014c = new b((i) null);

    /* compiled from: ParcelableSnapshotMutableState.kt */
    public static final class a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        a() {
        }

        /* renamed from: a */
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            a1 a1Var;
            p.j(parcel, "parcel");
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                a1Var = g.i();
            } else if (readInt == 1) {
                a1Var = g.o();
            } else if (readInt == 2) {
                a1Var = g.l();
            } else {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            return new ParcelableSnapshotMutableState<>(readValue, a1Var);
        }

        /* renamed from: c */
        public ParcelableSnapshotMutableState<Object>[] newArray(int i11) {
            return new ParcelableSnapshotMutableState[i11];
        }
    }

    /* compiled from: ParcelableSnapshotMutableState.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(T t, a1<T> a1Var) {
        super(t, a1Var);
        p.j(a1Var, HttpRequest.HEADER_POLICY);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i11) {
        int i12;
        p.j(parcel, "parcel");
        parcel.writeValue(getValue());
        a1 c11 = c();
        if (p.e(c11, g.i())) {
            i12 = 0;
        } else if (p.e(c11, g.o())) {
            i12 = 1;
        } else if (p.e(c11, g.l())) {
            i12 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i12);
    }
}

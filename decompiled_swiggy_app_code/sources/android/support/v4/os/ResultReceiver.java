package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.a;

@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final boolean f1361a = false;

    /* renamed from: b  reason: collision with root package name */
    final Handler f1362b = null;

    /* renamed from: c  reason: collision with root package name */
    a f1363c;

    class a implements Parcelable.Creator<ResultReceiver> {
        a() {
        }

        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: b */
        public ResultReceiver[] newArray(int i11) {
            return new ResultReceiver[i11];
        }
    }

    class b extends a.C0008a {
        b() {
        }

        public void t0(int i11, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f1362b;
            if (handler != null) {
                handler.post(new c(i11, bundle));
            } else {
                resultReceiver.a(i11, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final int f1365a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f1366b;

        c(int i11, Bundle bundle) {
            this.f1365a = i11;
            this.f1366b = bundle;
        }

        public void run() {
            ResultReceiver.this.a(this.f1365a, this.f1366b);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f1363c = a.C0008a.f(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    public void a(int i11, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i11) {
        synchronized (this) {
            if (this.f1363c == null) {
                this.f1363c = new b();
            }
            parcel.writeStrongBinder(this.f1363c.asBinder());
        }
    }
}

package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IMultiInstanceInvalidationCallback */
public interface t extends IInterface {

    /* compiled from: IMultiInstanceInvalidationCallback */
    public static abstract class a extends Binder implements t {

        /* renamed from: androidx.room.t$a$a  reason: collision with other inner class name */
        /* compiled from: IMultiInstanceInvalidationCallback */
        private static class C0081a implements t {

            /* renamed from: b  reason: collision with root package name */
            public static t f11613b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f11614a;

            C0081a(IBinder iBinder) {
                this.f11614a = iBinder;
            }

            public void A(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    if (this.f11614a.transact(1, obtain, (Parcel) null, 1) || a.u() == null) {
                        obtain.recycle();
                    } else {
                        a.u().A(strArr);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f11614a;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static t f(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof t)) {
                return new C0081a(iBinder);
            }
            return (t) queryLocalInterface;
        }

        public static t u() {
            return C0081a.f11613b;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                A(parcel.createStringArray());
                return true;
            } else if (i11 != 1598968902) {
                return super.onTransact(i11, parcel, parcel2, i12);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    void A(String[] strArr) throws RemoteException;
}

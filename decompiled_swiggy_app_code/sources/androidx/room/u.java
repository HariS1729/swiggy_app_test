package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.t;

/* compiled from: IMultiInstanceInvalidationService */
public interface u extends IInterface {

    /* compiled from: IMultiInstanceInvalidationService */
    public static abstract class a extends Binder implements u {

        /* renamed from: androidx.room.u$a$a  reason: collision with other inner class name */
        /* compiled from: IMultiInstanceInvalidationService */
        private static class C0082a implements u {

            /* renamed from: b  reason: collision with root package name */
            public static u f11622b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f11623a;

            C0082a(IBinder iBinder) {
                this.f11623a = iBinder;
            }

            public int W2(t tVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(tVar != null ? tVar.asBinder() : null);
                    obtain.writeString(str);
                    if (!this.f11623a.transact(1, obtain, obtain2, 0) && a.u() != null) {
                        return a.u().W2(tVar, str);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f11623a;
            }

            public void z2(int i11, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i11);
                    obtain.writeStringArray(strArr);
                    if (this.f11623a.transact(3, obtain, (Parcel) null, 1) || a.u() == null) {
                        obtain.recycle();
                    } else {
                        a.u().z2(i11, strArr);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static u f(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof u)) {
                return new C0082a(iBinder);
            }
            return (u) queryLocalInterface;
        }

        public static u u() {
            return C0082a.f11622b;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int W2 = W2(t.a.f(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(W2);
                return true;
            } else if (i11 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                R3(t.a.f(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i11 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                z2(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i11 != 1598968902) {
                return super.onTransact(i11, parcel, parcel2, i12);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
    }

    void R3(t tVar, int i11) throws RemoteException;

    int W2(t tVar, String str) throws RemoteException;

    void z2(int i11, String[] strArr) throws RemoteException;
}

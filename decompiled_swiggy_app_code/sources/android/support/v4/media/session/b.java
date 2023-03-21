package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IMediaSession */
public interface b extends IInterface {

    /* compiled from: IMediaSession */
    public static abstract class a extends Binder implements b {

        /* renamed from: android.support.v4.media.session.b$a$a  reason: collision with other inner class name */
        /* compiled from: IMediaSession */
        private static class C0007a implements b {

            /* renamed from: b  reason: collision with root package name */
            public static b f1350b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f1351a;

            C0007a(IBinder iBinder) {
                this.f1351a = iBinder;
            }

            public IBinder asBinder() {
                return this.f1351a;
            }

            public void x0(a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f1351a.transact(3, obtain, obtain2, 0) || a.u() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    a.u().x0(aVar);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b f(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                return new C0007a(iBinder);
            }
            return (b) queryLocalInterface;
        }

        public static b u() {
            return C0007a.f1350b;
        }
    }

    void x0(a aVar) throws RemoteException;
}

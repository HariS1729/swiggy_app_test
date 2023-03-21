package b;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: INotificationSideChannel */
public interface a extends IInterface {

    /* renamed from: b.a$a  reason: collision with other inner class name */
    /* compiled from: INotificationSideChannel */
    public static abstract class C0096a extends Binder implements a {

        /* renamed from: b.a$a$a  reason: collision with other inner class name */
        /* compiled from: INotificationSideChannel */
        private static class C0097a implements a {

            /* renamed from: b  reason: collision with root package name */
            public static a f12541b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f12542a;

            C0097a(IBinder iBinder) {
                this.f12542a = iBinder;
            }

            public IBinder asBinder() {
                return this.f12542a;
            }

            public void l1(String str, int i11, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i11);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f12542a.transact(1, obtain, (Parcel) null, 1) || C0096a.u() == null) {
                        obtain.recycle();
                    } else {
                        C0096a.u().l1(str, i11, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static a f(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0097a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        public static a u() {
            return C0097a.f12541b;
        }
    }

    void l1(String str, int i11, String str2, Notification notification) throws RemoteException;
}

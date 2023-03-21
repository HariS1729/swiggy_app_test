package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.core.app.f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a  reason: collision with root package name */
    final Object f1316a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f1317b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<c, a> f1318c;

    /* renamed from: d  reason: collision with root package name */
    final MediaSessionCompat.Token f1319d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f1320a;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i11, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21) this.f1320a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f1316a) {
                    mediaControllerCompat$MediaControllerImplApi21.f1319d.b(b.a.f(f.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f1319d.c(z3.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerCompat$MediaControllerImplApi21.a();
                }
            }
        }
    }

    private static class a extends c.b {
        a(c cVar) {
            super(cVar);
        }

        public void E2(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }

        public void I(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }

        public void S2(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        public void W() throws RemoteException {
            throw new AssertionError();
        }

        public void c2(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }

        public void q3(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f1319d.a() != null) {
            for (c next : this.f1317b) {
                a aVar = new a(next);
                this.f1318c.put(next, aVar);
                next.f1353b = aVar;
                try {
                    this.f1319d.a().x0(aVar);
                    next.i(13, (Object) null, (Bundle) null);
                } catch (RemoteException e11) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e11);
                }
            }
            this.f1317b.clear();
        }
    }
}

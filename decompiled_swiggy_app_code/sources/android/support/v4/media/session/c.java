package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: MediaControllerCompat */
public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    final MediaController.Callback f1352a = new a(this);

    /* renamed from: b  reason: collision with root package name */
    a f1353b;

    /* compiled from: MediaControllerCompat */
    private static class a extends MediaController.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f1354a;

        a(c cVar) {
            this.f1354a = new WeakReference<>(cVar);
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            c cVar = (c) this.f1354a.get();
            if (cVar != null) {
                cVar.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = (c) this.f1354a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            c cVar = (c) this.f1354a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(mediaMetadata));
            }
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            c cVar = (c) this.f1354a.get();
            if (cVar != null && cVar.f1353b == null) {
                cVar.d(PlaybackStateCompat.a(playbackState));
            }
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            c cVar = (c) this.f1354a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            c cVar = (c) this.f1354a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        public void onSessionDestroyed() {
            c cVar = (c) this.f1354a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = (c) this.f1354a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.f1353b == null || Build.VERSION.SDK_INT >= 23) {
                cVar.h(str, bundle);
            }
        }
    }

    /* compiled from: MediaControllerCompat */
    private static class b extends a.C0006a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f1355a;

        b(c cVar) {
            this.f1355a = new WeakReference<>(cVar);
        }

        public void F() throws RemoteException {
            c cVar = (c) this.f1355a.get();
            if (cVar != null) {
                cVar.i(13, (Object) null, (Bundle) null);
            }
        }

        public void S3(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            c cVar = (c) this.f1355a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, (Bundle) null);
            }
        }

        public void i3(boolean z11) throws RemoteException {
            c cVar = (c) this.f1355a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z11), (Bundle) null);
            }
        }

        public void k2(int i11) throws RemoteException {
            c cVar = (c) this.f1355a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i11), (Bundle) null);
            }
        }

        public void onRepeatModeChanged(int i11) throws RemoteException {
            c cVar = (c) this.f1355a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i11), (Bundle) null);
            }
        }

        public void p(String str, Bundle bundle) throws RemoteException {
            c cVar = (c) this.f1355a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        public void p3(boolean z11) throws RemoteException {
        }
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    public void binderDied() {
        i(8, (Object) null, (Bundle) null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public void i(int i11, Object obj, Bundle bundle) {
    }
}

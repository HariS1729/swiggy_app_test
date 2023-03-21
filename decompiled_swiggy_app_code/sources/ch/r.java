package ch;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.m;
import com.google.android.exoplayer2.drm.n;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class r implements MediaDrm.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f13020a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m.b f13021b;

    public /* synthetic */ r(n nVar, m.b bVar) {
        this.f13020a = nVar;
        this.f13021b = bVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i11, int i12, byte[] bArr2) {
        this.f13020a.y(this.f13021b, mediaDrm, bArr, i11, i12, bArr2);
    }
}

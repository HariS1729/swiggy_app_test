package coil.disk;

import bp0.k;
import java.io.IOException;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: DiskLruCache.kt */
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends Lambda implements l<IOException, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DiskLruCache f13544a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.f13544a = diskLruCache;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return k.f22762a;
    }

    public final void invoke(IOException iOException) {
        this.f13544a.f13521m = true;
    }
}

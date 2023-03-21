package m4;

import android.content.Context;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.b;
import d4.c;
import d4.d;
import d4.i;
import java.util.UUID;
import l4.q;

/* compiled from: WorkForegroundUpdater */
public class n implements d {

    /* renamed from: d  reason: collision with root package name */
    private static final String f15672d = i.f("WMFgUpdater");

    /* renamed from: a  reason: collision with root package name */
    private final n4.a f15673a;

    /* renamed from: b  reason: collision with root package name */
    final k4.a f15674b;

    /* renamed from: c  reason: collision with root package name */
    final q f15675c;

    /* compiled from: WorkForegroundUpdater */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f15676a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UUID f15677b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f15678c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f15679d;

        a(b bVar, UUID uuid, c cVar, Context context) {
            this.f15676a = bVar;
            this.f15677b = uuid;
            this.f15678c = cVar;
            this.f15679d = context;
        }

        public void run() {
            try {
                if (!this.f15676a.isCancelled()) {
                    String uuid = this.f15677b.toString();
                    WorkInfo.State d11 = n.this.f15675c.d(uuid);
                    if (d11 == null || d11.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    n.this.f15674b.a(uuid, this.f15678c);
                    this.f15679d.startService(androidx.work.impl.foreground.a.b(this.f15679d, uuid, this.f15678c));
                }
                this.f15676a.p(null);
            } catch (Throwable th2) {
                this.f15676a.q(th2);
            }
        }
    }

    public n(WorkDatabase workDatabase, k4.a aVar, n4.a aVar2) {
        this.f15674b = aVar;
        this.f15673a = aVar2;
        this.f15675c = workDatabase.N();
    }

    public com.google.common.util.concurrent.b<Void> a(Context context, UUID uuid, c cVar) {
        b t = b.t();
        this.f15673a.c(new a(t, uuid, cVar, context));
        return t;
    }
}

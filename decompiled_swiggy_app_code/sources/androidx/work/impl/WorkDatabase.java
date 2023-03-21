package androidx.work.impl;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.p0;
import androidx.work.impl.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l4.e;
import l4.k;
import l4.n;
import l4.q;
import l4.t;
import t3.g;
import t3.h;
import u3.c;

public abstract class WorkDatabase extends RoomDatabase {

    /* renamed from: o  reason: collision with root package name */
    private static final long f12350o = TimeUnit.DAYS.toMillis(1);

    class a implements h.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f12351a;

        a(Context context) {
            this.f12351a = context;
        }

        public h a(h.b bVar) {
            h.b.a a11 = h.b.a(this.f12351a);
            a11.c(bVar.f16716b).b(bVar.f16717c).d(true);
            return new c().a(a11.a());
        }
    }

    class b extends RoomDatabase.b {
        b() {
        }

        public void c(g gVar) {
            super.c(gVar);
            gVar.l();
            try {
                gVar.m0(WorkDatabase.I());
                gVar.y0();
            } finally {
                gVar.C0();
            }
        }
    }

    public static WorkDatabase E(Context context, Executor executor, boolean z11) {
        RoomDatabase.a<WorkDatabase> aVar;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z11) {
            aVar = p0.c(context, cls).c();
        } else {
            aVar = p0.a(context, cls, e4.h.d());
            aVar.f(new a(context));
        }
        return aVar.g(executor).a(G()).b(a.f12357a).b(new a.h(context, 2, 3)).b(a.f12358b).b(a.f12359c).b(new a.h(context, 5, 6)).b(a.f12360d).b(a.f12361e).b(a.f12362f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(a.f12363g).e().d();
    }

    static RoomDatabase.b G() {
        return new b();
    }

    static long H() {
        return System.currentTimeMillis() - f12350o;
    }

    static String I() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + H() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract l4.b F();

    public abstract e J();

    public abstract l4.h K();

    public abstract k L();

    public abstract n M();

    public abstract q N();

    public abstract t O();
}

package l4;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.s;
import androidx.room.u0;
import io.sentry.SpanStatus;
import io.sentry.k2;
import io.sentry.m0;
import java.util.ArrayList;
import java.util.List;
import t3.k;

/* compiled from: DependencyDao_Impl */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f15463a;

    /* renamed from: b  reason: collision with root package name */
    private final s<a> f15464b;

    /* compiled from: DependencyDao_Impl */
    class a extends s<a> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void g(k kVar, a aVar) {
            String str = aVar.f15461a;
            if (str == null) {
                kVar.b0(1);
            } else {
                kVar.K(1, str);
            }
            String str2 = aVar.f15462b;
            if (str2 == null) {
                kVar.b0(2);
            } else {
                kVar.K(2, str2);
            }
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.f15463a = roomDatabase;
        this.f15464b = new a(roomDatabase);
    }

    public List<String> a(String str) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.DependencyDao") : null;
        u0 f11 = u0.f("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f11.b0(1);
        } else {
            f11.K(1, str);
        }
        this.f15463a.d();
        Cursor c11 = m3.c.c(this.f15463a, f11, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                arrayList.add(c11.getString(0));
            }
            c11.close();
            if (q != null) {
                q.n(SpanStatus.OK);
            }
            f11.release();
            return arrayList;
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            c11.close();
            if (q != null) {
                q.finish();
            }
            f11.release();
            throw th2;
        }
    }

    public void b(a aVar) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.DependencyDao") : null;
        this.f15463a.d();
        this.f15463a.e();
        try {
            this.f15464b.h(aVar);
            this.f15463a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15463a.i();
            if (q != null) {
                q.finish();
            }
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            this.f15463a.i();
            if (q != null) {
                q.finish();
            }
            throw th2;
        }
    }

    public boolean c(String str) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.DependencyDao") : null;
        boolean z11 = true;
        u0 f11 = u0.f("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            f11.b0(1);
        } else {
            f11.K(1, str);
        }
        this.f15463a.d();
        boolean z12 = false;
        Cursor c11 = m3.c.c(this.f15463a, f11, false, (CancellationSignal) null);
        try {
            if (c11.moveToFirst()) {
                if (c11.getInt(0) == 0) {
                    z11 = false;
                }
                z12 = z11;
            }
            c11.close();
            if (q != null) {
                q.n(SpanStatus.OK);
            }
            f11.release();
            return z12;
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            c11.close();
            if (q != null) {
                q.finish();
            }
            f11.release();
            throw th2;
        }
    }

    public boolean d(String str) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.DependencyDao") : null;
        boolean z11 = true;
        u0 f11 = u0.f("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f11.b0(1);
        } else {
            f11.K(1, str);
        }
        this.f15463a.d();
        boolean z12 = false;
        Cursor c11 = m3.c.c(this.f15463a, f11, false, (CancellationSignal) null);
        try {
            if (c11.moveToFirst()) {
                if (c11.getInt(0) == 0) {
                    z11 = false;
                }
                z12 = z11;
            }
            c11.close();
            if (q != null) {
                q.n(SpanStatus.OK);
            }
            f11.release();
            return z12;
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            c11.close();
            if (q != null) {
                q.finish();
            }
            f11.release();
            throw th2;
        }
    }
}

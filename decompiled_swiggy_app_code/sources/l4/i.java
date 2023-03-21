package l4;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.s;
import androidx.room.u0;
import androidx.room.x0;
import io.sentry.SpanStatus;
import io.sentry.k2;
import io.sentry.m0;
import java.util.ArrayList;
import java.util.List;
import m3.c;
import t3.k;

/* compiled from: SystemIdInfoDao_Impl */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f15473a;

    /* renamed from: b  reason: collision with root package name */
    private final s<g> f15474b;

    /* renamed from: c  reason: collision with root package name */
    private final x0 f15475c;

    /* compiled from: SystemIdInfoDao_Impl */
    class a extends s<g> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void g(k kVar, g gVar) {
            String str = gVar.f15471a;
            if (str == null) {
                kVar.b0(1);
            } else {
                kVar.K(1, str);
            }
            kVar.R(2, (long) gVar.f15472b);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl */
    class b extends x0 {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(RoomDatabase roomDatabase) {
        this.f15473a = roomDatabase;
        this.f15474b = new a(roomDatabase);
        this.f15475c = new b(roomDatabase);
    }

    public void a(g gVar) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.SystemIdInfoDao") : null;
        this.f15473a.d();
        this.f15473a.e();
        try {
            this.f15474b.h(gVar);
            this.f15473a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15473a.i();
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
            this.f15473a.i();
            if (q != null) {
                q.finish();
            }
            throw th2;
        }
    }

    public g b(String str) {
        m0 k = k2.k();
        g gVar = null;
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.SystemIdInfoDao") : null;
        u0 f11 = u0.f("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            f11.b0(1);
        } else {
            f11.K(1, str);
        }
        this.f15473a.d();
        Cursor c11 = c.c(this.f15473a, f11, false, (CancellationSignal) null);
        try {
            int e11 = m3.b.e(c11, "work_spec_id");
            int e12 = m3.b.e(c11, "system_id");
            if (c11.moveToFirst()) {
                gVar = new g(c11.getString(e11), c11.getInt(e12));
            }
            c11.close();
            if (q != null) {
                q.n(SpanStatus.OK);
            }
            f11.release();
            return gVar;
        } catch (Exception e13) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e13);
            }
            throw e13;
        } catch (Throwable th2) {
            c11.close();
            if (q != null) {
                q.finish();
            }
            f11.release();
            throw th2;
        }
    }

    public List<String> c() {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.SystemIdInfoDao") : null;
        u0 f11 = u0.f("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f15473a.d();
        Cursor c11 = c.c(this.f15473a, f11, false, (CancellationSignal) null);
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

    public void d(String str) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.SystemIdInfoDao") : null;
        this.f15473a.d();
        k a11 = this.f15475c.a();
        if (str == null) {
            a11.b0(1);
        } else {
            a11.K(1, str);
        }
        this.f15473a.e();
        try {
            a11.n();
            this.f15473a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15473a.i();
            if (q != null) {
                q.finish();
            }
            this.f15475c.f(a11);
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            this.f15473a.i();
            if (q != null) {
                q.finish();
            }
            this.f15475c.f(a11);
            throw th2;
        }
    }
}

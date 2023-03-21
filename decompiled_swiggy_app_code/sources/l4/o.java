package l4;

import androidx.room.RoomDatabase;
import androidx.room.s;
import androidx.room.x0;
import io.sentry.SpanStatus;
import io.sentry.k2;
import io.sentry.m0;
import t3.k;

/* compiled from: WorkProgressDao_Impl */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f15485a;

    /* renamed from: b  reason: collision with root package name */
    private final s<m> f15486b;

    /* renamed from: c  reason: collision with root package name */
    private final x0 f15487c;

    /* renamed from: d  reason: collision with root package name */
    private final x0 f15488d;

    /* compiled from: WorkProgressDao_Impl */
    class a extends s<m> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void g(k kVar, m mVar) {
            String str = mVar.f15483a;
            if (str == null) {
                kVar.b0(1);
            } else {
                kVar.K(1, str);
            }
            byte[] m11 = androidx.work.b.m(mVar.f15484b);
            if (m11 == null) {
                kVar.b0(2);
            } else {
                kVar.S(2, m11);
            }
        }
    }

    /* compiled from: WorkProgressDao_Impl */
    class b extends x0 {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl */
    class c extends x0 {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(RoomDatabase roomDatabase) {
        this.f15485a = roomDatabase;
        this.f15486b = new a(roomDatabase);
        this.f15487c = new b(roomDatabase);
        this.f15488d = new c(roomDatabase);
    }

    public void a(String str) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkProgressDao") : null;
        this.f15485a.d();
        k a11 = this.f15487c.a();
        if (str == null) {
            a11.b0(1);
        } else {
            a11.K(1, str);
        }
        this.f15485a.e();
        try {
            a11.n();
            this.f15485a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15485a.i();
            if (q != null) {
                q.finish();
            }
            this.f15487c.f(a11);
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            this.f15485a.i();
            if (q != null) {
                q.finish();
            }
            this.f15487c.f(a11);
            throw th2;
        }
    }

    public void c() {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkProgressDao") : null;
        this.f15485a.d();
        k a11 = this.f15488d.a();
        this.f15485a.e();
        try {
            a11.n();
            this.f15485a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15485a.i();
            if (q != null) {
                q.finish();
            }
            this.f15488d.f(a11);
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            this.f15485a.i();
            if (q != null) {
                q.finish();
            }
            this.f15488d.f(a11);
            throw th2;
        }
    }
}

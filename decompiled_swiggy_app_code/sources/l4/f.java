package l4;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.s;
import androidx.room.u0;
import io.sentry.SpanStatus;
import io.sentry.k2;
import io.sentry.m0;
import m3.c;
import t3.k;

/* compiled from: PreferenceDao_Impl */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f15468a;

    /* renamed from: b  reason: collision with root package name */
    private final s<d> f15469b;

    /* compiled from: PreferenceDao_Impl */
    class a extends s<d> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void g(k kVar, d dVar) {
            String str = dVar.f15466a;
            if (str == null) {
                kVar.b0(1);
            } else {
                kVar.K(1, str);
            }
            Long l11 = dVar.f15467b;
            if (l11 == null) {
                kVar.b0(2);
            } else {
                kVar.R(2, l11.longValue());
            }
        }
    }

    public f(RoomDatabase roomDatabase) {
        this.f15468a = roomDatabase;
        this.f15469b = new a(roomDatabase);
    }

    public void a(d dVar) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.PreferenceDao") : null;
        this.f15468a.d();
        this.f15468a.e();
        try {
            this.f15469b.h(dVar);
            this.f15468a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15468a.i();
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
            this.f15468a.i();
            if (q != null) {
                q.finish();
            }
            throw th2;
        }
    }

    public Long b(String str) {
        m0 k = k2.k();
        Long l11 = null;
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.PreferenceDao") : null;
        u0 f11 = u0.f("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            f11.b0(1);
        } else {
            f11.K(1, str);
        }
        this.f15468a.d();
        Cursor c11 = c.c(this.f15468a, f11, false, (CancellationSignal) null);
        try {
            if (c11.moveToFirst()) {
                if (!c11.isNull(0)) {
                    l11 = Long.valueOf(c11.getLong(0));
                }
            }
            c11.close();
            if (q != null) {
                q.n(SpanStatus.OK);
            }
            f11.release();
            return l11;
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

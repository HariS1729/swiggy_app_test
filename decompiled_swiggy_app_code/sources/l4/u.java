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
import m3.c;
import t3.k;

/* compiled from: WorkTagDao_Impl */
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f15535a;

    /* renamed from: b  reason: collision with root package name */
    private final s<s> f15536b;

    /* compiled from: WorkTagDao_Impl */
    class a extends s<s> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void g(k kVar, s sVar) {
            String str = sVar.f15533a;
            if (str == null) {
                kVar.b0(1);
            } else {
                kVar.K(1, str);
            }
            String str2 = sVar.f15534b;
            if (str2 == null) {
                kVar.b0(2);
            } else {
                kVar.K(2, str2);
            }
        }
    }

    public u(RoomDatabase roomDatabase) {
        this.f15535a = roomDatabase;
        this.f15536b = new a(roomDatabase);
    }

    public void a(s sVar) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkTagDao") : null;
        this.f15535a.d();
        this.f15535a.e();
        try {
            this.f15536b.h(sVar);
            this.f15535a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15535a.i();
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
            this.f15535a.i();
            if (q != null) {
                q.finish();
            }
            throw th2;
        }
    }

    public List<String> b(String str) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkTagDao") : null;
        u0 f11 = u0.f("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            f11.b0(1);
        } else {
            f11.K(1, str);
        }
        this.f15535a.d();
        Cursor c11 = c.c(this.f15535a, f11, false, (CancellationSignal) null);
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
}

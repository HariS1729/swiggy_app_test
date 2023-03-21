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

/* compiled from: WorkNameDao_Impl */
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f15480a;

    /* renamed from: b  reason: collision with root package name */
    private final s<j> f15481b;

    /* compiled from: WorkNameDao_Impl */
    class a extends s<j> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void g(k kVar, j jVar) {
            String str = jVar.f15478a;
            if (str == null) {
                kVar.b0(1);
            } else {
                kVar.K(1, str);
            }
            String str2 = jVar.f15479b;
            if (str2 == null) {
                kVar.b0(2);
            } else {
                kVar.K(2, str2);
            }
        }
    }

    public l(RoomDatabase roomDatabase) {
        this.f15480a = roomDatabase;
        this.f15481b = new a(roomDatabase);
    }

    public List<String> a(String str) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkNameDao") : null;
        u0 f11 = u0.f("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            f11.b0(1);
        } else {
            f11.K(1, str);
        }
        this.f15480a.d();
        Cursor c11 = c.c(this.f15480a, f11, false, (CancellationSignal) null);
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

    public void b(j jVar) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkNameDao") : null;
        this.f15480a.d();
        this.f15480a.e();
        try {
            this.f15481b.h(jVar);
            this.f15480a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15480a.i();
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
            this.f15480a.i();
            if (q != null) {
                q.finish();
            }
            throw th2;
        }
    }
}

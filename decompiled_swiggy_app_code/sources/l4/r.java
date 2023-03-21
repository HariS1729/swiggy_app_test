package l4;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.s;
import androidx.room.u0;
import androidx.room.x0;
import androidx.work.WorkInfo;
import com.newrelic.agent.android.agentdata.HexAttribute;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import io.sentry.SpanStatus;
import io.sentry.k2;
import io.sentry.m0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l4.p;
import t3.k;

/* compiled from: WorkSpecDao_Impl */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f15515a;

    /* renamed from: b  reason: collision with root package name */
    private final s<p> f15516b;

    /* renamed from: c  reason: collision with root package name */
    private final x0 f15517c;

    /* renamed from: d  reason: collision with root package name */
    private final x0 f15518d;

    /* renamed from: e  reason: collision with root package name */
    private final x0 f15519e;

    /* renamed from: f  reason: collision with root package name */
    private final x0 f15520f;

    /* renamed from: g  reason: collision with root package name */
    private final x0 f15521g;

    /* renamed from: h  reason: collision with root package name */
    private final x0 f15522h;

    /* renamed from: i  reason: collision with root package name */
    private final x0 f15523i;
    private final x0 j;

    /* compiled from: WorkSpecDao_Impl */
    class a extends s<p> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: k */
        public void g(k kVar, p pVar) {
            String str = pVar.f15493a;
            if (str == null) {
                kVar.b0(1);
            } else {
                kVar.K(1, str);
            }
            kVar.R(2, (long) v.j(pVar.f15494b));
            String str2 = pVar.f15495c;
            if (str2 == null) {
                kVar.b0(3);
            } else {
                kVar.K(3, str2);
            }
            String str3 = pVar.f15496d;
            if (str3 == null) {
                kVar.b0(4);
            } else {
                kVar.K(4, str3);
            }
            byte[] m11 = androidx.work.b.m(pVar.f15497e);
            if (m11 == null) {
                kVar.b0(5);
            } else {
                kVar.S(5, m11);
            }
            byte[] m12 = androidx.work.b.m(pVar.f15498f);
            if (m12 == null) {
                kVar.b0(6);
            } else {
                kVar.S(6, m12);
            }
            kVar.R(7, pVar.f15499g);
            kVar.R(8, pVar.f15500h);
            kVar.R(9, pVar.f15501i);
            kVar.R(10, (long) pVar.k);
            kVar.R(11, (long) v.a(pVar.f15502l));
            kVar.R(12, pVar.f15503m);
            kVar.R(13, pVar.n);
            kVar.R(14, pVar.f15504o);
            kVar.R(15, pVar.f15505p);
            kVar.R(16, pVar.q ? 1 : 0);
            kVar.R(17, (long) v.i(pVar.f15506r));
            d4.a aVar = pVar.j;
            if (aVar != null) {
                kVar.R(18, (long) v.h(aVar.b()));
                kVar.R(19, aVar.g() ? 1 : 0);
                kVar.R(20, aVar.h() ? 1 : 0);
                kVar.R(21, aVar.f() ? 1 : 0);
                kVar.R(22, aVar.i() ? 1 : 0);
                kVar.R(23, aVar.c());
                kVar.R(24, aVar.d());
                byte[] c11 = v.c(aVar.a());
                if (c11 == null) {
                    kVar.b0(25);
                } else {
                    kVar.S(25, c11);
                }
            } else {
                kVar.b0(18);
                kVar.b0(19);
                kVar.b0(20);
                kVar.b0(21);
                kVar.b0(22);
                kVar.b0(23);
                kVar.b0(24);
                kVar.b0(25);
            }
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class b extends x0 {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class c extends x0 {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class d extends x0 {
        d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class e extends x0 {
        e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class f extends x0 {
        f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class g extends x0 {
        g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class h extends x0 {
        h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class i extends x0 {
        i(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(RoomDatabase roomDatabase) {
        this.f15515a = roomDatabase;
        this.f15516b = new a(roomDatabase);
        this.f15517c = new b(roomDatabase);
        this.f15518d = new c(roomDatabase);
        this.f15519e = new d(roomDatabase);
        this.f15520f = new e(roomDatabase);
        this.f15521g = new f(roomDatabase);
        this.f15522h = new g(roomDatabase);
        this.f15523i = new h(roomDatabase);
        this.j = new i(roomDatabase);
    }

    private void w(androidx.collection.a<String, ArrayList<androidx.work.b>> aVar) {
        ArrayList arrayList;
        int i11;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                androidx.collection.a aVar2 = new androidx.collection.a(999);
                int size = aVar.size();
                int i12 = 0;
                loop0:
                while (true) {
                    i11 = 0;
                    while (i12 < size) {
                        aVar2.put(aVar.m(i12), aVar.q(i12));
                        i12++;
                        i11++;
                        if (i11 == 999) {
                            w(aVar2);
                            aVar2 = new androidx.collection.a(999);
                        }
                    }
                    break loop0;
                }
                if (i11 > 0) {
                    w(aVar2);
                    return;
                }
                return;
            }
            StringBuilder b11 = m3.f.b();
            b11.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            m3.f.a(b11, size2);
            b11.append(")");
            u0 f11 = u0.f(b11.toString(), size2 + 0);
            int i13 = 1;
            for (String next : keySet) {
                if (next == null) {
                    f11.b0(i13);
                } else {
                    f11.K(i13, next);
                }
                i13++;
            }
            Cursor c11 = m3.c.c(this.f15515a, f11, false, (CancellationSignal) null);
            try {
                int d11 = m3.b.d(c11, "work_spec_id");
                if (d11 != -1) {
                    while (c11.moveToNext()) {
                        if (!c11.isNull(d11) && (arrayList = aVar.get(c11.getString(d11))) != null) {
                            arrayList.add(androidx.work.b.g(c11.getBlob(0)));
                        }
                    }
                    c11.close();
                }
            } finally {
                c11.close();
            }
        }
    }

    private void x(androidx.collection.a<String, ArrayList<String>> aVar) {
        ArrayList arrayList;
        int i11;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                androidx.collection.a aVar2 = new androidx.collection.a(999);
                int size = aVar.size();
                int i12 = 0;
                loop0:
                while (true) {
                    i11 = 0;
                    while (i12 < size) {
                        aVar2.put(aVar.m(i12), aVar.q(i12));
                        i12++;
                        i11++;
                        if (i11 == 999) {
                            x(aVar2);
                            aVar2 = new androidx.collection.a(999);
                        }
                    }
                    break loop0;
                }
                if (i11 > 0) {
                    x(aVar2);
                    return;
                }
                return;
            }
            StringBuilder b11 = m3.f.b();
            b11.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            m3.f.a(b11, size2);
            b11.append(")");
            u0 f11 = u0.f(b11.toString(), size2 + 0);
            int i13 = 1;
            for (String next : keySet) {
                if (next == null) {
                    f11.b0(i13);
                } else {
                    f11.K(i13, next);
                }
                i13++;
            }
            Cursor c11 = m3.c.c(this.f15515a, f11, false, (CancellationSignal) null);
            try {
                int d11 = m3.b.d(c11, "work_spec_id");
                if (d11 != -1) {
                    while (c11.moveToNext()) {
                        if (!c11.isNull(d11) && (arrayList = aVar.get(c11.getString(d11))) != null) {
                            arrayList.add(c11.getString(0));
                        }
                    }
                    c11.close();
                }
            } finally {
                c11.close();
            }
        }
    }

    public void a(String str) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        this.f15515a.d();
        k a11 = this.f15517c.a();
        if (str == null) {
            a11.b0(1);
        } else {
            a11.K(1, str);
        }
        this.f15515a.e();
        try {
            a11.n();
            this.f15515a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            this.f15517c.f(a11);
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            this.f15517c.f(a11);
            throw th2;
        }
    }

    public int b(WorkInfo.State state, String... strArr) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        this.f15515a.d();
        StringBuilder b11 = m3.f.b();
        b11.append("UPDATE workspec SET state=");
        b11.append("?");
        b11.append(" WHERE id IN (");
        m3.f.a(b11, strArr.length);
        b11.append(")");
        k f11 = this.f15515a.f(b11.toString());
        f11.R(1, (long) v.j(state));
        int i11 = 2;
        for (String str : strArr) {
            if (str == null) {
                f11.b0(i11);
            } else {
                f11.K(i11, str);
            }
            i11++;
        }
        this.f15515a.e();
        try {
            int n = f11.n();
            this.f15515a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            return n;
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            throw th2;
        }
    }

    public List<String> c(String str) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        u0 f11 = u0.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f11.b0(1);
        } else {
            f11.K(1, str);
        }
        this.f15515a.d();
        Cursor c11 = m3.c.c(this.f15515a, f11, false, (CancellationSignal) null);
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

    public WorkInfo.State d(String str) {
        m0 k = k2.k();
        WorkInfo.State state = null;
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        u0 f11 = u0.f("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            f11.b0(1);
        } else {
            f11.K(1, str);
        }
        this.f15515a.d();
        Cursor c11 = m3.c.c(this.f15515a, f11, false, (CancellationSignal) null);
        try {
            if (c11.moveToFirst()) {
                state = v.g(c11.getInt(0));
            }
            c11.close();
            if (q != null) {
                q.n(SpanStatus.OK);
            }
            f11.release();
            return state;
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

    public List<String> e(String str) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        u0 f11 = u0.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            f11.b0(1);
        } else {
            f11.K(1, str);
        }
        this.f15515a.d();
        Cursor c11 = m3.c.c(this.f15515a, f11, false, (CancellationSignal) null);
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

    public List<androidx.work.b> f(String str) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        u0 f11 = u0.f("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            f11.b0(1);
        } else {
            f11.K(1, str);
        }
        this.f15515a.d();
        Cursor c11 = m3.c.c(this.f15515a, f11, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                arrayList.add(androidx.work.b.g(c11.getBlob(0)));
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

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0249 A[SYNTHETIC, Splitter:B:55:0x0249] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0258  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<l4.p> g(int r36) {
        /*
            r35 = this;
            r1 = r35
            io.sentry.m0 r0 = io.sentry.k2.k()
            r2 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.String r3 = "db"
            java.lang.String r4 = "androidx.work.impl.model.WorkSpecDao"
            io.sentry.m0 r0 = r0.q(r3, r4)
            r3 = r0
            goto L_0x0014
        L_0x0013:
            r3 = r2
        L_0x0014:
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?"
            r4 = 1
            androidx.room.u0 r5 = androidx.room.u0.f(r0, r4)
            r0 = r36
            long r6 = (long) r0
            r5.R(r4, r6)
            androidx.room.RoomDatabase r0 = r1.f15515a
            r0.d()
            androidx.room.RoomDatabase r0 = r1.f15515a
            r6 = 0
            android.database.Cursor r2 = m3.c.c(r0, r5, r6, r2)
            java.lang.String r0 = "required_network_type"
            int r0 = m3.b.e(r2, r0)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r7 = "requires_charging"
            int r7 = m3.b.e(r2, r7)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r8 = "requires_device_idle"
            int r8 = m3.b.e(r2, r8)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r9 = "requires_battery_not_low"
            int r9 = m3.b.e(r2, r9)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r10 = "requires_storage_not_low"
            int r10 = m3.b.e(r2, r10)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r11 = "trigger_content_update_delay"
            int r11 = m3.b.e(r2, r11)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r12 = "trigger_max_content_delay"
            int r12 = m3.b.e(r2, r12)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r13 = "content_uri_triggers"
            int r13 = m3.b.e(r2, r13)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r14 = "id"
            int r14 = m3.b.e(r2, r14)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r15 = "state"
            int r15 = m3.b.e(r2, r15)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r4 = "worker_class_name"
            int r4 = m3.b.e(r2, r4)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r6 = "input_merger_class_name"
            int r6 = m3.b.e(r2, r6)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r1 = "input"
            int r1 = m3.b.e(r2, r1)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            r16 = r5
            java.lang.String r5 = "output"
            int r5 = m3.b.e(r2, r5)     // Catch:{ Exception -> 0x023b, all -> 0x0238 }
            r17 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r18 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r19 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r20 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r21 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r22 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r23 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r24 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r25 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r26 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r27 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r28 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r29 = r5
            int r5 = r2.getCount()     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
        L_0x00e8:
            boolean r5 = r2.moveToNext()     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            if (r5 == 0) goto L_0x0220
            java.lang.String r5 = r2.getString(r14)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r30 = r14
            java.lang.String r14 = r2.getString(r4)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r31 = r4
            d4.a r4 = new d4.a     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r4.<init>()     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            int r32 = r2.getInt(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r33 = r0
            androidx.work.NetworkType r0 = l4.v.e(r32)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r4.k(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            int r0 = r2.getInt(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            if (r0 == 0) goto L_0x0114
            r0 = 1
            goto L_0x0115
        L_0x0114:
            r0 = 0
        L_0x0115:
            r4.m(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            int r0 = r2.getInt(r8)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            if (r0 == 0) goto L_0x0120
            r0 = 1
            goto L_0x0121
        L_0x0120:
            r0 = 0
        L_0x0121:
            r4.n(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            int r0 = r2.getInt(r9)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            if (r0 == 0) goto L_0x012c
            r0 = 1
            goto L_0x012d
        L_0x012c:
            r0 = 0
        L_0x012d:
            r4.l(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            int r0 = r2.getInt(r10)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            if (r0 == 0) goto L_0x0138
            r0 = 1
            goto L_0x0139
        L_0x0138:
            r0 = 0
        L_0x0139:
            r4.o(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r0 = r7
            r32 = r8
            long r7 = r2.getLong(r11)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r4.p(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            long r7 = r2.getLong(r12)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r4.q(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            byte[] r7 = r2.getBlob(r13)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            d4.b r7 = l4.v.b(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r4.j(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            l4.p r7 = new l4.p     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.<init>(r5, r14)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            int r5 = r2.getInt(r15)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            androidx.work.WorkInfo$State r5 = l4.v.g(r5)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15494b = r5     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            java.lang.String r5 = r2.getString(r6)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15496d = r5     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            byte[] r5 = r2.getBlob(r1)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            androidx.work.b r5 = androidx.work.b.g(r5)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15497e = r5     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r5 = r29
            byte[] r8 = r2.getBlob(r5)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            androidx.work.b r8 = androidx.work.b.g(r8)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15498f = r8     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r14 = r1
            r8 = r18
            r18 = r0
            long r0 = r2.getLong(r8)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15499g = r0     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r29 = r5
            r1 = r6
            r0 = r19
            long r5 = r2.getLong(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15500h = r5     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r19 = r0
            r6 = r1
            r5 = r20
            long r0 = r2.getLong(r5)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15501i = r0     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r0 = r21
            int r1 = r2.getInt(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.k = r1     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r1 = r22
            int r20 = r2.getInt(r1)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r21 = r0
            androidx.work.BackoffPolicy r0 = l4.v.d(r20)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15502l = r0     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r20 = r5
            r22 = r6
            r0 = r23
            long r5 = r2.getLong(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15503m = r5     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r23 = r0
            r6 = r1
            r5 = r24
            long r0 = r2.getLong(r5)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.n = r0     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r24 = r5
            r1 = r6
            r0 = r25
            long r5 = r2.getLong(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15504o = r5     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r25 = r0
            r6 = r1
            r5 = r26
            long r0 = r2.getLong(r5)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15505p = r0     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r0 = r27
            int r1 = r2.getInt(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            if (r1 == 0) goto L_0x01f1
            r1 = 1
            goto L_0x01f2
        L_0x01f1:
            r1 = 0
        L_0x01f2:
            r7.q = r1     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r1 = r28
            int r26 = r2.getInt(r1)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r27 = r0
            androidx.work.OutOfQuotaPolicy r0 = l4.v.f(r26)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15506r = r0     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.j = r4     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r3.add(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r28 = r1
            r26 = r5
            r1 = r14
            r7 = r18
            r14 = r30
            r4 = r31
            r0 = r33
            r18 = r8
            r8 = r32
            r34 = r22
            r22 = r6
            r6 = r34
            goto L_0x00e8
        L_0x0220:
            r2.close()
            if (r17 == 0) goto L_0x022c
            io.sentry.SpanStatus r0 = io.sentry.SpanStatus.OK
            r1 = r17
            r1.n(r0)
        L_0x022c:
            r16.release()
            return r3
        L_0x0230:
            r0 = move-exception
            r1 = r17
            goto L_0x0253
        L_0x0234:
            r0 = move-exception
            r1 = r17
            goto L_0x0247
        L_0x0238:
            r0 = move-exception
            r1 = r3
            goto L_0x0253
        L_0x023b:
            r0 = move-exception
            r1 = r3
            goto L_0x0247
        L_0x023e:
            r0 = move-exception
            r1 = r3
            r16 = r5
            goto L_0x0253
        L_0x0243:
            r0 = move-exception
            r1 = r3
            r16 = r5
        L_0x0247:
            if (r1 == 0) goto L_0x0251
            io.sentry.SpanStatus r3 = io.sentry.SpanStatus.INTERNAL_ERROR     // Catch:{ all -> 0x0252 }
            r1.a(r3)     // Catch:{ all -> 0x0252 }
            r1.m(r0)     // Catch:{ all -> 0x0252 }
        L_0x0251:
            throw r0     // Catch:{ all -> 0x0252 }
        L_0x0252:
            r0 = move-exception
        L_0x0253:
            r2.close()
            if (r1 == 0) goto L_0x025b
            r1.finish()
        L_0x025b:
            r16.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.r.g(int):java.util.List");
    }

    public boolean h() {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        boolean z11 = false;
        u0 f11 = u0.f("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f15515a.d();
        Cursor c11 = m3.c.c(this.f15515a, f11, false, (CancellationSignal) null);
        try {
            if (c11.moveToFirst() && c11.getInt(0) != 0) {
                z11 = true;
            }
            c11.close();
            if (q != null) {
                q.n(SpanStatus.OK);
            }
            f11.release();
            return z11;
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

    public int i(String str) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        this.f15515a.d();
        k a11 = this.f15521g.a();
        if (str == null) {
            a11.b0(1);
        } else {
            a11.K(1, str);
        }
        this.f15515a.e();
        try {
            int n = a11.n();
            this.f15515a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            this.f15521g.f(a11);
            return n;
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            this.f15521g.f(a11);
            throw th2;
        }
    }

    public void j(String str, long j11) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        this.f15515a.d();
        k a11 = this.f15519e.a();
        a11.R(1, j11);
        if (str == null) {
            a11.b0(2);
        } else {
            a11.K(2, str);
        }
        this.f15515a.e();
        try {
            a11.n();
            this.f15515a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            this.f15519e.f(a11);
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            this.f15519e.f(a11);
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0248 A[SYNTHETIC, Splitter:B:55:0x0248] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0257  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<l4.p> k(long r35) {
        /*
            r34 = this;
            r1 = r34
            io.sentry.m0 r0 = io.sentry.k2.k()
            r2 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.String r3 = "db"
            java.lang.String r4 = "androidx.work.impl.model.WorkSpecDao"
            io.sentry.m0 r0 = r0.q(r3, r4)
            r3 = r0
            goto L_0x0014
        L_0x0013:
            r3 = r2
        L_0x0014:
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC"
            r4 = 1
            androidx.room.u0 r5 = androidx.room.u0.f(r0, r4)
            r6 = r35
            r5.R(r4, r6)
            androidx.room.RoomDatabase r0 = r1.f15515a
            r0.d()
            androidx.room.RoomDatabase r0 = r1.f15515a
            r6 = 0
            android.database.Cursor r2 = m3.c.c(r0, r5, r6, r2)
            java.lang.String r0 = "required_network_type"
            int r0 = m3.b.e(r2, r0)     // Catch:{ Exception -> 0x0242, all -> 0x023d }
            java.lang.String r7 = "requires_charging"
            int r7 = m3.b.e(r2, r7)     // Catch:{ Exception -> 0x0242, all -> 0x023d }
            java.lang.String r8 = "requires_device_idle"
            int r8 = m3.b.e(r2, r8)     // Catch:{ Exception -> 0x0242, all -> 0x023d }
            java.lang.String r9 = "requires_battery_not_low"
            int r9 = m3.b.e(r2, r9)     // Catch:{ Exception -> 0x0242, all -> 0x023d }
            java.lang.String r10 = "requires_storage_not_low"
            int r10 = m3.b.e(r2, r10)     // Catch:{ Exception -> 0x0242, all -> 0x023d }
            java.lang.String r11 = "trigger_content_update_delay"
            int r11 = m3.b.e(r2, r11)     // Catch:{ Exception -> 0x0242, all -> 0x023d }
            java.lang.String r12 = "trigger_max_content_delay"
            int r12 = m3.b.e(r2, r12)     // Catch:{ Exception -> 0x0242, all -> 0x023d }
            java.lang.String r13 = "content_uri_triggers"
            int r13 = m3.b.e(r2, r13)     // Catch:{ Exception -> 0x0242, all -> 0x023d }
            java.lang.String r14 = "id"
            int r14 = m3.b.e(r2, r14)     // Catch:{ Exception -> 0x0242, all -> 0x023d }
            java.lang.String r15 = "state"
            int r15 = m3.b.e(r2, r15)     // Catch:{ Exception -> 0x0242, all -> 0x023d }
            java.lang.String r4 = "worker_class_name"
            int r4 = m3.b.e(r2, r4)     // Catch:{ Exception -> 0x0242, all -> 0x023d }
            java.lang.String r6 = "input_merger_class_name"
            int r6 = m3.b.e(r2, r6)     // Catch:{ Exception -> 0x0242, all -> 0x023d }
            java.lang.String r1 = "input"
            int r1 = m3.b.e(r2, r1)     // Catch:{ Exception -> 0x0242, all -> 0x023d }
            r16 = r5
            java.lang.String r5 = "output"
            int r5 = m3.b.e(r2, r5)     // Catch:{ Exception -> 0x023a, all -> 0x0237 }
            r17 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r36 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r18 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r19 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r20 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r21 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r22 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r23 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r24 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r25 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r26 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r27 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r28 = r5
            int r5 = r2.getCount()     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
        L_0x00e7:
            boolean r5 = r2.moveToNext()     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            if (r5 == 0) goto L_0x021f
            java.lang.String r5 = r2.getString(r14)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r29 = r14
            java.lang.String r14 = r2.getString(r4)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r30 = r4
            d4.a r4 = new d4.a     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r4.<init>()     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            int r31 = r2.getInt(r0)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r32 = r0
            androidx.work.NetworkType r0 = l4.v.e(r31)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r4.k(r0)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            int r0 = r2.getInt(r7)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            if (r0 == 0) goto L_0x0113
            r0 = 1
            goto L_0x0114
        L_0x0113:
            r0 = 0
        L_0x0114:
            r4.m(r0)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            int r0 = r2.getInt(r8)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            if (r0 == 0) goto L_0x011f
            r0 = 1
            goto L_0x0120
        L_0x011f:
            r0 = 0
        L_0x0120:
            r4.n(r0)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            int r0 = r2.getInt(r9)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            if (r0 == 0) goto L_0x012b
            r0 = 1
            goto L_0x012c
        L_0x012b:
            r0 = 0
        L_0x012c:
            r4.l(r0)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            int r0 = r2.getInt(r10)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            if (r0 == 0) goto L_0x0137
            r0 = 1
            goto L_0x0138
        L_0x0137:
            r0 = 0
        L_0x0138:
            r4.o(r0)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r0 = r7
            r31 = r8
            long r7 = r2.getLong(r11)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r4.p(r7)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            long r7 = r2.getLong(r12)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r4.q(r7)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            byte[] r7 = r2.getBlob(r13)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            d4.b r7 = l4.v.b(r7)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r4.j(r7)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            l4.p r7 = new l4.p     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.<init>(r5, r14)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            int r5 = r2.getInt(r15)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            androidx.work.WorkInfo$State r5 = l4.v.g(r5)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.f15494b = r5     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            java.lang.String r5 = r2.getString(r6)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.f15496d = r5     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            byte[] r5 = r2.getBlob(r1)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            androidx.work.b r5 = androidx.work.b.g(r5)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.f15497e = r5     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r5 = r28
            byte[] r8 = r2.getBlob(r5)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            androidx.work.b r8 = androidx.work.b.g(r8)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.f15498f = r8     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r8 = r36
            r14 = r0
            r36 = r1
            long r0 = r2.getLong(r8)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.f15499g = r0     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r28 = r5
            r1 = r6
            r0 = r18
            long r5 = r2.getLong(r0)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.f15500h = r5     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r18 = r0
            r6 = r1
            r5 = r19
            long r0 = r2.getLong(r5)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.f15501i = r0     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r0 = r20
            int r1 = r2.getInt(r0)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.k = r1     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r1 = r21
            int r19 = r2.getInt(r1)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r20 = r0
            androidx.work.BackoffPolicy r0 = l4.v.d(r19)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.f15502l = r0     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r19 = r5
            r21 = r6
            r0 = r22
            long r5 = r2.getLong(r0)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.f15503m = r5     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r22 = r0
            r6 = r1
            r5 = r23
            long r0 = r2.getLong(r5)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.n = r0     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r23 = r5
            r1 = r6
            r0 = r24
            long r5 = r2.getLong(r0)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.f15504o = r5     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r24 = r0
            r6 = r1
            r5 = r25
            long r0 = r2.getLong(r5)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.f15505p = r0     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r0 = r26
            int r1 = r2.getInt(r0)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            if (r1 == 0) goto L_0x01f0
            r1 = 1
            goto L_0x01f1
        L_0x01f0:
            r1 = 0
        L_0x01f1:
            r7.q = r1     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r1 = r27
            int r25 = r2.getInt(r1)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r26 = r0
            androidx.work.OutOfQuotaPolicy r0 = l4.v.f(r25)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.f15506r = r0     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r7.j = r4     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r3.add(r7)     // Catch:{ Exception -> 0x0233, all -> 0x022f }
            r27 = r1
            r25 = r5
            r7 = r14
            r14 = r29
            r4 = r30
            r0 = r32
            r1 = r36
            r36 = r8
            r8 = r31
            r33 = r21
            r21 = r6
            r6 = r33
            goto L_0x00e7
        L_0x021f:
            r2.close()
            if (r17 == 0) goto L_0x022b
            io.sentry.SpanStatus r0 = io.sentry.SpanStatus.OK
            r1 = r17
            r1.n(r0)
        L_0x022b:
            r16.release()
            return r3
        L_0x022f:
            r0 = move-exception
            r1 = r17
            goto L_0x0252
        L_0x0233:
            r0 = move-exception
            r1 = r17
            goto L_0x0246
        L_0x0237:
            r0 = move-exception
            r1 = r3
            goto L_0x0252
        L_0x023a:
            r0 = move-exception
            r1 = r3
            goto L_0x0246
        L_0x023d:
            r0 = move-exception
            r1 = r3
            r16 = r5
            goto L_0x0252
        L_0x0242:
            r0 = move-exception
            r1 = r3
            r16 = r5
        L_0x0246:
            if (r1 == 0) goto L_0x0250
            io.sentry.SpanStatus r3 = io.sentry.SpanStatus.INTERNAL_ERROR     // Catch:{ all -> 0x0251 }
            r1.a(r3)     // Catch:{ all -> 0x0251 }
            r1.m(r0)     // Catch:{ all -> 0x0251 }
        L_0x0250:
            throw r0     // Catch:{ all -> 0x0251 }
        L_0x0251:
            r0 = move-exception
        L_0x0252:
            r2.close()
            if (r1 == 0) goto L_0x025a
            r1.finish()
        L_0x025a:
            r16.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.r.k(long):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0242 A[SYNTHETIC, Splitter:B:55:0x0242] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0251  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<l4.p> l() {
        /*
            r35 = this;
            r1 = r35
            io.sentry.m0 r0 = io.sentry.k2.k()
            r2 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.String r3 = "db"
            java.lang.String r4 = "androidx.work.impl.model.WorkSpecDao"
            io.sentry.m0 r0 = r0.q(r3, r4)
            r3 = r0
            goto L_0x0014
        L_0x0013:
            r3 = r2
        L_0x0014:
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1"
            r4 = 0
            androidx.room.u0 r5 = androidx.room.u0.f(r0, r4)
            androidx.room.RoomDatabase r0 = r1.f15515a
            r0.d()
            androidx.room.RoomDatabase r0 = r1.f15515a
            android.database.Cursor r2 = m3.c.c(r0, r5, r4, r2)
            java.lang.String r0 = "required_network_type"
            int r0 = m3.b.e(r2, r0)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r6 = "requires_charging"
            int r6 = m3.b.e(r2, r6)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r7 = "requires_device_idle"
            int r7 = m3.b.e(r2, r7)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r8 = "requires_battery_not_low"
            int r8 = m3.b.e(r2, r8)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r9 = "requires_storage_not_low"
            int r9 = m3.b.e(r2, r9)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r10 = "trigger_content_update_delay"
            int r10 = m3.b.e(r2, r10)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r11 = "trigger_max_content_delay"
            int r11 = m3.b.e(r2, r11)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r12 = "content_uri_triggers"
            int r12 = m3.b.e(r2, r12)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r13 = "id"
            int r13 = m3.b.e(r2, r13)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r14 = "state"
            int r14 = m3.b.e(r2, r14)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r15 = "worker_class_name"
            int r15 = m3.b.e(r2, r15)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r4 = "input_merger_class_name"
            int r4 = m3.b.e(r2, r4)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r1 = "input"
            int r1 = m3.b.e(r2, r1)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            r16 = r5
            java.lang.String r5 = "output"
            int r5 = m3.b.e(r2, r5)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
            r17 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r18 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r19 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r20 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r21 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r22 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r23 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r24 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r25 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r26 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r27 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r28 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r29 = r5
            int r5 = r2.getCount()     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
        L_0x00e1:
            boolean r5 = r2.moveToNext()     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            if (r5 == 0) goto L_0x0219
            java.lang.String r5 = r2.getString(r13)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r30 = r13
            java.lang.String r13 = r2.getString(r15)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r31 = r15
            d4.a r15 = new d4.a     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r15.<init>()     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            int r32 = r2.getInt(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r33 = r0
            androidx.work.NetworkType r0 = l4.v.e(r32)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r15.k(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            int r0 = r2.getInt(r6)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r32 = 1
            if (r0 == 0) goto L_0x010f
            r0 = 1
            goto L_0x0110
        L_0x010f:
            r0 = 0
        L_0x0110:
            r15.m(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            int r0 = r2.getInt(r7)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            if (r0 == 0) goto L_0x011b
            r0 = 1
            goto L_0x011c
        L_0x011b:
            r0 = 0
        L_0x011c:
            r15.n(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            int r0 = r2.getInt(r8)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            if (r0 == 0) goto L_0x0127
            r0 = 1
            goto L_0x0128
        L_0x0127:
            r0 = 0
        L_0x0128:
            r15.l(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            int r0 = r2.getInt(r9)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            if (r0 == 0) goto L_0x0133
            r0 = 1
            goto L_0x0134
        L_0x0133:
            r0 = 0
        L_0x0134:
            r15.o(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r0 = r6
            r34 = r7
            long r6 = r2.getLong(r10)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r15.p(r6)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            long r6 = r2.getLong(r11)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r15.q(r6)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            byte[] r6 = r2.getBlob(r12)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            d4.b r6 = l4.v.b(r6)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r15.j(r6)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            l4.p r6 = new l4.p     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.<init>(r5, r13)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            int r5 = r2.getInt(r14)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            androidx.work.WorkInfo$State r5 = l4.v.g(r5)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15494b = r5     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            java.lang.String r5 = r2.getString(r4)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15496d = r5     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            byte[] r5 = r2.getBlob(r1)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            androidx.work.b r5 = androidx.work.b.g(r5)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15497e = r5     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r5 = r29
            byte[] r7 = r2.getBlob(r5)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            androidx.work.b r7 = androidx.work.b.g(r7)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15498f = r7     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r13 = r1
            r7 = r18
            r18 = r0
            long r0 = r2.getLong(r7)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15499g = r0     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r1 = r4
            r29 = r5
            r0 = r19
            long r4 = r2.getLong(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15500h = r4     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r19 = r0
            r5 = r1
            r4 = r20
            long r0 = r2.getLong(r4)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15501i = r0     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r0 = r21
            int r1 = r2.getInt(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.k = r1     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r1 = r22
            int r20 = r2.getInt(r1)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r21 = r0
            androidx.work.BackoffPolicy r0 = l4.v.d(r20)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15502l = r0     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r20 = r4
            r22 = r5
            r0 = r23
            long r4 = r2.getLong(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15503m = r4     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r23 = r0
            r5 = r1
            r4 = r24
            long r0 = r2.getLong(r4)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.n = r0     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r24 = r4
            r1 = r5
            r0 = r25
            long r4 = r2.getLong(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15504o = r4     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r25 = r0
            r5 = r1
            r4 = r26
            long r0 = r2.getLong(r4)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15505p = r0     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r0 = r27
            int r1 = r2.getInt(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            if (r1 == 0) goto L_0x01ec
            r1 = 1
            goto L_0x01ed
        L_0x01ec:
            r1 = 0
        L_0x01ed:
            r6.q = r1     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r1 = r28
            int r26 = r2.getInt(r1)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r27 = r0
            androidx.work.OutOfQuotaPolicy r0 = l4.v.f(r26)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15506r = r0     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.j = r15     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r3.add(r6)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r28 = r1
            r26 = r4
            r1 = r13
            r6 = r18
            r4 = r22
            r13 = r30
            r15 = r31
            r0 = r33
            r22 = r5
            r18 = r7
            r7 = r34
            goto L_0x00e1
        L_0x0219:
            r2.close()
            if (r17 == 0) goto L_0x0225
            io.sentry.SpanStatus r0 = io.sentry.SpanStatus.OK
            r1 = r17
            r1.n(r0)
        L_0x0225:
            r16.release()
            return r3
        L_0x0229:
            r0 = move-exception
            r1 = r17
            goto L_0x024c
        L_0x022d:
            r0 = move-exception
            r1 = r17
            goto L_0x0240
        L_0x0231:
            r0 = move-exception
            r1 = r3
            goto L_0x024c
        L_0x0234:
            r0 = move-exception
            r1 = r3
            goto L_0x0240
        L_0x0237:
            r0 = move-exception
            r1 = r3
            r16 = r5
            goto L_0x024c
        L_0x023c:
            r0 = move-exception
            r1 = r3
            r16 = r5
        L_0x0240:
            if (r1 == 0) goto L_0x024a
            io.sentry.SpanStatus r3 = io.sentry.SpanStatus.INTERNAL_ERROR     // Catch:{ all -> 0x024b }
            r1.a(r3)     // Catch:{ all -> 0x024b }
            r1.m(r0)     // Catch:{ all -> 0x024b }
        L_0x024a:
            throw r0     // Catch:{ all -> 0x024b }
        L_0x024b:
            r0 = move-exception
        L_0x024c:
            r2.close()
            if (r1 == 0) goto L_0x0254
            r1.finish()
        L_0x0254:
            r16.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.r.l():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x01fe A[SYNTHETIC, Splitter:B:56:0x01fe] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x020d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l4.p m(java.lang.String r30) {
        /*
            r29 = this;
            r1 = r29
            r0 = r30
            io.sentry.m0 r2 = io.sentry.k2.k()
            r3 = 0
            if (r2 == 0) goto L_0x0014
            java.lang.String r4 = "db"
            java.lang.String r5 = "androidx.work.impl.model.WorkSpecDao"
            io.sentry.m0 r2 = r2.q(r4, r5)
            goto L_0x0015
        L_0x0014:
            r2 = r3
        L_0x0015:
            java.lang.String r4 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?"
            r5 = 1
            androidx.room.u0 r4 = androidx.room.u0.f(r4, r5)
            if (r0 != 0) goto L_0x0022
            r4.b0(r5)
            goto L_0x0025
        L_0x0022:
            r4.K(r5, r0)
        L_0x0025:
            androidx.room.RoomDatabase r0 = r1.f15515a
            r0.d()
            androidx.room.RoomDatabase r0 = r1.f15515a
            r6 = 0
            android.database.Cursor r7 = m3.c.c(r0, r4, r6, r3)
            java.lang.String r0 = "required_network_type"
            int r0 = m3.b.e(r7, r0)     // Catch:{ Exception -> 0x01f9, all -> 0x01f5 }
            java.lang.String r8 = "requires_charging"
            int r8 = m3.b.e(r7, r8)     // Catch:{ Exception -> 0x01f9, all -> 0x01f5 }
            java.lang.String r9 = "requires_device_idle"
            int r9 = m3.b.e(r7, r9)     // Catch:{ Exception -> 0x01f9, all -> 0x01f5 }
            java.lang.String r10 = "requires_battery_not_low"
            int r10 = m3.b.e(r7, r10)     // Catch:{ Exception -> 0x01f9, all -> 0x01f5 }
            java.lang.String r11 = "requires_storage_not_low"
            int r11 = m3.b.e(r7, r11)     // Catch:{ Exception -> 0x01f9, all -> 0x01f5 }
            java.lang.String r12 = "trigger_content_update_delay"
            int r12 = m3.b.e(r7, r12)     // Catch:{ Exception -> 0x01f9, all -> 0x01f5 }
            java.lang.String r13 = "trigger_max_content_delay"
            int r13 = m3.b.e(r7, r13)     // Catch:{ Exception -> 0x01f9, all -> 0x01f5 }
            java.lang.String r14 = "content_uri_triggers"
            int r14 = m3.b.e(r7, r14)     // Catch:{ Exception -> 0x01f9, all -> 0x01f5 }
            java.lang.String r15 = "id"
            int r15 = m3.b.e(r7, r15)     // Catch:{ Exception -> 0x01f9, all -> 0x01f5 }
            java.lang.String r3 = "state"
            int r3 = m3.b.e(r7, r3)     // Catch:{ Exception -> 0x01f9, all -> 0x01f5 }
            java.lang.String r5 = "worker_class_name"
            int r5 = m3.b.e(r7, r5)     // Catch:{ Exception -> 0x01f9, all -> 0x01f5 }
            java.lang.String r6 = "input_merger_class_name"
            int r6 = m3.b.e(r7, r6)     // Catch:{ Exception -> 0x01f9, all -> 0x01f5 }
            java.lang.String r1 = "input"
            int r1 = m3.b.e(r7, r1)     // Catch:{ Exception -> 0x01f9, all -> 0x01f5 }
            r16 = r4
            java.lang.String r4 = "output"
            int r4 = m3.b.e(r7, r4)     // Catch:{ Exception -> 0x01f3 }
            r17 = r2
            java.lang.String r2 = "initial_delay"
            int r2 = m3.b.e(r7, r2)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r18 = r2
            java.lang.String r2 = "interval_duration"
            int r2 = m3.b.e(r7, r2)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r19 = r2
            java.lang.String r2 = "flex_duration"
            int r2 = m3.b.e(r7, r2)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r20 = r2
            java.lang.String r2 = "run_attempt_count"
            int r2 = m3.b.e(r7, r2)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r21 = r2
            java.lang.String r2 = "backoff_policy"
            int r2 = m3.b.e(r7, r2)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r22 = r2
            java.lang.String r2 = "backoff_delay_duration"
            int r2 = m3.b.e(r7, r2)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r23 = r2
            java.lang.String r2 = "period_start_time"
            int r2 = m3.b.e(r7, r2)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r24 = r2
            java.lang.String r2 = "minimum_retention_duration"
            int r2 = m3.b.e(r7, r2)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r25 = r2
            java.lang.String r2 = "schedule_requested_at"
            int r2 = m3.b.e(r7, r2)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r26 = r2
            java.lang.String r2 = "run_in_foreground"
            int r2 = m3.b.e(r7, r2)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r27 = r2
            java.lang.String r2 = "out_of_quota_policy"
            int r2 = m3.b.e(r7, r2)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            boolean r28 = r7.moveToFirst()     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            if (r28 == 0) goto L_0x01da
            java.lang.String r15 = r7.getString(r15)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            java.lang.String r5 = r7.getString(r5)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r28 = r2
            d4.a r2 = new d4.a     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r2.<init>()     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            int r0 = r7.getInt(r0)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            androidx.work.NetworkType r0 = l4.v.e(r0)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r2.k(r0)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            int r0 = r7.getInt(r8)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            if (r0 == 0) goto L_0x0107
            r0 = 1
            goto L_0x0108
        L_0x0107:
            r0 = 0
        L_0x0108:
            r2.m(r0)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            int r0 = r7.getInt(r9)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            if (r0 == 0) goto L_0x0113
            r0 = 1
            goto L_0x0114
        L_0x0113:
            r0 = 0
        L_0x0114:
            r2.n(r0)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            int r0 = r7.getInt(r10)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            if (r0 == 0) goto L_0x011f
            r0 = 1
            goto L_0x0120
        L_0x011f:
            r0 = 0
        L_0x0120:
            r2.l(r0)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            int r0 = r7.getInt(r11)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            if (r0 == 0) goto L_0x012b
            r0 = 1
            goto L_0x012c
        L_0x012b:
            r0 = 0
        L_0x012c:
            r2.o(r0)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            long r8 = r7.getLong(r12)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r2.p(r8)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            long r8 = r7.getLong(r13)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r2.q(r8)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            byte[] r0 = r7.getBlob(r14)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            d4.b r0 = l4.v.b(r0)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r2.j(r0)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            l4.p r0 = new l4.p     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.<init>(r15, r5)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            int r3 = r7.getInt(r3)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            androidx.work.WorkInfo$State r3 = l4.v.g(r3)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.f15494b = r3     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            java.lang.String r3 = r7.getString(r6)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.f15496d = r3     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            byte[] r1 = r7.getBlob(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            androidx.work.b r1 = androidx.work.b.g(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.f15497e = r1     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            byte[] r1 = r7.getBlob(r4)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            androidx.work.b r1 = androidx.work.b.g(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.f15498f = r1     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r1 = r18
            long r3 = r7.getLong(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.f15499g = r3     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r1 = r19
            long r3 = r7.getLong(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.f15500h = r3     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r1 = r20
            long r3 = r7.getLong(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.f15501i = r3     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r1 = r21
            int r1 = r7.getInt(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.k = r1     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r1 = r22
            int r1 = r7.getInt(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            androidx.work.BackoffPolicy r1 = l4.v.d(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.f15502l = r1     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r1 = r23
            long r3 = r7.getLong(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.f15503m = r3     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r1 = r24
            long r3 = r7.getLong(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.n = r3     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r1 = r25
            long r3 = r7.getLong(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.f15504o = r3     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r1 = r26
            long r3 = r7.getLong(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.f15505p = r3     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r1 = r27
            int r1 = r7.getInt(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            if (r1 == 0) goto L_0x01c7
            r5 = 1
            goto L_0x01c8
        L_0x01c7:
            r5 = 0
        L_0x01c8:
            r0.q = r5     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r1 = r28
            int r1 = r7.getInt(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            androidx.work.OutOfQuotaPolicy r1 = l4.v.f(r1)     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.f15506r = r1     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r0.j = r2     // Catch:{ Exception -> 0x01ef, all -> 0x01eb }
            r3 = r0
            goto L_0x01db
        L_0x01da:
            r3 = 0
        L_0x01db:
            r7.close()
            if (r17 == 0) goto L_0x01e7
            io.sentry.SpanStatus r0 = io.sentry.SpanStatus.OK
            r2 = r17
            r2.n(r0)
        L_0x01e7:
            r16.release()
            return r3
        L_0x01eb:
            r0 = move-exception
            r2 = r17
            goto L_0x0208
        L_0x01ef:
            r0 = move-exception
            r2 = r17
            goto L_0x01fc
        L_0x01f3:
            r0 = move-exception
            goto L_0x01fc
        L_0x01f5:
            r0 = move-exception
            r16 = r4
            goto L_0x0208
        L_0x01f9:
            r0 = move-exception
            r16 = r4
        L_0x01fc:
            if (r2 == 0) goto L_0x0206
            io.sentry.SpanStatus r1 = io.sentry.SpanStatus.INTERNAL_ERROR     // Catch:{ all -> 0x0207 }
            r2.a(r1)     // Catch:{ all -> 0x0207 }
            r2.m(r0)     // Catch:{ all -> 0x0207 }
        L_0x0206:
            throw r0     // Catch:{ all -> 0x0207 }
        L_0x0207:
            r0 = move-exception
        L_0x0208:
            r7.close()
            if (r2 == 0) goto L_0x0210
            r2.finish()
        L_0x0210:
            r16.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.r.m(java.lang.String):l4.p");
    }

    public int n() {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        this.f15515a.d();
        k a11 = this.f15523i.a();
        this.f15515a.e();
        try {
            int n = a11.n();
            this.f15515a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            this.f15523i.f(a11);
            return n;
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            this.f15523i.f(a11);
            throw th2;
        }
    }

    public void o(p pVar) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        this.f15515a.d();
        this.f15515a.e();
        try {
            this.f15516b.h(pVar);
            this.f15515a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15515a.i();
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
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            throw th2;
        }
    }

    public int p(String str, long j11) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        this.f15515a.d();
        k a11 = this.f15522h.a();
        a11.R(1, j11);
        if (str == null) {
            a11.b0(2);
        } else {
            a11.K(2, str);
        }
        this.f15515a.e();
        try {
            int n = a11.n();
            this.f15515a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            this.f15522h.f(a11);
            return n;
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            this.f15522h.f(a11);
            throw th2;
        }
    }

    public List<p.b> q(String str) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        u0 f11 = u0.f("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f11.b0(1);
        } else {
            f11.K(1, str);
        }
        this.f15515a.d();
        Cursor c11 = m3.c.c(this.f15515a, f11, false, (CancellationSignal) null);
        try {
            int e11 = m3.b.e(c11, DistributedTracing.NR_ID_ATTRIBUTE);
            int e12 = m3.b.e(c11, HexAttribute.HEX_ATTR_THREAD_STATE);
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f15507a = c11.getString(e11);
                bVar.f15508b = v.g(c11.getInt(e12));
                arrayList.add(bVar);
            }
            c11.close();
            if (q != null) {
                q.n(SpanStatus.OK);
            }
            f11.release();
            return arrayList;
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

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0249 A[SYNTHETIC, Splitter:B:55:0x0249] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0258  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<l4.p> r(int r36) {
        /*
            r35 = this;
            r1 = r35
            io.sentry.m0 r0 = io.sentry.k2.k()
            r2 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.String r3 = "db"
            java.lang.String r4 = "androidx.work.impl.model.WorkSpecDao"
            io.sentry.m0 r0 = r0.q(r3, r4)
            r3 = r0
            goto L_0x0014
        L_0x0013:
            r3 = r2
        L_0x0014:
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))"
            r4 = 1
            androidx.room.u0 r5 = androidx.room.u0.f(r0, r4)
            r0 = r36
            long r6 = (long) r0
            r5.R(r4, r6)
            androidx.room.RoomDatabase r0 = r1.f15515a
            r0.d()
            androidx.room.RoomDatabase r0 = r1.f15515a
            r6 = 0
            android.database.Cursor r2 = m3.c.c(r0, r5, r6, r2)
            java.lang.String r0 = "required_network_type"
            int r0 = m3.b.e(r2, r0)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r7 = "requires_charging"
            int r7 = m3.b.e(r2, r7)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r8 = "requires_device_idle"
            int r8 = m3.b.e(r2, r8)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r9 = "requires_battery_not_low"
            int r9 = m3.b.e(r2, r9)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r10 = "requires_storage_not_low"
            int r10 = m3.b.e(r2, r10)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r11 = "trigger_content_update_delay"
            int r11 = m3.b.e(r2, r11)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r12 = "trigger_max_content_delay"
            int r12 = m3.b.e(r2, r12)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r13 = "content_uri_triggers"
            int r13 = m3.b.e(r2, r13)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r14 = "id"
            int r14 = m3.b.e(r2, r14)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r15 = "state"
            int r15 = m3.b.e(r2, r15)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r4 = "worker_class_name"
            int r4 = m3.b.e(r2, r4)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r6 = "input_merger_class_name"
            int r6 = m3.b.e(r2, r6)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            java.lang.String r1 = "input"
            int r1 = m3.b.e(r2, r1)     // Catch:{ Exception -> 0x0243, all -> 0x023e }
            r16 = r5
            java.lang.String r5 = "output"
            int r5 = m3.b.e(r2, r5)     // Catch:{ Exception -> 0x023b, all -> 0x0238 }
            r17 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r18 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r19 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r20 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r21 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r22 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r23 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r24 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r25 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r26 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r27 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r28 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r29 = r5
            int r5 = r2.getCount()     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
        L_0x00e8:
            boolean r5 = r2.moveToNext()     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            if (r5 == 0) goto L_0x0220
            java.lang.String r5 = r2.getString(r14)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r30 = r14
            java.lang.String r14 = r2.getString(r4)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r31 = r4
            d4.a r4 = new d4.a     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r4.<init>()     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            int r32 = r2.getInt(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r33 = r0
            androidx.work.NetworkType r0 = l4.v.e(r32)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r4.k(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            int r0 = r2.getInt(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            if (r0 == 0) goto L_0x0114
            r0 = 1
            goto L_0x0115
        L_0x0114:
            r0 = 0
        L_0x0115:
            r4.m(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            int r0 = r2.getInt(r8)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            if (r0 == 0) goto L_0x0120
            r0 = 1
            goto L_0x0121
        L_0x0120:
            r0 = 0
        L_0x0121:
            r4.n(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            int r0 = r2.getInt(r9)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            if (r0 == 0) goto L_0x012c
            r0 = 1
            goto L_0x012d
        L_0x012c:
            r0 = 0
        L_0x012d:
            r4.l(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            int r0 = r2.getInt(r10)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            if (r0 == 0) goto L_0x0138
            r0 = 1
            goto L_0x0139
        L_0x0138:
            r0 = 0
        L_0x0139:
            r4.o(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r0 = r7
            r32 = r8
            long r7 = r2.getLong(r11)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r4.p(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            long r7 = r2.getLong(r12)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r4.q(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            byte[] r7 = r2.getBlob(r13)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            d4.b r7 = l4.v.b(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r4.j(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            l4.p r7 = new l4.p     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.<init>(r5, r14)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            int r5 = r2.getInt(r15)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            androidx.work.WorkInfo$State r5 = l4.v.g(r5)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15494b = r5     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            java.lang.String r5 = r2.getString(r6)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15496d = r5     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            byte[] r5 = r2.getBlob(r1)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            androidx.work.b r5 = androidx.work.b.g(r5)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15497e = r5     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r5 = r29
            byte[] r8 = r2.getBlob(r5)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            androidx.work.b r8 = androidx.work.b.g(r8)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15498f = r8     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r14 = r1
            r8 = r18
            r18 = r0
            long r0 = r2.getLong(r8)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15499g = r0     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r29 = r5
            r1 = r6
            r0 = r19
            long r5 = r2.getLong(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15500h = r5     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r19 = r0
            r6 = r1
            r5 = r20
            long r0 = r2.getLong(r5)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15501i = r0     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r0 = r21
            int r1 = r2.getInt(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.k = r1     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r1 = r22
            int r20 = r2.getInt(r1)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r21 = r0
            androidx.work.BackoffPolicy r0 = l4.v.d(r20)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15502l = r0     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r20 = r5
            r22 = r6
            r0 = r23
            long r5 = r2.getLong(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15503m = r5     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r23 = r0
            r6 = r1
            r5 = r24
            long r0 = r2.getLong(r5)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.n = r0     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r24 = r5
            r1 = r6
            r0 = r25
            long r5 = r2.getLong(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15504o = r5     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r25 = r0
            r6 = r1
            r5 = r26
            long r0 = r2.getLong(r5)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15505p = r0     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r0 = r27
            int r1 = r2.getInt(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            if (r1 == 0) goto L_0x01f1
            r1 = 1
            goto L_0x01f2
        L_0x01f1:
            r1 = 0
        L_0x01f2:
            r7.q = r1     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r1 = r28
            int r26 = r2.getInt(r1)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r27 = r0
            androidx.work.OutOfQuotaPolicy r0 = l4.v.f(r26)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.f15506r = r0     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r7.j = r4     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r3.add(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0230 }
            r28 = r1
            r26 = r5
            r1 = r14
            r7 = r18
            r14 = r30
            r4 = r31
            r0 = r33
            r18 = r8
            r8 = r32
            r34 = r22
            r22 = r6
            r6 = r34
            goto L_0x00e8
        L_0x0220:
            r2.close()
            if (r17 == 0) goto L_0x022c
            io.sentry.SpanStatus r0 = io.sentry.SpanStatus.OK
            r1 = r17
            r1.n(r0)
        L_0x022c:
            r16.release()
            return r3
        L_0x0230:
            r0 = move-exception
            r1 = r17
            goto L_0x0253
        L_0x0234:
            r0 = move-exception
            r1 = r17
            goto L_0x0247
        L_0x0238:
            r0 = move-exception
            r1 = r3
            goto L_0x0253
        L_0x023b:
            r0 = move-exception
            r1 = r3
            goto L_0x0247
        L_0x023e:
            r0 = move-exception
            r1 = r3
            r16 = r5
            goto L_0x0253
        L_0x0243:
            r0 = move-exception
            r1 = r3
            r16 = r5
        L_0x0247:
            if (r1 == 0) goto L_0x0251
            io.sentry.SpanStatus r3 = io.sentry.SpanStatus.INTERNAL_ERROR     // Catch:{ all -> 0x0252 }
            r1.a(r3)     // Catch:{ all -> 0x0252 }
            r1.m(r0)     // Catch:{ all -> 0x0252 }
        L_0x0251:
            throw r0     // Catch:{ all -> 0x0252 }
        L_0x0252:
            r0 = move-exception
        L_0x0253:
            r2.close()
            if (r1 == 0) goto L_0x025b
            r1.finish()
        L_0x025b:
            r16.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.r.r(int):java.util.List");
    }

    public void s(String str, androidx.work.b bVar) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        this.f15515a.d();
        k a11 = this.f15518d.a();
        byte[] m11 = androidx.work.b.m(bVar);
        if (m11 == null) {
            a11.b0(1);
        } else {
            a11.S(1, m11);
        }
        if (str == null) {
            a11.b0(2);
        } else {
            a11.K(2, str);
        }
        this.f15515a.e();
        try {
            a11.n();
            this.f15515a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            this.f15518d.f(a11);
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            this.f15518d.f(a11);
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0242 A[SYNTHETIC, Splitter:B:55:0x0242] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0251  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<l4.p> t() {
        /*
            r35 = this;
            r1 = r35
            io.sentry.m0 r0 = io.sentry.k2.k()
            r2 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.String r3 = "db"
            java.lang.String r4 = "androidx.work.impl.model.WorkSpecDao"
            io.sentry.m0 r0 = r0.q(r3, r4)
            r3 = r0
            goto L_0x0014
        L_0x0013:
            r3 = r2
        L_0x0014:
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1"
            r4 = 0
            androidx.room.u0 r5 = androidx.room.u0.f(r0, r4)
            androidx.room.RoomDatabase r0 = r1.f15515a
            r0.d()
            androidx.room.RoomDatabase r0 = r1.f15515a
            android.database.Cursor r2 = m3.c.c(r0, r5, r4, r2)
            java.lang.String r0 = "required_network_type"
            int r0 = m3.b.e(r2, r0)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r6 = "requires_charging"
            int r6 = m3.b.e(r2, r6)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r7 = "requires_device_idle"
            int r7 = m3.b.e(r2, r7)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r8 = "requires_battery_not_low"
            int r8 = m3.b.e(r2, r8)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r9 = "requires_storage_not_low"
            int r9 = m3.b.e(r2, r9)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r10 = "trigger_content_update_delay"
            int r10 = m3.b.e(r2, r10)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r11 = "trigger_max_content_delay"
            int r11 = m3.b.e(r2, r11)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r12 = "content_uri_triggers"
            int r12 = m3.b.e(r2, r12)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r13 = "id"
            int r13 = m3.b.e(r2, r13)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r14 = "state"
            int r14 = m3.b.e(r2, r14)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r15 = "worker_class_name"
            int r15 = m3.b.e(r2, r15)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r4 = "input_merger_class_name"
            int r4 = m3.b.e(r2, r4)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            java.lang.String r1 = "input"
            int r1 = m3.b.e(r2, r1)     // Catch:{ Exception -> 0x023c, all -> 0x0237 }
            r16 = r5
            java.lang.String r5 = "output"
            int r5 = m3.b.e(r2, r5)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
            r17 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r18 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r19 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r20 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r21 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r22 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r23 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r24 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r25 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r26 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r27 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = m3.b.e(r2, r3)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r28 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r29 = r5
            int r5 = r2.getCount()     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
        L_0x00e1:
            boolean r5 = r2.moveToNext()     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            if (r5 == 0) goto L_0x0219
            java.lang.String r5 = r2.getString(r13)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r30 = r13
            java.lang.String r13 = r2.getString(r15)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r31 = r15
            d4.a r15 = new d4.a     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r15.<init>()     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            int r32 = r2.getInt(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r33 = r0
            androidx.work.NetworkType r0 = l4.v.e(r32)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r15.k(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            int r0 = r2.getInt(r6)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r32 = 1
            if (r0 == 0) goto L_0x010f
            r0 = 1
            goto L_0x0110
        L_0x010f:
            r0 = 0
        L_0x0110:
            r15.m(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            int r0 = r2.getInt(r7)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            if (r0 == 0) goto L_0x011b
            r0 = 1
            goto L_0x011c
        L_0x011b:
            r0 = 0
        L_0x011c:
            r15.n(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            int r0 = r2.getInt(r8)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            if (r0 == 0) goto L_0x0127
            r0 = 1
            goto L_0x0128
        L_0x0127:
            r0 = 0
        L_0x0128:
            r15.l(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            int r0 = r2.getInt(r9)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            if (r0 == 0) goto L_0x0133
            r0 = 1
            goto L_0x0134
        L_0x0133:
            r0 = 0
        L_0x0134:
            r15.o(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r0 = r6
            r34 = r7
            long r6 = r2.getLong(r10)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r15.p(r6)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            long r6 = r2.getLong(r11)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r15.q(r6)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            byte[] r6 = r2.getBlob(r12)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            d4.b r6 = l4.v.b(r6)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r15.j(r6)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            l4.p r6 = new l4.p     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.<init>(r5, r13)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            int r5 = r2.getInt(r14)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            androidx.work.WorkInfo$State r5 = l4.v.g(r5)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15494b = r5     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            java.lang.String r5 = r2.getString(r4)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15496d = r5     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            byte[] r5 = r2.getBlob(r1)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            androidx.work.b r5 = androidx.work.b.g(r5)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15497e = r5     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r5 = r29
            byte[] r7 = r2.getBlob(r5)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            androidx.work.b r7 = androidx.work.b.g(r7)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15498f = r7     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r13 = r1
            r7 = r18
            r18 = r0
            long r0 = r2.getLong(r7)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15499g = r0     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r1 = r4
            r29 = r5
            r0 = r19
            long r4 = r2.getLong(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15500h = r4     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r19 = r0
            r5 = r1
            r4 = r20
            long r0 = r2.getLong(r4)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15501i = r0     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r0 = r21
            int r1 = r2.getInt(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.k = r1     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r1 = r22
            int r20 = r2.getInt(r1)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r21 = r0
            androidx.work.BackoffPolicy r0 = l4.v.d(r20)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15502l = r0     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r20 = r4
            r22 = r5
            r0 = r23
            long r4 = r2.getLong(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15503m = r4     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r23 = r0
            r5 = r1
            r4 = r24
            long r0 = r2.getLong(r4)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.n = r0     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r24 = r4
            r1 = r5
            r0 = r25
            long r4 = r2.getLong(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15504o = r4     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r25 = r0
            r5 = r1
            r4 = r26
            long r0 = r2.getLong(r4)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15505p = r0     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r0 = r27
            int r1 = r2.getInt(r0)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            if (r1 == 0) goto L_0x01ec
            r1 = 1
            goto L_0x01ed
        L_0x01ec:
            r1 = 0
        L_0x01ed:
            r6.q = r1     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r1 = r28
            int r26 = r2.getInt(r1)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r27 = r0
            androidx.work.OutOfQuotaPolicy r0 = l4.v.f(r26)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.f15506r = r0     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r6.j = r15     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r3.add(r6)     // Catch:{ Exception -> 0x022d, all -> 0x0229 }
            r28 = r1
            r26 = r4
            r1 = r13
            r6 = r18
            r4 = r22
            r13 = r30
            r15 = r31
            r0 = r33
            r22 = r5
            r18 = r7
            r7 = r34
            goto L_0x00e1
        L_0x0219:
            r2.close()
            if (r17 == 0) goto L_0x0225
            io.sentry.SpanStatus r0 = io.sentry.SpanStatus.OK
            r1 = r17
            r1.n(r0)
        L_0x0225:
            r16.release()
            return r3
        L_0x0229:
            r0 = move-exception
            r1 = r17
            goto L_0x024c
        L_0x022d:
            r0 = move-exception
            r1 = r17
            goto L_0x0240
        L_0x0231:
            r0 = move-exception
            r1 = r3
            goto L_0x024c
        L_0x0234:
            r0 = move-exception
            r1 = r3
            goto L_0x0240
        L_0x0237:
            r0 = move-exception
            r1 = r3
            r16 = r5
            goto L_0x024c
        L_0x023c:
            r0 = move-exception
            r1 = r3
            r16 = r5
        L_0x0240:
            if (r1 == 0) goto L_0x024a
            io.sentry.SpanStatus r3 = io.sentry.SpanStatus.INTERNAL_ERROR     // Catch:{ all -> 0x024b }
            r1.a(r3)     // Catch:{ all -> 0x024b }
            r1.m(r0)     // Catch:{ all -> 0x024b }
        L_0x024a:
            throw r0     // Catch:{ all -> 0x024b }
        L_0x024b:
            r0 = move-exception
        L_0x024c:
            r2.close()
            if (r1 == 0) goto L_0x0254
            r1.finish()
        L_0x0254:
            r16.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.r.t():java.util.List");
    }

    public List<p.c> u(String str) {
        Cursor c11;
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        u0 f11 = u0.f("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            f11.b0(1);
        } else {
            f11.K(1, str);
        }
        this.f15515a.d();
        this.f15515a.e();
        try {
            c11 = m3.c.c(this.f15515a, f11, true, (CancellationSignal) null);
            int e11 = m3.b.e(c11, DistributedTracing.NR_ID_ATTRIBUTE);
            int e12 = m3.b.e(c11, HexAttribute.HEX_ATTR_THREAD_STATE);
            int e13 = m3.b.e(c11, "output");
            int e14 = m3.b.e(c11, "run_attempt_count");
            androidx.collection.a aVar = new androidx.collection.a();
            androidx.collection.a aVar2 = new androidx.collection.a();
            while (c11.moveToNext()) {
                if (!c11.isNull(e11)) {
                    String string = c11.getString(e11);
                    if (((ArrayList) aVar.get(string)) == null) {
                        aVar.put(string, new ArrayList());
                    }
                }
                if (!c11.isNull(e11)) {
                    String string2 = c11.getString(e11);
                    if (((ArrayList) aVar2.get(string2)) == null) {
                        aVar2.put(string2, new ArrayList());
                    }
                }
            }
            c11.moveToPosition(-1);
            x(aVar);
            w(aVar2);
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                ArrayList arrayList2 = !c11.isNull(e11) ? (ArrayList) aVar.get(c11.getString(e11)) : null;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = !c11.isNull(e11) ? (ArrayList) aVar2.get(c11.getString(e11)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                p.c cVar = new p.c();
                cVar.f15509a = c11.getString(e11);
                cVar.f15510b = v.g(c11.getInt(e12));
                cVar.f15511c = androidx.work.b.g(c11.getBlob(e13));
                cVar.f15512d = c11.getInt(e14);
                cVar.f15513e = arrayList2;
                cVar.f15514f = arrayList3;
                arrayList.add(cVar);
            }
            this.f15515a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            c11.close();
            f11.release();
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            return arrayList;
        } catch (Exception e15) {
            if (q != null) {
                try {
                    q.a(SpanStatus.INTERNAL_ERROR);
                    q.m(e15);
                } catch (Throwable th2) {
                    this.f15515a.i();
                    if (q != null) {
                        q.finish();
                    }
                    throw th2;
                }
            }
            throw e15;
        } catch (Throwable th3) {
            c11.close();
            f11.release();
            throw th3;
        }
    }

    public int v(String str) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db", "androidx.work.impl.model.WorkSpecDao") : null;
        this.f15515a.d();
        k a11 = this.f15520f.a();
        if (str == null) {
            a11.b0(1);
        } else {
            a11.K(1, str);
        }
        this.f15515a.e();
        try {
            int n = a11.n();
            this.f15515a.C();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            this.f15520f.f(a11);
            return n;
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            this.f15515a.i();
            if (q != null) {
                q.finish();
            }
            this.f15520f.f(a11);
            throw th2;
        }
    }
}

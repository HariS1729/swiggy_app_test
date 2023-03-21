package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.room.t0;
import androidx.room.x;
import com.newrelic.agent.android.agentdata.HexAttribute;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import l4.b;
import l4.e;
import l4.f;
import l4.h;
import l4.i;
import l4.k;
import l4.l;
import l4.n;
import l4.o;
import l4.q;
import l4.r;
import l4.t;
import l4.u;
import m3.c;
import m3.g;
import t3.g;
import t3.h;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: p  reason: collision with root package name */
    private volatile q f12352p;
    private volatile b q;

    /* renamed from: r  reason: collision with root package name */
    private volatile t f12353r;

    /* renamed from: s  reason: collision with root package name */
    private volatile h f12354s;
    private volatile k t;

    /* renamed from: u  reason: collision with root package name */
    private volatile n f12355u;
    private volatile e v;

    class a extends t0.a {
        a(int i11) {
            super(i11);
        }

        public void a(g gVar) {
            gVar.m0("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.m0("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.m0("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.m0("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            gVar.m0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.m0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            gVar.m0("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.m0("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.m0("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.m0("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.m0("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.m0("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.m0("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.m0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.m0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        public void b(g gVar) {
            gVar.m0("DROP TABLE IF EXISTS `Dependency`");
            gVar.m0("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.m0("DROP TABLE IF EXISTS `WorkTag`");
            gVar.m0("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.m0("DROP TABLE IF EXISTS `WorkName`");
            gVar.m0("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.m0("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f11505h != null) {
                int size = WorkDatabase_Impl.this.f11505h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.b) WorkDatabase_Impl.this.f11505h.get(i11)).b(gVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void c(g gVar) {
            if (WorkDatabase_Impl.this.f11505h != null) {
                int size = WorkDatabase_Impl.this.f11505h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.b) WorkDatabase_Impl.this.f11505h.get(i11)).a(gVar);
                }
            }
        }

        public void d(g gVar) {
            g unused = WorkDatabase_Impl.this.f11498a = gVar;
            gVar.m0("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.v(gVar);
            if (WorkDatabase_Impl.this.f11505h != null) {
                int size = WorkDatabase_Impl.this.f11505h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.b) WorkDatabase_Impl.this.f11505h.get(i11)).c(gVar);
                }
            }
        }

        public void e(g gVar) {
        }

        public void f(g gVar) {
            c.b(gVar);
        }

        /* access modifiers changed from: protected */
        public t0.b g(g gVar) {
            g gVar2 = gVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new g.a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{DistributedTracing.NR_ID_ATTRIBUTE})));
            hashSet.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{DistributedTracing.NR_ID_ATTRIBUTE})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new g.d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            hashSet2.add(new g.d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
            m3.g gVar3 = new m3.g("Dependency", hashMap, hashSet, hashSet2);
            m3.g a11 = m3.g.a(gVar2, "Dependency");
            if (!gVar3.equals(a11)) {
                return new t0.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gVar3 + "\n Found:\n" + a11);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put(DistributedTracing.NR_ID_ATTRIBUTE, new g.a(DistributedTracing.NR_ID_ATTRIBUTE, "TEXT", true, 1, (String) null, 1));
            hashMap2.put(HexAttribute.HEX_ATTR_THREAD_STATE, new g.a(HexAttribute.HEX_ATTR_THREAD_STATE, "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new g.a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new g.a("input_merger_class_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("input", new g.a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new g.a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new g.a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new g.a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new g.a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new g.a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new g.a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new g.a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_start_time", new g.a("period_start_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("minimum_retention_duration", new g.a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new g.a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new g.a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new g.a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("required_network_type", new g.a("required_network_type", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("requires_charging", new g.a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new g.a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new g.a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new g.a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new g.a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new g.a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new g.a("content_uri_triggers", "BLOB", false, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new g.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
            hashSet4.add(new g.d("index_WorkSpec_period_start_time", false, Arrays.asList(new String[]{"period_start_time"})));
            m3.g gVar4 = new m3.g("WorkSpec", hashMap2, hashSet3, hashSet4);
            m3.g a12 = m3.g.a(gVar2, "WorkSpec");
            if (!gVar4.equals(a12)) {
                return new t0.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gVar4 + "\n Found:\n" + a12);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new g.a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{DistributedTracing.NR_ID_ATTRIBUTE})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new g.d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            m3.g gVar5 = new m3.g("WorkTag", hashMap3, hashSet5, hashSet6);
            m3.g a13 = m3.g.a(gVar2, "WorkTag");
            if (!gVar5.equals(a13)) {
                return new t0.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gVar5 + "\n Found:\n" + a13);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("system_id", new g.a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{DistributedTracing.NR_ID_ATTRIBUTE})));
            m3.g gVar6 = new m3.g("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            m3.g a14 = m3.g.a(gVar2, "SystemIdInfo");
            if (!gVar6.equals(a14)) {
                return new t0.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gVar6 + "\n Found:\n" + a14);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new g.a("name", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{DistributedTracing.NR_ID_ATTRIBUTE})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new g.d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            m3.g gVar7 = new m3.g("WorkName", hashMap5, hashSet8, hashSet9);
            m3.g a15 = m3.g.a(gVar2, "WorkName");
            if (!gVar7.equals(a15)) {
                return new t0.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gVar7 + "\n Found:\n" + a15);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new g.a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{DistributedTracing.NR_ID_ATTRIBUTE})));
            m3.g gVar8 = new m3.g("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            m3.g a16 = m3.g.a(gVar2, "WorkProgress");
            if (!gVar8.equals(a16)) {
                return new t0.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gVar8 + "\n Found:\n" + a16);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put(HttpRequest.HEADER_KEY, new g.a(HttpRequest.HEADER_KEY, "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new g.a("long_value", "INTEGER", false, 0, (String) null, 1));
            m3.g gVar9 = new m3.g("Preference", hashMap7, new HashSet(0), new HashSet(0));
            m3.g a17 = m3.g.a(gVar2, "Preference");
            if (gVar9.equals(a17)) {
                return new t0.b(true, (String) null);
            }
            return new t0.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gVar9 + "\n Found:\n" + a17);
        }
    }

    public b F() {
        b bVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new l4.c(this);
            }
            bVar = this.q;
        }
        return bVar;
    }

    public e J() {
        e eVar;
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            if (this.v == null) {
                this.v = new f(this);
            }
            eVar = this.v;
        }
        return eVar;
    }

    public h K() {
        h hVar;
        if (this.f12354s != null) {
            return this.f12354s;
        }
        synchronized (this) {
            if (this.f12354s == null) {
                this.f12354s = new i(this);
            }
            hVar = this.f12354s;
        }
        return hVar;
    }

    public k L() {
        k kVar;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            if (this.t == null) {
                this.t = new l(this);
            }
            kVar = this.t;
        }
        return kVar;
    }

    public n M() {
        n nVar;
        if (this.f12355u != null) {
            return this.f12355u;
        }
        synchronized (this) {
            if (this.f12355u == null) {
                this.f12355u = new o(this);
            }
            nVar = this.f12355u;
        }
        return nVar;
    }

    public q N() {
        q qVar;
        if (this.f12352p != null) {
            return this.f12352p;
        }
        synchronized (this) {
            if (this.f12352p == null) {
                this.f12352p = new r(this);
            }
            qVar = this.f12352p;
        }
        return qVar;
    }

    public t O() {
        t tVar;
        if (this.f12353r != null) {
            return this.f12353r;
        }
        synchronized (this) {
            if (this.f12353r == null) {
                this.f12353r = new u(this);
            }
            tVar = this.f12353r;
        }
        return tVar;
    }

    /* access modifiers changed from: protected */
    public x g() {
        return new x(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* access modifiers changed from: protected */
    public t3.h h(androidx.room.o oVar) {
        return oVar.f11591a.a(h.b.a(oVar.f11592b).c(oVar.f11593c).b(new t0(oVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }
}

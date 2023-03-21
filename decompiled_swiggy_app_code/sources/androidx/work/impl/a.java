package androidx.work.impl;

import android.content.Context;
import android.os.Build;

/* compiled from: WorkDatabaseMigrations */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static l3.b f12357a = new C0094a(1, 2);

    /* renamed from: b  reason: collision with root package name */
    public static l3.b f12358b = new b(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static l3.b f12359c = new c(4, 5);

    /* renamed from: d  reason: collision with root package name */
    public static l3.b f12360d = new d(6, 7);

    /* renamed from: e  reason: collision with root package name */
    public static l3.b f12361e = new e(7, 8);

    /* renamed from: f  reason: collision with root package name */
    public static l3.b f12362f = new f(8, 9);

    /* renamed from: g  reason: collision with root package name */
    public static l3.b f12363g = new g(11, 12);

    /* renamed from: androidx.work.impl.a$a  reason: collision with other inner class name */
    /* compiled from: WorkDatabaseMigrations */
    class C0094a extends l3.b {
        C0094a(int i11, int i12) {
            super(i11, i12);
        }

        public void a(t3.g gVar) {
            gVar.m0("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.m0("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            gVar.m0("DROP TABLE IF EXISTS alarmInfo");
            gVar.m0("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    class b extends l3.b {
        b(int i11, int i12) {
            super(i11, i12);
        }

        public void a(t3.g gVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                gVar.m0("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    class c extends l3.b {
        c(int i11, int i12) {
            super(i11, i12);
        }

        public void a(t3.g gVar) {
            gVar.m0("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            gVar.m0("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    class d extends l3.b {
        d(int i11, int i12) {
            super(i11, i12);
        }

        public void a(t3.g gVar) {
            gVar.m0("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    class e extends l3.b {
        e(int i11, int i12) {
            super(i11, i12);
        }

        public void a(t3.g gVar) {
            gVar.m0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    class f extends l3.b {
        f(int i11, int i12) {
            super(i11, i12);
        }

        public void a(t3.g gVar) {
            gVar.m0("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    class g extends l3.b {
        g(int i11, int i12) {
            super(i11, i12);
        }

        public void a(t3.g gVar) {
            gVar.m0("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class h extends l3.b {

        /* renamed from: c  reason: collision with root package name */
        final Context f12364c;

        public h(Context context, int i11, int i12) {
            super(i11, i12);
            this.f12364c = context;
        }

        public void a(t3.g gVar) {
            if (this.f15460b >= 10) {
                gVar.z0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            this.f12364c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class i extends l3.b {

        /* renamed from: c  reason: collision with root package name */
        final Context f12365c;

        public i(Context context) {
            super(9, 10);
            this.f12365c = context;
        }

        public void a(t3.g gVar) {
            gVar.m0("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            m4.e.b(this.f12365c, gVar);
            m4.c.a(this.f12365c, gVar);
        }
    }
}

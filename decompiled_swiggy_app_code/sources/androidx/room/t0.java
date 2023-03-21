package androidx.room;

import android.database.Cursor;
import java.util.List;
import t3.g;
import t3.h;

/* compiled from: RoomOpenHelper */
public class t0 extends h.a {

    /* renamed from: b  reason: collision with root package name */
    private o f11615b;

    /* renamed from: c  reason: collision with root package name */
    private final a f11616c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11617d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11618e;

    /* compiled from: RoomOpenHelper */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11619a;

        public a(int i11) {
            this.f11619a = i11;
        }

        /* access modifiers changed from: protected */
        public abstract void a(g gVar);

        /* access modifiers changed from: protected */
        public abstract void b(g gVar);

        /* access modifiers changed from: protected */
        public abstract void c(g gVar);

        /* access modifiers changed from: protected */
        public abstract void d(g gVar);

        /* access modifiers changed from: protected */
        public abstract void e(g gVar);

        /* access modifiers changed from: protected */
        public abstract void f(g gVar);

        /* access modifiers changed from: protected */
        public abstract b g(g gVar);
    }

    /* compiled from: RoomOpenHelper */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f11620a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11621b;

        public b(boolean z11, String str) {
            this.f11620a = z11;
            this.f11621b = str;
        }
    }

    public t0(o oVar, a aVar, String str, String str2) {
        super(aVar.f11619a);
        this.f11615b = oVar;
        this.f11616c = aVar;
        this.f11617d = str;
        this.f11618e = str2;
    }

    /* JADX INFO: finally extract failed */
    private void h(g gVar) {
        if (k(gVar)) {
            String str = null;
            Cursor j02 = gVar.j0(new t3.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (j02.moveToFirst()) {
                    str = j02.getString(0);
                }
                j02.close();
                if (!this.f11617d.equals(str) && !this.f11618e.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th2) {
                j02.close();
                throw th2;
            }
        } else {
            b g11 = this.f11616c.g(gVar);
            if (g11.f11620a) {
                this.f11616c.e(gVar);
                l(gVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g11.f11621b);
        }
    }

    private void i(g gVar) {
        gVar.m0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(g gVar) {
        Cursor b12 = gVar.b1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z11 = false;
            if (b12.moveToFirst() && b12.getInt(0) == 0) {
                z11 = true;
            }
            return z11;
        } finally {
            b12.close();
        }
    }

    private static boolean k(g gVar) {
        Cursor b12 = gVar.b1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z11 = false;
            if (b12.moveToFirst() && b12.getInt(0) != 0) {
                z11 = true;
            }
            return z11;
        } finally {
            b12.close();
        }
    }

    private void l(g gVar) {
        i(gVar);
        gVar.m0(s0.a(this.f11617d));
    }

    public void b(g gVar) {
        super.b(gVar);
    }

    public void d(g gVar) {
        boolean j = j(gVar);
        this.f11616c.a(gVar);
        if (!j) {
            b g11 = this.f11616c.g(gVar);
            if (!g11.f11620a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g11.f11621b);
            }
        }
        l(gVar);
        this.f11616c.c(gVar);
    }

    public void e(g gVar, int i11, int i12) {
        g(gVar, i11, i12);
    }

    public void f(g gVar) {
        super.f(gVar);
        h(gVar);
        this.f11616c.d(gVar);
        this.f11615b = null;
    }

    public void g(g gVar, int i11, int i12) {
        boolean z11;
        List<l3.b> c11;
        o oVar = this.f11615b;
        if (oVar == null || (c11 = oVar.f11594d.c(i11, i12)) == null) {
            z11 = false;
        } else {
            this.f11616c.f(gVar);
            for (l3.b a11 : c11) {
                a11.a(gVar);
            }
            b g11 = this.f11616c.g(gVar);
            if (g11.f11620a) {
                this.f11616c.e(gVar);
                l(gVar);
                z11 = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g11.f11621b);
            }
        }
        if (!z11) {
            o oVar2 = this.f11615b;
            if (oVar2 == null || oVar2.a(i11, i12)) {
                throw new IllegalStateException("A migration from " + i11 + " to " + i12 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f11616c.b(gVar);
            this.f11616c.a(gVar);
        }
    }
}

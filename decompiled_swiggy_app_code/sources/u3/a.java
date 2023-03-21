package u3;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import io.sentry.SpanStatus;
import io.sentry.k2;
import io.sentry.m0;
import java.io.IOException;
import java.util.List;
import t3.g;
import t3.j;
import t3.k;

/* compiled from: FrameworkSQLiteDatabase */
class a implements g {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f16972b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f16973c = new String[0];

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f16974a;

    /* renamed from: u3.a$a  reason: collision with other inner class name */
    /* compiled from: FrameworkSQLiteDatabase */
    class C0191a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f16975a;

        C0191a(j jVar) {
            this.f16975a = jVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f16975a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* compiled from: FrameworkSQLiteDatabase */
    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f16977a;

        b(j jVar) {
            this.f16977a = jVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f16977a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    a(SQLiteDatabase sQLiteDatabase) {
        this.f16974a = sQLiteDatabase;
    }

    public void C0() {
        this.f16974a.endTransaction();
    }

    public k T0(String str) {
        return new e(this.f16974a.compileStatement(str));
    }

    /* access modifiers changed from: package-private */
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f16974a == sQLiteDatabase;
    }

    public Cursor b1(String str) {
        return j0(new t3.a(str));
    }

    public Cursor c0(j jVar, CancellationSignal cancellationSignal) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db.sql.query", jVar.a()) : null;
        try {
            Cursor e11 = t3.b.e(this.f16974a, jVar.a(), f16973c, (String) null, cancellationSignal, new b(jVar));
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            if (q != null) {
                q.finish();
            }
            return e11;
        } catch (Exception e12) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e12);
            }
            throw e12;
        } catch (Throwable th2) {
            if (q != null) {
                q.finish();
            }
            throw th2;
        }
    }

    public void close() throws IOException {
        this.f16974a.close();
    }

    public boolean f1() {
        return this.f16974a.inTransaction();
    }

    public boolean g1() {
        return t3.b.d(this.f16974a);
    }

    public String getPath() {
        return this.f16974a.getPath();
    }

    public boolean isOpen() {
        return this.f16974a.isOpen();
    }

    public Cursor j0(j jVar) {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db.sql.query", jVar.a()) : null;
        try {
            Cursor rawQueryWithFactory = this.f16974a.rawQueryWithFactory(new C0191a(jVar), jVar.a(), f16973c, (String) null);
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            if (q != null) {
                q.finish();
            }
            return rawQueryWithFactory;
        } catch (Exception e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            if (q != null) {
                q.finish();
            }
            throw th2;
        }
    }

    public void l() {
        this.f16974a.beginTransaction();
    }

    public List<Pair<String, String>> m() {
        return this.f16974a.getAttachedDbs();
    }

    public void m0(String str) throws SQLException {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db.sql.query", str) : null;
        try {
            this.f16974a.execSQL(str);
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            if (q != null) {
                q.finish();
            }
        } catch (SQLException e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            if (q != null) {
                q.finish();
            }
            throw th2;
        }
    }

    public void s() {
        this.f16974a.beginTransactionNonExclusive();
    }

    public void y0() {
        this.f16974a.setTransactionSuccessful();
    }

    public void z0(String str, Object[] objArr) throws SQLException {
        m0 k = k2.k();
        m0 q = k != null ? k.q("db.sql.query", str) : null;
        try {
            this.f16974a.execSQL(str, objArr);
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            if (q != null) {
                q.finish();
            }
        } catch (SQLException e11) {
            if (q != null) {
                q.a(SpanStatus.INTERNAL_ERROR);
                q.m(e11);
            }
            throw e11;
        } catch (Throwable th2) {
            if (q != null) {
                q.finish();
            }
            throw th2;
        }
    }
}

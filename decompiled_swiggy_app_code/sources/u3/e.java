package u3;

import android.database.sqlite.SQLiteStatement;
import io.sentry.SpanStatus;
import io.sentry.k2;
import io.sentry.m0;
import t3.k;

/* compiled from: FrameworkSQLiteStatement */
class e extends d implements k {

    /* renamed from: b  reason: collision with root package name */
    private final SQLiteStatement f16992b;

    e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f16992b = sQLiteStatement;
    }

    public long P0() {
        String sQLiteStatement = this.f16992b.toString();
        String substring = sQLiteStatement.substring(sQLiteStatement.indexOf(58) + 2);
        m0 k = k2.k();
        m0 q = k != null ? k.q("db.sql.query", substring) : null;
        try {
            long executeInsert = this.f16992b.executeInsert();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            if (q != null) {
                q.finish();
            }
            return executeInsert;
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

    public int n() {
        String sQLiteStatement = this.f16992b.toString();
        String substring = sQLiteStatement.substring(sQLiteStatement.indexOf(58) + 2);
        m0 k = k2.k();
        m0 q = k != null ? k.q("db.sql.query", substring) : null;
        try {
            int executeUpdateDelete = this.f16992b.executeUpdateDelete();
            if (q != null) {
                q.a(SpanStatus.OK);
            }
            if (q != null) {
                q.finish();
            }
            return executeUpdateDelete;
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
}

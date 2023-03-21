package u3;

import android.database.sqlite.SQLiteProgram;
import t3.i;

/* compiled from: FrameworkSQLiteProgram */
class d implements i {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteProgram f16991a;

    d(SQLiteProgram sQLiteProgram) {
        this.f16991a = sQLiteProgram;
    }

    public void K(int i11, String str) {
        this.f16991a.bindString(i11, str);
    }

    public void R(int i11, long j) {
        this.f16991a.bindLong(i11, j);
    }

    public void S(int i11, byte[] bArr) {
        this.f16991a.bindBlob(i11, bArr);
    }

    public void b0(int i11) {
        this.f16991a.bindNull(i11);
    }

    public void close() {
        this.f16991a.close();
    }

    public void o0(int i11, double d11) {
        this.f16991a.bindDouble(i11, d11);
    }
}

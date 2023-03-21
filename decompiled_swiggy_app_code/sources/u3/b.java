package u3;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import t3.d;
import t3.g;
import t3.h;

/* compiled from: FrameworkSQLiteOpenHelper */
class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16979a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16980b;

    /* renamed from: c  reason: collision with root package name */
    private final h.a f16981c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f16982d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f16983e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private a f16984f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f16985g;

    /* compiled from: FrameworkSQLiteOpenHelper */
    static class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        final a[] f16986a;

        /* renamed from: b  reason: collision with root package name */
        final h.a f16987b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f16988c;

        /* renamed from: u3.b$a$a  reason: collision with other inner class name */
        /* compiled from: FrameworkSQLiteOpenHelper */
        class C0192a implements DatabaseErrorHandler {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.a f16989a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a[] f16990b;

            C0192a(h.a aVar, a[] aVarArr) {
                this.f16989a = aVar;
                this.f16990b = aVarArr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f16989a.c(a.b(this.f16990b, sQLiteDatabase));
            }
        }

        a(Context context, String str, a[] aVarArr, h.a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f16714a, new C0192a(aVar, aVarArr));
            this.f16987b = aVar;
            this.f16986a = aVarArr;
        }

        static a b(a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        /* access modifiers changed from: package-private */
        public a a(SQLiteDatabase sQLiteDatabase) {
            return b(this.f16986a, sQLiteDatabase);
        }

        public synchronized void close() {
            super.close();
            this.f16986a[0] = null;
        }

        /* access modifiers changed from: package-private */
        public synchronized g f() {
            this.f16988c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f16988c) {
                close();
                return f();
            }
            return a(writableDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f16987b.b(a(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f16987b.d(a(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
            this.f16988c = true;
            this.f16987b.e(a(sQLiteDatabase), i11, i12);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f16988c) {
                this.f16987b.f(a(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
            this.f16988c = true;
            this.f16987b.g(a(sQLiteDatabase), i11, i12);
        }
    }

    b(Context context, String str, h.a aVar, boolean z11) {
        this.f16979a = context;
        this.f16980b = str;
        this.f16981c = aVar;
        this.f16982d = z11;
    }

    private a a() {
        a aVar;
        synchronized (this.f16983e) {
            if (this.f16984f == null) {
                a[] aVarArr = new a[1];
                if (Build.VERSION.SDK_INT < 23 || this.f16980b == null || !this.f16982d) {
                    this.f16984f = new a(this.f16979a, this.f16980b, aVarArr, this.f16981c);
                } else {
                    this.f16984f = new a(this.f16979a, new File(d.a(this.f16979a), this.f16980b).getAbsolutePath(), aVarArr, this.f16981c);
                }
                t3.b.f(this.f16984f, this.f16985g);
            }
            aVar = this.f16984f;
        }
        return aVar;
    }

    public void close() {
        a().close();
    }

    public String getDatabaseName() {
        return this.f16980b;
    }

    public g i() {
        return a().f();
    }

    public void setWriteAheadLoggingEnabled(boolean z11) {
        synchronized (this.f16983e) {
            a aVar = this.f16984f;
            if (aVar != null) {
                t3.b.f(aVar, z11);
            }
            this.f16985g = z11;
        }
    }
}

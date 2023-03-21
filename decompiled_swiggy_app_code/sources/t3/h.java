package t3;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* compiled from: SupportSQLiteOpenHelper */
public interface h extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f16714a;

        public a(int i11) {
            this.f16714a = i11;
        }

        private void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    b.c(new File(str));
                } catch (Exception e11) {
                    Log.w("SupportSQLite", "delete failed: ", e11);
                }
            }
        }

        public void b(g gVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r0 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r3.hasNext() != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            a((java.lang.String) r3.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            a(r3.getPath());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(t3.g r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Corruption reported by sqlite on database: "
                r0.append(r1)
                java.lang.String r1 = r3.getPath()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.e(r1, r0)
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x0028
                java.lang.String r3 = r3.getPath()
                r2.a(r3)
                return
            L_0x0028:
                r0 = 0
                java.util.List r0 = r3.m()     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r1 = move-exception
                goto L_0x0034
            L_0x0030:
                r3.close()     // Catch:{ IOException -> 0x0056, all -> 0x002e }
                goto L_0x0057
            L_0x0034:
                if (r0 == 0) goto L_0x004e
                java.util.Iterator r3 = r0.iterator()
            L_0x003a:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0055
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.a(r0)
                goto L_0x003a
            L_0x004e:
                java.lang.String r3 = r3.getPath()
                r2.a(r3)
            L_0x0055:
                throw r1
            L_0x0056:
            L_0x0057:
                if (r0 == 0) goto L_0x0071
                java.util.Iterator r3 = r0.iterator()
            L_0x005d:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0078
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.a(r0)
                goto L_0x005d
            L_0x0071:
                java.lang.String r3 = r3.getPath()
                r2.a(r3)
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.h.a.c(t3.g):void");
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i11, int i12);

        public void f(g gVar) {
        }

        public abstract void g(g gVar, int i11, int i12);
    }

    /* compiled from: SupportSQLiteOpenHelper */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16715a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16716b;

        /* renamed from: c  reason: collision with root package name */
        public final a f16717c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f16718d;

        /* compiled from: SupportSQLiteOpenHelper */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            Context f16719a;

            /* renamed from: b  reason: collision with root package name */
            String f16720b;

            /* renamed from: c  reason: collision with root package name */
            a f16721c;

            /* renamed from: d  reason: collision with root package name */
            boolean f16722d;

            a(Context context) {
                this.f16719a = context;
            }

            public b a() {
                if (this.f16721c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.f16719a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                } else if (!this.f16722d || !TextUtils.isEmpty(this.f16720b)) {
                    return new b(this.f16719a, this.f16720b, this.f16721c, this.f16722d);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }

            public a b(a aVar) {
                this.f16721c = aVar;
                return this;
            }

            public a c(String str) {
                this.f16720b = str;
                return this;
            }

            public a d(boolean z11) {
                this.f16722d = z11;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z11) {
            this.f16715a = context;
            this.f16716b = str;
            this.f16717c = aVar;
            this.f16718d = z11;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* compiled from: SupportSQLiteOpenHelper */
    public interface c {
        h a(b bVar);
    }

    void close();

    String getDatabaseName();

    g i();

    void setWriteAheadLoggingEnabled(boolean z11);
}

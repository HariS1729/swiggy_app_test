package androidx.datastore.core;

import bp0.k;
import fp0.c;
import java.util.List;
import kotlin.jvm.internal.i;
import lp0.p;
import y2.b;
import y2.e;

/* compiled from: DataMigrationInitializer.kt */
public final class DataMigrationInitializer<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f9746a = new Companion((i) null);

    /* compiled from: DataMigrationInitializer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> java.lang.Object c(java.util.List<? extends y2.b<T>> r7, y2.e<T> r8, fp0.c<? super bp0.k> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                if (r0 == 0) goto L_0x0013
                r0 = r9
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                int r1 = r0.f9754e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f9754e = r1
                goto L_0x0018
            L_0x0013:
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                r0.<init>(r6, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f9752c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
                int r2 = r0.f9754e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r7 = r0.f9751b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f9750a
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
                bp0.g.b(r9)     // Catch:{ all -> 0x0034 }
                goto L_0x0069
            L_0x0034:
                r9 = move-exception
                goto L_0x0082
            L_0x0036:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x003e:
                java.lang.Object r7 = r0.f9750a
                java.util.List r7 = (java.util.List) r7
                bp0.g.b(r9)
                goto L_0x0060
            L_0x0046:
                bp0.g.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r2 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f9750a = r9
                r0.f9754e = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L_0x005f
                return r1
            L_0x005f:
                r7 = r9
            L_0x0060:
                kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x0069:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0094
                java.lang.Object r9 = r7.next()
                lp0.l r9 = (lp0.l) r9
                r0.f9750a = r8     // Catch:{ all -> 0x0034 }
                r0.f9751b = r7     // Catch:{ all -> 0x0034 }
                r0.f9754e = r3     // Catch:{ all -> 0x0034 }
                java.lang.Object r9 = r9.invoke(r0)     // Catch:{ all -> 0x0034 }
                if (r9 != r1) goto L_0x0069
                return r1
            L_0x0082:
                T r2 = r8.f25666a
                if (r2 != 0) goto L_0x0089
                r8.f25666a = r9
                goto L_0x0069
            L_0x0089:
                kotlin.jvm.internal.p.g(r2)
                T r2 = r8.f25666a
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                bp0.b.a(r2, r9)
                goto L_0x0069
            L_0x0094:
                T r7 = r8.f25666a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L_0x009d
                bp0.k r7 = bp0.k.f22762a
                return r7
            L_0x009d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer.Companion.c(java.util.List, y2.e, fp0.c):java.lang.Object");
        }

        public final <T> p<e<T>, c<? super k>, Object> b(List<? extends b<T>> list) {
            kotlin.jvm.internal.p.j(list, "migrations");
            return new DataMigrationInitializer$Companion$getInitializer$1(list, (c<? super DataMigrationInitializer$Companion$getInitializer$1>) null);
        }
    }
}

package w5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FaceCoordinateObjsManager */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static List<a> f17560a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static int f17561b = 5;

    /* compiled from: FaceCoordinateObjsManager */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private List<Float> f17562a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public long f17563b;

        /* renamed from: c  reason: collision with root package name */
        private long f17564c;

        public a(long j) {
            this.f17563b = j;
        }

        public float a() {
            return this.f17562a.get(2).floatValue();
        }

        public void c(long j) {
            this.f17564c = j;
        }

        public void d(List<Float> list) {
            this.f17562a = list;
        }

        public float e() {
            return this.f17562a.get(3).floatValue();
        }

        public List<Float> f() {
            return this.f17562a;
        }

        public long g() {
            return this.f17563b;
        }

        public float h() {
            return this.f17562a.get(0).floatValue();
        }

        public float i() {
            return this.f17562a.get(1).floatValue();
        }

        public boolean j() {
            return this.f17564c + 1500 < System.currentTimeMillis() || this.f17563b + 1700 < System.currentTimeMillis();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r3 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized w5.e.a a() {
        /*
            java.lang.Class<w5.e> r0 = w5.e.class
            monitor-enter(r0)
            java.util.List<w5.e$a> r1 = f17560a     // Catch:{ all -> 0x0025 }
            int r1 = r1.size()     // Catch:{ all -> 0x0025 }
            r2 = 0
            if (r1 != 0) goto L_0x000e
            monitor-exit(r0)
            return r2
        L_0x000e:
            java.util.List<w5.e$a> r1 = f17560a     // Catch:{ all -> 0x0025 }
            int r3 = r1.size()     // Catch:{ all -> 0x0025 }
            int r3 = r3 + -1
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x0025 }
            w5.e$a r1 = (w5.e.a) r1     // Catch:{ all -> 0x0025 }
            boolean r3 = r1.j()     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)
            if (r3 == 0) goto L_0x0024
            return r2
        L_0x0024:
            return r1
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.e.a():w5.e$a");
    }

    public static synchronized void b(a aVar) {
        synchronized (e.class) {
            Iterator<a> it2 = f17560a.iterator();
            int i11 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                a next = it2.next();
                if (next.j()) {
                    it2.remove();
                } else if (next.f17563b > aVar.g()) {
                    break;
                } else {
                    i11++;
                }
            }
            f17560a.add(i11, aVar);
            if (f17560a.size() > f17561b) {
                f17560a.remove(0);
            }
        }
    }
}

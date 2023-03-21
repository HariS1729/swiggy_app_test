package l4;

import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import com.xiaomi.mipush.sdk.Constants;
import d4.i;
import defpackage.s1;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkSpec */
public final class p {

    /* renamed from: s  reason: collision with root package name */
    private static final String f15492s = i.f("WorkSpec");
    public static final s1.b<List<c>, List<WorkInfo>> t = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f15493a;

    /* renamed from: b  reason: collision with root package name */
    public WorkInfo.State f15494b = WorkInfo.State.ENQUEUED;

    /* renamed from: c  reason: collision with root package name */
    public String f15495c;

    /* renamed from: d  reason: collision with root package name */
    public String f15496d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.work.b f15497e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.work.b f15498f;

    /* renamed from: g  reason: collision with root package name */
    public long f15499g;

    /* renamed from: h  reason: collision with root package name */
    public long f15500h;

    /* renamed from: i  reason: collision with root package name */
    public long f15501i;
    public d4.a j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public BackoffPolicy f15502l;

    /* renamed from: m  reason: collision with root package name */
    public long f15503m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public long f15504o;

    /* renamed from: p  reason: collision with root package name */
    public long f15505p;
    public boolean q;

    /* renamed from: r  reason: collision with root package name */
    public OutOfQuotaPolicy f15506r;

    /* compiled from: WorkSpec */
    class a implements s1.b<List<c>, List<WorkInfo>> {
        a() {
        }

        /* renamed from: a */
        public List<WorkInfo> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (c a11 : list) {
                arrayList.add(a11.a());
            }
            return arrayList;
        }
    }

    /* compiled from: WorkSpec */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f15507a;

        /* renamed from: b  reason: collision with root package name */
        public WorkInfo.State f15508b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f15508b != bVar.f15508b) {
                return false;
            }
            return this.f15507a.equals(bVar.f15507a);
        }

        public int hashCode() {
            return (this.f15507a.hashCode() * 31) + this.f15508b.hashCode();
        }
    }

    /* compiled from: WorkSpec */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f15509a;

        /* renamed from: b  reason: collision with root package name */
        public WorkInfo.State f15510b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.work.b f15511c;

        /* renamed from: d  reason: collision with root package name */
        public int f15512d;

        /* renamed from: e  reason: collision with root package name */
        public List<String> f15513e;

        /* renamed from: f  reason: collision with root package name */
        public List<androidx.work.b> f15514f;

        public WorkInfo a() {
            androidx.work.b bVar;
            List<androidx.work.b> list = this.f15514f;
            if (list == null || list.isEmpty()) {
                bVar = androidx.work.b.f12339c;
            } else {
                bVar = this.f15514f.get(0);
            }
            return new WorkInfo(UUID.fromString(this.f15509a), this.f15510b, this.f15511c, this.f15513e, bVar, this.f15512d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f15512d != cVar.f15512d) {
                return false;
            }
            String str = this.f15509a;
            if (str == null ? cVar.f15509a != null : !str.equals(cVar.f15509a)) {
                return false;
            }
            if (this.f15510b != cVar.f15510b) {
                return false;
            }
            androidx.work.b bVar = this.f15511c;
            if (bVar == null ? cVar.f15511c != null : !bVar.equals(cVar.f15511c)) {
                return false;
            }
            List<String> list = this.f15513e;
            if (list == null ? cVar.f15513e != null : !list.equals(cVar.f15513e)) {
                return false;
            }
            List<androidx.work.b> list2 = this.f15514f;
            List<androidx.work.b> list3 = cVar.f15514f;
            if (list2 != null) {
                return list2.equals(list3);
            }
            if (list3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f15509a;
            int i11 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            WorkInfo.State state = this.f15510b;
            int hashCode2 = (hashCode + (state != null ? state.hashCode() : 0)) * 31;
            androidx.work.b bVar = this.f15511c;
            int hashCode3 = (((hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f15512d) * 31;
            List<String> list = this.f15513e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<androidx.work.b> list2 = this.f15514f;
            if (list2 != null) {
                i11 = list2.hashCode();
            }
            return hashCode4 + i11;
        }
    }

    public p(String str, String str2) {
        androidx.work.b bVar = androidx.work.b.f12339c;
        this.f15497e = bVar;
        this.f15498f = bVar;
        this.j = d4.a.f14106i;
        this.f15502l = BackoffPolicy.EXPONENTIAL;
        this.f15503m = 30000;
        this.f15505p = -1;
        this.f15506r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f15493a = str;
        this.f15495c = str2;
    }

    public long a() {
        long j11;
        boolean z11 = false;
        if (c()) {
            if (this.f15502l == BackoffPolicy.LINEAR) {
                z11 = true;
            }
            if (z11) {
                j11 = this.f15503m * ((long) this.k);
            } else {
                j11 = (long) Math.scalb((float) this.f15503m, this.k - 1);
            }
            return this.n + Math.min(18000000, j11);
        }
        long j12 = 0;
        if (d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j13 = this.n;
            long j14 = j13 == 0 ? currentTimeMillis + this.f15499g : j13;
            long j15 = this.f15501i;
            long j16 = this.f15500h;
            if (j15 != j16) {
                z11 = true;
            }
            if (z11) {
                if (j13 == 0) {
                    j12 = j15 * -1;
                }
                return j14 + j16 + j12;
            }
            if (j13 != 0) {
                j12 = j16;
            }
            return j14 + j12;
        }
        long j17 = this.n;
        if (j17 == 0) {
            j17 = System.currentTimeMillis();
        }
        return j17 + this.f15499g;
    }

    public boolean b() {
        return !d4.a.f14106i.equals(this.j);
    }

    public boolean c() {
        return this.f15494b == WorkInfo.State.ENQUEUED && this.k > 0;
    }

    public boolean d() {
        return this.f15500h != 0;
    }

    public void e(long j11) {
        if (j11 < 900000) {
            i.c().h(f15492s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}), new Throwable[0]);
            j11 = 900000;
        }
        f(j11, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f15499g != pVar.f15499g || this.f15500h != pVar.f15500h || this.f15501i != pVar.f15501i || this.k != pVar.k || this.f15503m != pVar.f15503m || this.n != pVar.n || this.f15504o != pVar.f15504o || this.f15505p != pVar.f15505p || this.q != pVar.q || !this.f15493a.equals(pVar.f15493a) || this.f15494b != pVar.f15494b || !this.f15495c.equals(pVar.f15495c)) {
            return false;
        }
        String str = this.f15496d;
        if (str == null ? pVar.f15496d != null : !str.equals(pVar.f15496d)) {
            return false;
        }
        if (this.f15497e.equals(pVar.f15497e) && this.f15498f.equals(pVar.f15498f) && this.j.equals(pVar.j) && this.f15502l == pVar.f15502l && this.f15506r == pVar.f15506r) {
            return true;
        }
        return false;
    }

    public void f(long j11, long j12) {
        if (j11 < 900000) {
            i.c().h(f15492s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}), new Throwable[0]);
            j11 = 900000;
        }
        if (j12 < Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL) {
            i.c().h(f15492s, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL)}), new Throwable[0]);
            j12 = 300000;
        }
        if (j12 > j11) {
            i.c().h(f15492s, String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(j11)}), new Throwable[0]);
            j12 = j11;
        }
        this.f15500h = j11;
        this.f15501i = j12;
    }

    public int hashCode() {
        int hashCode = ((((this.f15493a.hashCode() * 31) + this.f15494b.hashCode()) * 31) + this.f15495c.hashCode()) * 31;
        String str = this.f15496d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j11 = this.f15499g;
        long j12 = this.f15500h;
        long j13 = this.f15501i;
        long j14 = this.f15503m;
        long j15 = this.n;
        long j16 = this.f15504o;
        long j17 = this.f15505p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f15497e.hashCode()) * 31) + this.f15498f.hashCode()) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.j.hashCode()) * 31) + this.k) * 31) + this.f15502l.hashCode()) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + ((int) (j17 ^ (j17 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31) + this.f15506r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f15493a + "}";
    }

    public p(p pVar) {
        androidx.work.b bVar = androidx.work.b.f12339c;
        this.f15497e = bVar;
        this.f15498f = bVar;
        this.j = d4.a.f14106i;
        this.f15502l = BackoffPolicy.EXPONENTIAL;
        this.f15503m = 30000;
        this.f15505p = -1;
        this.f15506r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f15493a = pVar.f15493a;
        this.f15495c = pVar.f15495c;
        this.f15494b = pVar.f15494b;
        this.f15496d = pVar.f15496d;
        this.f15497e = new androidx.work.b(pVar.f15497e);
        this.f15498f = new androidx.work.b(pVar.f15498f);
        this.f15499g = pVar.f15499g;
        this.f15500h = pVar.f15500h;
        this.f15501i = pVar.f15501i;
        this.j = new d4.a(pVar.j);
        this.k = pVar.k;
        this.f15502l = pVar.f15502l;
        this.f15503m = pVar.f15503m;
        this.n = pVar.n;
        this.f15504o = pVar.f15504o;
        this.f15505p = pVar.f15505p;
        this.q = pVar.q;
        this.f15506r = pVar.f15506r;
    }
}

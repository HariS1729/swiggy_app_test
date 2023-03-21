package androidx.recyclerview.widget;

/* compiled from: BatchingListUpdateCallback */
public class e implements o {

    /* renamed from: a  reason: collision with root package name */
    final o f11323a;

    /* renamed from: b  reason: collision with root package name */
    int f11324b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f11325c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f11326d = -1;

    /* renamed from: e  reason: collision with root package name */
    Object f11327e = null;

    public e(o oVar) {
        this.f11323a = oVar;
    }

    public void a(int i11, int i12, Object obj) {
        int i13;
        if (this.f11324b == 3) {
            int i14 = this.f11325c;
            int i15 = this.f11326d;
            if (i11 <= i14 + i15 && (i13 = i11 + i12) >= i14 && this.f11327e == obj) {
                this.f11325c = Math.min(i11, i14);
                this.f11326d = Math.max(i15 + i14, i13) - this.f11325c;
                return;
            }
        }
        e();
        this.f11325c = i11;
        this.f11326d = i12;
        this.f11327e = obj;
        this.f11324b = 3;
    }

    public void b(int i11, int i12) {
        int i13;
        if (this.f11324b == 1 && i11 >= (i13 = this.f11325c)) {
            int i14 = this.f11326d;
            if (i11 <= i13 + i14) {
                this.f11326d = i14 + i12;
                this.f11325c = Math.min(i11, i13);
                return;
            }
        }
        e();
        this.f11325c = i11;
        this.f11326d = i12;
        this.f11324b = 1;
    }

    public void c(int i11, int i12) {
        int i13;
        if (this.f11324b != 2 || (i13 = this.f11325c) < i11 || i13 > i11 + i12) {
            e();
            this.f11325c = i11;
            this.f11326d = i12;
            this.f11324b = 2;
            return;
        }
        this.f11326d += i12;
        this.f11325c = i11;
    }

    public void d(int i11, int i12) {
        e();
        this.f11323a.d(i11, i12);
    }

    public void e() {
        int i11 = this.f11324b;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f11323a.b(this.f11325c, this.f11326d);
            } else if (i11 == 2) {
                this.f11323a.c(this.f11325c, this.f11326d);
            } else if (i11 == 3) {
                this.f11323a.a(this.f11325c, this.f11326d, this.f11327e);
            }
            this.f11327e = null;
            this.f11324b = 0;
        }
    }
}

package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.core.os.l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker */
final class j implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    static final ThreadLocal<j> f11422e = new ThreadLocal<>();

    /* renamed from: f  reason: collision with root package name */
    static Comparator<c> f11423f = new a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList<RecyclerView> f11424a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    long f11425b;

    /* renamed from: c  reason: collision with root package name */
    long f11426c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<c> f11427d = new ArrayList<>();

    /* compiled from: GapWorker */
    class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f11435d;
            if ((recyclerView == null) != (cVar2.f11435d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z11 = cVar.f11432a;
            if (z11 == cVar2.f11432a) {
                int i11 = cVar2.f11433b - cVar.f11433b;
                if (i11 != 0) {
                    return i11;
                }
                int i12 = cVar.f11434c - cVar2.f11434c;
                if (i12 != 0) {
                    return i12;
                }
                return 0;
            } else if (z11) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* compiled from: GapWorker */
    static class b implements RecyclerView.o.c {

        /* renamed from: a  reason: collision with root package name */
        int f11428a;

        /* renamed from: b  reason: collision with root package name */
        int f11429b;

        /* renamed from: c  reason: collision with root package name */
        int[] f11430c;

        /* renamed from: d  reason: collision with root package name */
        int f11431d;

        b() {
        }

        public void a(int i11, int i12) {
            if (i11 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i12 >= 0) {
                int i13 = this.f11431d * 2;
                int[] iArr = this.f11430c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f11430c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i13 >= iArr.length) {
                    int[] iArr3 = new int[(i13 * 2)];
                    this.f11430c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f11430c;
                iArr4[i13] = i11;
                iArr4[i13 + 1] = i12;
                this.f11431d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f11430c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f11431d = 0;
        }

        /* access modifiers changed from: package-private */
        public void c(RecyclerView recyclerView, boolean z11) {
            this.f11431d = 0;
            int[] iArr = this.f11430c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.f11139m;
            if (recyclerView.f11138l != null && oVar != null && oVar.B0()) {
                if (z11) {
                    if (!recyclerView.f11132d.p()) {
                        oVar.A(recyclerView.f11138l.getItemCount(), this);
                    }
                } else if (!recyclerView.p0()) {
                    oVar.z(this.f11428a, this.f11429b, recyclerView.f11153v0, this);
                }
                int i11 = this.f11431d;
                if (i11 > oVar.f11204m) {
                    oVar.f11204m = i11;
                    oVar.n = z11;
                    recyclerView.f11129b.K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i11) {
            if (this.f11430c != null) {
                int i12 = this.f11431d * 2;
                for (int i13 = 0; i13 < i12; i13 += 2) {
                    if (this.f11430c[i13] == i11) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(int i11, int i12) {
            this.f11428a = i11;
            this.f11429b = i12;
        }
    }

    /* compiled from: GapWorker */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f11432a;

        /* renamed from: b  reason: collision with root package name */
        public int f11433b;

        /* renamed from: c  reason: collision with root package name */
        public int f11434c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f11435d;

        /* renamed from: e  reason: collision with root package name */
        public int f11436e;

        c() {
        }

        public void a() {
            this.f11432a = false;
            this.f11433b = 0;
            this.f11434c = 0;
            this.f11435d = null;
            this.f11436e = 0;
        }
    }

    j() {
    }

    private void b() {
        c cVar;
        int size = this.f11424a.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView = this.f11424a.get(i12);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f11152u0.c(recyclerView, false);
                i11 += recyclerView.f11152u0.f11431d;
            }
        }
        this.f11427d.ensureCapacity(i11);
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView recyclerView2 = this.f11424a.get(i14);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f11152u0;
                int abs = Math.abs(bVar.f11428a) + Math.abs(bVar.f11429b);
                for (int i15 = 0; i15 < bVar.f11431d * 2; i15 += 2) {
                    if (i13 >= this.f11427d.size()) {
                        cVar = new c();
                        this.f11427d.add(cVar);
                    } else {
                        cVar = this.f11427d.get(i13);
                    }
                    int[] iArr = bVar.f11430c;
                    int i16 = iArr[i15 + 1];
                    cVar.f11432a = i16 <= abs;
                    cVar.f11433b = abs;
                    cVar.f11434c = i16;
                    cVar.f11435d = recyclerView2;
                    cVar.f11436e = iArr[i15];
                    i13++;
                }
            }
        }
        Collections.sort(this.f11427d, f11423f);
    }

    private void c(c cVar, long j) {
        RecyclerView.d0 i11 = i(cVar.f11435d, cVar.f11436e, cVar.f11432a ? Long.MAX_VALUE : j);
        if (i11 != null && i11.mNestedRecyclerView != null && i11.isBound() && !i11.isInvalid()) {
            h((RecyclerView) i11.mNestedRecyclerView.get(), j);
        }
    }

    private void d(long j) {
        int i11 = 0;
        while (i11 < this.f11427d.size()) {
            c cVar = this.f11427d.get(i11);
            if (cVar.f11435d != null) {
                c(cVar, j);
                cVar.a();
                i11++;
            } else {
                return;
            }
        }
    }

    static boolean e(RecyclerView recyclerView, int i11) {
        int j = recyclerView.f11133e.j();
        for (int i12 = 0; i12 < j; i12++) {
            RecyclerView.d0 i02 = RecyclerView.i0(recyclerView.f11133e.i(i12));
            if (i02.mPosition == i11 && !i02.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.E && recyclerView.f11133e.j() != 0) {
                recyclerView.Y0();
            }
            b bVar = recyclerView.f11152u0;
            bVar.c(recyclerView, true);
            if (bVar.f11431d != 0) {
                try {
                    l.a("RV Nested Prefetch");
                    recyclerView.f11153v0.f(recyclerView.f11138l);
                    for (int i11 = 0; i11 < bVar.f11431d * 2; i11 += 2) {
                        i(recyclerView, bVar.f11430c[i11], j);
                    }
                } finally {
                    l.b();
                }
            }
        }
    }

    private RecyclerView.d0 i(RecyclerView recyclerView, int i11, long j) {
        if (e(recyclerView, i11)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.f11129b;
        try {
            recyclerView.K0();
            RecyclerView.d0 I = vVar.I(i11, false, j);
            if (I != null) {
                if (!I.isBound() || I.isInvalid()) {
                    vVar.a(I, false);
                } else {
                    vVar.B(I.itemView);
                }
            }
            return I;
        } finally {
            recyclerView.M0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f11424a.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i11, int i12) {
        if (recyclerView.isAttachedToWindow() && this.f11425b == 0) {
            this.f11425b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f11152u0.e(i11, i12);
    }

    /* access modifiers changed from: package-private */
    public void g(long j) {
        b();
        d(j);
    }

    public void j(RecyclerView recyclerView) {
        this.f11424a.remove(recyclerView);
    }

    public void run() {
        try {
            l.a("RV Prefetch");
            if (!this.f11424a.isEmpty()) {
                int size = this.f11424a.size();
                long j = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = this.f11424a.get(i11);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j) + this.f11426c);
                    this.f11425b = 0;
                    l.b();
                }
            }
        } finally {
            this.f11425b = 0;
            l.b();
        }
    }
}

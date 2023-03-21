package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;
import n2.a;

/* compiled from: RunGroup */
class k {

    /* renamed from: h  reason: collision with root package name */
    public static int f8266h;

    /* renamed from: a  reason: collision with root package name */
    public int f8267a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8268b = false;

    /* renamed from: c  reason: collision with root package name */
    WidgetRun f8269c = null;

    /* renamed from: d  reason: collision with root package name */
    WidgetRun f8270d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<WidgetRun> f8271e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    int f8272f;

    /* renamed from: g  reason: collision with root package name */
    int f8273g;

    public k(WidgetRun widgetRun, int i11) {
        int i12 = f8266h;
        this.f8272f = i12;
        f8266h = i12 + 1;
        this.f8269c = widgetRun;
        this.f8270d = widgetRun;
        this.f8273g = i11;
    }

    private long c(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f8220d;
        if (widgetRun instanceof i) {
            return j;
        }
        int size = dependencyNode.k.size();
        long j11 = j;
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = dependencyNode.k.get(i11);
            if (aVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) aVar;
                if (dependencyNode2.f8220d != widgetRun) {
                    j11 = Math.min(j11, c(dependencyNode2, ((long) dependencyNode2.f8222f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f8235i) {
            return j11;
        }
        long j12 = j - widgetRun.j();
        return Math.min(Math.min(j11, c(widgetRun.f8234h, j12)), j12 - ((long) widgetRun.f8234h.f8222f));
    }

    private long d(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f8220d;
        if (widgetRun instanceof i) {
            return j;
        }
        int size = dependencyNode.k.size();
        long j11 = j;
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = dependencyNode.k.get(i11);
            if (aVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) aVar;
                if (dependencyNode2.f8220d != widgetRun) {
                    j11 = Math.max(j11, d(dependencyNode2, ((long) dependencyNode2.f8222f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f8234h) {
            return j11;
        }
        long j12 = j + widgetRun.j();
        return Math.max(Math.max(j11, d(widgetRun.f8235i, j12)), j12 - ((long) widgetRun.f8235i.f8222f));
    }

    public void a(WidgetRun widgetRun) {
        this.f8271e.add(widgetRun);
        this.f8270d = widgetRun;
    }

    public long b(d dVar, int i11) {
        int i12;
        long j;
        WidgetRun widgetRun = this.f8269c;
        long j11 = 0;
        if (widgetRun instanceof c) {
            if (((c) widgetRun).f8232f != i11) {
                return 0;
            }
        } else if (i11 == 0) {
            if (!(widgetRun instanceof j)) {
                return 0;
            }
        } else if (!(widgetRun instanceof l)) {
            return 0;
        }
        DependencyNode dependencyNode = (i11 == 0 ? dVar.f8176e : dVar.f8178f).f8234h;
        DependencyNode dependencyNode2 = (i11 == 0 ? dVar.f8176e : dVar.f8178f).f8235i;
        boolean contains = widgetRun.f8234h.f8226l.contains(dependencyNode);
        boolean contains2 = this.f8269c.f8235i.f8226l.contains(dependencyNode2);
        long j12 = this.f8269c.j();
        if (contains && contains2) {
            long d11 = d(this.f8269c.f8234h, 0);
            long c11 = c(this.f8269c.f8235i, 0);
            long j13 = d11 - j12;
            WidgetRun widgetRun2 = this.f8269c;
            int i13 = widgetRun2.f8235i.f8222f;
            if (j13 >= ((long) (-i13))) {
                j13 += (long) i13;
            }
            int i14 = widgetRun2.f8234h.f8222f;
            long j14 = ((-c11) - j12) - ((long) i14);
            if (j14 >= ((long) i14)) {
                j14 -= (long) i14;
            }
            float s11 = widgetRun2.f8228b.s(i11);
            if (s11 > 0.0f) {
                j11 = (long) ((((float) j14) / s11) + (((float) j13) / (1.0f - s11)));
            }
            float f11 = (float) j11;
            long j15 = ((long) ((f11 * s11) + 0.5f)) + j12 + ((long) ((f11 * (1.0f - s11)) + 0.5f));
            WidgetRun widgetRun3 = this.f8269c;
            j = ((long) widgetRun3.f8234h.f8222f) + j15;
            i12 = widgetRun3.f8235i.f8222f;
        } else if (contains) {
            DependencyNode dependencyNode3 = this.f8269c.f8234h;
            return Math.max(d(dependencyNode3, (long) dependencyNode3.f8222f), ((long) this.f8269c.f8234h.f8222f) + j12);
        } else if (contains2) {
            DependencyNode dependencyNode4 = this.f8269c.f8235i;
            return Math.max(-c(dependencyNode4, (long) dependencyNode4.f8222f), ((long) (-this.f8269c.f8235i.f8222f)) + j12);
        } else {
            WidgetRun widgetRun4 = this.f8269c;
            j = ((long) widgetRun4.f8234h.f8222f) + widgetRun4.j();
            i12 = this.f8269c.f8235i.f8222f;
        }
        return j - ((long) i12);
    }
}

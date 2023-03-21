package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n2.a;

/* compiled from: DependencyGraph */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.d f8252a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f8253b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8254c = true;

    /* renamed from: d  reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.d f8255d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<WidgetRun> f8256e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<k> f8257f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private b.C0027b f8258g = null;

    /* renamed from: h  reason: collision with root package name */
    private b.a f8259h = new b.a();

    /* renamed from: i  reason: collision with root package name */
    ArrayList<k> f8260i = new ArrayList<>();

    public d(androidx.constraintlayout.core.widgets.d dVar) {
        this.f8252a = dVar;
        this.f8255d = dVar;
    }

    private void a(DependencyNode dependencyNode, int i11, int i12, DependencyNode dependencyNode2, ArrayList<k> arrayList, k kVar) {
        WidgetRun widgetRun = dependencyNode.f8220d;
        if (widgetRun.f8229c == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.f8252a;
            if (widgetRun != dVar.f8176e && widgetRun != dVar.f8178f) {
                if (kVar == null) {
                    kVar = new k(widgetRun, i12);
                    arrayList.add(kVar);
                }
                widgetRun.f8229c = kVar;
                kVar.a(widgetRun);
                for (a next : widgetRun.f8234h.k) {
                    if (next instanceof DependencyNode) {
                        a((DependencyNode) next, i11, 0, dependencyNode2, arrayList, kVar);
                    }
                }
                for (a next2 : widgetRun.f8235i.k) {
                    if (next2 instanceof DependencyNode) {
                        a((DependencyNode) next2, i11, 1, dependencyNode2, arrayList, kVar);
                    }
                }
                if (i11 == 1 && (widgetRun instanceof l)) {
                    for (a next3 : ((l) widgetRun).k.k) {
                        if (next3 instanceof DependencyNode) {
                            a((DependencyNode) next3, i11, 2, dependencyNode2, arrayList, kVar);
                        }
                    }
                }
                for (DependencyNode next4 : widgetRun.f8234h.f8226l) {
                    if (next4 == dependencyNode2) {
                        kVar.f8268b = true;
                    }
                    a(next4, i11, 0, dependencyNode2, arrayList, kVar);
                }
                for (DependencyNode next5 : widgetRun.f8235i.f8226l) {
                    if (next5 == dependencyNode2) {
                        kVar.f8268b = true;
                    }
                    a(next5, i11, 1, dependencyNode2, arrayList, kVar);
                }
                if (i11 == 1 && (widgetRun instanceof l)) {
                    for (DependencyNode a11 : ((l) widgetRun).k.f8226l) {
                        a(a11, i11, 2, dependencyNode2, arrayList, kVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0288, code lost:
        r4 = r0.f8171b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(androidx.constraintlayout.core.widgets.d r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r0.V0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0342
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r2.f8171b0
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.Z()
            r7 = 8
            if (r6 != r7) goto L_0x0027
            r2.f8168a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.B
            r11 = 1065353216(0x3f800000, float:1.0)
            r7 = 2
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0036
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f8206w = r7
        L_0x0036:
            float r6 = r2.E
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f8208x = r7
        L_0x0042:
            float r6 = r2.x()
            r8 = 0
            r9 = 3
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0078
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 == r8) goto L_0x0058
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 != r8) goto L_0x005b
        L_0x0058:
            r2.f8206w = r9
            goto L_0x0078
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r8) goto L_0x0065
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 != r8) goto L_0x0068
        L_0x0065:
            r2.f8208x = r9
            goto L_0x0078
        L_0x0068:
            if (r5 != r6) goto L_0x0078
            if (r4 != r6) goto L_0x0078
            int r6 = r2.f8206w
            if (r6 != 0) goto L_0x0072
            r2.f8206w = r9
        L_0x0072:
            int r6 = r2.f8208x
            if (r6 != 0) goto L_0x0078
            r2.f8208x = r9
        L_0x0078:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008e
            int r8 = r2.f8206w
            if (r8 != r10) goto L_0x008e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r8.f8163f
            if (r8 == 0) goto L_0x008c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r8.f8163f
            if (r8 != 0) goto L_0x008e
        L_0x008c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x008e:
            r8 = r5
            if (r4 != r6) goto L_0x00a3
            int r5 = r2.f8208x
            if (r5 != r10) goto L_0x00a3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f8163f
            if (r5 == 0) goto L_0x00a1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f8163f
            if (r5 != 0) goto L_0x00a3
        L_0x00a1:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x00a3:
            r12 = r4
            androidx.constraintlayout.core.widgets.analyzer.j r4 = r2.f8176e
            r4.f8230d = r8
            int r5 = r2.f8206w
            r4.f8227a = r5
            androidx.constraintlayout.core.widgets.analyzer.l r4 = r2.f8178f
            r4.f8230d = r12
            int r13 = r2.f8208x
            r4.f8227a = r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r8 == r4) goto L_0x00c0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 == r14) goto L_0x00c0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 != r14) goto L_0x00cc
        L_0x00c0:
            if (r12 == r4) goto L_0x02ec
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 == r14) goto L_0x02ec
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cc
            goto L_0x02ec
        L_0x00cc:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r8 != r6) goto L_0x019e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 != r11) goto L_0x019e
        L_0x00d8:
            if (r5 != r9) goto L_0x0114
            if (r12 != r15) goto L_0x00e6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.l(r5, r6, r7, r8, r9)
        L_0x00e6:
            int r9 = r2.z()
            float r3 = (float) r9
            float r4 = r2.f8179f0
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f8176e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.a0()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.z()
            r3.d(r4)
            r2.f8168a = r10
            goto L_0x0008
        L_0x0114:
            if (r5 != r10) goto L_0x012c
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f8176e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r2 = r2.a0()
            r3.f8261m = r2
            goto L_0x0008
        L_0x012c:
            if (r5 != r7) goto L_0x016c
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r0.f8171b0
            r15 = r11[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r15 == r7) goto L_0x013a
            r11 = r11[r3]
            if (r11 != r4) goto L_0x019e
        L_0x013a:
            float r3 = r2.B
            int r4 = r17.a0()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            int r9 = r2.z()
            r4 = r16
            r5 = r2
            r6 = r7
            r7 = r3
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f8176e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.a0()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.z()
            r3.d(r4)
            r2.f8168a = r10
            goto L_0x0008
        L_0x016c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r2.Y
            r11 = r7[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.f8163f
            if (r11 == 0) goto L_0x017a
            r7 = r7[r10]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.f8163f
            if (r7 != 0) goto L_0x019e
        L_0x017a:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f8176e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.a0()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.z()
            r3.d(r4)
            r2.f8168a = r10
            goto L_0x0008
        L_0x019e:
            if (r12 != r6) goto L_0x027a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 == r11) goto L_0x01a8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 != r7) goto L_0x027a
        L_0x01a8:
            if (r13 != r9) goto L_0x01ef
            if (r8 != r11) goto L_0x01b6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.l(r5, r6, r7, r8, r9)
        L_0x01b6:
            int r7 = r2.a0()
            float r3 = r2.f8179f0
            int r4 = r2.y()
            r5 = -1
            if (r4 != r5) goto L_0x01c7
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x01c7:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f8176e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.a0()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.z()
            r3.d(r4)
            r2.f8168a = r10
            goto L_0x0008
        L_0x01ef:
            if (r13 != r10) goto L_0x0207
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r2 = r2.z()
            r3.f8261m = r2
            goto L_0x0008
        L_0x0207:
            r7 = 2
            if (r13 != r7) goto L_0x0247
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r0.f8171b0
            r9 = r7[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r9 == r11) goto L_0x0216
            r7 = r7[r10]
            if (r7 != r4) goto L_0x027a
        L_0x0216:
            float r3 = r2.E
            int r7 = r2.a0()
            int r4 = r17.z()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r9 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f8176e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.a0()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.z()
            r3.d(r4)
            r2.f8168a = r10
            goto L_0x0008
        L_0x0247:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r2.Y
            r7 = 2
            r15 = r4[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r15.f8163f
            if (r7 == 0) goto L_0x0256
            r4 = r4[r9]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f8163f
            if (r4 != 0) goto L_0x027a
        L_0x0256:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f8176e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.a0()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.z()
            r3.d(r4)
            r2.f8168a = r10
            goto L_0x0008
        L_0x027a:
            if (r8 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x02cb
            if (r13 != r10) goto L_0x0283
            goto L_0x02cb
        L_0x0283:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.f8171b0
            r3 = r4[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r8) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
            float r3 = r2.B
            float r4 = r2.E
            int r5 = r17.a0()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.z()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f8176e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.a0()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.z()
            r3.d(r4)
            r2.f8168a = r10
            goto L_0x0008
        L_0x02cb:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f8176e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.a0()
            r3.f8261m = r4
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r2 = r2.z()
            r3.f8261m = r2
            goto L_0x0008
        L_0x02ec:
            int r3 = r2.a0()
            if (r8 != r4) goto L_0x0305
            int r3 = r17.a0()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.Q
            int r5 = r5.f8164g
            int r3 = r3 - r5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.S
            int r5 = r5.f8164g
            int r3 = r3 - r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r7 = r3
            r6 = r5
            goto L_0x0307
        L_0x0305:
            r7 = r3
            r6 = r8
        L_0x0307:
            int r3 = r2.z()
            if (r12 != r4) goto L_0x0320
            int r3 = r17.z()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.R
            int r4 = r4.f8164g
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.T
            int r4 = r4.f8164g
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r9 = r3
            r8 = r4
            goto L_0x0322
        L_0x0320:
            r9 = r3
            r8 = r12
        L_0x0322:
            r4 = r16
            r5 = r2
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f8176e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.a0()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f8231e
            int r4 = r2.z()
            r3.d(r4)
            r2.f8168a = r10
            goto L_0x0008
        L_0x0342:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.d.b(androidx.constraintlayout.core.widgets.d):boolean");
    }

    private int e(androidx.constraintlayout.core.widgets.d dVar, int i11) {
        int size = this.f8260i.size();
        long j = 0;
        for (int i12 = 0; i12 < size; i12++) {
            j = Math.max(j, this.f8260i.get(i12).b(dVar, i11));
        }
        return (int) j;
    }

    private void i(WidgetRun widgetRun, int i11, ArrayList<k> arrayList) {
        for (a next : widgetRun.f8234h.k) {
            if (next instanceof DependencyNode) {
                a((DependencyNode) next, i11, 0, widgetRun.f8235i, arrayList, (k) null);
            } else if (next instanceof WidgetRun) {
                a(((WidgetRun) next).f8234h, i11, 0, widgetRun.f8235i, arrayList, (k) null);
            }
        }
        for (a next2 : widgetRun.f8235i.k) {
            if (next2 instanceof DependencyNode) {
                a((DependencyNode) next2, i11, 1, widgetRun.f8234h, arrayList, (k) null);
            } else if (next2 instanceof WidgetRun) {
                a(((WidgetRun) next2).f8235i, i11, 1, widgetRun.f8234h, arrayList, (k) null);
            }
        }
        if (i11 == 1) {
            for (a next3 : ((l) widgetRun).k.k) {
                if (next3 instanceof DependencyNode) {
                    a((DependencyNode) next3, i11, 2, (DependencyNode) null, arrayList, (k) null);
                }
            }
        }
    }

    private void l(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i11, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i12) {
        b.a aVar = this.f8259h;
        aVar.f8242a = dimensionBehaviour;
        aVar.f8243b = dimensionBehaviour2;
        aVar.f8244c = i11;
        aVar.f8245d = i12;
        this.f8258g.b(constraintWidget, aVar);
        constraintWidget.q1(this.f8259h.f8246e);
        constraintWidget.R0(this.f8259h.f8247f);
        constraintWidget.Q0(this.f8259h.f8249h);
        constraintWidget.G0(this.f8259h.f8248g);
    }

    public void c() {
        d(this.f8256e);
        this.f8260i.clear();
        k.f8266h = 0;
        i(this.f8252a.f8176e, 0, this.f8260i);
        i(this.f8252a.f8178f, 1, this.f8260i);
        this.f8253b = false;
    }

    public void d(ArrayList<WidgetRun> arrayList) {
        arrayList.clear();
        this.f8255d.f8176e.f();
        this.f8255d.f8178f.f();
        arrayList.add(this.f8255d.f8176e);
        arrayList.add(this.f8255d.f8178f);
        Iterator<ConstraintWidget> it2 = this.f8255d.V0.iterator();
        HashSet hashSet = null;
        while (it2.hasNext()) {
            ConstraintWidget next = it2.next();
            if (next instanceof f) {
                arrayList.add(new h(next));
            } else {
                if (next.m0()) {
                    if (next.f8172c == null) {
                        next.f8172c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f8172c);
                } else {
                    arrayList.add(next.f8176e);
                }
                if (next.o0()) {
                    if (next.f8174d == null) {
                        next.f8174d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f8174d);
                } else {
                    arrayList.add(next.f8178f);
                }
                if (next instanceof m2.b) {
                    arrayList.add(new i(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            it3.next().f();
        }
        Iterator<WidgetRun> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            WidgetRun next2 = it4.next();
            if (next2.f8228b != this.f8255d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z11) {
        boolean z12;
        boolean z13 = true;
        boolean z14 = z11 & true;
        if (this.f8253b || this.f8254c) {
            Iterator<ConstraintWidget> it2 = this.f8252a.V0.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next = it2.next();
                next.p();
                next.f8168a = false;
                next.f8176e.r();
                next.f8178f.q();
            }
            this.f8252a.p();
            androidx.constraintlayout.core.widgets.d dVar = this.f8252a;
            dVar.f8168a = false;
            dVar.f8176e.r();
            this.f8252a.f8178f.q();
            this.f8254c = false;
        }
        if (b(this.f8255d)) {
            return false;
        }
        this.f8252a.s1(0);
        this.f8252a.t1(0);
        ConstraintWidget.DimensionBehaviour w11 = this.f8252a.w(0);
        ConstraintWidget.DimensionBehaviour w12 = this.f8252a.w(1);
        if (this.f8253b) {
            c();
        }
        int b02 = this.f8252a.b0();
        int c02 = this.f8252a.c0();
        this.f8252a.f8176e.f8234h.d(b02);
        this.f8252a.f8178f.f8234h.d(c02);
        m();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (w11 == dimensionBehaviour || w12 == dimensionBehaviour) {
            if (z14) {
                Iterator<WidgetRun> it3 = this.f8256e.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (!it3.next().m()) {
                            z14 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z14 && w11 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f8252a.V0(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar2 = this.f8252a;
                dVar2.q1(e(dVar2, 0));
                androidx.constraintlayout.core.widgets.d dVar3 = this.f8252a;
                dVar3.f8176e.f8231e.d(dVar3.a0());
            }
            if (z14 && w12 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f8252a.m1(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar4 = this.f8252a;
                dVar4.R0(e(dVar4, 1));
                androidx.constraintlayout.core.widgets.d dVar5 = this.f8252a;
                dVar5.f8178f.f8231e.d(dVar5.z());
            }
        }
        androidx.constraintlayout.core.widgets.d dVar6 = this.f8252a;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = dVar6.f8171b0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int a02 = dVar6.a0() + b02;
            this.f8252a.f8176e.f8235i.d(a02);
            this.f8252a.f8176e.f8231e.d(a02 - b02);
            m();
            androidx.constraintlayout.core.widgets.d dVar7 = this.f8252a;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar7.f8171b0;
            if (dimensionBehaviourArr2[1] == dimensionBehaviour3 || dimensionBehaviourArr2[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int z15 = dVar7.z() + c02;
                this.f8252a.f8178f.f8235i.d(z15);
                this.f8252a.f8178f.f8231e.d(z15 - c02);
            }
            m();
            z12 = true;
        } else {
            z12 = false;
        }
        Iterator<WidgetRun> it4 = this.f8256e.iterator();
        while (it4.hasNext()) {
            WidgetRun next2 = it4.next();
            if (next2.f8228b != this.f8252a || next2.f8233g) {
                next2.e();
            }
        }
        Iterator<WidgetRun> it5 = this.f8256e.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            WidgetRun next3 = it5.next();
            if ((z12 || next3.f8228b != this.f8252a) && (!next3.f8234h.j || ((!next3.f8235i.j && !(next3 instanceof h)) || (!next3.f8231e.j && !(next3 instanceof c) && !(next3 instanceof h))))) {
                z13 = false;
            }
        }
        z13 = false;
        this.f8252a.V0(w11);
        this.f8252a.m1(w12);
        return z13;
    }

    public boolean g(boolean z11) {
        if (this.f8253b) {
            Iterator<ConstraintWidget> it2 = this.f8252a.V0.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next = it2.next();
                next.p();
                next.f8168a = false;
                j jVar = next.f8176e;
                jVar.f8231e.j = false;
                jVar.f8233g = false;
                jVar.r();
                l lVar = next.f8178f;
                lVar.f8231e.j = false;
                lVar.f8233g = false;
                lVar.q();
            }
            this.f8252a.p();
            androidx.constraintlayout.core.widgets.d dVar = this.f8252a;
            dVar.f8168a = false;
            j jVar2 = dVar.f8176e;
            jVar2.f8231e.j = false;
            jVar2.f8233g = false;
            jVar2.r();
            l lVar2 = this.f8252a.f8178f;
            lVar2.f8231e.j = false;
            lVar2.f8233g = false;
            lVar2.q();
            c();
        }
        if (b(this.f8255d)) {
            return false;
        }
        this.f8252a.s1(0);
        this.f8252a.t1(0);
        this.f8252a.f8176e.f8234h.d(0);
        this.f8252a.f8178f.f8234h.d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143 A[EDGE_INSN: B:77:0x0143->B:62:0x0143 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            androidx.constraintlayout.core.widgets.d r1 = r9.f8252a
            r2 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r1.w(r2)
            androidx.constraintlayout.core.widgets.d r3 = r9.f8252a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.w(r0)
            androidx.constraintlayout.core.widgets.d r4 = r9.f8252a
            int r4 = r4.b0()
            androidx.constraintlayout.core.widgets.d r5 = r9.f8252a
            int r5 = r5.c0()
            if (r10 == 0) goto L_0x0089
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0089
        L_0x0023:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r6 = r9.f8256e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            int r8 = r7.f8232f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.m()
            if (r7 != 0) goto L_0x0029
            r10 = 0
        L_0x0040:
            if (r11 != 0) goto L_0x0066
            if (r10 == 0) goto L_0x0089
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r10) goto L_0x0089
            androidx.constraintlayout.core.widgets.d r10 = r9.f8252a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.V0(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f8252a
            int r6 = r9.e(r10, r2)
            r10.q1(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f8252a
            androidx.constraintlayout.core.widgets.analyzer.j r6 = r10.f8176e
            androidx.constraintlayout.core.widgets.analyzer.e r6 = r6.f8231e
            int r10 = r10.a0()
            r6.d(r10)
            goto L_0x0089
        L_0x0066:
            if (r10 == 0) goto L_0x0089
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r10) goto L_0x0089
            androidx.constraintlayout.core.widgets.d r10 = r9.f8252a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.m1(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f8252a
            int r6 = r9.e(r10, r0)
            r10.R0(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f8252a
            androidx.constraintlayout.core.widgets.analyzer.l r6 = r10.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r6 = r6.f8231e
            int r10 = r10.z()
            r6.d(r10)
        L_0x0089:
            if (r11 != 0) goto L_0x00b4
            androidx.constraintlayout.core.widgets.d r10 = r9.f8252a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r10.f8171b0
            r6 = r5[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r6 == r7) goto L_0x009b
            r5 = r5[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r6) goto L_0x00c5
        L_0x009b:
            int r10 = r10.a0()
            int r10 = r10 + r4
            androidx.constraintlayout.core.widgets.d r5 = r9.f8252a
            androidx.constraintlayout.core.widgets.analyzer.j r5 = r5.f8176e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.f8235i
            r5.d(r10)
            androidx.constraintlayout.core.widgets.d r5 = r9.f8252a
            androidx.constraintlayout.core.widgets.analyzer.j r5 = r5.f8176e
            androidx.constraintlayout.core.widgets.analyzer.e r5 = r5.f8231e
            int r10 = r10 - r4
            r5.d(r10)
            goto L_0x00df
        L_0x00b4:
            androidx.constraintlayout.core.widgets.d r10 = r9.f8252a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r10.f8171b0
            r6 = r4[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r6 == r7) goto L_0x00c7
            r4 = r4[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r4 != r6) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r10 = 0
            goto L_0x00e0
        L_0x00c7:
            int r10 = r10.z()
            int r10 = r10 + r5
            androidx.constraintlayout.core.widgets.d r4 = r9.f8252a
            androidx.constraintlayout.core.widgets.analyzer.l r4 = r4.f8178f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r4.f8235i
            r4.d(r10)
            androidx.constraintlayout.core.widgets.d r4 = r9.f8252a
            androidx.constraintlayout.core.widgets.analyzer.l r4 = r4.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r4 = r4.f8231e
            int r10 = r10 - r5
            r4.d(r10)
        L_0x00df:
            r10 = 1
        L_0x00e0:
            r9.m()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r9.f8256e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0109
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            int r6 = r5.f8232f
            if (r6 == r11) goto L_0x00fa
            goto L_0x00e9
        L_0x00fa:
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.f8228b
            androidx.constraintlayout.core.widgets.d r7 = r9.f8252a
            if (r6 != r7) goto L_0x0105
            boolean r6 = r5.f8233g
            if (r6 != 0) goto L_0x0105
            goto L_0x00e9
        L_0x0105:
            r5.e()
            goto L_0x00e9
        L_0x0109:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r9.f8256e
            java.util.Iterator r4 = r4.iterator()
        L_0x010f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0143
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            int r6 = r5.f8232f
            if (r6 == r11) goto L_0x0120
            goto L_0x010f
        L_0x0120:
            if (r10 != 0) goto L_0x0129
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.f8228b
            androidx.constraintlayout.core.widgets.d r7 = r9.f8252a
            if (r6 != r7) goto L_0x0129
            goto L_0x010f
        L_0x0129:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.f8234h
            boolean r6 = r6.j
            if (r6 != 0) goto L_0x0131
        L_0x012f:
            r0 = 0
            goto L_0x0143
        L_0x0131:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.f8235i
            boolean r6 = r6.j
            if (r6 != 0) goto L_0x0138
            goto L_0x012f
        L_0x0138:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.analyzer.c
            if (r6 != 0) goto L_0x010f
            androidx.constraintlayout.core.widgets.analyzer.e r5 = r5.f8231e
            boolean r5 = r5.j
            if (r5 != 0) goto L_0x010f
            goto L_0x012f
        L_0x0143:
            androidx.constraintlayout.core.widgets.d r10 = r9.f8252a
            r10.V0(r1)
            androidx.constraintlayout.core.widgets.d r10 = r9.f8252a
            r10.m1(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.d.h(boolean, int):boolean");
    }

    public void j() {
        this.f8253b = true;
    }

    public void k() {
        this.f8254c = true;
    }

    public void m() {
        e eVar;
        Iterator<ConstraintWidget> it2 = this.f8252a.V0.iterator();
        while (it2.hasNext()) {
            ConstraintWidget next = it2.next();
            if (!next.f8168a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.f8171b0;
                boolean z11 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i11 = next.f8206w;
                int i12 = next.f8208x;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z12 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i11 == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i12 == 1)) {
                    z11 = true;
                }
                e eVar2 = next.f8176e.f8231e;
                boolean z13 = eVar2.j;
                e eVar3 = next.f8178f.f8231e;
                boolean z14 = eVar3.j;
                if (z13 && z14) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    l(next, dimensionBehaviour4, eVar2.f8223g, dimensionBehaviour4, eVar3.f8223g);
                    next.f8168a = true;
                } else if (z13 && z11) {
                    l(next, ConstraintWidget.DimensionBehaviour.FIXED, eVar2.f8223g, dimensionBehaviour3, eVar3.f8223g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f8178f.f8231e.f8261m = next.z();
                    } else {
                        next.f8178f.f8231e.d(next.z());
                        next.f8168a = true;
                    }
                } else if (z14 && z12) {
                    l(next, dimensionBehaviour3, eVar2.f8223g, ConstraintWidget.DimensionBehaviour.FIXED, eVar3.f8223g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f8176e.f8231e.f8261m = next.a0();
                    } else {
                        next.f8176e.f8231e.d(next.a0());
                        next.f8168a = true;
                    }
                }
                if (next.f8168a && (eVar = next.f8178f.f8274l) != null) {
                    eVar.d(next.r());
                }
            }
        }
    }

    public void n(b.C0027b bVar) {
        this.f8258g = bVar;
    }
}

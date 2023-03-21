package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun */
public class c extends WidgetRun {
    ArrayList<WidgetRun> k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private int f8251l;

    public c(ConstraintWidget constraintWidget, int i11) {
        super(constraintWidget);
        this.f8232f = i11;
        q();
    }

    private void q() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.f8228b;
        ConstraintWidget O = constraintWidget2.O(this.f8232f);
        while (true) {
            ConstraintWidget constraintWidget3 = O;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            }
            O = constraintWidget2.O(this.f8232f);
        }
        this.f8228b = constraintWidget;
        this.k.add(constraintWidget.Q(this.f8232f));
        ConstraintWidget M = constraintWidget.M(this.f8232f);
        while (M != null) {
            this.k.add(M.Q(this.f8232f));
            M = M.M(this.f8232f);
        }
        Iterator<WidgetRun> it2 = this.k.iterator();
        while (it2.hasNext()) {
            WidgetRun next = it2.next();
            int i11 = this.f8232f;
            if (i11 == 0) {
                next.f8228b.f8172c = this;
            } else if (i11 == 1) {
                next.f8228b.f8174d = this;
            }
        }
        if ((this.f8232f == 0 && ((d) this.f8228b.N()).V1()) && this.k.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.k;
            this.f8228b = arrayList.get(arrayList.size() - 1).f8228b;
        }
        this.f8251l = this.f8232f == 0 ? this.f8228b.B() : this.f8228b.W();
    }

    private ConstraintWidget r() {
        for (int i11 = 0; i11 < this.k.size(); i11++) {
            WidgetRun widgetRun = this.k.get(i11);
            if (widgetRun.f8228b.Z() != 8) {
                return widgetRun.f8228b;
            }
        }
        return null;
    }

    private ConstraintWidget s() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.k.get(size);
            if (widgetRun.f8228b.Z() != 8) {
                return widgetRun.f8228b;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(n2.a r27) {
        /*
            r26 = this;
            r0 = r26
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f8234h
            boolean r1 = r1.j
            if (r1 == 0) goto L_0x0429
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f8235i
            boolean r1 = r1.j
            if (r1 != 0) goto L_0x0010
            goto L_0x0429
        L_0x0010:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f8228b
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.N()
            boolean r2 = r1 instanceof androidx.constraintlayout.core.widgets.d
            if (r2 == 0) goto L_0x0021
            androidx.constraintlayout.core.widgets.d r1 = (androidx.constraintlayout.core.widgets.d) r1
            boolean r1 = r1.V1()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r0.f8235i
            int r2 = r2.f8223g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r0.f8234h
            int r4 = r4.f8223g
            int r2 = r2 - r4
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r0.k
            int r4 = r4.size()
            r5 = 0
        L_0x0032:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r8 = r0.k
            java.lang.Object r8 = r8.get(r5)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r8
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r8.f8228b
            int r8 = r8.Z()
            if (r8 != r7) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            r5 = -1
        L_0x004b:
            int r8 = r4 + -1
            r9 = r8
        L_0x004e:
            if (r9 < 0) goto L_0x0064
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r10 = r0.k
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.f8228b
            int r10 = r10.Z()
            if (r10 != r7) goto L_0x0063
            int r9 = r9 + -1
            goto L_0x004e
        L_0x0063:
            r6 = r9
        L_0x0064:
            r9 = 0
        L_0x0065:
            r11 = 2
            if (r9 >= r11) goto L_0x0109
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x006f:
            if (r13 >= r4) goto L_0x00fb
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r3 = r0.k
            java.lang.Object r3 = r3.get(r13)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.f8228b
            int r11 = r11.Z()
            if (r11 != r7) goto L_0x0083
            goto L_0x00f4
        L_0x0083:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x008e
            if (r13 < r5) goto L_0x008e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r3.f8234h
            int r11 = r11.f8222f
            int r14 = r14 + r11
        L_0x008e:
            androidx.constraintlayout.core.widgets.analyzer.e r11 = r3.f8231e
            int r7 = r11.f8223g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r3.f8230d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 == 0) goto L_0x00bd
            int r11 = r0.f8232f
            if (r11 != 0) goto L_0x00ac
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r3.f8228b
            androidx.constraintlayout.core.widgets.analyzer.j r12 = r12.f8176e
            androidx.constraintlayout.core.widgets.analyzer.e r12 = r12.f8231e
            boolean r12 = r12.j
            if (r12 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r12 = 1
            if (r11 != r12) goto L_0x00ba
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.f8228b
            androidx.constraintlayout.core.widgets.analyzer.l r11 = r11.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r11 = r11.f8231e
            boolean r11 = r11.j
            if (r11 != 0) goto L_0x00ba
            return
        L_0x00ba:
            r19 = r7
            goto L_0x00d3
        L_0x00bd:
            r19 = r7
            r12 = 1
            int r7 = r3.f8227a
            if (r7 != r12) goto L_0x00cb
            if (r9 != 0) goto L_0x00cb
            int r7 = r11.f8261m
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00cb:
            boolean r7 = r11.j
            if (r7 == 0) goto L_0x00d3
            r7 = r19
        L_0x00d1:
            r10 = 1
            goto L_0x00d5
        L_0x00d3:
            r7 = r19
        L_0x00d5:
            if (r10 != 0) goto L_0x00e9
            int r15 = r15 + 1
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r3.f8228b
            float[] r7 = r7.N0
            int r10 = r0.f8232f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ea
            float r17 = r17 + r7
            goto L_0x00ea
        L_0x00e9:
            int r14 = r14 + r7
        L_0x00ea:
            if (r13 >= r8) goto L_0x00f4
            if (r13 >= r6) goto L_0x00f4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.f8235i
            int r3 = r3.f8222f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x00f4:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x006f
        L_0x00fb:
            if (r14 < r2) goto L_0x0106
            if (r15 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0065
        L_0x0106:
            r3 = r16
            goto L_0x010e
        L_0x0109:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.f8234h
            int r7 = r7.f8223g
            if (r1 == 0) goto L_0x0118
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.f8235i
            int r7 = r7.f8223g
        L_0x0118:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x012f
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0128
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x012f
        L_0x0128:
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x012f:
            if (r15 <= 0) goto L_0x0227
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x013b:
            if (r12 >= r4) goto L_0x01d9
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.k
            java.lang.Object r9 = r9.get(r12)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r9 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r9
            r19 = r11
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r9.f8228b
            int r11 = r11.Z()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x0155
            goto L_0x01bf
        L_0x0155:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.f8230d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x01bf
            androidx.constraintlayout.core.widgets.analyzer.e r11 = r9.f8231e
            boolean r14 = r11.j
            if (r14 != 0) goto L_0x01bf
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0179
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r9.f8228b
            float[] r14 = r14.N0
            r21 = r7
            int r7 = r0.f8232f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x017d
        L_0x0179:
            r21 = r7
            r7 = r19
        L_0x017d:
            int r14 = r0.f8232f
            if (r14 != 0) goto L_0x018c
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r9.f8228b
            r22 = r10
            int r10 = r14.A
            int r14 = r14.f8212z
            r23 = r1
            goto L_0x019b
        L_0x018c:
            r22 = r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r9.f8228b
            int r14 = r10.D
            int r10 = r10.C
            r23 = r1
            r25 = r14
            r14 = r10
            r10 = r25
        L_0x019b:
            int r1 = r9.f8227a
            r24 = r3
            r3 = 1
            if (r1 != r3) goto L_0x01a9
            int r1 = r11.f8261m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x01aa
        L_0x01a9:
            r1 = r7
        L_0x01aa:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01b4
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01b4:
            if (r1 == r7) goto L_0x01b9
            int r13 = r13 + 1
            r7 = r1
        L_0x01b9:
            androidx.constraintlayout.core.widgets.analyzer.e r1 = r9.f8231e
            r1.d(r7)
            goto L_0x01c7
        L_0x01bf:
            r23 = r1
            r24 = r3
            r21 = r7
            r22 = r10
        L_0x01c7:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r3 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x013b
        L_0x01d9:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0218
            int r15 = r15 - r13
            r1 = 0
            r3 = 0
        L_0x01e6:
            if (r1 >= r4) goto L_0x0216
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r7 = r0.k
            java.lang.Object r7 = r7.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r7.f8228b
            int r9 = r9.Z()
            r10 = 8
            if (r9 != r10) goto L_0x01fb
            goto L_0x0213
        L_0x01fb:
            if (r1 <= 0) goto L_0x0204
            if (r1 < r5) goto L_0x0204
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r7.f8234h
            int r9 = r9.f8222f
            int r3 = r3 + r9
        L_0x0204:
            androidx.constraintlayout.core.widgets.analyzer.e r9 = r7.f8231e
            int r9 = r9.f8223g
            int r3 = r3 + r9
            if (r1 >= r8) goto L_0x0213
            if (r1 >= r6) goto L_0x0213
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r7.f8235i
            int r7 = r7.f8222f
            int r7 = -r7
            int r3 = r3 + r7
        L_0x0213:
            int r1 = r1 + 1
            goto L_0x01e6
        L_0x0216:
            r14 = r3
            goto L_0x021a
        L_0x0218:
            r14 = r20
        L_0x021a:
            int r1 = r0.f8251l
            r3 = 2
            if (r1 != r3) goto L_0x0225
            if (r13 != 0) goto L_0x0225
            r1 = 0
            r0.f8251l = r1
            goto L_0x0231
        L_0x0225:
            r1 = 0
            goto L_0x0231
        L_0x0227:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            r1 = 0
            r3 = 2
        L_0x0231:
            if (r14 <= r2) goto L_0x0235
            r0.f8251l = r3
        L_0x0235:
            if (r24 <= 0) goto L_0x023d
            if (r15 != 0) goto L_0x023d
            if (r5 != r6) goto L_0x023d
            r0.f8251l = r3
        L_0x023d:
            int r3 = r0.f8251l
            r7 = 1
            if (r3 != r7) goto L_0x02e1
            r9 = r24
            if (r9 <= r7) goto L_0x024b
            int r2 = r2 - r14
            int r3 = r9 + -1
            int r2 = r2 / r3
            goto L_0x0252
        L_0x024b:
            if (r9 != r7) goto L_0x0251
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L_0x0252
        L_0x0251:
            r2 = 0
        L_0x0252:
            if (r15 <= 0) goto L_0x0255
            r2 = 0
        L_0x0255:
            r7 = r21
            r3 = 0
        L_0x0258:
            if (r3 >= r4) goto L_0x0429
            if (r23 == 0) goto L_0x0261
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x0262
        L_0x0261:
            r1 = r3
        L_0x0262:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.k
            java.lang.Object r1 = r9.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r1.f8228b
            int r9 = r9.Z()
            r10 = 8
            if (r9 != r10) goto L_0x027f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f8234h
            r9.d(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f8235i
            r1.d(r7)
            goto L_0x02dd
        L_0x027f:
            if (r3 <= 0) goto L_0x0286
            if (r23 == 0) goto L_0x0285
            int r7 = r7 - r2
            goto L_0x0286
        L_0x0285:
            int r7 = r7 + r2
        L_0x0286:
            if (r3 <= 0) goto L_0x0297
            if (r3 < r5) goto L_0x0297
            if (r23 == 0) goto L_0x0292
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f8234h
            int r9 = r9.f8222f
            int r7 = r7 - r9
            goto L_0x0297
        L_0x0292:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f8234h
            int r9 = r9.f8222f
            int r7 = r7 + r9
        L_0x0297:
            if (r23 == 0) goto L_0x029f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f8235i
            r9.d(r7)
            goto L_0x02a4
        L_0x029f:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f8234h
            r9.d(r7)
        L_0x02a4:
            androidx.constraintlayout.core.widgets.analyzer.e r9 = r1.f8231e
            int r10 = r9.f8223g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.f8230d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02b5
            int r11 = r1.f8227a
            r12 = 1
            if (r11 != r12) goto L_0x02b5
            int r10 = r9.f8261m
        L_0x02b5:
            if (r23 == 0) goto L_0x02b9
            int r7 = r7 - r10
            goto L_0x02ba
        L_0x02b9:
            int r7 = r7 + r10
        L_0x02ba:
            if (r23 == 0) goto L_0x02c2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f8234h
            r9.d(r7)
            goto L_0x02c7
        L_0x02c2:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f8235i
            r9.d(r7)
        L_0x02c7:
            r9 = 1
            r1.f8233g = r9
            if (r3 >= r8) goto L_0x02dd
            if (r3 >= r6) goto L_0x02dd
            if (r23 == 0) goto L_0x02d7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f8235i
            int r1 = r1.f8222f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x02dd
        L_0x02d7:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f8235i
            int r1 = r1.f8222f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x02dd:
            int r3 = r3 + 1
            goto L_0x0258
        L_0x02e1:
            r9 = r24
            if (r3 != 0) goto L_0x0378
            int r2 = r2 - r14
            r3 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02ed
            r2 = 0
        L_0x02ed:
            r7 = r21
            r3 = 0
        L_0x02f0:
            if (r3 >= r4) goto L_0x0429
            if (r23 == 0) goto L_0x02f9
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x02fa
        L_0x02f9:
            r1 = r3
        L_0x02fa:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.k
            java.lang.Object r1 = r9.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r1.f8228b
            int r9 = r9.Z()
            r10 = 8
            if (r9 != r10) goto L_0x0317
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f8234h
            r9.d(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f8235i
            r1.d(r7)
            goto L_0x0374
        L_0x0317:
            if (r23 == 0) goto L_0x031b
            int r7 = r7 - r2
            goto L_0x031c
        L_0x031b:
            int r7 = r7 + r2
        L_0x031c:
            if (r3 <= 0) goto L_0x032d
            if (r3 < r5) goto L_0x032d
            if (r23 == 0) goto L_0x0328
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f8234h
            int r9 = r9.f8222f
            int r7 = r7 - r9
            goto L_0x032d
        L_0x0328:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f8234h
            int r9 = r9.f8222f
            int r7 = r7 + r9
        L_0x032d:
            if (r23 == 0) goto L_0x0335
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f8235i
            r9.d(r7)
            goto L_0x033a
        L_0x0335:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f8234h
            r9.d(r7)
        L_0x033a:
            androidx.constraintlayout.core.widgets.analyzer.e r9 = r1.f8231e
            int r10 = r9.f8223g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.f8230d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x034f
            int r11 = r1.f8227a
            r12 = 1
            if (r11 != r12) goto L_0x034f
            int r9 = r9.f8261m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x034f:
            if (r23 == 0) goto L_0x0353
            int r7 = r7 - r10
            goto L_0x0354
        L_0x0353:
            int r7 = r7 + r10
        L_0x0354:
            if (r23 == 0) goto L_0x035c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f8234h
            r9.d(r7)
            goto L_0x0361
        L_0x035c:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f8235i
            r9.d(r7)
        L_0x0361:
            if (r3 >= r8) goto L_0x0374
            if (r3 >= r6) goto L_0x0374
            if (r23 == 0) goto L_0x036e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f8235i
            int r1 = r1.f8222f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0374
        L_0x036e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f8235i
            int r1 = r1.f8222f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0374:
            int r3 = r3 + 1
            goto L_0x02f0
        L_0x0378:
            r7 = 2
            if (r3 != r7) goto L_0x0429
            int r3 = r0.f8232f
            if (r3 != 0) goto L_0x0386
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f8228b
            float r3 = r3.A()
            goto L_0x038c
        L_0x0386:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f8228b
            float r3 = r3.V()
        L_0x038c:
            if (r23 == 0) goto L_0x0392
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
        L_0x0392:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L_0x039e
            if (r15 <= 0) goto L_0x039f
        L_0x039e:
            r2 = 0
        L_0x039f:
            if (r23 == 0) goto L_0x03a4
            int r7 = r21 - r2
            goto L_0x03a6
        L_0x03a4:
            int r7 = r21 + r2
        L_0x03a6:
            r3 = 0
        L_0x03a7:
            if (r3 >= r4) goto L_0x0429
            if (r23 == 0) goto L_0x03b0
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x03b1
        L_0x03b0:
            r1 = r3
        L_0x03b1:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r2 = r0.k
            java.lang.Object r1 = r2.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.f8228b
            int r2 = r2.Z()
            r9 = 8
            if (r2 != r9) goto L_0x03cf
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f8234h
            r2.d(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f8235i
            r1.d(r7)
            r12 = 1
            goto L_0x0425
        L_0x03cf:
            if (r3 <= 0) goto L_0x03e0
            if (r3 < r5) goto L_0x03e0
            if (r23 == 0) goto L_0x03db
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f8234h
            int r2 = r2.f8222f
            int r7 = r7 - r2
            goto L_0x03e0
        L_0x03db:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f8234h
            int r2 = r2.f8222f
            int r7 = r7 + r2
        L_0x03e0:
            if (r23 == 0) goto L_0x03e8
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f8235i
            r2.d(r7)
            goto L_0x03ed
        L_0x03e8:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f8234h
            r2.d(r7)
        L_0x03ed:
            androidx.constraintlayout.core.widgets.analyzer.e r2 = r1.f8231e
            int r10 = r2.f8223g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.f8230d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03ff
            int r11 = r1.f8227a
            r12 = 1
            if (r11 != r12) goto L_0x0400
            int r10 = r2.f8261m
            goto L_0x0400
        L_0x03ff:
            r12 = 1
        L_0x0400:
            if (r23 == 0) goto L_0x0404
            int r7 = r7 - r10
            goto L_0x0405
        L_0x0404:
            int r7 = r7 + r10
        L_0x0405:
            if (r23 == 0) goto L_0x040d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f8234h
            r2.d(r7)
            goto L_0x0412
        L_0x040d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f8235i
            r2.d(r7)
        L_0x0412:
            if (r3 >= r8) goto L_0x0425
            if (r3 >= r6) goto L_0x0425
            if (r23 == 0) goto L_0x041f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f8235i
            int r1 = r1.f8222f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0425
        L_0x041f:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f8235i
            int r1 = r1.f8222f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0425:
            int r3 = r3 + 1
            goto L_0x03a7
        L_0x0429:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.c.a(n2.a):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        Iterator<WidgetRun> it2 = this.k.iterator();
        while (it2.hasNext()) {
            it2.next().d();
        }
        int size = this.k.size();
        if (size >= 1) {
            ConstraintWidget constraintWidget = this.k.get(0).f8228b;
            ConstraintWidget constraintWidget2 = this.k.get(size - 1).f8228b;
            if (this.f8232f == 0) {
                ConstraintAnchor constraintAnchor = constraintWidget.Q;
                ConstraintAnchor constraintAnchor2 = constraintWidget2.S;
                DependencyNode i11 = i(constraintAnchor, 0);
                int f11 = constraintAnchor.f();
                ConstraintWidget r11 = r();
                if (r11 != null) {
                    f11 = r11.Q.f();
                }
                if (i11 != null) {
                    b(this.f8234h, i11, f11);
                }
                DependencyNode i12 = i(constraintAnchor2, 0);
                int f12 = constraintAnchor2.f();
                ConstraintWidget s11 = s();
                if (s11 != null) {
                    f12 = s11.S.f();
                }
                if (i12 != null) {
                    b(this.f8235i, i12, -f12);
                }
            } else {
                ConstraintAnchor constraintAnchor3 = constraintWidget.R;
                ConstraintAnchor constraintAnchor4 = constraintWidget2.T;
                DependencyNode i13 = i(constraintAnchor3, 1);
                int f13 = constraintAnchor3.f();
                ConstraintWidget r12 = r();
                if (r12 != null) {
                    f13 = r12.R.f();
                }
                if (i13 != null) {
                    b(this.f8234h, i13, f13);
                }
                DependencyNode i14 = i(constraintAnchor4, 1);
                int f14 = constraintAnchor4.f();
                ConstraintWidget s12 = s();
                if (s12 != null) {
                    f14 = s12.T.f();
                }
                if (i14 != null) {
                    b(this.f8235i, i14, -f14);
                }
            }
            this.f8234h.f8217a = this;
            this.f8235i.f8217a = this;
        }
    }

    public void e() {
        for (int i11 = 0; i11 < this.k.size(); i11++) {
            this.k.get(i11).e();
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f8229c = null;
        Iterator<WidgetRun> it2 = this.k.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
    }

    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i11 = 0; i11 < size; i11++) {
            WidgetRun widgetRun = this.k.get(i11);
            j = j + ((long) widgetRun.f8234h.f8222f) + widgetRun.j() + ((long) widgetRun.f8235i.f8222f);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        int size = this.k.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!this.k.get(i11).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f8232f == 0 ? "horizontal : " : "vertical : ");
        Iterator<WidgetRun> it2 = this.k.iterator();
        while (it2.hasNext()) {
            sb2.append("<");
            sb2.append(it2.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}

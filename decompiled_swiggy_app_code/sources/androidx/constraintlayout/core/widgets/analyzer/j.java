package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* compiled from: HorizontalWidgetRun */
public class j extends WidgetRun {
    private static int[] k = new int[2];

    /* compiled from: HorizontalWidgetRun */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8265a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8265a = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8265a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8265a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.j.a.<clinit>():void");
        }
    }

    public j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f8234h.f8221e = DependencyNode.Type.LEFT;
        this.f8235i.f8221e = DependencyNode.Type.RIGHT;
        this.f8232f = 0;
    }

    private void q(int[] iArr, int i11, int i12, int i13, int i14, float f11, int i15) {
        int i16 = i12 - i11;
        int i17 = i14 - i13;
        if (i15 == -1) {
            int i18 = (int) ((((float) i17) * f11) + 0.5f);
            int i19 = (int) ((((float) i16) / f11) + 0.5f);
            if (i18 <= i16) {
                iArr[0] = i18;
                iArr[1] = i17;
            } else if (i19 <= i17) {
                iArr[0] = i16;
                iArr[1] = i19;
            }
        } else if (i15 == 0) {
            iArr[0] = (int) ((((float) i17) * f11) + 0.5f);
            iArr[1] = i17;
        } else if (i15 == 1) {
            iArr[0] = i16;
            iArr[1] = (int) ((((float) i16) * f11) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02bc, code lost:
        if (r14 != 1) goto L_0x0324;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(n2.a r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = androidx.constraintlayout.core.widgets.analyzer.j.a.f8265a
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = r8.j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.S
            r3 = r17
            r8.n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.p(r17)
        L_0x002e:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            boolean r0 = r0.j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x0324
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.f8230d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x0324
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            int r3 = r0.f8206w
            if (r3 == r1) goto L_0x0306
            if (r3 == r2) goto L_0x0046
            goto L_0x0324
        L_0x0046:
            int r1 = r0.f8208x
            r3 = -1
            if (r1 == 0) goto L_0x008f
            if (r1 != r2) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            int r0 = r0.y()
            if (r0 == r3) goto L_0x0077
            if (r0 == 0) goto L_0x0068
            if (r0 == r9) goto L_0x005a
            r0 = 0
            goto L_0x0088
        L_0x005a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            androidx.constraintlayout.core.widgets.analyzer.l r1 = r0.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r1 = r1.f8231e
            int r1 = r1.f8223g
            float r1 = (float) r1
            float r0 = r0.x()
            goto L_0x0084
        L_0x0068:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            androidx.constraintlayout.core.widgets.analyzer.l r1 = r0.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r1 = r1.f8231e
            int r1 = r1.f8223g
            float r1 = (float) r1
            float r0 = r0.x()
            float r1 = r1 / r0
            goto L_0x0086
        L_0x0077:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            androidx.constraintlayout.core.widgets.analyzer.l r1 = r0.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r1 = r1.f8231e
            int r1 = r1.f8223g
            float r1 = (float) r1
            float r0 = r0.x()
        L_0x0084:
            float r1 = r1 * r0
        L_0x0086:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x0088:
            androidx.constraintlayout.core.widgets.analyzer.e r1 = r8.f8231e
            r1.d(r0)
            goto L_0x0324
        L_0x008f:
            androidx.constraintlayout.core.widgets.analyzer.l r1 = r0.f8178f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r12 = r1.f8234h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r13 = r1.f8235i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f8163f
            if (r1 == 0) goto L_0x009d
            r1 = 1
            goto L_0x009e
        L_0x009d:
            r1 = 0
        L_0x009e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f8163f
            if (r2 == 0) goto L_0x00a6
            r2 = 1
            goto L_0x00a7
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f8163f
            if (r4 == 0) goto L_0x00af
            r4 = 1
            goto L_0x00b0
        L_0x00af:
            r4 = 0
        L_0x00b0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f8163f
            if (r5 == 0) goto L_0x00b8
            r5 = 1
            goto L_0x00b9
        L_0x00b8:
            r5 = 0
        L_0x00b9:
            int r14 = r0.y()
            if (r1 == 0) goto L_0x0200
            if (r2 == 0) goto L_0x0200
            if (r4 == 0) goto L_0x0200
            if (r5 == 0) goto L_0x0200
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            float r15 = r0.x()
            boolean r0 = r12.j
            if (r0 == 0) goto L_0x012e
            boolean r0 = r13.j
            if (r0 == 0) goto L_0x012e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8234h
            boolean r1 = r0.f8219c
            if (r1 == 0) goto L_0x012d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f8235i
            boolean r1 = r1.f8219c
            if (r1 != 0) goto L_0x00e0
            goto L_0x012d
        L_0x00e0:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f8226l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f8223g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f8234h
            int r1 = r1.f8222f
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8235i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f8226l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f8223g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f8235i
            int r1 = r1.f8222f
            int r3 = r0 - r1
            int r0 = r12.f8223g
            int r1 = r12.f8222f
            int r4 = r0 + r1
            int r0 = r13.f8223g
            int r1 = r13.f8222f
            int r5 = r0 - r1
            int[] r1 = k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            int[] r1 = k
            r1 = r1[r10]
            r0.d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f8231e
            int[] r1 = k
            r1 = r1[r9]
            r0.d(r1)
        L_0x012d:
            return
        L_0x012e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8234h
            boolean r1 = r0.j
            if (r1 == 0) goto L_0x018b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f8235i
            boolean r2 = r1.j
            if (r2 == 0) goto L_0x018b
            boolean r2 = r12.f8219c
            if (r2 == 0) goto L_0x018a
            boolean r2 = r13.f8219c
            if (r2 != 0) goto L_0x0143
            goto L_0x018a
        L_0x0143:
            int r2 = r0.f8223g
            int r0 = r0.f8222f
            int r2 = r2 + r0
            int r0 = r1.f8223g
            int r1 = r1.f8222f
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r12.f8226l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f8223g
            int r1 = r12.f8222f
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r13.f8226l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f8223g
            int r1 = r13.f8222f
            int r5 = r0 - r1
            int[] r1 = k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            int[] r1 = k
            r1 = r1[r10]
            r0.d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f8231e
            int[] r1 = k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x018b
        L_0x018a:
            return
        L_0x018b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8234h
            boolean r1 = r0.f8219c
            if (r1 == 0) goto L_0x01ff
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f8235i
            boolean r1 = r1.f8219c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r12.f8219c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r13.f8219c
            if (r1 != 0) goto L_0x01a0
            goto L_0x01ff
        L_0x01a0:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f8226l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f8223g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f8234h
            int r1 = r1.f8222f
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8235i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f8226l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f8223g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f8235i
            int r1 = r1.f8222f
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r12.f8226l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f8223g
            int r1 = r12.f8222f
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r13.f8226l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f8223g
            int r1 = r13.f8222f
            int r5 = r0 - r1
            int[] r1 = k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            int[] r1 = k
            r1 = r1[r10]
            r0.d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f8231e
            int[] r1 = k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x0324
        L_0x01ff:
            return
        L_0x0200:
            if (r1 == 0) goto L_0x028b
            if (r4 == 0) goto L_0x028b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8234h
            boolean r0 = r0.f8219c
            if (r0 == 0) goto L_0x028a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8235i
            boolean r0 = r0.f8219c
            if (r0 != 0) goto L_0x0212
            goto L_0x028a
        L_0x0212:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            float r0 = r0.x()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f8234h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.f8226l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r1 = r1.f8223g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f8234h
            int r2 = r2.f8222f
            int r1 = r1 + r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f8235i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r2.f8226l
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.f8223g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.f8235i
            int r4 = r4.f8222f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0266
            if (r14 == 0) goto L_0x0266
            if (r14 == r9) goto L_0x0242
            goto L_0x0324
        L_0x0242:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0256
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0256:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            r0.d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f8231e
            r0.d(r3)
            goto L_0x0324
        L_0x0266:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x027a
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x027a:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            r0.d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f8231e
            r0.d(r3)
            goto L_0x0324
        L_0x028a:
            return
        L_0x028b:
            if (r2 == 0) goto L_0x0324
            if (r5 == 0) goto L_0x0324
            boolean r0 = r12.f8219c
            if (r0 == 0) goto L_0x0305
            boolean r0 = r13.f8219c
            if (r0 != 0) goto L_0x0298
            goto L_0x0305
        L_0x0298:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            float r0 = r0.x()
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r12.f8226l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r1 = r1.f8223g
            int r2 = r12.f8222f
            int r1 = r1 + r2
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r13.f8226l
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.f8223g
            int r4 = r13.f8222f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02e2
            if (r14 == 0) goto L_0x02bf
            if (r14 == r9) goto L_0x02e2
            goto L_0x0324
        L_0x02bf:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02d3
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02d3:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            r0.d(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f8231e
            r0.d(r1)
            goto L_0x0324
        L_0x02e2:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02f6
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02f6:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            r0.d(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f8178f
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f8231e
            r0.d(r1)
            goto L_0x0324
        L_0x0305:
            return
        L_0x0306:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.N()
            if (r0 == 0) goto L_0x0324
            androidx.constraintlayout.core.widgets.analyzer.j r0 = r0.f8176e
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f8231e
            boolean r1 = r0.j
            if (r1 == 0) goto L_0x0324
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f8228b
            float r1 = r1.B
            int r0 = r0.f8223g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            androidx.constraintlayout.core.widgets.analyzer.e r1 = r8.f8231e
            r1.d(r0)
        L_0x0324:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8234h
            boolean r1 = r0.f8219c
            if (r1 == 0) goto L_0x0446
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f8235i
            boolean r2 = r1.f8219c
            if (r2 != 0) goto L_0x0332
            goto L_0x0446
        L_0x0332:
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x0341
            boolean r0 = r1.j
            if (r0 == 0) goto L_0x0341
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x0341
            return
        L_0x0341:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x038b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.f8230d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x038b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f8228b
            int r1 = r0.f8206w
            if (r1 != 0) goto L_0x038b
            boolean r0 = r0.m0()
            if (r0 != 0) goto L_0x038b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8234h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f8226l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f8235i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.f8226l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.f8223g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f8234h
            int r3 = r2.f8222f
            int r0 = r0 + r3
            int r1 = r1.f8223g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.f8235i
            int r3 = r3.f8222f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.d(r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8235i
            r0.d(r1)
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            r0.d(r3)
            return
        L_0x038b:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x03ef
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.f8230d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03ef
            int r0 = r8.f8227a
            if (r0 != r9) goto L_0x03ef
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8234h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f8226l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ef
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8235i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f8226l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ef
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8234h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f8226l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f8235i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.f8226l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.f8223g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f8234h
            int r2 = r2.f8222f
            int r0 = r0 + r2
            int r1 = r1.f8223g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f8235i
            int r2 = r2.f8222f
            int r1 = r1 + r2
            int r1 = r1 - r0
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            int r0 = r0.f8261m
            int r0 = java.lang.Math.min(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f8228b
            int r2 = r1.A
            int r1 = r1.f8212z
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03ea
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03ea:
            androidx.constraintlayout.core.widgets.analyzer.e r1 = r8.f8231e
            r1.d(r0)
        L_0x03ef:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x03f6
            return
        L_0x03f6:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8234h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f8226l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f8235i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.f8226l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r2 = r0.f8223g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.f8234h
            int r3 = r3.f8222f
            int r2 = r2 + r3
            int r3 = r1.f8223g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.f8235i
            int r4 = r4.f8222f
            int r3 = r3 + r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r8.f8228b
            float r4 = r4.A()
            if (r0 != r1) goto L_0x0426
            int r2 = r0.f8223g
            int r3 = r1.f8223g
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x0426:
            int r3 = r3 - r2
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f8231e
            int r0 = r0.f8223g
            int r3 = r3 - r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8234h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.d(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8235i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f8234h
            int r1 = r1.f8223g
            androidx.constraintlayout.core.widgets.analyzer.e r2 = r8.f8231e
            int r2 = r2.f8223g
            int r1 = r1 + r2
            r0.d(r1)
        L_0x0446:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.j.a(n2.a):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        ConstraintWidget N;
        ConstraintWidget N2;
        ConstraintWidget constraintWidget = this.f8228b;
        if (constraintWidget.f8168a) {
            this.f8231e.d(constraintWidget.a0());
        }
        if (!this.f8231e.j) {
            ConstraintWidget.DimensionBehaviour C = this.f8228b.C();
            this.f8230d = C;
            if (C != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (C == dimensionBehaviour && (N2 = this.f8228b.N()) != null && (N2.C() == ConstraintWidget.DimensionBehaviour.FIXED || N2.C() == dimensionBehaviour)) {
                    int a02 = (N2.a0() - this.f8228b.Q.f()) - this.f8228b.S.f();
                    b(this.f8234h, N2.f8176e.f8234h, this.f8228b.Q.f());
                    b(this.f8235i, N2.f8176e.f8235i, -this.f8228b.S.f());
                    this.f8231e.d(a02);
                    return;
                } else if (this.f8230d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f8231e.d(this.f8228b.a0());
                }
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f8230d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour2 == dimensionBehaviour3 && (N = this.f8228b.N()) != null && (N.C() == ConstraintWidget.DimensionBehaviour.FIXED || N.C() == dimensionBehaviour3)) {
                b(this.f8234h, N.f8176e.f8234h, this.f8228b.Q.f());
                b(this.f8235i, N.f8176e.f8235i, -this.f8228b.S.f());
                return;
            }
        }
        e eVar = this.f8231e;
        if (eVar.j) {
            ConstraintWidget constraintWidget2 = this.f8228b;
            if (constraintWidget2.f8168a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.Y;
                if (constraintAnchorArr[0].f8163f == null || constraintAnchorArr[1].f8163f == null) {
                    if (constraintAnchorArr[0].f8163f != null) {
                        DependencyNode h11 = h(constraintAnchorArr[0]);
                        if (h11 != null) {
                            b(this.f8234h, h11, this.f8228b.Y[0].f());
                            b(this.f8235i, this.f8234h, this.f8231e.f8223g);
                            return;
                        }
                        return;
                    } else if (constraintAnchorArr[1].f8163f != null) {
                        DependencyNode h12 = h(constraintAnchorArr[1]);
                        if (h12 != null) {
                            b(this.f8235i, h12, -this.f8228b.Y[1].f());
                            b(this.f8234h, this.f8235i, -this.f8231e.f8223g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget2 instanceof m2.a) && constraintWidget2.N() != null && this.f8228b.q(ConstraintAnchor.Type.CENTER).f8163f == null) {
                        b(this.f8234h, this.f8228b.N().f8176e.f8234h, this.f8228b.b0());
                        b(this.f8235i, this.f8234h, this.f8231e.f8223g);
                        return;
                    } else {
                        return;
                    }
                } else if (constraintWidget2.m0()) {
                    this.f8234h.f8222f = this.f8228b.Y[0].f();
                    this.f8235i.f8222f = -this.f8228b.Y[1].f();
                    return;
                } else {
                    DependencyNode h13 = h(this.f8228b.Y[0]);
                    if (h13 != null) {
                        b(this.f8234h, h13, this.f8228b.Y[0].f());
                    }
                    DependencyNode h14 = h(this.f8228b.Y[1]);
                    if (h14 != null) {
                        b(this.f8235i, h14, -this.f8228b.Y[1].f());
                    }
                    this.f8234h.f8218b = true;
                    this.f8235i.f8218b = true;
                    return;
                }
            }
        }
        if (this.f8230d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f8228b;
            int i11 = constraintWidget3.f8206w;
            if (i11 == 2) {
                ConstraintWidget N3 = constraintWidget3.N();
                if (N3 != null) {
                    e eVar2 = N3.f8178f.f8231e;
                    this.f8231e.f8226l.add(eVar2);
                    eVar2.k.add(this.f8231e);
                    e eVar3 = this.f8231e;
                    eVar3.f8218b = true;
                    eVar3.k.add(this.f8234h);
                    this.f8231e.k.add(this.f8235i);
                }
            } else if (i11 == 3) {
                if (constraintWidget3.f8208x == 3) {
                    this.f8234h.f8217a = this;
                    this.f8235i.f8217a = this;
                    l lVar = constraintWidget3.f8178f;
                    lVar.f8234h.f8217a = this;
                    lVar.f8235i.f8217a = this;
                    eVar.f8217a = this;
                    if (constraintWidget3.o0()) {
                        this.f8231e.f8226l.add(this.f8228b.f8178f.f8231e);
                        this.f8228b.f8178f.f8231e.k.add(this.f8231e);
                        l lVar2 = this.f8228b.f8178f;
                        lVar2.f8231e.f8217a = this;
                        this.f8231e.f8226l.add(lVar2.f8234h);
                        this.f8231e.f8226l.add(this.f8228b.f8178f.f8235i);
                        this.f8228b.f8178f.f8234h.k.add(this.f8231e);
                        this.f8228b.f8178f.f8235i.k.add(this.f8231e);
                    } else if (this.f8228b.m0()) {
                        this.f8228b.f8178f.f8231e.f8226l.add(this.f8231e);
                        this.f8231e.k.add(this.f8228b.f8178f.f8231e);
                    } else {
                        this.f8228b.f8178f.f8231e.f8226l.add(this.f8231e);
                    }
                } else {
                    e eVar4 = constraintWidget3.f8178f.f8231e;
                    eVar.f8226l.add(eVar4);
                    eVar4.k.add(this.f8231e);
                    this.f8228b.f8178f.f8234h.k.add(this.f8231e);
                    this.f8228b.f8178f.f8235i.k.add(this.f8231e);
                    e eVar5 = this.f8231e;
                    eVar5.f8218b = true;
                    eVar5.k.add(this.f8234h);
                    this.f8231e.k.add(this.f8235i);
                    this.f8234h.f8226l.add(this.f8231e);
                    this.f8235i.f8226l.add(this.f8231e);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.f8228b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.Y;
        if (constraintAnchorArr2[0].f8163f == null || constraintAnchorArr2[1].f8163f == null) {
            if (constraintAnchorArr2[0].f8163f != null) {
                DependencyNode h15 = h(constraintAnchorArr2[0]);
                if (h15 != null) {
                    b(this.f8234h, h15, this.f8228b.Y[0].f());
                    c(this.f8235i, this.f8234h, 1, this.f8231e);
                }
            } else if (constraintAnchorArr2[1].f8163f != null) {
                DependencyNode h16 = h(constraintAnchorArr2[1]);
                if (h16 != null) {
                    b(this.f8235i, h16, -this.f8228b.Y[1].f());
                    c(this.f8234h, this.f8235i, -1, this.f8231e);
                }
            } else if (!(constraintWidget4 instanceof m2.a) && constraintWidget4.N() != null) {
                b(this.f8234h, this.f8228b.N().f8176e.f8234h, this.f8228b.b0());
                c(this.f8235i, this.f8234h, 1, this.f8231e);
            }
        } else if (constraintWidget4.m0()) {
            this.f8234h.f8222f = this.f8228b.Y[0].f();
            this.f8235i.f8222f = -this.f8228b.Y[1].f();
        } else {
            DependencyNode h17 = h(this.f8228b.Y[0]);
            DependencyNode h18 = h(this.f8228b.Y[1]);
            if (h17 != null) {
                h17.b(this);
            }
            if (h18 != null) {
                h18.b(this);
            }
            this.j = WidgetRun.RunType.CENTER;
        }
    }

    public void e() {
        DependencyNode dependencyNode = this.f8234h;
        if (dependencyNode.j) {
            this.f8228b.s1(dependencyNode.f8223g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f8229c = null;
        this.f8234h.c();
        this.f8235i.c();
        this.f8231e.c();
        this.f8233g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        if (this.f8230d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f8228b.f8206w == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f8233g = false;
        this.f8234h.c();
        this.f8234h.j = false;
        this.f8235i.c();
        this.f8235i.j = false;
        this.f8231e.j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f8228b.v();
    }
}

package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.c;
import androidx.constraintlayout.core.widgets.analyzer.g;
import androidx.constraintlayout.core.widgets.analyzer.m;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintAnchor {

    /* renamed from: a  reason: collision with root package name */
    private HashSet<ConstraintAnchor> f8158a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f8159b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8160c;

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintWidget f8161d;

    /* renamed from: e  reason: collision with root package name */
    public final Type f8162e;

    /* renamed from: f  reason: collision with root package name */
    public ConstraintAnchor f8163f;

    /* renamed from: g  reason: collision with root package name */
    public int f8164g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f8165h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    SolverVariable f8166i;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8167a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8167a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8167a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8167a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8167a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8167a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8167a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8167a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8167a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8167a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintAnchor.a.<clinit>():void");
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f8161d = constraintWidget;
        this.f8162e = type;
    }

    public boolean a(ConstraintAnchor constraintAnchor, int i11) {
        return b(constraintAnchor, i11, Integer.MIN_VALUE, false);
    }

    public boolean b(ConstraintAnchor constraintAnchor, int i11, int i12, boolean z11) {
        if (constraintAnchor == null) {
            q();
            return true;
        } else if (!z11 && !p(constraintAnchor)) {
            return false;
        } else {
            this.f8163f = constraintAnchor;
            if (constraintAnchor.f8158a == null) {
                constraintAnchor.f8158a = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.f8163f.f8158a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f8164g = i11;
            this.f8165h = i12;
            return true;
        }
    }

    public void c(int i11, ArrayList<m> arrayList, m mVar) {
        HashSet<ConstraintAnchor> hashSet = this.f8158a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                g.a(it2.next().f8161d, i11, arrayList, mVar);
            }
        }
    }

    public HashSet<ConstraintAnchor> d() {
        return this.f8158a;
    }

    public int e() {
        if (!this.f8160c) {
            return 0;
        }
        return this.f8159b;
    }

    public int f() {
        ConstraintAnchor constraintAnchor;
        if (this.f8161d.Z() == 8) {
            return 0;
        }
        if (this.f8165h == Integer.MIN_VALUE || (constraintAnchor = this.f8163f) == null || constraintAnchor.f8161d.Z() != 8) {
            return this.f8164g;
        }
        return this.f8165h;
    }

    public final ConstraintAnchor g() {
        switch (a.f8167a[this.f8162e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f8161d.S;
            case 3:
                return this.f8161d.Q;
            case 4:
                return this.f8161d.T;
            case 5:
                return this.f8161d.R;
            default:
                throw new AssertionError(this.f8162e.name());
        }
    }

    public ConstraintWidget h() {
        return this.f8161d;
    }

    public SolverVariable i() {
        return this.f8166i;
    }

    public ConstraintAnchor j() {
        return this.f8163f;
    }

    public Type k() {
        return this.f8162e;
    }

    public boolean l() {
        HashSet<ConstraintAnchor> hashSet = this.f8158a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (it2.next().g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet<ConstraintAnchor> hashSet = this.f8158a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean n() {
        return this.f8160c;
    }

    public boolean o() {
        return this.f8163f != null;
    }

    public boolean p(ConstraintAnchor constraintAnchor) {
        boolean z11 = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type k = constraintAnchor.k();
        Type type = this.f8162e;
        if (k != type) {
            switch (a.f8167a[type.ordinal()]) {
                case 1:
                    if (k == Type.BASELINE || k == Type.CENTER_X || k == Type.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    boolean z12 = k == Type.LEFT || k == Type.RIGHT;
                    if (!(constraintAnchor.h() instanceof f)) {
                        return z12;
                    }
                    if (z12 || k == Type.CENTER_X) {
                        z11 = true;
                    }
                    return z11;
                case 4:
                case 5:
                    boolean z13 = k == Type.TOP || k == Type.BOTTOM;
                    if (!(constraintAnchor.h() instanceof f)) {
                        return z13;
                    }
                    if (z13 || k == Type.CENTER_Y) {
                        z11 = true;
                    }
                    return z11;
                case 6:
                    if (k == Type.LEFT || k == Type.RIGHT) {
                        return false;
                    }
                    return true;
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f8162e.name());
            }
        } else if (type != Type.BASELINE || (constraintAnchor.h().d0() && h().d0())) {
            return true;
        } else {
            return false;
        }
    }

    public void q() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f8163f;
        if (!(constraintAnchor == null || (hashSet = constraintAnchor.f8158a) == null)) {
            hashSet.remove(this);
            if (this.f8163f.f8158a.size() == 0) {
                this.f8163f.f8158a = null;
            }
        }
        this.f8158a = null;
        this.f8163f = null;
        this.f8164g = 0;
        this.f8165h = Integer.MIN_VALUE;
        this.f8160c = false;
        this.f8159b = 0;
    }

    public void r() {
        this.f8160c = false;
        this.f8159b = 0;
    }

    public void s(c cVar) {
        SolverVariable solverVariable = this.f8166i;
        if (solverVariable == null) {
            this.f8166i = new SolverVariable(SolverVariable.Type.UNRESTRICTED, (String) null);
        } else {
            solverVariable.j();
        }
    }

    public void t(int i11) {
        this.f8159b = i11;
        this.f8160c = true;
    }

    public String toString() {
        return this.f8161d.v() + Constants.COLON_SEPARATOR + this.f8162e.toString();
    }

    public void u(int i11) {
        if (o()) {
            this.f8165h = i11;
        }
    }
}

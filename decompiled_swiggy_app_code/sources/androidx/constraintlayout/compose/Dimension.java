package androidx.constraintlayout.compose;

import f2.k;

/* compiled from: ConstraintLayout.kt */
public interface Dimension {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f7970a = Companion.f7971a;

    /* compiled from: ConstraintLayout.kt */
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ Companion f7971a = new Companion();

        private Companion() {
        }

        public final a a() {
            return new k(Dimension$Companion$fillToConstraints$1.f7972a);
        }

        public final Dimension b() {
            return new k(Dimension$Companion$wrapContent$1.f7974a);
        }

        public final Dimension c(float f11) {
            return new k(new Dimension$Companion$value$1(f11));
        }
    }

    /* compiled from: ConstraintLayout.kt */
    public interface a extends Dimension {
    }
}

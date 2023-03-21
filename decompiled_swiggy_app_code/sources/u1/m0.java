package u1;

import androidx.compose.ui.text.font.AsyncFontListLoader;
import e0.d1;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: FontFamilyResolver.kt */
public interface m0 extends d1<Object> {

    /* compiled from: FontFamilyResolver.kt */
    public static final class a implements m0, d1<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final AsyncFontListLoader f16930a;

        public a(AsyncFontListLoader asyncFontListLoader) {
            p.j(asyncFontListLoader, "current");
            this.f16930a = asyncFontListLoader;
        }

        public boolean a() {
            return this.f16930a.f();
        }

        public Object getValue() {
            return this.f16930a.getValue();
        }
    }

    boolean a();

    /* compiled from: FontFamilyResolver.kt */
    public static final class b implements m0 {

        /* renamed from: a  reason: collision with root package name */
        private final Object f16931a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f16932b;

        public b(Object obj, boolean z11) {
            p.j(obj, "value");
            this.f16931a = obj;
            this.f16932b = z11;
        }

        public boolean a() {
            return this.f16932b;
        }

        public Object getValue() {
            return this.f16931a;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(Object obj, boolean z11, int i11, i iVar) {
            this(obj, (i11 & 2) != 0 ? true : z11);
        }
    }
}

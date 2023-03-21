package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.p;
import tp0.e;

/* compiled from: ViewGroup.kt */
public final class e0 {

    /* compiled from: ViewGroup.kt */
    public static final class a implements e<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f9502a;

        a(ViewGroup viewGroup) {
            this.f9502a = viewGroup;
        }

        public Iterator<View> iterator() {
            return e0.b(this.f9502a);
        }
    }

    /* compiled from: ViewGroup.kt */
    public static final class b implements Iterator<View>, mp0.a {

        /* renamed from: a  reason: collision with root package name */
        private int f9503a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f9504b;

        b(ViewGroup viewGroup) {
            this.f9504b = viewGroup;
        }

        /* renamed from: b */
        public View next() {
            ViewGroup viewGroup = this.f9504b;
            int i11 = this.f9503a;
            this.f9503a = i11 + 1;
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.f9503a < this.f9504b.getChildCount();
        }

        public void remove() {
            ViewGroup viewGroup = this.f9504b;
            int i11 = this.f9503a - 1;
            this.f9503a = i11;
            viewGroup.removeViewAt(i11);
        }
    }

    public static final e<View> a(ViewGroup viewGroup) {
        p.j(viewGroup, "<this>");
        return new a(viewGroup);
    }

    public static final Iterator<View> b(ViewGroup viewGroup) {
        p.j(viewGroup, "<this>");
        return new b(viewGroup);
    }
}

package yf0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.R;
import in.swiggy.android.activities.HomeActivity;
import kotlin.jvm.internal.p;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import p3.b;
import p3.c;
import p3.d;

/* compiled from: SwiggySlice.kt */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f20014a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f20015b;

    /* renamed from: yf0.a$a  reason: collision with other inner class name */
    /* compiled from: SwiggySlice.kt */
    public static final class C0251a extends a {

        /* renamed from: c  reason: collision with root package name */
        private final Context f20016c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f20017d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0251a(Context context, Uri uri) {
            super(context, uri);
            p.j(context, LogCategory.CONTEXT);
            p.j(uri, "sliceUri");
            this.f20016c = context;
            this.f20017d = uri;
        }

        public Slice f() {
            b bVar = new b(this.f20016c, this.f20017d, -1);
            a(bVar, g(R.string.order_status_slice_title), g(R.string.order_status_slice_error_msg), a.e(this, 0, 1, (Object) null), false, a.c(this, 0, 1, (Object) null));
            Slice h11 = bVar.h();
            p.f(h11, "ListBuilderDsl(context, …ply { addRows() }.build()");
            return h11;
        }
    }

    public a(Context context, Uri uri) {
        p.j(context, LogCategory.CONTEXT);
        p.j(uri, "sliceUri");
        this.f20014a = context;
        this.f20015b = uri;
    }

    public static /* synthetic */ d c(a aVar, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i11 = R.string.open_app;
            }
            return aVar.b(i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDefaultActivityAction");
    }

    public static /* synthetic */ IconCompat e(a aVar, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i11 = R.drawable.swiggy_launcher_icon;
            }
            return aVar.d(i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIconCompat");
    }

    /* access modifiers changed from: protected */
    public final void a(b bVar, String str, String str2, IconCompat iconCompat, boolean z11, d dVar) {
        p.j(bVar, "listBuilderDsl");
        p.j(str, "title");
        p.j(str2, "subtitle");
        p.j(iconCompat, "iconCompat");
        c cVar = new c();
        cVar.u(str, z11);
        cVar.t(str2, z11);
        if (dVar != null) {
            cVar.s(dVar);
        }
        cVar.a(iconCompat, 1, z11);
        p.f(bVar.g(cVar), "addRow(RowBuilderDsl().apply { buildRow() })");
    }

    /* access modifiers changed from: protected */
    public final d b(int i11) {
        d b11 = d.b(PendingIntent.getActivity(this.f20014a, 0, new Intent(this.f20014a, HomeActivity.class), Build.VERSION.SDK_INT >= 31 ? PDButton.FLAG_RADIOS_IN_UNISON : 0), e(this, 0, 1, (Object) null), 0, g(i11));
        p.i(b11, "create(\n            Pend…actionTitleRes)\n        )");
        return b11;
    }

    /* access modifiers changed from: protected */
    public final IconCompat d(int i11) {
        IconCompat j = IconCompat.j(this.f20014a, i11);
        p.i(j, "createWithResource(context, icon)");
        return j;
    }

    public abstract Slice f();

    /* access modifiers changed from: protected */
    public final String g(int i11) {
        String string = this.f20014a.getString(i11);
        p.i(string, "context.getString(resId)");
        return string;
    }

    /* access modifiers changed from: protected */
    public final void h() {
        this.f20014a.getContentResolver().notifyChange(this.f20015b, (ContentObserver) null);
    }
}

package ng0;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import fi0.d;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.apache.fontbox.ttf.HeaderTable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/* compiled from: AjaxInterceptJavascriptInterface.kt */
public final class a {
    public static final C0236a Companion = new C0236a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static String f19784b;

    /* renamed from: a  reason: collision with root package name */
    private final d f19785a;

    /* renamed from: ng0.a$a  reason: collision with other inner class name */
    /* compiled from: AjaxInterceptJavascriptInterface.kt */
    public static final class C0236a {
        private C0236a() {
        }

        public /* synthetic */ C0236a(i iVar) {
            this();
        }

        public final String a(Context context, byte[] bArr) throws IOException {
            String str;
            p.j(context, LogCategory.CONTEXT);
            p.j(bArr, CardTypeAdapterFactory.DATA);
            if (a.f19784b == null) {
                b bVar = b.f19786a;
                InputStream open = context.getAssets().open("interceptheader.html");
                p.i(open, "context.assets.open(\"interceptheader.html\")");
                byte[] a11 = bVar.a(open);
                if (a11 == null) {
                    str = null;
                } else {
                    str = new String(a11, up0.a.f29102b);
                }
                a.f19784b = str;
            }
            Document a12 = ir0.a.a(new String(bArr, up0.a.f29102b));
            a12.J0().k(true);
            Elements j02 = a12.j0(HeaderTable.TAG);
            if (j02.size() > 0) {
                ((Element) j02.get(0)).x0(a.f19784b);
            }
            return a12.toString();
        }
    }

    public a(d dVar) {
        p.j(dVar, "webViewClient");
        this.f19785a = dVar;
    }

    @JavascriptInterface
    public final void customFetch(String str, String str2) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "body");
        this.f19785a.n(str, str2);
    }
}

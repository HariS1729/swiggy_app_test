package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.xiaomi.mipush.sdk.Constants;
import d4.i;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l4.g;
import l4.h;
import l4.k;
import l4.p;
import l4.q;
import l4.t;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;

public class DiagnosticsWorker extends Worker {

    /* renamed from: g  reason: collision with root package name */
    private static final String f12482g = i.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String x(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{pVar.f15493a, pVar.f15495c, num, pVar.f15494b.name(), str, str2});
    }

    private static String y(k kVar, t tVar, h hVar, List<p> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"}));
        for (p next : list) {
            Integer num = null;
            g b11 = hVar.b(next.f15493a);
            if (b11 != null) {
                num = Integer.valueOf(b11.f15472b);
            }
            sb2.append(x(next, TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, kVar.a(next.f15493a)), num, TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, tVar.b(next.f15493a))));
        }
        return sb2.toString();
    }

    public ListenableWorker.a w() {
        WorkDatabase w11 = e4.i.s(b()).w();
        q N = w11.N();
        k L = w11.L();
        t O = w11.O();
        h K = w11.K();
        List<p> k = N.k(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List<p> t = N.t();
        List<p> g11 = N.g(OS2WindowsMetricsTable.WEIGHT_CLASS_ULTRA_LIGHT);
        if (k != null && !k.isEmpty()) {
            i c11 = i.c();
            String str = f12482g;
            c11.d(str, "Recently completed work:\n\n", new Throwable[0]);
            i.c().d(str, y(L, O, K, k), new Throwable[0]);
        }
        if (t != null && !t.isEmpty()) {
            i c12 = i.c();
            String str2 = f12482g;
            c12.d(str2, "Running work:\n\n", new Throwable[0]);
            i.c().d(str2, y(L, O, K, t), new Throwable[0]);
        }
        if (g11 != null && !g11.isEmpty()) {
            i c13 = i.c();
            String str3 = f12482g;
            c13.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            i.c().d(str3, y(L, O, K, g11), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}

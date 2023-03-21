package amazonpay.silentpay;

import android.content.SharedPreferences;
import in.swiggy.android.tejas.network.HttpRequest;
import java.io.UnsupportedEncodingException;
import java.util.Map;

final class o {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f1280a;

    o(SharedPreferences sharedPreferences) {
        this.f1280a = sharedPreferences;
    }

    /* access modifiers changed from: package-private */
    public synchronized String a(String str) {
        return this.f1280a.getString(str, (String) null);
    }

    /* access modifiers changed from: package-private */
    public synchronized void b() {
        SharedPreferences.Editor edit = this.f1280a.edit();
        edit.clear();
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    public synchronized void c(String str, long j) {
        SharedPreferences.Editor edit = this.f1280a.edit();
        edit.putLong(str, j);
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    public synchronized void d(String str, String str2) {
        SharedPreferences.Editor edit = this.f1280a.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    public synchronized long e() throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        Map<String, ?> all = this.f1280a.getAll();
        if (all == null) {
            return 0;
        }
        for (Map.Entry<String, ?> value : all.entrySet()) {
            sb2.append(value.getValue().toString());
        }
        return (long) sb2.toString().getBytes(HttpRequest.CHARSET_UTF8).length;
    }

    /* access modifiers changed from: package-private */
    public synchronized long f(String str) {
        return this.f1280a.getLong(str, Long.MIN_VALUE);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean g(String str) {
        return this.f1280a.contains(str);
    }
}

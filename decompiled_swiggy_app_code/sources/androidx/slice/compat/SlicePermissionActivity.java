package androidx.slice.compat;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.core.text.a;
import androidx.slice.core.R;

public class SlicePermissionActivity extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private Uri f11741a;

    /* renamed from: b  reason: collision with root package name */
    private String f11742b;

    /* renamed from: c  reason: collision with root package name */
    private String f11743c;

    /* renamed from: d  reason: collision with root package name */
    private c f11744d;

    private CharSequence a(PackageManager packageManager, ApplicationInfo applicationInfo) {
        String obj = Html.fromHtml(applicationInfo.loadLabel(packageManager).toString()).toString();
        int length = obj.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            int codePointAt = obj.codePointAt(i11);
            int type = Character.getType(codePointAt);
            if (type == 13 || type == 15 || type == 14) {
                obj = obj.substring(0, i11);
            } else {
                if (type == 12) {
                    obj = obj.substring(0, i11) + " " + obj.substring(Character.charCount(codePointAt) + i11);
                }
                i11 += Character.charCount(codePointAt);
            }
        }
        String trim = obj.trim();
        if (trim.isEmpty()) {
            return applicationInfo.packageName;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(42.0f);
        return TextUtils.ellipsize(trim, textPaint, 500.0f, TextUtils.TruncateAt.END);
    }

    public void onClick(DialogInterface dialogInterface, int i11) {
        if (i11 == -1) {
            r3.c.i(this, getPackageName(), this.f11742b, this.f11741a.buildUpon().path("").build());
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11741a = (Uri) getIntent().getParcelableExtra("slice_uri");
        this.f11742b = getIntent().getStringExtra("pkg");
        this.f11743c = getIntent().getStringExtra("provider_pkg");
        try {
            PackageManager packageManager = getPackageManager();
            String j = a.c().j(a(packageManager, packageManager.getApplicationInfo(this.f11742b, 0)).toString());
            String j11 = a.c().j(a(packageManager, packageManager.getApplicationInfo(this.f11743c, 0)).toString());
            c l11 = new c.a(this).setTitle(getString(R.string.abc_slice_permission_title, new Object[]{j, j11})).k(R.layout.abc_slice_permission_request).setNegativeButton(R.string.abc_slice_permission_deny, this).setPositiveButton(R.string.abc_slice_permission_allow, this).g(this).l();
            this.f11744d = l11;
            ((TextView) l11.getWindow().getDecorView().findViewById(R.id.text1)).setText(getString(R.string.abc_slice_permission_text_1, new Object[]{j11}));
            ((TextView) this.f11744d.getWindow().getDecorView().findViewById(R.id.text2)).setText(getString(R.string.abc_slice_permission_text_2, new Object[]{j11}));
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("SlicePermissionActivity", "Couldn't find package", e11);
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        c cVar = this.f11744d;
        if (cVar != null && cVar.isShowing()) {
            this.f11744d.cancel();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        finish();
    }
}

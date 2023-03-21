package androidx.core.app;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import java.util.ArrayList;

/* compiled from: ShareCompat */
class q {
    static String a(CharSequence charSequence) {
        return Html.escapeHtml(charSequence);
    }

    static void b(Intent intent, ArrayList<Uri> arrayList) {
        CharSequence charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TEXT");
        String stringExtra = intent.getStringExtra("android.intent.extra.HTML_TEXT");
        ClipData clipData = new ClipData((CharSequence) null, new String[]{intent.getType()}, new ClipData.Item(charSequenceExtra, stringExtra, (Intent) null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i11 = 1; i11 < size; i11++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i11)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }

    static void c(Intent intent) {
        intent.setClipData((ClipData) null);
        intent.setFlags(intent.getFlags() & -2);
    }
}

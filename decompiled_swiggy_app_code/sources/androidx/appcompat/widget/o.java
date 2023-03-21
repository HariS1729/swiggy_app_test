package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import androidx.core.view.a0;
import androidx.core.view.c;
import s2.b;
import s2.c;

/* compiled from: AppCompatReceiveContentHelper */
final class o {

    /* compiled from: AppCompatReceiveContentHelper */
    class a implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f2219a;

        a(View view) {
            this.f2219a = view;
        }

        public boolean a(c cVar, int i11, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 25 && (i11 & 1) != 0) {
                try {
                    cVar.d();
                    InputContentInfo inputContentInfo = (InputContentInfo) cVar.e();
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                } catch (Exception e11) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e11);
                    return false;
                }
            }
            if (a0.m0(this.f2219a, new c.a(new ClipData(cVar.b(), new ClipData.Item(cVar.a())), 2).d(cVar.c()).b(bundle).a()) == null) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: AppCompatReceiveContentHelper */
    private static final class b {
        /* JADX INFO: finally extract failed */
        static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                a0.m0(textView, new c.a(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th2) {
                textView.endBatchEdit();
                throw th2;
            }
        }

        static boolean b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            a0.m0(view, new c.a(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    static b.c a(View view) {
        return new a(view);
    }

    static boolean b(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && a0.I(view) != null) {
            Activity d11 = d(view);
            if (d11 == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        return b.a(dragEvent, (TextView) view, d11);
                    }
                    return b.b(dragEvent, view, d11);
                }
            }
        }
        return false;
    }

    static boolean c(TextView textView, int i11) {
        ClipData clipData;
        int i12 = 0;
        if ((i11 != 16908322 && i11 != 16908337) || a0.I(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null && clipData.getItemCount() > 0) {
            c.a aVar = new c.a(clipData, 1);
            if (i11 != 16908322) {
                i12 = 1;
            }
            a0.m0(textView, aVar.c(i12).a());
        }
        return true;
    }

    static Activity d(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}

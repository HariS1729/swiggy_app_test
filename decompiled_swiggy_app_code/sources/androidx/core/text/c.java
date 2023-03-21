package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* compiled from: PrecomputedTextCompat */
public class c implements Spannable {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f9388d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Spannable f9389a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9390b;

    /* renamed from: c  reason: collision with root package name */
    private final PrecomputedText f9391c;

    public a a() {
        return this.f9390b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f9389a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i11) {
        return this.f9389a.charAt(i11);
    }

    public int getSpanEnd(Object obj) {
        return this.f9389a.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f9389a.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f9389a.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i11, int i12, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f9391c.getSpans(i11, i12, cls);
        }
        return this.f9389a.getSpans(i11, i12, cls);
    }

    public int length() {
        return this.f9389a.length();
    }

    public int nextSpanTransition(int i11, int i12, Class cls) {
        return this.f9389a.nextSpanTransition(i11, i12, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f9391c.removeSpan(obj);
        } else {
            this.f9389a.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i11, int i12, int i13) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f9391c.setSpan(obj, i11, i12, i13);
        } else {
            this.f9389a.setSpan(obj, i11, i12, i13);
        }
    }

    public CharSequence subSequence(int i11, int i12) {
        return this.f9389a.subSequence(i11, i12);
    }

    public String toString() {
        return this.f9389a.toString();
    }

    /* compiled from: PrecomputedTextCompat */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f9392a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f9393b;

        /* renamed from: c  reason: collision with root package name */
        private final int f9394c;

        /* renamed from: d  reason: collision with root package name */
        private final int f9395d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f9396e;

        /* renamed from: androidx.core.text.c$a$a  reason: collision with other inner class name */
        /* compiled from: PrecomputedTextCompat */
        public static class C0044a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f9397a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f9398b;

            /* renamed from: c  reason: collision with root package name */
            private int f9399c;

            /* renamed from: d  reason: collision with root package name */
            private int f9400d;

            public C0044a(TextPaint textPaint) {
                this.f9397a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f9399c = 1;
                    this.f9400d = 1;
                } else {
                    this.f9400d = 0;
                    this.f9399c = 0;
                }
                this.f9398b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public a a() {
                return new a(this.f9397a, this.f9398b, this.f9399c, this.f9400d);
            }

            public C0044a b(int i11) {
                this.f9399c = i11;
                return this;
            }

            public C0044a c(int i11) {
                this.f9400d = i11;
                return this;
            }

            public C0044a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f9398b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i11, int i12) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f9396e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i11).setHyphenationFrequency(i12).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f9396e = null;
            }
            this.f9392a = textPaint;
            this.f9393b = textDirectionHeuristic;
            this.f9394c = i11;
            this.f9395d = i12;
        }

        public boolean a(a aVar) {
            int i11 = Build.VERSION.SDK_INT;
            if ((i11 >= 23 && (this.f9394c != aVar.b() || this.f9395d != aVar.c())) || this.f9392a.getTextSize() != aVar.e().getTextSize() || this.f9392a.getTextScaleX() != aVar.e().getTextScaleX() || this.f9392a.getTextSkewX() != aVar.e().getTextSkewX() || this.f9392a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f9392a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f9392a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i11 >= 24) {
                if (!this.f9392a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f9392a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            if (this.f9392a.getTypeface() == null) {
                if (aVar.e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f9392a.getTypeface().equals(aVar.e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public int b() {
            return this.f9394c;
        }

        public int c() {
            return this.f9395d;
        }

        public TextDirectionHeuristic d() {
            return this.f9393b;
        }

        public TextPaint e() {
            return this.f9392a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f9393b == aVar.d();
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return androidx.core.util.c.b(Float.valueOf(this.f9392a.getTextSize()), Float.valueOf(this.f9392a.getTextScaleX()), Float.valueOf(this.f9392a.getTextSkewX()), Float.valueOf(this.f9392a.getLetterSpacing()), Integer.valueOf(this.f9392a.getFlags()), this.f9392a.getTextLocales(), this.f9392a.getTypeface(), Boolean.valueOf(this.f9392a.isElegantTextHeight()), this.f9393b, Integer.valueOf(this.f9394c), Integer.valueOf(this.f9395d));
            }
            return androidx.core.util.c.b(Float.valueOf(this.f9392a.getTextSize()), Float.valueOf(this.f9392a.getTextScaleX()), Float.valueOf(this.f9392a.getTextSkewX()), Float.valueOf(this.f9392a.getLetterSpacing()), Integer.valueOf(this.f9392a.getFlags()), this.f9392a.getTextLocale(), this.f9392a.getTypeface(), Boolean.valueOf(this.f9392a.isElegantTextHeight()), this.f9393b, Integer.valueOf(this.f9394c), Integer.valueOf(this.f9395d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f9392a.getTextSize());
            sb2.append(", textScaleX=" + this.f9392a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f9392a.getTextSkewX());
            int i11 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f9392a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f9392a.isElegantTextHeight());
            if (i11 >= 24) {
                sb2.append(", textLocale=" + this.f9392a.getTextLocales());
            } else {
                sb2.append(", textLocale=" + this.f9392a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f9392a.getTypeface());
            if (i11 >= 26) {
                sb2.append(", variationSettings=" + this.f9392a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f9393b);
            sb2.append(", breakStrategy=" + this.f9394c);
            sb2.append(", hyphenationFrequency=" + this.f9395d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f9392a = params.getTextPaint();
            this.f9393b = params.getTextDirection();
            this.f9394c = params.getBreakStrategy();
            this.f9395d = params.getHyphenationFrequency();
            this.f9396e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}

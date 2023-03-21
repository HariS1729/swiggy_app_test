package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.o0;
import androidx.core.view.a0;

public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    private g f1670a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f1671b;

    /* renamed from: c  reason: collision with root package name */
    private RadioButton f1672c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f1673d;

    /* renamed from: e  reason: collision with root package name */
    private CheckBox f1674e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f1675f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f1676g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f1677h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f1678i;
    private Drawable j;
    private int k;

    /* renamed from: l  reason: collision with root package name */
    private Context f1679l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1680m;
    private Drawable n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1681o;

    /* renamed from: p  reason: collision with root package name */
    private LayoutInflater f1682p;
    private boolean q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i11) {
        LinearLayout linearLayout = this.f1678i;
        if (linearLayout != null) {
            linearLayout.addView(view, i11);
        } else {
            addView(view, i11);
        }
    }

    private void d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
        this.f1674e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
        this.f1671b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
        this.f1672c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f1682p == null) {
            this.f1682p = LayoutInflater.from(getContext());
        }
        return this.f1682p;
    }

    private void setSubMenuArrowVisible(boolean z11) {
        ImageView imageView = this.f1676g;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1677h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1677h.getLayoutParams();
            rect.top += this.f1677h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public boolean c() {
        return false;
    }

    public void e(g gVar, int i11) {
        this.f1670a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    public g getItemData() {
        return this.f1670a;
    }

    public void h(boolean z11, char c11) {
        int i11 = (!z11 || !this.f1670a.A()) ? 8 : 0;
        if (i11 == 0) {
            this.f1675f.setText(this.f1670a.h());
        }
        if (this.f1675f.getVisibility() != i11) {
            this.f1675f.setVisibility(i11);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        a0.A0(this, this.j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1673d = textView;
        int i11 = this.k;
        if (i11 != -1) {
            textView.setTextAppearance(this.f1679l, i11);
        }
        this.f1675f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1676g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.n);
        }
        this.f1677h = (ImageView) findViewById(R.id.group_divider);
        this.f1678i = (LinearLayout) findViewById(R.id.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        if (this.f1671b != null && this.f1680m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1671b.getLayoutParams();
            int i13 = layoutParams.height;
            if (i13 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i13;
            }
        }
        super.onMeasure(i11, i12);
    }

    public void setCheckable(boolean z11) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z11 || this.f1672c != null || this.f1674e != null) {
            if (this.f1670a.m()) {
                if (this.f1672c == null) {
                    g();
                }
                compoundButton2 = this.f1672c;
                compoundButton = this.f1674e;
            } else {
                if (this.f1674e == null) {
                    d();
                }
                compoundButton2 = this.f1674e;
                compoundButton = this.f1672c;
            }
            if (z11) {
                compoundButton2.setChecked(this.f1670a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f1674e;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f1672c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z11) {
        CompoundButton compoundButton;
        if (this.f1670a.m()) {
            if (this.f1672c == null) {
                g();
            }
            compoundButton = this.f1672c;
        } else {
            if (this.f1674e == null) {
                d();
            }
            compoundButton = this.f1674e;
        }
        compoundButton.setChecked(z11);
    }

    public void setForceShowIcon(boolean z11) {
        this.q = z11;
        this.f1680m = z11;
    }

    public void setGroupDividerEnabled(boolean z11) {
        ImageView imageView = this.f1677h;
        if (imageView != null) {
            imageView.setVisibility((this.f1681o || !z11) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z11 = this.f1670a.z() || this.q;
        if (z11 || this.f1680m) {
            ImageView imageView = this.f1671b;
            if (imageView != null || drawable != null || this.f1680m) {
                if (imageView == null) {
                    f();
                }
                if (drawable != null || this.f1680m) {
                    ImageView imageView2 = this.f1671b;
                    if (!z11) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f1671b.getVisibility() != 0) {
                        this.f1671b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f1671b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1673d.setText(charSequence);
            if (this.f1673d.getVisibility() != 0) {
                this.f1673d.setVisibility(0);
            }
        } else if (this.f1673d.getVisibility() != 8) {
            this.f1673d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet);
        o0 v = o0.v(getContext(), attributeSet, R.styleable.MenuView, i11, 0);
        this.j = v.g(R.styleable.MenuView_android_itemBackground);
        this.k = v.n(R.styleable.MenuView_android_itemTextAppearance, -1);
        this.f1680m = v.a(R.styleable.MenuView_preserveIconSpacing, false);
        this.f1679l = context;
        this.n = v.g(R.styleable.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f1681o = obtainStyledAttributes.hasValue(0);
        v.w();
        obtainStyledAttributes.recycle();
    }
}

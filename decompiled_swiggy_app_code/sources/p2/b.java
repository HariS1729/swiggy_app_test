package p2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

/* compiled from: SupportMenuItem */
public interface b extends MenuItem {
    androidx.core.view.b a();

    b b(androidx.core.view.b bVar);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i11);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c11, int i11);

    b setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c11, int i11);

    MenuItem setShortcut(char c11, char c12, int i11, int i12);

    void setShowAsAction(int i11);

    MenuItem setShowAsActionFlags(int i11);

    b setTooltipText(CharSequence charSequence);
}

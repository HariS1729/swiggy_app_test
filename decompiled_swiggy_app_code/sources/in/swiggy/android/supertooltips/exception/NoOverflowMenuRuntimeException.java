package in.swiggy.android.supertooltips.exception;

public class NoOverflowMenuRuntimeException extends RuntimeException {
    public NoOverflowMenuRuntimeException() {
        super("No overflow menu found. Are you sure the overflow menu button is visible? Check the docs for showToolTipForActionBarOverflowMenu(Activity, ToolTip) again!");
    }
}

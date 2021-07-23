
import android.text.InputFilter
import android.widget.EditText


/**
 * 过滤掉空格和回车
 */
fun EditText.filterBlankAndCarriageReturn() {
    this.filters =
        arrayOf(InputFilter { source, _, _, _, _, _ -> if (source == " " || source == "\n") "" else null })
}
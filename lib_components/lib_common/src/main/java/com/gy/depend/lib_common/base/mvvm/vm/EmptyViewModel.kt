
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * 空的ViewModel 主要给现阶段不需要ViewModel的界面使用
 *
 */
@HiltViewModel
class EmptyViewModel @Inject constructor() : BaseViewModel()
package guoyuan.szkingdom.android.phone

import androidx.multidex.MultiDex
import com.gy.depend.lib_common.base.BaseApplication
import org.greenrobot.eventbus.EventBus


/**
 * @author: liujie
 * @date: 2021/7/19
 * @description: App壳
 */
class AppApplication : BaseApplication() {

    override fun onCreate() {
        // 开启EventBusAPT,优化反射效率 当组件作为App运行时需要将添加的Index注释掉 因为找不到对应的类了
        EventBus
            .builder()
//            .addIndex(MainEventIndex())
            .installDefaultEventBus()
        super.onCreate()
    }
}
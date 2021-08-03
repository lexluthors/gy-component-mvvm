package com.gyzq.depend.plugin

/**
 * @author: liujie
 * @date: 2021/7/21
 * @description: 第三方依赖库的版本控制
 */
object Versions {
    val retrofit = "2.9.0"
    val appcompat = "1.2.0"
    val coreKtx = "1.3.0"
    val constraintlayout = "2.0.1"
    val paging = "3.0.0-alpha01"
    val timber = "4.5.1"
    val kotlin = "1.5.21"
    val kotlinStdlib = "1.5.21"
    val koin = "2.1.5"
    val work = "2.2.0"
    val room = "2.3.0-alpha01"
    val cardview = "1.0.0"
    val recyclerview = "1.0.0"
    val fragment = "1.2.1"
    val anko = "0.10.8"

    val junit = "4.12"
    val junitExt = "1.1.1"
    val espressoCore = "3.2.0"
    val jDatabinding = "1.0.1"
    val material = "1.2.1"
    val lifecycleRuntime = "2.3.1"
    val lifecycleExtensions  = "2.2.0"
    val vectordrawable  = "1.1.0"
    val lifecycleLiveDataKtx  = "2.2.0"
    val lifecycleViewModelKtx  = "2.2.0"
    val navigationFragmentKtx  = "2.3.0"
    val navigationUiKtx  = "2.3.0"



    // AndroidX--------------------------------------------------------------
    const val AppCompat = "1.2.0"
    const val CoreKtx = "1.3.1"
    const val ConstraintLayout = "2.0.1"                // 约束布局
    const val TestExtJunit = "1.1.2"
    const val TestEspresso = "3.3.0"
    const val ActivityKtx = "1.1.0"
    const val FragmentKtx = "1.2.5"
    const val MultiDex = "2.0.1"

    // Android---------------------------------------------------------------
    const val Junit = "4.13"
    const val Material = "1.2.0"                        // 材料设计UI套件

    // Kotlin----------------------------------------------------------------
    const val Kotlin = "1.5.10"
    const val Coroutines = "1.5.0"                      // 协程

    // JetPack---------------------------------------------------------------
    const val Lifecycle = "2.3.1"                       // Lifecycle相关（ViewModel & LiveData & Lifecycle）
    const val Hilt = "2.35.1"                           // DI框架-Hilt
    const val HiltAndroidx = "1.0.0"

    // GitHub----------------------------------------------------------------
    const val OkHttp = "4.9.0"                          // OkHttp
    const val OkHttpInterceptorLogging = "4.9.1"        // OkHttp 请求Log拦截器
    const val Retrofit = "2.9.0"                        // Retrofit
    const val RetrofitConverterGson = "2.9.0"           // Retrofit Gson 转换器
    const val Gson = "2.8.7"                            // Gson
    const val MMKV = "1.2.9"                            // 腾讯 MMKV 替代SP
    const val AutoSize = "1.2.1"                        // 屏幕适配
    const val ARoute = "1.5.2"                          // 阿里路由
    const val ARouteCompiler = "1.5.2"                  // 阿里路由 APT
    const val RecyclerViewAdapter = "3.0.4"             // RecyclerViewAdapter
    const val StatusBar = "1.5.1"                       // 状态栏
    const val EventBus = "3.2.0"                        // 事件总线
    const val PermissionX = "1.4.0"                     // 权限申请
    const val LeakCanary = "2.7"                        // 检测内存泄漏
    const val AutoService = "1.0"                       // 自动生成SPI暴露服务文件
    const val Coil = "1.3.0"                            // Kotlin图片加载框架

    // 第三方SDK--------------------------------------------------------------
    const val TencentBugly = "3.3.9"                    // 腾讯Bugly 异常上报
    const val TencentBuglyNative = "3.8.0"              // Bugly native异常上报
    const val TencentTBSX5 = "43939"                    // 腾讯X5WebView
}

object AndroidX {
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    val pagingRuntime = "androidx.paging:paging-runtime:${Versions.paging}"

    val workRuntime = "androidx.work:work-runtime:${Versions.work}"
    val workTesting = "androidx.work:work-testing:${Versions.work}"
    val cardView = "androidx.cardview:cardview:${Versions.cardview}"
    val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycleRuntime}"
    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleExtensions}"
    val vectorDrawable = "androidx.vectordrawable:vectordrawable:${Versions.vectordrawable}"
    val lifecycleLivedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleLiveDataKtx}"
    val lifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModelKtx}"
    val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationFragmentKtx}"
    val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigationUiKtx}"

    val ActivityKtx = "androidx.activity:activity-ktx:${Versions.ActivityKtx}"
    val FragmentKtx = "androidx.fragment:fragment-ktx:${Versions.FragmentKtx}"
    val MultiDex = "androidx.multidex:multidex:${Versions.MultiDex}"
}

object Room {
    val runtime = "androidx.room:room-runtime:${Versions.room}"
    val compiler = "androidx.room:room-compiler:${Versions.room}"
    val ktx = "androidx.room:room-ktx:${Versions.room}"
    val rxjava2 = "androidx.room:room-rxjava2:${Versions.room}"
    val testing = "androidx.room:room-testing:${Versions.room}"
}

object Fragment {
    val runtime = "androidx.fragment:fragment:${Versions.fragment}"
    val runtimeKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    val testing = "androidx.fragment:fragment-testing:${Versions.fragment}"
}

object Kt {
    val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinStdlib}"
    val test = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val CoroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Coroutines}"
    const val CoroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Coroutines}"
}

object Koin {
    val core = "org.koin:koin-core:${Versions.koin}"
    val androidCore = "org.koin:koin-android:${Versions.koin}"
    val viewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    val androidScope = "org.koin:koin-android-scope:$${Versions.koin}"
}

object Anko {
    val common = "org.jetbrains.anko:anko-common:${Versions.anko}"
    val sqlite = "org.jetbrains.anko:anko-sqlite:${Versions.anko}"
    val coroutines = "org.jetbrains.anko:anko-coroutines:${Versions.anko}"
    val design = "org.jetbrains.anko:anko-design:${Versions.anko}" // For SnackBars
}

object Retrofit {
    val runtime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val mock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"
}

object Depend {

    val junit = "junit:junit:${Versions.junit}"
    val androidTestJunit = "androidx.test.ext:junit:${Versions.junitExt}"
    val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    val jDataBinding = "com.hi-dhl:jdatabinding:${Versions.jDatabinding}"
    val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    val material = "com.google.android.material:material:${Versions.material}"
}

/**
 * @author: liujie
 * @date: 2021/7/15
 * @description: GitHub及其他相关依赖
 */
object GitHub {
    const val OkHttp = "com.squareup.okhttp3:okhttp:${Versions.OkHttp}"
    const val OkHttpInterceptorLogging =
        "com.squareup.okhttp3:logging-interceptor:${Versions.OkHttpInterceptorLogging}"
    const val Retrofit = "com.squareup.retrofit2:retrofit:${Versions.Retrofit}"
    const val RetrofitConverterGson =
        "com.squareup.retrofit2:converter-gson:${Versions.RetrofitConverterGson}"
    const val Gson = "com.google.code.gson:gson:${Versions.Gson}"
    const val MMKV = "com.tencent:mmkv-static:${Versions.MMKV}"
    const val AutoSize = "me.jessyan:autosize:${Versions.AutoSize}"
    const val ARoute = "com.alibaba:arouter-api:${Versions.ARoute}"
    const val ARouteCompiler = "com.alibaba:arouter-compiler:${Versions.ARouteCompiler}"
    const val RecyclerViewAdapter =
        "com.github.CymChad:BaseRecyclerViewAdapterHelper:${Versions.RecyclerViewAdapter}"
    const val StatusBar = "com.jaeger.statusbarutil:library:${Versions.StatusBar}"
    const val EventBus = "org.greenrobot:eventbus:${Versions.EventBus}"
    const val EventBusAPT = "org.greenrobot:eventbus-annotation-processor:${Versions.EventBus}"
    const val PermissionX = "com.permissionx.guolindev:permissionx:${Versions.PermissionX}"
    const val LeakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.LeakCanary}"
    const val AutoService = "com.google.auto.service:auto-service:${Versions.AutoService}"
    const val AutoServiceAnnotations =
        "com.google.auto.service:auto-service-annotations:${Versions.AutoService}"
    const val Coil = "io.coil-kt:coil:${Versions.Coil}"
    const val CoilGIF = "io.coil-kt:coil-gif:${Versions.Coil}"
    const val CoilSVG = "io.coil-kt:coil-svg:${Versions.Coil}"
    const val CoilVideo = "io.coil-kt:coil-video:${Versions.Coil}"
}

object JetPack {
    const val ViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.Lifecycle}"
    const val ViewModelSavedState =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.Lifecycle}"
    const val LiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.Lifecycle}"
    const val Lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Lifecycle}"
    const val LifecycleCompilerAPT =
        "androidx.lifecycle:lifecycle-compiler:${Versions.Lifecycle}"
    const val HiltCore = "com.google.dagger:hilt-android:${Versions.Hilt}"
    const val HiltApt = "com.google.dagger:hilt-compiler:${Versions.Hilt}"
    const val HiltAndroidx = "androidx.hilt:hilt-compiler:${Versions.HiltAndroidx}"
}




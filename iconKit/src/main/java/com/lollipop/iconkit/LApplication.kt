package com.lollipop.iconkit

import com.lollipop.iconcore.IconPackCore
import com.lollipop.iconcore.provider.MainPageProvider
import com.lollipop.iconcore.provider.MainPageRenderer
import com.lollipop.iconcore.ui.IconApplication

/**
 * @author lollipop
 * @date 10/22/20 16:29
 */
open class LApplication: IconApplication() {

    override fun onCreate() {
        super.onCreate()
        initMainPage()
    }

    open protected fun initMainPage() {
        IconPackCore.init(this, object: MainPageProvider {
            override fun createRenderer(): MainPageRenderer {
                return MainActivity()
            }
        })
    }

}
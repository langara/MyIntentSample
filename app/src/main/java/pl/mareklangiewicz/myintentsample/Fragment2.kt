package pl.mareklangiewicz.myintentsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pl.mareklangiewicz.mycorelib.MyClass
import pl.mareklangiewicz.myfragments.MyFragment

class Fragment2 : MyFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        MyClass.bla()

        manager?.lnav?.menuId = R.menu.local_menu2
        return inflater.inflate(R.layout.fragment2, container, false)
    }
}


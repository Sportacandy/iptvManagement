package com.anp.iptvmanagement

import android.support.multidex.MultiDexApplication
import com.anp.iptvmanagement.data.database.DataBaseManager

class IptvManagementApplication : MultiDexApplication() {


  override fun onCreate() {
    super.onCreate()

    DataBaseManager.initialize(this)
  }

}

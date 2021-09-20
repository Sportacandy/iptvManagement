package com.anp.iptvmanagement.presentations.base

import android.support.v17.leanback.app.BrowseFragment
import com.anp.iptvmanagement.presentations.base.BaseView


open class BaseBrowseFragment : BrowseFragment(), BaseView {

  /**
   * Callback @{@link BaseView}
   */
  override fun showLoading() {

  }

  override fun hideLoading() {

  }
}
package org.ast.example

import android.view.Menu
import android.app.Activity

/**
 * @author me@andresteingress.com
 */

trait OptionsMenu extends Activity {

  override def onCreateOptionsMenu(menu: Menu) : Boolean = {
    menu.addSubMenu("Test")

    true
  }
}
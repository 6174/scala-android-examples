package org.ast.example

import android.view.View
import util.Activity
import android.content.Intent

class HomeActivity extends Activity {

  val contentView: Int = R.layout.activity_home

  val init = {
    loginButton.setOnClickListener( (v: View) => startActivity(new Intent(HomeActivity.this, classOf[NextActivity] )))
  }
}

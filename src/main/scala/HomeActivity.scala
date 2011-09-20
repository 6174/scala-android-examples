package org.ast.example

import _root_.android.os.Bundle
import _root_.android.widget.TextView

class HomeActivity extends TypedActivity {

  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)

    setContentView(new TextView(this) {
      setText("hello, world")
    })
  }

}

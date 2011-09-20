package org.ast.example.util

import org.ast.example.{TR, TypedActivity}
import android.os.Bundle
import android.view.View

/**
 * @author me@andresteingress.com
 */

abstract class Activity extends TypedActivity {

  lazy val usernameEditText = findView(TR.usernameEditText)
  lazy val passwordEditText = findView(TR.passwordEditText)
  lazy val loginButton = findView(TR.loginButton)

  val contentView: Int

  val init: Unit

  override def onCreate(savedInstanceState: Bundle) {
    setContentView(contentView)

    init
  }

  // implicit conversions
  implicit def function2ViewOnClickListener(f: View => Unit) : View.OnClickListener = {

    new View.OnClickListener() {
      def onClick(view: View) {
        f(view)
      }
    }

  }
}
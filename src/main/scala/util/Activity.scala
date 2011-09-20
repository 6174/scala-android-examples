package org.ast.example.util

import android.os.Bundle
import android.view.View
import org.ast.example.{OptionsMenu, TR, TypedActivity}

/**
 * @author me@andresteingress.com
 **/
trait Activity extends android.app.Activity with TypedActivity with OptionsMenu {

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
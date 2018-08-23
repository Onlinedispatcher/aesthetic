/*
 * Licensed under Apache-2.0
 *
 * Designed and developed by Aidan Follestad (@afollestad)
 */
package com.afollestad.aesthetic

/** @author Aidan Follestad (afollestad) */
enum class TabLayoutIndicatorMode(val value: Int) {
  PRIMARY(0),
  ACCENT(1);

  companion object {
    fun fromInt(value: Int): TabLayoutIndicatorMode {
      return when (value) {
        0 -> PRIMARY
        else -> ACCENT
      }
    }
  }
}

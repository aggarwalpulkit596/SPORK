package tech.arnav.spork.annotations

import android.content.Context
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.CLASS

@Target(CLASS)
@Retention(RUNTIME)
annotation class PreferenceFile(
    val fileName: String,
    val mode: Int = Context.MODE_PRIVATE
)
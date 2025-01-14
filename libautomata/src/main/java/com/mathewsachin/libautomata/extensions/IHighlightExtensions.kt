package com.mathewsachin.libautomata.extensions

import com.mathewsachin.libautomata.HighlightColor
import com.mathewsachin.libautomata.Region
import kotlin.time.Duration

interface IHighlightExtensions {
    /**
     * Adds borders around the [Region].
     *
     * @param duration how long the borders should be displayed
     */
    fun Region.highlight(color: HighlightColor, duration: Duration = Duration.seconds(0.3))
}
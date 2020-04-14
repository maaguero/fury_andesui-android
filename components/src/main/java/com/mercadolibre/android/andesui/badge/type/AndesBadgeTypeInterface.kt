package com.mercadolibre.android.andesui.badge.type

import android.graphics.drawable.Drawable
import com.mercadolibre.android.andesui.R
import com.mercadolibre.android.andesui.color.AndesColor
import com.mercadolibre.android.andesui.color.toAndesColor

/**
 * Defines all types related properties that an [AndesBadge] needs to be drawn properly.
 * Those properties change depending on the style of the badge.
 *
 */
internal sealed class AndesBadgeTypeInterface {

    /**
     * Returns a [AndesColor] that contains the primary color data for the badge.
     *
     * @return a [AndesColor] that contains the primary color data for the badge.
     */
    abstract fun primaryColor(): AndesColor

    /**
     * Returns a [AndesColor] that contains the secondary color data for the badge.
     *
     * @return a [AndesColor] that contains the secondary color data for the badge.
     */
    abstract fun secondaryColor(): AndesColor
}

internal object AndesNeutralBadgeType : AndesBadgeTypeInterface() {
    override fun primaryColor() = R.color.andes_gray_450_solid.toAndesColor()
    override fun secondaryColor() = R.color.andes_gray_070_solid.toAndesColor()
}

internal object AndesHighlightBadgeType : AndesBadgeTypeInterface() {
    override fun primaryColor() = R.color.andes_accent_color_500.toAndesColor()
    override fun secondaryColor() = R.color.andes_accent_color_100.toAndesColor()
}

internal object AndesSuccessBadgeType : AndesBadgeTypeInterface() {
    override fun primaryColor() = R.color.andes_green_500.toAndesColor()
    override fun secondaryColor() = R.color.andes_green_100.toAndesColor()
}

internal object AndesWarningBadgeType : AndesBadgeTypeInterface() {
    override fun primaryColor() = R.color.andes_orange_500.toAndesColor()
    override fun secondaryColor() = R.color.andes_orange_100.toAndesColor()
}

internal object AndesErrorBadgeType : AndesBadgeTypeInterface() {
    override fun primaryColor() = R.color.andes_red_500.toAndesColor()
    override fun secondaryColor() = R.color.andes_red_100.toAndesColor()
}
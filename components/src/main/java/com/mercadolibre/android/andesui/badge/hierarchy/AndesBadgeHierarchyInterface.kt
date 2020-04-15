package com.mercadolibre.android.andesui.badge.hierarchy

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import com.mercadolibre.android.andesui.R
import com.mercadolibre.android.andesui.badge.type.AndesBadgeTypeInterface
import com.mercadolibre.android.andesui.color.AndesColor
import com.mercadolibre.android.andesui.color.toAndesColor
import com.mercadolibre.android.andesui.message.AndesMessage
import com.mercadolibre.android.andesui.typeface.getFontOrDefault

/**
 * Defines all style related properties that an [AndesBadge] needs to be drawn properly.
 * Those properties change depending on the style of the badge.
 *
 */
internal interface AndesBadgeHierarchyInterface {
    /**
     * Returns a [AndesColor] that contains the color data for the message background.
     *
     * @param type is the selected type of badge.
     * @return a [AndesColor] that contains the color data for the badge background.
     */
    fun backgroundColor(type: AndesBadgeTypeInterface): AndesColor

    /**
     * Returns a [AndesColor] that contains the data for the text color.
     * We are using [AndesColor] because text color depends on the badge type.
     *
     * @param type is the selected type of badge.
     * @return a [AndesColor] that contains the data for the text color.
     */
    fun textColor(type: AndesBadgeTypeInterface): AndesColor
}

internal class AndesLoudBadgeHierarchy : AndesBadgeHierarchyInterface {
    override fun backgroundColor(type: AndesBadgeTypeInterface) = type.primaryColor()
    override fun textColor(type: AndesBadgeTypeInterface) = R.color.andes_white.toAndesColor()
}

internal class AndesQuietBadgeHierarchy : AndesBadgeHierarchyInterface {
    override fun backgroundColor(type: AndesBadgeTypeInterface) = type.secondaryColor()
    override fun textColor(type: AndesBadgeTypeInterface) = type.primaryColor()
}

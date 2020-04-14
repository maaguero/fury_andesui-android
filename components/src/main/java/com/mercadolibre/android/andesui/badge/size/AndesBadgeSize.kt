package com.mercadolibre.android.andesui.badge.size

import com.mercadolibre.android.andesui.badge.AndesBadge

/**
 * Utility class that does two things: Defines the possible sizes an [AndesBadge] can take because it's an enum, as you can see.
 * But as a bonus it gives you the proper implementation so you don't have to make any mapping.
 *
 * You ask me with, let's say 'SMALL', and then I'll give you a proper implementation of that size.
 *
 * @property size Possible sizes that an [AndesBadge] may take.
 */
enum class AndesBadgeSize {
    SMALL,
    LARGE;

    internal val size get() = getAndesBadgeSize()

    private fun getAndesBadgeSize(): AndesBadgeSizeInterface {
        return when (this) {
            SMALL -> AndesSmallBadgeSize()
            LARGE -> AndesLargeBadgeSize()
        }
    }
}
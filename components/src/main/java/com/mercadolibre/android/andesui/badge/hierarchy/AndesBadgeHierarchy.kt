package com.mercadolibre.android.andesui.badge.hierarchy

import com.mercadolibre.android.andesui.button.AndesButton

/**
 * Utility class that does two things: Defines the possible hierarchies an [AndesBadge] can take because it's an enum, as you can see.
 * But as a bonus it gives you the proper implementation so you don't have to make any mapping.
 *
 * You ask me with, let's say 'QUIET', and then I'll give you a proper implementation of that hierarchy.
 *
 * @property hierarchy Possible hierarchies that an [AndesBadge] may take.
 */
enum class AndesBadgeHierarchy {
    QUIET,
    LOUD;

    internal val hierarchy get() = getAndesButtonHierarchy()

    private fun getAndesButtonHierarchy(): AndesBadgeHierarchyInterface {
        return when (this) {
            QUIET -> AndesQuietBadgeHierarchy()
            LOUD -> AndesLoudBadgeHierarchy()
        }
    }
}
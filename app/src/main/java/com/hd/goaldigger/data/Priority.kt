package com.hd.goaldigger.data

import androidx.compose.ui.graphics.Color
import com.hd.goaldigger.ui.theme.HighPriorityColor
import com.hd.goaldigger.ui.theme.LowPriorityColor
import com.hd.goaldigger.ui.theme.MediumPriorityColor
import com.hd.goaldigger.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}
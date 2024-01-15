package com.app.touch_of_jasmine.helper.calendar_decorators

import android.content.Context
import android.text.style.ForegroundColorSpan
import androidx.core.content.ContextCompat
import com.app.touch_of_jasmine.R
import com.app.touch_of_jasmine.helper.Constants
import com.app.touch_of_jasmine.helper.CustomTypefaceSpan
import com.app.touch_of_jasmine.helper.Global
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.DayViewDecorator
import com.prolificinteractive.materialcalendarview.DayViewFacade

class RangeSelectionDecorator(private var startDate: CalendarDay?,private var endDate: CalendarDay?, private val context: Context) : DayViewDecorator {

    override fun shouldDecorate(day: CalendarDay): Boolean {
        return (startDate?.let { day.isAfter(it) } == true || day == startDate) && (endDate?.let { day.isBefore(it) } == true || day == endDate)
    }

    override fun decorate(view: DayViewFacade) {
        view.addSpan(CustomTypefaceSpan("", Global.getTypeFace(context , Constants.fontMedium)))
        view.addSpan(ForegroundColorSpan(ContextCompat.getColor(context, R.color.color_white)))
        ContextCompat.getDrawable(context, R.drawable.bg_circle_calendar)?.let { view.setBackgroundDrawable(it) }
    }
}

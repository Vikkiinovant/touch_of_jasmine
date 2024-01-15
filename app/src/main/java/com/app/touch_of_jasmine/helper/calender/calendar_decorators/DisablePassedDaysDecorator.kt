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

class DisablePassedDaysDecorator(private val context: Context, private var date: CalendarDay?) : DayViewDecorator {
    init {
        date = CalendarDay.today()
    }

    override fun shouldDecorate(day: CalendarDay): Boolean {
        return date != null && day.isBefore(date!!)
    }

    override fun decorate(view: DayViewFacade) {
        view.setDaysDisabled(true) //disable all days
        view.addSpan(ForegroundColorSpan(ContextCompat.getColor(context, R.color.divider_line_color_grey)))
        view.addSpan(CustomTypefaceSpan("", Global.getTypeFace(context, Constants.fontRegular)))
        ContextCompat.getDrawable(context, R.drawable.bg_circle_calendar_disabled)?.let { view.setBackgroundDrawable(it) }
    }
}

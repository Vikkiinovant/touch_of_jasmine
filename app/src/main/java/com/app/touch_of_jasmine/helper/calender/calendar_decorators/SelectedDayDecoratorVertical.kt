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

class SelectedDayDecoratorVertical(private var date: CalendarDay?, private val context: Context) : DayViewDecorator {

    override fun shouldDecorate(day: CalendarDay): Boolean {
        return date != null && day == date
    }

    override fun decorate(view: DayViewFacade) {
        view.addSpan(CustomTypefaceSpan("", Global.getTypeFace(context , Constants.fontMedium)))
        view.addSpan(ForegroundColorSpan(ContextCompat.getColor(context, R.color.color_white)))
        ContextCompat.getDrawable(context, R.drawable.bg_circle_calendar)?.let { view.setBackgroundDrawable(it) }
    }
}

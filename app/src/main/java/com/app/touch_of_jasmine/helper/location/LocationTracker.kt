package com.app.touch_of_jasmine.helper.location

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}
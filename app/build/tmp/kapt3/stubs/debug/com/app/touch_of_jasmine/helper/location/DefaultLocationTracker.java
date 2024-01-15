package com.app.touch_of_jasmine.helper.location;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/app/touch_of_jasmine/helper/location/DefaultLocationTracker;", "Lcom/app/touch_of_jasmine/helper/location/LocationTracker;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "application", "Lcom/app/touch_of_jasmine/helper/AppController;", "(Lcom/google/android/gms/location/FusedLocationProviderClient;Lcom/app/touch_of_jasmine/helper/AppController;)V", "getCurrentLocation", "Landroid/location/Location;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DefaultLocationTracker implements com.app.touch_of_jasmine.helper.location.LocationTracker {
    @org.jetbrains.annotations.NotNull
    private final com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = null;
    @org.jetbrains.annotations.NotNull
    private final com.app.touch_of_jasmine.helper.AppController application = null;
    
    public DefaultLocationTracker(@org.jetbrains.annotations.NotNull
    com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, @org.jetbrains.annotations.NotNull
    com.app.touch_of_jasmine.helper.AppController application) {
        super();
    }
    
    @java.lang.Override
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getCurrentLocation(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super android.location.Location> $completion) {
        return null;
    }
}
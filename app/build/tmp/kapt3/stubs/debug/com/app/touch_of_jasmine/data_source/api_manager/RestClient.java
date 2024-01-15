package com.app.touch_of_jasmine.data_source.api_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/app/touch_of_jasmine/data_source/api_manager/RestClient;", "", "Companion", "app_debug"})
public abstract interface RestClient {
    @org.jetbrains.annotations.NotNull
    public static final com.app.touch_of_jasmine.data_source.api_manager.RestClient.Companion Companion = null;
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/app/touch_of_jasmine/data_source/api_manager/RestClient$Companion;", "", "()V", "apiService", "Lio/ktor/client/HttpClient;", "getApiService", "()Lio/ktor/client/HttpClient;", "apiService$delegate", "Lkotlin/Lazy;", "create", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull
        private static final kotlin.Lazy<?> apiService$delegate = null;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final io.ktor.client.HttpClient getApiService() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final io.ktor.client.HttpClient create() {
            return null;
        }
    }
}
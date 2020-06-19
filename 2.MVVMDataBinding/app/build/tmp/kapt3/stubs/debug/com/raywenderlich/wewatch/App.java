package com.raywenderlich.wewatch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/raywenderlich/wewatch/App;", "Landroid/app/Application;", "()V", "cicerone", "Lru/terrakok/cicerone/Cicerone;", "Lru/terrakok/cicerone/Router;", "getCicerone", "()Lru/terrakok/cicerone/Cicerone;", "setCicerone", "(Lru/terrakok/cicerone/Cicerone;)V", "initCicerone", "", "onCreate", "Companion", "app_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public ru.terrakok.cicerone.Cicerone<ru.terrakok.cicerone.Router> cicerone;
    @org.jetbrains.annotations.NotNull()
    public static com.raywenderlich.wewatch.App INSTANCE;
    public static final com.raywenderlich.wewatch.App.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.terrakok.cicerone.Cicerone<ru.terrakok.cicerone.Router> getCicerone() {
        return null;
    }
    
    public final void setCicerone(@org.jetbrains.annotations.NotNull()
    ru.terrakok.cicerone.Cicerone<ru.terrakok.cicerone.Router> p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initCicerone() {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/raywenderlich/wewatch/App$Companion;", "", "()V", "INSTANCE", "Lcom/raywenderlich/wewatch/App;", "getINSTANCE", "()Lcom/raywenderlich/wewatch/App;", "setINSTANCE", "(Lcom/raywenderlich/wewatch/App;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.wewatch.App getINSTANCE() {
            return null;
        }
        
        public final void setINSTANCE(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.wewatch.App p0) {
        }
        
        private Companion() {
            super();
        }
    }
}
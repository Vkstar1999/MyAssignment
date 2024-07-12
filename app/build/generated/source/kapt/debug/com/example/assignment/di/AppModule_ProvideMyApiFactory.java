// Generated by Dagger (https://dagger.dev).
package com.example.assignment.di;

import com.example.assignment.networks.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideMyApiFactory implements Factory<ApiService> {
  private final AppModule module;

  public AppModule_ProvideMyApiFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ApiService get() {
    return provideMyApi(module);
  }

  public static AppModule_ProvideMyApiFactory create(AppModule module) {
    return new AppModule_ProvideMyApiFactory(module);
  }

  public static ApiService provideMyApi(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideMyApi());
  }
}

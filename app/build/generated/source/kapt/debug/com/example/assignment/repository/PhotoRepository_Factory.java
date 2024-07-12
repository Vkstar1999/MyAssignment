// Generated by Dagger (https://dagger.dev).
package com.example.assignment.repository;

import com.example.assignment.networks.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class PhotoRepository_Factory implements Factory<PhotoRepository> {
  private final Provider<ApiService> apiServiceProvider;

  public PhotoRepository_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public PhotoRepository get() {
    return newInstance(apiServiceProvider.get());
  }

  public static PhotoRepository_Factory create(Provider<ApiService> apiServiceProvider) {
    return new PhotoRepository_Factory(apiServiceProvider);
  }

  public static PhotoRepository newInstance(ApiService apiService) {
    return new PhotoRepository(apiService);
  }
}
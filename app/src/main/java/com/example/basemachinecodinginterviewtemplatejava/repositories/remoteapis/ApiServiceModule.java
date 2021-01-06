package com.example.basemachinecodinginterviewtemplatejava.repositories.remoteapis;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Module
public class ApiServiceModule {

  @Provides
  @ApplicationScope
  ObjectMapper objectMapper() {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//    objectMapper.registerModule(new JodaModule());
//    objectMapper.enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE);
    return objectMapper;
  }

  @Provides
  @ApplicationScope
  Retrofit retrofit(OkHttpClient okHttpClient, ObjectMapper objectMapper) {
    return new Retrofit.Builder()
        .baseUrl("BASE_URL")
        .addConverterFactory(JacksonConverterFactory.create(objectMapper))
        .client(okHttpClient)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build();
  }


  @Provides
  @ApplicationScope
  HttpLoggingInterceptor loggingInterceptor() {
    HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
    httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
    return httpLoggingInterceptor;
  }

  @Provides
  @ApplicationScope
  OkHttpClient okHttpClient(HttpLoggingInterceptor loggingInterceptor) {
    return new OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build();
  }
}

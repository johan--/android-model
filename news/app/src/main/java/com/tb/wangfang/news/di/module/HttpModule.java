package com.tb.wangfang.news.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * Created by tangbin on 2017/5/4.
 */
@Module
public class HttpModule {
    @Singleton
    @Provides
    ManagedChannel provideClient() {
//        ManagedChannel mChannel = ManagedChannelBuilder.forAddress("10.0.3.2", 8080)
//                .usePlaintext(true)
//                .build();
        ManagedChannel mChannel = ManagedChannelBuilder.forAddress("10.20.17.249", 8088)
                .usePlaintext(true)
                .build();
        return mChannel;
    }


}

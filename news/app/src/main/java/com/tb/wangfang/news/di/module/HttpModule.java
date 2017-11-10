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

        //模拟器对应的电脑
//        ManagedChannel mChannel = ManagedChannelBuilder.forAddress("10.0.3.2", 8088)
//                .usePlaintext(true)
//                .build();
        //马旭亮的电脑
//        ManagedChannel mChannel = ManagedChannelBuilder.forAddress("10.20.17.249", 8088)
//                .usePlaintext(true)
//                .build();
//        //唐斌的电脑
//        ManagedChannel mChannel = ManagedChannelBuilder.forAddress("10.20.17.147", 8088)
//                .usePlaintext(true)
//                .build();
        //叶书胜的电脑
        ManagedChannel mChannel = ManagedChannelBuilder.forAddress("10.20.13.178", 8088)
                .usePlaintext(true)
                .build();
        return mChannel;
    }


}

package DesignPatters.Proxy;

import DesignPatters.Proxy.downloader.YouTubeManager;
import DesignPatters.Proxy.proxy.CachedYouTubeClass;
import DesignPatters.Proxy.youtubeService.ThirdPartyYouTubeClass;

public class Main {
    public static void main(String[] args) {
        YouTubeManager naiveDownloader = new YouTubeManager(new ThirdPartyYouTubeClass());
        YouTubeManager smartDownloader = new YouTubeManager(new CachedYouTubeClass());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

     private static long test(YouTubeManager downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}

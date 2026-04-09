package DesignPatters.Proxy.youtubeService;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {//interface do serviço remoto
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}

package com.fuchunshanju.webchat.message.resp;

/**
 * 
* @ClassName: MusicMessage 
* @Description: (音乐消息) 
* @author Lee 
* @date 2017年4月28日 下午3:01:03 
*
 */
public class MusicMessage extends BaseMessage{
	  // 音乐   
    private Music Music;  

    public Music getMusic() {  
        return Music;  
    }  

    public void setMusic(Music music) {  
        Music = music;  
    }  
}

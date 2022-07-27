package bao0726;

/**
 * @ClassName GifBizBus
 * @Description 定义对象为数组，再接收数据
 * @Author CQ
 * @Date 2022/7/26 15:55
 * @Version 1.0
 */
public class GifBus {
        //定义对象为数组
        GifBiz[] gifBizs=new GifBiz[3];

        //定义一个对象 gifbiz
        public void setAdd(GifBiz bbb){
            for (int i = 0; i < gifBizs.length; i++) {
                if(gifBizs[i]==null){
                    gifBizs[i]=bbb;
                    break;
                }
            }
        }
        //显示信息
        public void getGif(){
            for (int i = 0; i < gifBizs.length; i++) {
                gifBizs[i].show();
            }
        }
}

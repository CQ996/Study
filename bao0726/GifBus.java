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
        GifBiz[] aaa =new GifBiz[3];

        //以GifBiz为模板定义一个对象 bbb
        public void setAdd(GifBiz bbb){
            for (int i = 0; i < aaa.length; i++) {
                if(aaa[i]==null){
                    aaa[i]=bbb;
                    break;
                }
            }
        }
        //显示信息
        public void getGif(){
            for (int i = 0; i < aaa.length; i++) {
                aaa[i].show();
            }
        }
}

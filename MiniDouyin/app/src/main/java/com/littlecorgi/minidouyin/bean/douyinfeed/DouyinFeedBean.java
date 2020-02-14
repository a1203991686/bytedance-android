package com.littlecorgi.minidouyin.bean.douyinfeed;

import java.util.List;

/**
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-13 19:22
 */
public class DouyinFeedBean {
    private int status_code;
    private int min_cursor;
    private int max_cursor;
    private int has_more;
    private int home_model;
    private int refresh_clear;
    private ExtraBean extra;
    private LogPbBean log_pb;
    private Object preload_awemes;
    private List<AwemeListBean> aweme_list;
    private List<?> preload_ads;

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public int getMin_cursor() {
        return min_cursor;
    }

    public void setMin_cursor(int min_cursor) {
        this.min_cursor = min_cursor;
    }

    public int getMax_cursor() {
        return max_cursor;
    }

    public void setMax_cursor(int max_cursor) {
        this.max_cursor = max_cursor;
    }

    public int getHas_more() {
        return has_more;
    }

    public void setHas_more(int has_more) {
        this.has_more = has_more;
    }

    public int getHome_model() {
        return home_model;
    }

    public void setHome_model(int home_model) {
        this.home_model = home_model;
    }

    public int getRefresh_clear() {
        return refresh_clear;
    }

    public void setRefresh_clear(int refresh_clear) {
        this.refresh_clear = refresh_clear;
    }

    public ExtraBean getExtra() {
        return extra;
    }

    public void setExtra(ExtraBean extra) {
        this.extra = extra;
    }

    public LogPbBean getLog_pb() {
        return log_pb;
    }

    public void setLog_pb(LogPbBean log_pb) {
        this.log_pb = log_pb;
    }

    public Object getPreload_awemes() {
        return preload_awemes;
    }

    public void setPreload_awemes(Object preload_awemes) {
        this.preload_awemes = preload_awemes;
    }

    public List<AwemeListBean> getAweme_list() {
        return aweme_list;
    }

    public void setAweme_list(List<AwemeListBean> aweme_list) {
        this.aweme_list = aweme_list;
    }

    public List<?> getPreload_ads() {
        return preload_ads;
    }

    public void setPreload_ads(List<?> preload_ads) {
        this.preload_ads = preload_ads;
    }

    public static class ExtraBean {
        /**
         * now : 1581592004000
         * fatal_item_ids : null
         */

        private long now;
        private Object fatal_item_ids;

        public long getNow() {
            return now;
        }

        public void setNow(long now) {
            this.now = now;
        }

        public Object getFatal_item_ids() {
            return fatal_item_ids;
        }

        public void setFatal_item_ids(Object fatal_item_ids) {
            this.fatal_item_ids = fatal_item_ids;
        }
    }

    public static class LogPbBean {
        /**
         * impr_id : 202002131906430100260781490827E832
         */

        private String impr_id;

        public String getImpr_id() {
            return impr_id;
        }

        public void setImpr_id(String impr_id) {
            this.impr_id = impr_id;
        }
    }

    public static class AwemeListBean {
        /**
         * aweme_id : 6792846210706312461
         * desc : (2/12/20)其实是昨天应该发的视频 #酱式vlog
         * create_time : 1581582918
         * author : {"uid":"71647309230","short_id":"152127764","nickname":"东北人(酱)在洛杉矶","signature":"商务v:dongbei_jiang非本人，请注明来意\nIns:dongbei_jiang\n🧣:东北酱在洛杉矶","avatar_thumb":{"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p1-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg"],"width":720,"height":720},"avatar_medium":{"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p1-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg"],"width":720,"height":720},"is_verified":true,"follow_status":0,"is_block":false,"location":"","hide_location":false,"custom_verify":"人气视频创作者","unique_id":"","story_count":0,"room_id":0,"authority_status":0,"verify_info":"","share_info":{"share_url":"","share_weibo_desc":"","share_desc":"","share_title":"","share_qrcode_url":{"uri":"508f000dcb2032bf2c55","url_list":["https://p9-dy.byteimg.com/obj/508f000dcb2032bf2c55?from=2563711402","https://p1-dy.byteimg.com/obj/508f000dcb2032bf2c55?from=2563711402","https://p3-dy.byteimg.com/obj/508f000dcb2032bf2c55?from=2563711402"],"width":720,"height":720},"share_title_myself":"","share_title_other":""},"with_commerce_entry":false,"verification_type":1,"enterprise_verify_reason":"","is_ad_fake":false,"followers_detail":null,"region":"CN","sync_to_toutiao":0,"commerce_user_level":0,"platform_sync_info":null,"is_discipline_member":false,"secret":0,"prevent_download":false,"geofencing":null,"video_icon":{"uri":"","url_list":[],"width":720,"height":720},"is_gov_media_vip":false,"comment_setting":0,"duet_setting":0,"download_setting":-1,"cover_url":[{"uri":"c8510002be9a3a61aad2","url_list":["https://p3-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"],"width":720,"height":720}],"language":"zh-Hans","item_list":null,"has_unread_story":false,"new_story_cover":null,"is_star":false,"type_label":[],"ad_cover_url":null,"comment_filter_status":0,"avatar_168x168":{"uri":"172870001bde3b09e8995","url_list":["http://p9-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~168x168.webp","http://p3-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~168x168.webp","http://p1-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~168x168.webp"],"width":720,"height":720},"avatar_300x300":{"uri":"172870001bde3b09e8995","url_list":["http://p9-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~300x300.webp","http://p3-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~300x300.webp","http://p1-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~300x300.webp"],"width":720,"height":720},"relative_users":null,"cha_list":null,"sec_uid":"MS4wLjABAAAAEK2Ejw4U32TEcUns-4XWOd18CMphsXfbxfzUMxWgUtY","need_points":null,"homepage_bottom_toast":null}
         * music : {"id":6792832286218357511,"id_str":"6792832286218357511","title":"@东北人(酱)在洛杉矶创作的原声","author":"东北人(酱)在洛杉矶","album":"","cover_hd":{"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg"],"width":720,"height":720},"cover_large":{"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg"],"width":720,"height":720},"cover_medium":{"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg"],"width":720,"height":720},"cover_thumb":{"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg"],"width":720,"height":720},"play_url":{"uri":"http://p9-dy.byteimg.com/obj/ies-music/1658406906543160.mp3","url_list":["http://p9-dy.byteimg.com/obj/ies-music/1658406906543160.mp3","http://p3-dy.byteimg.com/obj/ies-music/1658406906543160.mp3"],"width":720,"height":720},"schema_url":"","source_platform":23,"start_time":0,"end_time":0,"duration":101,"extra":"{\"has_edited\":0,\"reviewed\":1,\"beats\":{},\"douyin_beats_info\":{},\"schedule_search_time\":0}","user_count":0,"position":null,"collect_stat":0,"status":1,"offline_desc":"","owner_id":"71647309230","owner_nickname":"东北人(酱)在洛杉矶","is_original":false,"mid":"6792832286218357511","binded_challenge_id":0,"redirect":false,"is_restricted":false,"author_deleted":false,"is_del_video":false,"is_video_self_see":false,"owner_handle":"152127764","author_position":null,"prevent_download":false,"strong_beat_url":{"uri":"http://p1-dy.byteimg.com/obj/ies-music/strong_beat/1658415414723597","url_list":["http://p1-dy.byteimg.com/obj/ies-music/strong_beat/1658415414723597","http://p3-dy.byteimg.com/obj/ies-music/strong_beat/1658415414723597"],"width":720,"height":720},"unshelve_countries":null,"prevent_item_download_status":0,"external_song_info":[],"sec_uid":"MS4wLjABAAAAEK2Ejw4U32TEcUns-4XWOd18CMphsXfbxfzUMxWgUtY","avatar_thumb":{"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg"],"width":720,"height":720},"avatar_medium":{"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg"],"width":720,"height":720},"avatar_large":{"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg"],"width":720,"height":720},"preview_start_time":0,"preview_end_time":0,"is_commerce_music":true,"is_original_sound":true,"artists":null,"lyric_short_position":null,"mute_share":false,"tag_list":null,"is_author_artist":false}
         * cha_list : [{"cid":"1631946134816775","cha_name":"酱式vlog","desc":"","schema":"aweme://aweme/challenge/detail?cid=1631946134816775","author":{"followers_detail":null,"platform_sync_info":null,"geofencing":null,"cover_url":null,"item_list":null,"new_story_cover":null,"type_label":null,"ad_cover_url":null,"relative_users":null,"cha_list":null,"need_points":null,"homepage_bottom_toast":null},"user_count":0,"share_info":{"share_url":"https://www.iesdouyin.com/share/challenge/1631946134816775/?u_code=11hm6d42m","share_weibo_desc":"我在抖音参加#酱式vlog，超多有趣音乐短视频！赶快来玩！戳这里>>","share_desc":"在抖音，记录美好生活","share_title":"我在抖音参加#酱式vlog，超多有趣音乐短视频！赶快来玩！戳这里>>","bool_persist":0,"share_title_myself":"","share_title_other":"","share_signature_url":"https://tiktokv.com/","share_signature_desc":"TikTok: Make Every Second Count","share_quote":""},"connect_music":[],"type":1,"sub_type":0,"is_pgcshow":false,"collect_stat":0,"is_challenge":0,"view_count":0,"is_commerce":false,"hashtag_profile":"2cef200010f74273533c9","cha_attrs":null}]
         * video : {"play_addr":{"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["http://v6-dy.ixigua.com/d7956e651fa169306a4a3821163ed149/5e453c39/video/tos/cn/tos-cn-ve-15/9b9a16dafc714fe3968ae56f0f9d0eed/?a=1128&br=0&bt=1983&cr=3&cs=0&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=0&rc=M3lsOGdzNjRqczMzPGkzM0ApZjw5aDplNGQ0Nzg8NzpmPGdwZS9uMmBzZy9fLS1fLS9zcy8vNGBhLzM2LzZeNjYyLTU6Yw%3D%3D","http://v26-dy.ixigua.com/236b6d304dbb7f0c4ef4467dba6fd9ac/5e453c39/video/tos/cn/tos-cn-ve-15/9b9a16dafc714fe3968ae56f0f9d0eed/?a=1128&br=0&bt=1983&cr=3&cs=0&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=0&rc=M3lsOGdzNjRqczMzPGkzM0ApZjw5aDplNGQ0Nzg8NzpmPGdwZS9uMmBzZy9fLS1fLS9zcy8vNGBhLzM2LzZeNjYyLTU6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720,"height":720,"url_key":"v0200fb90000bp2gj1v3cp5dq52ihvs0_h264_540p_2031448","data_size":25803209},"cover":{"uri":"large/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976","url_list":["http://p9-dy.byteimg.com/large/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976.jpeg?from=2563711402","http://p1-dy.byteimg.com/large/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976.jpeg?from=2563711402","http://p3-dy.byteimg.com/large/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976.jpeg?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976~tplv-dy-360p.jpeg?from=2563711402_360p"],"width":720,"height":720},"height":1024,"width":576,"dynamic_cover":{"uri":"tos-cn-p-0015/30630670e5234418a67ce03fc9123ff9_1581582927","url_list":["https://p3-dy.byteimg.com/obj/tos-cn-p-0015/30630670e5234418a67ce03fc9123ff9_1581582927?from=2563711402","https://p1-dy.byteimg.com/obj/tos-cn-p-0015/30630670e5234418a67ce03fc9123ff9_1581582927?from=2563711402","https://p9-dy.byteimg.com/obj/tos-cn-p-0015/30630670e5234418a67ce03fc9123ff9_1581582927?from=2563711402"],"width":720,"height":720},"origin_cover":{"uri":"large/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926","url_list":["http://p9-dy.byteimg.com/large/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926.jpeg?from=2563711402","http://p1-dy.byteimg.com/large/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926.jpeg?from=2563711402","http://p3-dy.byteimg.com/large/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926.jpeg?from=2563711402","https://p3-dy.byteimg.com/img/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926~tplv-dy-360p.jpeg?from=2563711402_360p"],"width":720,"height":720},"ratio":"540p","download_addr":{"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&quality_type=11&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&quality_type=11&source=PackSourceEnum_FEED"],"width":720,"height":720,"data_size":41910005},"has_watermark":true,"play_addr_lowbr":{"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["http://v6-dy.ixigua.com/d7956e651fa169306a4a3821163ed149/5e453c39/video/tos/cn/tos-cn-ve-15/9b9a16dafc714fe3968ae56f0f9d0eed/?a=1128&br=0&bt=1983&cr=3&cs=0&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=0&rc=M3lsOGdzNjRqczMzPGkzM0ApZjw5aDplNGQ0Nzg8NzpmPGdwZS9uMmBzZy9fLS1fLS9zcy8vNGBhLzM2LzZeNjYyLTU6Yw%3D%3D","http://v26-dy.ixigua.com/236b6d304dbb7f0c4ef4467dba6fd9ac/5e453c39/video/tos/cn/tos-cn-ve-15/9b9a16dafc714fe3968ae56f0f9d0eed/?a=1128&br=0&bt=1983&cr=3&cs=0&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=0&rc=M3lsOGdzNjRqczMzPGkzM0ApZjw5aDplNGQ0Nzg8NzpmPGdwZS9uMmBzZy9fLS1fLS9zcy8vNGBhLzM2LzZeNjYyLTU6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720,"height":720,"url_key":"v0200fb90000bp2gj1v3cp5dq52ihvs0_h264_540p_2031448","data_size":25803209},"bit_rate":[{"gear_name":"adapt_540","quality_type":28,"bit_rate":1337256,"play_addr":{"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["http://v6-dy.ixigua.com/61c15b8a19b3b7433e19d06386e1967b/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","http://v26-dy.ixigua.com/7754733861bff327b4c3926ac93cb5ab/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720,"height":720,"url_key":"v0200fb90000bp2gj1v3cp5dq52ihvs0_h265_540p_1337256","data_size":16985671},"is_h265":1,"play_addr_265":{"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["http://v6-dy.ixigua.com/61c15b8a19b3b7433e19d06386e1967b/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","http://v26-dy.ixigua.com/7754733861bff327b4c3926ac93cb5ab/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720,"height":720,"url_key":"v0200fb90000bp2gj1v3cp5dq52ihvs0_h265_540p_1337256","data_size":16985671}}],"duration":101610,"play_addr_265":{"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["http://v6-dy.ixigua.com/61c15b8a19b3b7433e19d06386e1967b/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","http://v26-dy.ixigua.com/7754733861bff327b4c3926ac93cb5ab/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720,"height":720,"url_key":"v0200fb90000bp2gj1v3cp5dq52ihvs0_h265_540p_1337256","data_size":16985671},"is_h265":0,"play_addr_h264":{"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED"],"width":720,"height":720,"url_key":"v0200fb90000bp2gj1v3cp5dq52ihvs0_h264_540p_2031448","data_size":25803209},"cdn_url_expired":0}
         * share_url : https://www.iesdouyin.com/share/video/6792846210706312461/?region=CN&mid=6792832286218357511&u_code=11hm6d42m&titleType=title
         * user_digged : 0
         * statistics : {"aweme_id":"6792846210706312461","comment_count":10824,"digg_count":341737,"download_count":2192,"play_count":0,"share_count":1821,"forward_count":8,"lose_count":0,"lose_comment_count":0}
         * status : {"aweme_id":"6792846210706312461","is_delete":false,"allow_share":true,"allow_comment":true,"is_private":false,"with_goods":false,"private_status":0,"with_fusion_goods":false,"in_reviewing":false,"reviewed":1,"self_see":false,"is_prohibited":false,"download_status":0}
         * rate : 12
         * text_extra : [{"start":21,"end":28,"type":1,"hashtag_name":"酱式vlog","hashtag_id":"1631946134816775","is_commerce":false}]
         * is_top : 0
         * label_top : {"uri":"c150000f34767e2cb56","url_list":["https://p9-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p1-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p3-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402"],"width":720,"height":720}
         * share_info : {"share_url":"https://www.iesdouyin.com/share/video/6792846210706312461/?region=CN&mid=6792832286218357511&u_code=11hm6d42m&titleType=title","share_weibo_desc":"#在抖音，记录美好生活#(2/12/20)其实是昨天应该发的视频 #酱式vlog","share_desc":"在抖音，记录美好生活","share_title":"(2/12/20)其实是昨天应该发的视频 #酱式vlog","bool_persist":0,"share_title_myself":"","share_title_other":"","share_link_desc":"#在抖音，记录美好生活#(2/12/20)其实是昨天应该发的视频 #酱式vlog %s 复制此链接，打开【抖音短视频】，直接观看视频！","share_signature_url":"https://tiktokv.com/","share_signature_desc":"TikTok: Make Every Second Count","share_quote":""}
         * distance :
         * video_labels : []
         * is_vr : false
         * is_ads : false
         * duration : 101610
         * aweme_type : 0
         * is_fantasy : false
         * cmt_swt : false
         * image_infos : null
         * risk_infos : {"vote":false,"warn":false,"risk_sink":false,"type":0,"content":""}
         * is_relieve : false
         * sort_label : _
         * position : null
         * uniqid_position : null
         * comment_list : null
         * author_user_id : 71647309230
         * bodydance_score : 0
         * geofencing : []
         * is_hash_tag : 1
         * is_pgcshow : false
         * region :
         * video_text : []
         * vr_type : 0
         * collect_stat : 0
         * label_top_text : null
         * promotions : []
         * group_id : 6792846210706312461
         * prevent_download : false
         * nickname_position : null
         * challenge_position : null
         * item_comment_settings : 0
         * with_promotional_music : false
         * xigua_task : {"is_xigua_task":false}
         * long_video : null
         * item_duet : 0
         * item_react : 0
         * desc_language : zh
         * interaction_stickers : null
         * ad_link_type : 0
         * origin_comment_ids : null
         * commerce_config_data : null
         * enable_top_view : true
         * distribute_type : 2
         * video_control : {"allow_download":true,"share_type":1,"show_progress_bar":1,"draft_progress_bar":1,"allow_duet":false,"allow_react":false,"prevent_download_type":0,"allow_dynamic_wallpaper":false,"timer_status":1}
         * aweme_control : {"can_forward":true,"can_share":true,"can_comment":true,"can_show_comment":true}
         * has_vs_entry : false
         * need_vs_entry : false
         * descendants : {"platforms":["toutiao"],"notify_msg":"头条"}
         * star_atlas_info : {"link_info":{"id":"10102","title":"找小姐姐打游戏，就上比心APP","sub_title":"比心APP","avatar_icon":{"uri":"daea0011e9c832dd395c","url_list":["https://p9-dy.byteimg.com/obj/daea0011e9c832dd395c?from=2563711402","https://p29-dy.byteimg.com/obj/daea0011e9c832dd395c?from=2563711402","https://p1-dy.byteimg.com/obj/daea0011e9c832dd395c?from=2563711402"],"width":720,"height":720},"web_url":"https://h5.hibixin.com/pandora/152","open_url":""}}
         * commerce_info : {"avoid_global_pendant":true}
         * raw_ad_data : {"ad_id":1658301421427739,"ad_source_type":1,"ad_tag_position":2,"animation_type":1,"avatar_url":"http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202002115d0df4ff3f000aa24210a30a?from=ad","button_style":1,"button_text":"查看详情","click_track_url_list":{"uri":"","url_list":["http://e.cn.miaozhen.com/r/k=2155995&p=7X69X&dx=__IPDX__&rt=2&ns=106.121.137.174&ni=__IESID__&v=__LOC__&xa=__ADPLATFORM__&tr=202002131906430100260781490827E832&mo=0&m0=a03f240705e409ad&m0a=__DUID__&m1=a03f240705e409ad&m1a=9dea8fbe57a7382e825f0d19014c1a1f&m2=d817477c00e5c39344e361da7f7c400e&m4=__AAID__&m5=__IDFA__&m6=07c3d4db3ea7ef4c72f0aeefe25cd5ec&m6a=2ba10f5753f7e0736097f3c96ae0424a&m11=__OAID__&ls=40.0x116.3x100.0&o="]},"comment_area":{"avatar_icon":{"uri":"web.business.image/202002115d0df4ff3f000aa24210a30a","url_list":["http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202002115d0df4ff3f000aa24210a30a?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202002115d0df4ff3f000aa24210a30a?from=ad","http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202002115d0df4ff3f000aa24210a30a?from=ad"]},"button_text":"查看详情","comment_info":"跟NTC教练一起，把运动练到家。\n点击按钮预约健身直播课。2/12-2/18每晚8点见。","comment_nickname":"NIKE，把运动练到家","comment_time":1581523200,"show_button_number":10,"source":"NIKE，把运动练到家","title":"跟NTC教练一起，把运动练到家。\n点击按钮预约健身直播课。2/12-2/18每晚8点见。"},"comment_area_switch":true,"creative_id":1658301533509639,"disable_show_ad_link":true,"effective_play_time":0,"group_id":6792109482185886984,"is_preview":false,"is_real_author":true,"label":{"color":"#14FFFFFF","color_text":"#7FFFFFFF","text":"广告","type":4},"learn_more_bg_color":"#8BCC00","log_extra":"{\"component_ids\":[8,9,13,38],\"convert_component_suspend\":0,\"convert_id\":0,\"is_pack_v2\":true,\"orit\":40001,\"placement\":\"unknown\",\"req_id\":\"202002131906430100260781490827E832\",\"rit\":40001,\"style_id\":4916,\"style_ids\":[4916],\"van_package\":-1}","report_enable":true,"show_button_seconds":3,"show_mask_times":2,"source":"NIKE，把运动练到家","title":"跟NTC教练一起，把运动练到家。\n点击按钮预约健身直播课。2/12-2/18每晚8点见。","track_url_list":{"uri":"","url_list":["http://g.cn.miaozhen.com/x/k=2155995&p=7X69X&dx=__IPDX__&rt=2&ns=106.121.137.174&ni=__IESID__&v=__LOC__&xa=__ADPLATFORM__&tr=202002131906430100260781490827E832&vg=__AUTOPLAY__&nh=__AUTOREFRESH__&mo=0&m0=a03f240705e409ad&m0a=__DUID__&m1=a03f240705e409ad&m1a=9dea8fbe57a7382e825f0d19014c1a1f&m2=d817477c00e5c39344e361da7f7c400e&m4=__AAID__&m5=__IDFA__&m6=07c3d4db3ea7ef4c72f0aeefe25cd5ec&m6a=2ba10f5753f7e0736097f3c96ae0424a&m11=__OAID__&ls=40.0x116.3x100.0&o="]},"type":"web","use_ordinary_web":true,"video_transpose":0,"web_title":"NIKE，把运动练到家","web_url":"https://aweme.snssdk.com/magic/page/ejs/5e3ea590c3e6d5026a7a9d49?appType=douyin"}
         * misc_info : {"vpa_info":{"show_opt_out_button":false,"show_info_bar_type":0}}
         * ad_aweme_source : 1
         * open_platform_name :
         * open_platform_info : {"raw_data":"{\"base\":{\"app_icon\":\"https://sf1-dycdn-tos.pstatp.com/obj/douyin-web-image/b22313de3911b1169d1064198d589bc1\",\"client_key\":\"aw7c4z4ej0o3efzd\",\"app_name\":\"剪映-抖音出品\"}}"}
         * relation_label : {"label_info":"你的关注"}
         * micro_app_info : {"app_id":"tt768b0036e9a14874","app_name":"天天台球","icon":"https://sf3-ttcdn-tos.pstatp.com/img/developer/app/tt768b0036e9a14874/iconb2794d3~144x144.jpeg","orientation":1,"schema":"sslocal://microgame?app_id=tt768b0036e9a14874&extra=%7B%22event_extra%22%3A%7B%22group_id%22%3A6792792803148598542%7D%7D&meta=%7B%22icon%22%3A%22https%3A%2F%2Fsf3-ttcdn-tos.pstatp.com%2Fimg%2Fdeveloper%2Fapp%2Ftt768b0036e9a14874%2Ficonb2794d3~144x144.jpeg%22%2C%22name%22%3A%22%E5%A4%A9%E5%A4%A9%E5%8F%B0%E7%90%83%22%2C%22orientation%22%3A1%7D&query=%7B%22introducerId%22%3A%22529e559f-eb14-4549-91d1-689aa2b020f6%22%2C%22originalMaterialId%22%3A%22529e559f-eb14-4549-91d1-689aa2b020f6%22%2C%22currentMaterialId%22%3A%22529e559f-eb14-4549-91d1-689aa2b020f6%22%7D","state":1,"summary":"天天台球，无限撞击，激情对对碰！","type":2,"description":"体验一杆清台的爽感","title":"天天台球，一杆清台","card":{"image_url":"https://sf3-ttcdn-tos.pstatp.com/img/developer/app/tt768b0036e9a14874/si838f2c0~noop.image","text":"553w人玩过","wait_time":3}}
         * mix_info : {"mix_id":"6792861205561083918","mix_name":"斯诺克不可思议系列","cover_url":{"uri":"tos-cn-i-0813/cd3b0dffd4c64b1d84ae1bcb598e37ba","url_list":["https://p3-dy.byteimg.com/obj/tos-cn-i-0813/cd3b0dffd4c64b1d84ae1bcb598e37ba?from=2563711402","https://p29-dy.byteimg.com/obj/tos-cn-i-0813/cd3b0dffd4c64b1d84ae1bcb598e37ba?from=2563711402","https://p9-dy.byteimg.com/obj/tos-cn-i-0813/cd3b0dffd4c64b1d84ae1bcb598e37ba?from=2563711402"],"width":720,"height":720},"status":{"status":2,"is_collected":0},"statis":{"play_vv":0,"collect_vv":0,"current_episode":1,"updated_to_episode":13},"desc":"这里收录的那些斯诺克力神奇的进球，解球，那些搞笑的瞬间！","extra":"{\"first_reviewed\":1,\"next_info\":{\"cover\":\"tos-cn-i-0813/cd3b0dffd4c64b1d84ae1bcb598e37ba\",\"desc\":\"这里收录的那些斯诺克力神奇的进球，解球，那些搞笑的瞬间！\",\"name\":\"斯诺克不可思议系列\"}}","share_info":{"share_url":"https://www.iesdouyin.com/share/mix/detail/6792861205561083918/?schema_type=24&object_id=6792861205561083918","share_weibo_desc":"这么有趣的合集，不能只有我一个人知道吧","share_desc":"在抖音，记录美好生活","share_title":"这么有趣的合集，不能只有我一个人知道吧","share_title_myself":"","share_title_other":""}}
         */

        private String aweme_id;
        private String desc;
        private int create_time;
        private AuthorBean author;
        private MusicBean music;
        private VideoBean video;
        private String share_url;
        private int user_digged;
        private StatisticsBean statistics;
        private StatusBean status;
        private int rate;
        private int is_top;
        private LabelTopBean label_top;
        private ShareInfoBeanX share_info;
        private String distance;
        private boolean is_vr;
        private boolean is_ads;
        private int duration;
        private int aweme_type;
        private boolean is_fantasy;
        private boolean cmt_swt;
        private Object image_infos;
        private RiskInfosBean risk_infos;
        private boolean is_relieve;
        private String sort_label;
        private Object position;
        private Object uniqid_position;
        private Object comment_list;
        private long author_user_id;
        private int bodydance_score;
        private int is_hash_tag;
        private boolean is_pgcshow;
        private String region;
        private int vr_type;
        private int collect_stat;
        private Object label_top_text;
        private String group_id;
        private boolean prevent_download;
        private Object nickname_position;
        private Object challenge_position;
        private int item_comment_settings;
        private boolean with_promotional_music;
        private XiguaTaskBean xigua_task;
        private Object long_video;
        private int item_duet;
        private int item_react;
        private String desc_language;
        private Object interaction_stickers;
        private int ad_link_type;
        private Object origin_comment_ids;
        private Object commerce_config_data;
        private boolean enable_top_view;
        private int distribute_type;
        private VideoControlBean video_control;
        private AwemeControlBean aweme_control;
        private boolean has_vs_entry;
        private boolean need_vs_entry;
        private DescendantsBean descendants;
        private StarAtlasInfoBean star_atlas_info;
        private CommerceInfoBean commerce_info;
        private RawAdDataBean raw_ad_data;
        private String misc_info;
        private int ad_aweme_source;
        private String open_platform_name;
        private OpenPlatformInfoBean open_platform_info;
        private RelationLabelBean relation_label;
        private MicroAppInfoBean micro_app_info;
        private MixInfoBean mix_info;
        private List<ChaListBean> cha_list;
        private List<TextExtraBean> text_extra;
        private List<?> video_labels;
        private List<?> geofencing;
        private List<?> video_text;
        private List<?> promotions;

        public String getAweme_id() {
            return aweme_id;
        }

        public void setAweme_id(String aweme_id) {
            this.aweme_id = aweme_id;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getCreate_time() {
            return create_time;
        }

        public void setCreate_time(int create_time) {
            this.create_time = create_time;
        }

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public MusicBean getMusic() {
            return music;
        }

        public void setMusic(MusicBean music) {
            this.music = music;
        }

        public VideoBean getVideo() {
            return video;
        }

        public void setVideo(VideoBean video) {
            this.video = video;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public int getUser_digged() {
            return user_digged;
        }

        public void setUser_digged(int user_digged) {
            this.user_digged = user_digged;
        }

        public StatisticsBean getStatistics() {
            return statistics;
        }

        public void setStatistics(StatisticsBean statistics) {
            this.statistics = statistics;
        }

        public StatusBean getStatus() {
            return status;
        }

        public void setStatus(StatusBean status) {
            this.status = status;
        }

        public int getRate() {
            return rate;
        }

        public void setRate(int rate) {
            this.rate = rate;
        }

        public int getIs_top() {
            return is_top;
        }

        public void setIs_top(int is_top) {
            this.is_top = is_top;
        }

        public LabelTopBean getLabel_top() {
            return label_top;
        }

        public void setLabel_top(LabelTopBean label_top) {
            this.label_top = label_top;
        }

        public ShareInfoBeanX getShare_info() {
            return share_info;
        }

        public void setShare_info(ShareInfoBeanX share_info) {
            this.share_info = share_info;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public boolean isIs_vr() {
            return is_vr;
        }

        public void setIs_vr(boolean is_vr) {
            this.is_vr = is_vr;
        }

        public boolean isIs_ads() {
            return is_ads;
        }

        public void setIs_ads(boolean is_ads) {
            this.is_ads = is_ads;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getAweme_type() {
            return aweme_type;
        }

        public void setAweme_type(int aweme_type) {
            this.aweme_type = aweme_type;
        }

        public boolean isIs_fantasy() {
            return is_fantasy;
        }

        public void setIs_fantasy(boolean is_fantasy) {
            this.is_fantasy = is_fantasy;
        }

        public boolean isCmt_swt() {
            return cmt_swt;
        }

        public void setCmt_swt(boolean cmt_swt) {
            this.cmt_swt = cmt_swt;
        }

        public Object getImage_infos() {
            return image_infos;
        }

        public void setImage_infos(Object image_infos) {
            this.image_infos = image_infos;
        }

        public RiskInfosBean getRisk_infos() {
            return risk_infos;
        }

        public void setRisk_infos(RiskInfosBean risk_infos) {
            this.risk_infos = risk_infos;
        }

        public boolean isIs_relieve() {
            return is_relieve;
        }

        public void setIs_relieve(boolean is_relieve) {
            this.is_relieve = is_relieve;
        }

        public String getSort_label() {
            return sort_label;
        }

        public void setSort_label(String sort_label) {
            this.sort_label = sort_label;
        }

        public Object getPosition() {
            return position;
        }

        public void setPosition(Object position) {
            this.position = position;
        }

        public Object getUniqid_position() {
            return uniqid_position;
        }

        public void setUniqid_position(Object uniqid_position) {
            this.uniqid_position = uniqid_position;
        }

        public Object getComment_list() {
            return comment_list;
        }

        public void setComment_list(Object comment_list) {
            this.comment_list = comment_list;
        }

        public long getAuthor_user_id() {
            return author_user_id;
        }

        public void setAuthor_user_id(long author_user_id) {
            this.author_user_id = author_user_id;
        }

        public int getBodydance_score() {
            return bodydance_score;
        }

        public void setBodydance_score(int bodydance_score) {
            this.bodydance_score = bodydance_score;
        }

        public int getIs_hash_tag() {
            return is_hash_tag;
        }

        public void setIs_hash_tag(int is_hash_tag) {
            this.is_hash_tag = is_hash_tag;
        }

        public boolean isIs_pgcshow() {
            return is_pgcshow;
        }

        public void setIs_pgcshow(boolean is_pgcshow) {
            this.is_pgcshow = is_pgcshow;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public int getVr_type() {
            return vr_type;
        }

        public void setVr_type(int vr_type) {
            this.vr_type = vr_type;
        }

        public int getCollect_stat() {
            return collect_stat;
        }

        public void setCollect_stat(int collect_stat) {
            this.collect_stat = collect_stat;
        }

        public Object getLabel_top_text() {
            return label_top_text;
        }

        public void setLabel_top_text(Object label_top_text) {
            this.label_top_text = label_top_text;
        }

        public String getGroup_id() {
            return group_id;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }

        public boolean isPrevent_download() {
            return prevent_download;
        }

        public void setPrevent_download(boolean prevent_download) {
            this.prevent_download = prevent_download;
        }

        public Object getNickname_position() {
            return nickname_position;
        }

        public void setNickname_position(Object nickname_position) {
            this.nickname_position = nickname_position;
        }

        public Object getChallenge_position() {
            return challenge_position;
        }

        public void setChallenge_position(Object challenge_position) {
            this.challenge_position = challenge_position;
        }

        public int getItem_comment_settings() {
            return item_comment_settings;
        }

        public void setItem_comment_settings(int item_comment_settings) {
            this.item_comment_settings = item_comment_settings;
        }

        public boolean isWith_promotional_music() {
            return with_promotional_music;
        }

        public void setWith_promotional_music(boolean with_promotional_music) {
            this.with_promotional_music = with_promotional_music;
        }

        public XiguaTaskBean getXigua_task() {
            return xigua_task;
        }

        public void setXigua_task(XiguaTaskBean xigua_task) {
            this.xigua_task = xigua_task;
        }

        public Object getLong_video() {
            return long_video;
        }

        public void setLong_video(Object long_video) {
            this.long_video = long_video;
        }

        public int getItem_duet() {
            return item_duet;
        }

        public void setItem_duet(int item_duet) {
            this.item_duet = item_duet;
        }

        public int getItem_react() {
            return item_react;
        }

        public void setItem_react(int item_react) {
            this.item_react = item_react;
        }

        public String getDesc_language() {
            return desc_language;
        }

        public void setDesc_language(String desc_language) {
            this.desc_language = desc_language;
        }

        public Object getInteraction_stickers() {
            return interaction_stickers;
        }

        public void setInteraction_stickers(Object interaction_stickers) {
            this.interaction_stickers = interaction_stickers;
        }

        public int getAd_link_type() {
            return ad_link_type;
        }

        public void setAd_link_type(int ad_link_type) {
            this.ad_link_type = ad_link_type;
        }

        public Object getOrigin_comment_ids() {
            return origin_comment_ids;
        }

        public void setOrigin_comment_ids(Object origin_comment_ids) {
            this.origin_comment_ids = origin_comment_ids;
        }

        public Object getCommerce_config_data() {
            return commerce_config_data;
        }

        public void setCommerce_config_data(Object commerce_config_data) {
            this.commerce_config_data = commerce_config_data;
        }

        public boolean isEnable_top_view() {
            return enable_top_view;
        }

        public void setEnable_top_view(boolean enable_top_view) {
            this.enable_top_view = enable_top_view;
        }

        public int getDistribute_type() {
            return distribute_type;
        }

        public void setDistribute_type(int distribute_type) {
            this.distribute_type = distribute_type;
        }

        public VideoControlBean getVideo_control() {
            return video_control;
        }

        public void setVideo_control(VideoControlBean video_control) {
            this.video_control = video_control;
        }

        public AwemeControlBean getAweme_control() {
            return aweme_control;
        }

        public void setAweme_control(AwemeControlBean aweme_control) {
            this.aweme_control = aweme_control;
        }

        public boolean isHas_vs_entry() {
            return has_vs_entry;
        }

        public void setHas_vs_entry(boolean has_vs_entry) {
            this.has_vs_entry = has_vs_entry;
        }

        public boolean isNeed_vs_entry() {
            return need_vs_entry;
        }

        public void setNeed_vs_entry(boolean need_vs_entry) {
            this.need_vs_entry = need_vs_entry;
        }

        public DescendantsBean getDescendants() {
            return descendants;
        }

        public void setDescendants(DescendantsBean descendants) {
            this.descendants = descendants;
        }

        public StarAtlasInfoBean getStar_atlas_info() {
            return star_atlas_info;
        }

        public void setStar_atlas_info(StarAtlasInfoBean star_atlas_info) {
            this.star_atlas_info = star_atlas_info;
        }

        public CommerceInfoBean getCommerce_info() {
            return commerce_info;
        }

        public void setCommerce_info(CommerceInfoBean commerce_info) {
            this.commerce_info = commerce_info;
        }

        public RawAdDataBean getRaw_ad_data() {
            return raw_ad_data;
        }

        public void setRaw_ad_data(RawAdDataBean raw_ad_data) {
            this.raw_ad_data = raw_ad_data;
        }

        public String getMisc_info() {
            return misc_info;
        }

        public void setMisc_info(String misc_info) {
            this.misc_info = misc_info;
        }

        public int getAd_aweme_source() {
            return ad_aweme_source;
        }

        public void setAd_aweme_source(int ad_aweme_source) {
            this.ad_aweme_source = ad_aweme_source;
        }

        public String getOpen_platform_name() {
            return open_platform_name;
        }

        public void setOpen_platform_name(String open_platform_name) {
            this.open_platform_name = open_platform_name;
        }

        public OpenPlatformInfoBean getOpen_platform_info() {
            return open_platform_info;
        }

        public void setOpen_platform_info(OpenPlatformInfoBean open_platform_info) {
            this.open_platform_info = open_platform_info;
        }

        public RelationLabelBean getRelation_label() {
            return relation_label;
        }

        public void setRelation_label(RelationLabelBean relation_label) {
            this.relation_label = relation_label;
        }

        public MicroAppInfoBean getMicro_app_info() {
            return micro_app_info;
        }

        public void setMicro_app_info(MicroAppInfoBean micro_app_info) {
            this.micro_app_info = micro_app_info;
        }

        public MixInfoBean getMix_info() {
            return mix_info;
        }

        public void setMix_info(MixInfoBean mix_info) {
            this.mix_info = mix_info;
        }

        public List<ChaListBean> getCha_list() {
            return cha_list;
        }

        public void setCha_list(List<ChaListBean> cha_list) {
            this.cha_list = cha_list;
        }

        public List<TextExtraBean> getText_extra() {
            return text_extra;
        }

        public void setText_extra(List<TextExtraBean> text_extra) {
            this.text_extra = text_extra;
        }

        public List<?> getVideo_labels() {
            return video_labels;
        }

        public void setVideo_labels(List<?> video_labels) {
            this.video_labels = video_labels;
        }

        public List<?> getGeofencing() {
            return geofencing;
        }

        public void setGeofencing(List<?> geofencing) {
            this.geofencing = geofencing;
        }

        public List<?> getVideo_text() {
            return video_text;
        }

        public void setVideo_text(List<?> video_text) {
            this.video_text = video_text;
        }

        public List<?> getPromotions() {
            return promotions;
        }

        public void setPromotions(List<?> promotions) {
            this.promotions = promotions;
        }

        public static class AuthorBean {
            /**
             * uid : 71647309230
             * short_id : 152127764
             * nickname : 东北人(酱)在洛杉矶
             * signature : 商务v:dongbei_jiang非本人，请注明来意
             * Ins:dongbei_jiang
             * 🧣:东北酱在洛杉矶
             * avatar_thumb : {"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p1-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg"],"width":720,"height":720}
             * avatar_medium : {"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p1-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg"],"width":720,"height":720}
             * is_verified : true
             * follow_status : 0
             * is_block : false
             * location :
             * hide_location : false
             * custom_verify : 人气视频创作者
             * unique_id :
             * story_count : 0
             * room_id : 0
             * authority_status : 0
             * verify_info :
             * share_info : {"share_url":"","share_weibo_desc":"","share_desc":"","share_title":"","share_qrcode_url":{"uri":"508f000dcb2032bf2c55","url_list":["https://p9-dy.byteimg.com/obj/508f000dcb2032bf2c55?from=2563711402","https://p1-dy.byteimg.com/obj/508f000dcb2032bf2c55?from=2563711402","https://p3-dy.byteimg.com/obj/508f000dcb2032bf2c55?from=2563711402"],"width":720,"height":720},"share_title_myself":"","share_title_other":""}
             * with_commerce_entry : false
             * verification_type : 1
             * enterprise_verify_reason :
             * is_ad_fake : false
             * followers_detail : null
             * region : CN
             * sync_to_toutiao : 0
             * commerce_user_level : 0
             * platform_sync_info : null
             * is_discipline_member : false
             * secret : 0
             * prevent_download : false
             * geofencing : null
             * video_icon : {"uri":"","url_list":[],"width":720,"height":720}
             * is_gov_media_vip : false
             * comment_setting : 0
             * duet_setting : 0
             * download_setting : -1
             * cover_url : [{"uri":"c8510002be9a3a61aad2","url_list":["https://p3-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"],"width":720,"height":720}]
             * language : zh-Hans
             * item_list : null
             * has_unread_story : false
             * new_story_cover : null
             * is_star : false
             * type_label : []
             * ad_cover_url : null
             * comment_filter_status : 0
             * avatar_168x168 : {"uri":"172870001bde3b09e8995","url_list":["http://p9-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~168x168.webp","http://p3-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~168x168.webp","http://p1-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~168x168.webp"],"width":720,"height":720}
             * avatar_300x300 : {"uri":"172870001bde3b09e8995","url_list":["http://p9-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~300x300.webp","http://p3-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~300x300.webp","http://p1-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~300x300.webp"],"width":720,"height":720}
             * relative_users : null
             * cha_list : null
             * sec_uid : MS4wLjABAAAAEK2Ejw4U32TEcUns-4XWOd18CMphsXfbxfzUMxWgUtY
             * need_points : null
             * homepage_bottom_toast : null
             */

            private String uid;
            private String short_id;
            private String nickname;
            private String signature;
            private AvatarThumbBean avatar_thumb;
            private AvatarMediumBean avatar_medium;
            private boolean is_verified;
            private int follow_status;
            private boolean is_block;
            private String location;
            private boolean hide_location;
            private String custom_verify;
            private String unique_id;
            private int story_count;
            private int room_id;
            private int authority_status;
            private String verify_info;
            private ShareInfoBean share_info;
            private boolean with_commerce_entry;
            private int verification_type;
            private String enterprise_verify_reason;
            private boolean is_ad_fake;
            private Object followers_detail;
            private String region;
            private int sync_to_toutiao;
            private int commerce_user_level;
            private Object platform_sync_info;
            private boolean is_discipline_member;
            private int secret;
            private boolean prevent_download;
            private Object geofencing;
            private VideoIconBean video_icon;
            private boolean is_gov_media_vip;
            private int comment_setting;
            private int duet_setting;
            private int download_setting;
            private String language;
            private Object item_list;
            private boolean has_unread_story;
            private Object new_story_cover;
            private boolean is_star;
            private Object ad_cover_url;
            private int comment_filter_status;
            private Avatar168x168Bean avatar_168x168;
            private Avatar300x300Bean avatar_300x300;
            private Object relative_users;
            private Object cha_list;
            private String sec_uid;
            private Object need_points;
            private Object homepage_bottom_toast;
            private List<CoverUrlBean> cover_url;
            private List<?> type_label;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getShort_id() {
                return short_id;
            }

            public void setShort_id(String short_id) {
                this.short_id = short_id;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public AvatarThumbBean getAvatar_thumb() {
                return avatar_thumb;
            }

            public void setAvatar_thumb(AvatarThumbBean avatar_thumb) {
                this.avatar_thumb = avatar_thumb;
            }

            public AvatarMediumBean getAvatar_medium() {
                return avatar_medium;
            }

            public void setAvatar_medium(AvatarMediumBean avatar_medium) {
                this.avatar_medium = avatar_medium;
            }

            public boolean isIs_verified() {
                return is_verified;
            }

            public void setIs_verified(boolean is_verified) {
                this.is_verified = is_verified;
            }

            public int getFollow_status() {
                return follow_status;
            }

            public void setFollow_status(int follow_status) {
                this.follow_status = follow_status;
            }

            public boolean isIs_block() {
                return is_block;
            }

            public void setIs_block(boolean is_block) {
                this.is_block = is_block;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public boolean isHide_location() {
                return hide_location;
            }

            public void setHide_location(boolean hide_location) {
                this.hide_location = hide_location;
            }

            public String getCustom_verify() {
                return custom_verify;
            }

            public void setCustom_verify(String custom_verify) {
                this.custom_verify = custom_verify;
            }

            public String getUnique_id() {
                return unique_id;
            }

            public void setUnique_id(String unique_id) {
                this.unique_id = unique_id;
            }

            public int getStory_count() {
                return story_count;
            }

            public void setStory_count(int story_count) {
                this.story_count = story_count;
            }

            public int getRoom_id() {
                return room_id;
            }

            public void setRoom_id(int room_id) {
                this.room_id = room_id;
            }

            public int getAuthority_status() {
                return authority_status;
            }

            public void setAuthority_status(int authority_status) {
                this.authority_status = authority_status;
            }

            public String getVerify_info() {
                return verify_info;
            }

            public void setVerify_info(String verify_info) {
                this.verify_info = verify_info;
            }

            public ShareInfoBean getShare_info() {
                return share_info;
            }

            public void setShare_info(ShareInfoBean share_info) {
                this.share_info = share_info;
            }

            public boolean isWith_commerce_entry() {
                return with_commerce_entry;
            }

            public void setWith_commerce_entry(boolean with_commerce_entry) {
                this.with_commerce_entry = with_commerce_entry;
            }

            public int getVerification_type() {
                return verification_type;
            }

            public void setVerification_type(int verification_type) {
                this.verification_type = verification_type;
            }

            public String getEnterprise_verify_reason() {
                return enterprise_verify_reason;
            }

            public void setEnterprise_verify_reason(String enterprise_verify_reason) {
                this.enterprise_verify_reason = enterprise_verify_reason;
            }

            public boolean isIs_ad_fake() {
                return is_ad_fake;
            }

            public void setIs_ad_fake(boolean is_ad_fake) {
                this.is_ad_fake = is_ad_fake;
            }

            public Object getFollowers_detail() {
                return followers_detail;
            }

            public void setFollowers_detail(Object followers_detail) {
                this.followers_detail = followers_detail;
            }

            public String getRegion() {
                return region;
            }

            public void setRegion(String region) {
                this.region = region;
            }

            public int getSync_to_toutiao() {
                return sync_to_toutiao;
            }

            public void setSync_to_toutiao(int sync_to_toutiao) {
                this.sync_to_toutiao = sync_to_toutiao;
            }

            public int getCommerce_user_level() {
                return commerce_user_level;
            }

            public void setCommerce_user_level(int commerce_user_level) {
                this.commerce_user_level = commerce_user_level;
            }

            public Object getPlatform_sync_info() {
                return platform_sync_info;
            }

            public void setPlatform_sync_info(Object platform_sync_info) {
                this.platform_sync_info = platform_sync_info;
            }

            public boolean isIs_discipline_member() {
                return is_discipline_member;
            }

            public void setIs_discipline_member(boolean is_discipline_member) {
                this.is_discipline_member = is_discipline_member;
            }

            public int getSecret() {
                return secret;
            }

            public void setSecret(int secret) {
                this.secret = secret;
            }

            public boolean isPrevent_download() {
                return prevent_download;
            }

            public void setPrevent_download(boolean prevent_download) {
                this.prevent_download = prevent_download;
            }

            public Object getGeofencing() {
                return geofencing;
            }

            public void setGeofencing(Object geofencing) {
                this.geofencing = geofencing;
            }

            public VideoIconBean getVideo_icon() {
                return video_icon;
            }

            public void setVideo_icon(VideoIconBean video_icon) {
                this.video_icon = video_icon;
            }

            public boolean isIs_gov_media_vip() {
                return is_gov_media_vip;
            }

            public void setIs_gov_media_vip(boolean is_gov_media_vip) {
                this.is_gov_media_vip = is_gov_media_vip;
            }

            public int getComment_setting() {
                return comment_setting;
            }

            public void setComment_setting(int comment_setting) {
                this.comment_setting = comment_setting;
            }

            public int getDuet_setting() {
                return duet_setting;
            }

            public void setDuet_setting(int duet_setting) {
                this.duet_setting = duet_setting;
            }

            public int getDownload_setting() {
                return download_setting;
            }

            public void setDownload_setting(int download_setting) {
                this.download_setting = download_setting;
            }

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public Object getItem_list() {
                return item_list;
            }

            public void setItem_list(Object item_list) {
                this.item_list = item_list;
            }

            public boolean isHas_unread_story() {
                return has_unread_story;
            }

            public void setHas_unread_story(boolean has_unread_story) {
                this.has_unread_story = has_unread_story;
            }

            public Object getNew_story_cover() {
                return new_story_cover;
            }

            public void setNew_story_cover(Object new_story_cover) {
                this.new_story_cover = new_story_cover;
            }

            public boolean isIs_star() {
                return is_star;
            }

            public void setIs_star(boolean is_star) {
                this.is_star = is_star;
            }

            public Object getAd_cover_url() {
                return ad_cover_url;
            }

            public void setAd_cover_url(Object ad_cover_url) {
                this.ad_cover_url = ad_cover_url;
            }

            public int getComment_filter_status() {
                return comment_filter_status;
            }

            public void setComment_filter_status(int comment_filter_status) {
                this.comment_filter_status = comment_filter_status;
            }

            public Avatar168x168Bean getAvatar_168x168() {
                return avatar_168x168;
            }

            public void setAvatar_168x168(Avatar168x168Bean avatar_168x168) {
                this.avatar_168x168 = avatar_168x168;
            }

            public Avatar300x300Bean getAvatar_300x300() {
                return avatar_300x300;
            }

            public void setAvatar_300x300(Avatar300x300Bean avatar_300x300) {
                this.avatar_300x300 = avatar_300x300;
            }

            public Object getRelative_users() {
                return relative_users;
            }

            public void setRelative_users(Object relative_users) {
                this.relative_users = relative_users;
            }

            public Object getCha_list() {
                return cha_list;
            }

            public void setCha_list(Object cha_list) {
                this.cha_list = cha_list;
            }

            public String getSec_uid() {
                return sec_uid;
            }

            public void setSec_uid(String sec_uid) {
                this.sec_uid = sec_uid;
            }

            public Object getNeed_points() {
                return need_points;
            }

            public void setNeed_points(Object need_points) {
                this.need_points = need_points;
            }

            public Object getHomepage_bottom_toast() {
                return homepage_bottom_toast;
            }

            public void setHomepage_bottom_toast(Object homepage_bottom_toast) {
                this.homepage_bottom_toast = homepage_bottom_toast;
            }

            public List<CoverUrlBean> getCover_url() {
                return cover_url;
            }

            public void setCover_url(List<CoverUrlBean> cover_url) {
                this.cover_url = cover_url;
            }

            public List<?> getType_label() {
                return type_label;
            }

            public void setType_label(List<?> type_label) {
                this.type_label = type_label;
            }

            public static class AvatarThumbBean {
                /**
                 * uri : 172870001bde3b09e8995
                 * url_list : ["https://p9-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p1-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class AvatarMediumBean {
                /**
                 * uri : 172870001bde3b09e8995
                 * url_list : ["https://p9-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p1-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class ShareInfoBean {
                /**
                 * share_url :
                 * share_weibo_desc :
                 * share_desc :
                 * share_title :
                 * share_qrcode_url : {"uri":"508f000dcb2032bf2c55","url_list":["https://p9-dy.byteimg.com/obj/508f000dcb2032bf2c55?from=2563711402","https://p1-dy.byteimg.com/obj/508f000dcb2032bf2c55?from=2563711402","https://p3-dy.byteimg.com/obj/508f000dcb2032bf2c55?from=2563711402"],"width":720,"height":720}
                 * share_title_myself :
                 * share_title_other :
                 */

                private String share_url;
                private String share_weibo_desc;
                private String share_desc;
                private String share_title;
                private ShareQrcodeUrlBean share_qrcode_url;
                private String share_title_myself;
                private String share_title_other;

                public String getShare_url() {
                    return share_url;
                }

                public void setShare_url(String share_url) {
                    this.share_url = share_url;
                }

                public String getShare_weibo_desc() {
                    return share_weibo_desc;
                }

                public void setShare_weibo_desc(String share_weibo_desc) {
                    this.share_weibo_desc = share_weibo_desc;
                }

                public String getShare_desc() {
                    return share_desc;
                }

                public void setShare_desc(String share_desc) {
                    this.share_desc = share_desc;
                }

                public String getShare_title() {
                    return share_title;
                }

                public void setShare_title(String share_title) {
                    this.share_title = share_title;
                }

                public ShareQrcodeUrlBean getShare_qrcode_url() {
                    return share_qrcode_url;
                }

                public void setShare_qrcode_url(ShareQrcodeUrlBean share_qrcode_url) {
                    this.share_qrcode_url = share_qrcode_url;
                }

                public String getShare_title_myself() {
                    return share_title_myself;
                }

                public void setShare_title_myself(String share_title_myself) {
                    this.share_title_myself = share_title_myself;
                }

                public String getShare_title_other() {
                    return share_title_other;
                }

                public void setShare_title_other(String share_title_other) {
                    this.share_title_other = share_title_other;
                }

                public static class ShareQrcodeUrlBean {
                    /**
                     * uri : 508f000dcb2032bf2c55
                     * url_list : ["https://p9-dy.byteimg.com/obj/508f000dcb2032bf2c55?from=2563711402","https://p1-dy.byteimg.com/obj/508f000dcb2032bf2c55?from=2563711402","https://p3-dy.byteimg.com/obj/508f000dcb2032bf2c55?from=2563711402"]
                     * width : 720
                     * height : 720
                     */

                    private String uri;
                    private int width;
                    private int height;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }
            }

            public static class VideoIconBean {
                /**
                 * uri :
                 * url_list : []
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<?> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<?> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<?> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class Avatar168x168Bean {
                /**
                 * uri : 172870001bde3b09e8995
                 * url_list : ["http://p9-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~168x168.webp","http://p3-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~168x168.webp","http://p1-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~168x168.webp"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class Avatar300x300Bean {
                /**
                 * uri : 172870001bde3b09e8995
                 * url_list : ["http://p9-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~300x300.webp","http://p3-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~300x300.webp","http://p1-dy.byteimg.com/img/mosaic-legacy/172870001bde3b09e8995~300x300.webp"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverUrlBean {
                /**
                 * uri : c8510002be9a3a61aad2
                 * url_list : ["https://p3-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }
        }

        public static class MusicBean {
            /**
             * id : 6792832286218357511
             * id_str : 6792832286218357511
             * title : @东北人(酱)在洛杉矶创作的原声
             * author : 东北人(酱)在洛杉矶
             * album :
             * cover_hd : {"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg"],"width":720,"height":720}
             * cover_large : {"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg"],"width":720,"height":720}
             * cover_medium : {"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg"],"width":720,"height":720}
             * cover_thumb : {"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg"],"width":720,"height":720}
             * play_url : {"uri":"http://p9-dy.byteimg.com/obj/ies-music/1658406906543160.mp3","url_list":["http://p9-dy.byteimg.com/obj/ies-music/1658406906543160.mp3","http://p3-dy.byteimg.com/obj/ies-music/1658406906543160.mp3"],"width":720,"height":720}
             * schema_url :
             * source_platform : 23
             * start_time : 0
             * end_time : 0
             * duration : 101
             * extra : {"has_edited":0,"reviewed":1,"beats":{},"douyin_beats_info":{},"schedule_search_time":0}
             * user_count : 0
             * position : null
             * collect_stat : 0
             * status : 1
             * offline_desc :
             * owner_id : 71647309230
             * owner_nickname : 东北人(酱)在洛杉矶
             * is_original : false
             * mid : 6792832286218357511
             * binded_challenge_id : 0
             * redirect : false
             * is_restricted : false
             * author_deleted : false
             * is_del_video : false
             * is_video_self_see : false
             * owner_handle : 152127764
             * author_position : null
             * prevent_download : false
             * strong_beat_url : {"uri":"http://p1-dy.byteimg.com/obj/ies-music/strong_beat/1658415414723597","url_list":["http://p1-dy.byteimg.com/obj/ies-music/strong_beat/1658415414723597","http://p3-dy.byteimg.com/obj/ies-music/strong_beat/1658415414723597"],"width":720,"height":720}
             * unshelve_countries : null
             * prevent_item_download_status : 0
             * external_song_info : []
             * sec_uid : MS4wLjABAAAAEK2Ejw4U32TEcUns-4XWOd18CMphsXfbxfzUMxWgUtY
             * avatar_thumb : {"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg"],"width":720,"height":720}
             * avatar_medium : {"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg"],"width":720,"height":720}
             * avatar_large : {"uri":"172870001bde3b09e8995","url_list":["https://p9-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg"],"width":720,"height":720}
             * preview_start_time : 0
             * preview_end_time : 0
             * is_commerce_music : true
             * is_original_sound : true
             * artists : null
             * lyric_short_position : null
             * mute_share : false
             * tag_list : null
             * is_author_artist : false
             */

            private long id;
            private String id_str;
            private String title;
            private String author;
            private String album;
            private CoverHdBean cover_hd;
            private CoverLargeBean cover_large;
            private CoverMediumBean cover_medium;
            private CoverThumbBean cover_thumb;
            private PlayUrlBean play_url;
            private String schema_url;
            private int source_platform;
            private int start_time;
            private int end_time;
            private int duration;
            private String extra;
            private int user_count;
            private Object position;
            private int collect_stat;
            private int status;
            private String offline_desc;
            private String owner_id;
            private String owner_nickname;
            private boolean is_original;
            private String mid;
            private int binded_challenge_id;
            private boolean redirect;
            private boolean is_restricted;
            private boolean author_deleted;
            private boolean is_del_video;
            private boolean is_video_self_see;
            private String owner_handle;
            private Object author_position;
            private boolean prevent_download;
            private StrongBeatUrlBean strong_beat_url;
            private Object unshelve_countries;
            private int prevent_item_download_status;
            private String sec_uid;
            private AvatarThumbBeanX avatar_thumb;
            private AvatarMediumBeanX avatar_medium;
            private AvatarLargeBean avatar_large;
            private int preview_start_time;
            private int preview_end_time;
            private boolean is_commerce_music;
            private boolean is_original_sound;
            private Object artists;
            private Object lyric_short_position;
            private boolean mute_share;
            private Object tag_list;
            private boolean is_author_artist;
            private List<?> external_song_info;

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public String getId_str() {
                return id_str;
            }

            public void setId_str(String id_str) {
                this.id_str = id_str;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getAlbum() {
                return album;
            }

            public void setAlbum(String album) {
                this.album = album;
            }

            public CoverHdBean getCover_hd() {
                return cover_hd;
            }

            public void setCover_hd(CoverHdBean cover_hd) {
                this.cover_hd = cover_hd;
            }

            public CoverLargeBean getCover_large() {
                return cover_large;
            }

            public void setCover_large(CoverLargeBean cover_large) {
                this.cover_large = cover_large;
            }

            public CoverMediumBean getCover_medium() {
                return cover_medium;
            }

            public void setCover_medium(CoverMediumBean cover_medium) {
                this.cover_medium = cover_medium;
            }

            public CoverThumbBean getCover_thumb() {
                return cover_thumb;
            }

            public void setCover_thumb(CoverThumbBean cover_thumb) {
                this.cover_thumb = cover_thumb;
            }

            public PlayUrlBean getPlay_url() {
                return play_url;
            }

            public void setPlay_url(PlayUrlBean play_url) {
                this.play_url = play_url;
            }

            public String getSchema_url() {
                return schema_url;
            }

            public void setSchema_url(String schema_url) {
                this.schema_url = schema_url;
            }

            public int getSource_platform() {
                return source_platform;
            }

            public void setSource_platform(int source_platform) {
                this.source_platform = source_platform;
            }

            public int getStart_time() {
                return start_time;
            }

            public void setStart_time(int start_time) {
                this.start_time = start_time;
            }

            public int getEnd_time() {
                return end_time;
            }

            public void setEnd_time(int end_time) {
                this.end_time = end_time;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public String getExtra() {
                return extra;
            }

            public void setExtra(String extra) {
                this.extra = extra;
            }

            public int getUser_count() {
                return user_count;
            }

            public void setUser_count(int user_count) {
                this.user_count = user_count;
            }

            public Object getPosition() {
                return position;
            }

            public void setPosition(Object position) {
                this.position = position;
            }

            public int getCollect_stat() {
                return collect_stat;
            }

            public void setCollect_stat(int collect_stat) {
                this.collect_stat = collect_stat;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getOffline_desc() {
                return offline_desc;
            }

            public void setOffline_desc(String offline_desc) {
                this.offline_desc = offline_desc;
            }

            public String getOwner_id() {
                return owner_id;
            }

            public void setOwner_id(String owner_id) {
                this.owner_id = owner_id;
            }

            public String getOwner_nickname() {
                return owner_nickname;
            }

            public void setOwner_nickname(String owner_nickname) {
                this.owner_nickname = owner_nickname;
            }

            public boolean isIs_original() {
                return is_original;
            }

            public void setIs_original(boolean is_original) {
                this.is_original = is_original;
            }

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }

            public int getBinded_challenge_id() {
                return binded_challenge_id;
            }

            public void setBinded_challenge_id(int binded_challenge_id) {
                this.binded_challenge_id = binded_challenge_id;
            }

            public boolean isRedirect() {
                return redirect;
            }

            public void setRedirect(boolean redirect) {
                this.redirect = redirect;
            }

            public boolean isIs_restricted() {
                return is_restricted;
            }

            public void setIs_restricted(boolean is_restricted) {
                this.is_restricted = is_restricted;
            }

            public boolean isAuthor_deleted() {
                return author_deleted;
            }

            public void setAuthor_deleted(boolean author_deleted) {
                this.author_deleted = author_deleted;
            }

            public boolean isIs_del_video() {
                return is_del_video;
            }

            public void setIs_del_video(boolean is_del_video) {
                this.is_del_video = is_del_video;
            }

            public boolean isIs_video_self_see() {
                return is_video_self_see;
            }

            public void setIs_video_self_see(boolean is_video_self_see) {
                this.is_video_self_see = is_video_self_see;
            }

            public String getOwner_handle() {
                return owner_handle;
            }

            public void setOwner_handle(String owner_handle) {
                this.owner_handle = owner_handle;
            }

            public Object getAuthor_position() {
                return author_position;
            }

            public void setAuthor_position(Object author_position) {
                this.author_position = author_position;
            }

            public boolean isPrevent_download() {
                return prevent_download;
            }

            public void setPrevent_download(boolean prevent_download) {
                this.prevent_download = prevent_download;
            }

            public StrongBeatUrlBean getStrong_beat_url() {
                return strong_beat_url;
            }

            public void setStrong_beat_url(StrongBeatUrlBean strong_beat_url) {
                this.strong_beat_url = strong_beat_url;
            }

            public Object getUnshelve_countries() {
                return unshelve_countries;
            }

            public void setUnshelve_countries(Object unshelve_countries) {
                this.unshelve_countries = unshelve_countries;
            }

            public int getPrevent_item_download_status() {
                return prevent_item_download_status;
            }

            public void setPrevent_item_download_status(int prevent_item_download_status) {
                this.prevent_item_download_status = prevent_item_download_status;
            }

            public String getSec_uid() {
                return sec_uid;
            }

            public void setSec_uid(String sec_uid) {
                this.sec_uid = sec_uid;
            }

            public AvatarThumbBeanX getAvatar_thumb() {
                return avatar_thumb;
            }

            public void setAvatar_thumb(AvatarThumbBeanX avatar_thumb) {
                this.avatar_thumb = avatar_thumb;
            }

            public AvatarMediumBeanX getAvatar_medium() {
                return avatar_medium;
            }

            public void setAvatar_medium(AvatarMediumBeanX avatar_medium) {
                this.avatar_medium = avatar_medium;
            }

            public AvatarLargeBean getAvatar_large() {
                return avatar_large;
            }

            public void setAvatar_large(AvatarLargeBean avatar_large) {
                this.avatar_large = avatar_large;
            }

            public int getPreview_start_time() {
                return preview_start_time;
            }

            public void setPreview_start_time(int preview_start_time) {
                this.preview_start_time = preview_start_time;
            }

            public int getPreview_end_time() {
                return preview_end_time;
            }

            public void setPreview_end_time(int preview_end_time) {
                this.preview_end_time = preview_end_time;
            }

            public boolean isIs_commerce_music() {
                return is_commerce_music;
            }

            public void setIs_commerce_music(boolean is_commerce_music) {
                this.is_commerce_music = is_commerce_music;
            }

            public boolean isIs_original_sound() {
                return is_original_sound;
            }

            public void setIs_original_sound(boolean is_original_sound) {
                this.is_original_sound = is_original_sound;
            }

            public Object getArtists() {
                return artists;
            }

            public void setArtists(Object artists) {
                this.artists = artists;
            }

            public Object getLyric_short_position() {
                return lyric_short_position;
            }

            public void setLyric_short_position(Object lyric_short_position) {
                this.lyric_short_position = lyric_short_position;
            }

            public boolean isMute_share() {
                return mute_share;
            }

            public void setMute_share(boolean mute_share) {
                this.mute_share = mute_share;
            }

            public Object getTag_list() {
                return tag_list;
            }

            public void setTag_list(Object tag_list) {
                this.tag_list = tag_list;
            }

            public boolean isIs_author_artist() {
                return is_author_artist;
            }

            public void setIs_author_artist(boolean is_author_artist) {
                this.is_author_artist = is_author_artist;
            }

            public List<?> getExternal_song_info() {
                return external_song_info;
            }

            public void setExternal_song_info(List<?> external_song_info) {
                this.external_song_info = external_song_info;
            }

            public static class CoverHdBean {
                /**
                 * uri : 172870001bde3b09e8995
                 * url_list : ["https://p9-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverLargeBean {
                /**
                 * uri : 172870001bde3b09e8995
                 * url_list : ["https://p9-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverMediumBean {
                /**
                 * uri : 172870001bde3b09e8995
                 * url_list : ["https://p9-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverThumbBean {
                /**
                 * uri : 172870001bde3b09e8995
                 * url_list : ["https://p9-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class PlayUrlBean {
                /**
                 * uri : http://p9-dy.byteimg.com/obj/ies-music/1658406906543160.mp3
                 * url_list : ["http://p9-dy.byteimg.com/obj/ies-music/1658406906543160.mp3","http://p3-dy.byteimg.com/obj/ies-music/1658406906543160.mp3"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class StrongBeatUrlBean {
                /**
                 * uri : http://p1-dy.byteimg.com/obj/ies-music/strong_beat/1658415414723597
                 * url_list : ["http://p1-dy.byteimg.com/obj/ies-music/strong_beat/1658415414723597","http://p3-dy.byteimg.com/obj/ies-music/strong_beat/1658415414723597"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class AvatarThumbBeanX {
                /**
                 * uri : 172870001bde3b09e8995
                 * url_list : ["https://p9-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/100x100/172870001bde3b09e8995.jpeg"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class AvatarMediumBeanX {
                /**
                 * uri : 172870001bde3b09e8995
                 * url_list : ["https://p9-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/720x720/172870001bde3b09e8995.jpeg"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class AvatarLargeBean {
                /**
                 * uri : 172870001bde3b09e8995
                 * url_list : ["https://p9-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p3-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg","https://p29-dy.byteimg.com/aweme/1080x1080/172870001bde3b09e8995.jpeg"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }
        }

        public static class VideoBean {
            /**
             * play_addr : {"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["http://v6-dy.ixigua.com/d7956e651fa169306a4a3821163ed149/5e453c39/video/tos/cn/tos-cn-ve-15/9b9a16dafc714fe3968ae56f0f9d0eed/?a=1128&br=0&bt=1983&cr=3&cs=0&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=0&rc=M3lsOGdzNjRqczMzPGkzM0ApZjw5aDplNGQ0Nzg8NzpmPGdwZS9uMmBzZy9fLS1fLS9zcy8vNGBhLzM2LzZeNjYyLTU6Yw%3D%3D","http://v26-dy.ixigua.com/236b6d304dbb7f0c4ef4467dba6fd9ac/5e453c39/video/tos/cn/tos-cn-ve-15/9b9a16dafc714fe3968ae56f0f9d0eed/?a=1128&br=0&bt=1983&cr=3&cs=0&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=0&rc=M3lsOGdzNjRqczMzPGkzM0ApZjw5aDplNGQ0Nzg8NzpmPGdwZS9uMmBzZy9fLS1fLS9zcy8vNGBhLzM2LzZeNjYyLTU6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720,"height":720,"url_key":"v0200fb90000bp2gj1v3cp5dq52ihvs0_h264_540p_2031448","data_size":25803209}
             * cover : {"uri":"large/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976","url_list":["http://p9-dy.byteimg.com/large/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976.jpeg?from=2563711402","http://p1-dy.byteimg.com/large/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976.jpeg?from=2563711402","http://p3-dy.byteimg.com/large/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976.jpeg?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976~tplv-dy-360p.jpeg?from=2563711402_360p"],"width":720,"height":720}
             * height : 1024
             * width : 576
             * dynamic_cover : {"uri":"tos-cn-p-0015/30630670e5234418a67ce03fc9123ff9_1581582927","url_list":["https://p3-dy.byteimg.com/obj/tos-cn-p-0015/30630670e5234418a67ce03fc9123ff9_1581582927?from=2563711402","https://p1-dy.byteimg.com/obj/tos-cn-p-0015/30630670e5234418a67ce03fc9123ff9_1581582927?from=2563711402","https://p9-dy.byteimg.com/obj/tos-cn-p-0015/30630670e5234418a67ce03fc9123ff9_1581582927?from=2563711402"],"width":720,"height":720}
             * origin_cover : {"uri":"large/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926","url_list":["http://p9-dy.byteimg.com/large/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926.jpeg?from=2563711402","http://p1-dy.byteimg.com/large/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926.jpeg?from=2563711402","http://p3-dy.byteimg.com/large/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926.jpeg?from=2563711402","https://p3-dy.byteimg.com/img/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926~tplv-dy-360p.jpeg?from=2563711402_360p"],"width":720,"height":720}
             * ratio : 540p
             * download_addr : {"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&quality_type=11&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&quality_type=11&source=PackSourceEnum_FEED"],"width":720,"height":720,"data_size":41910005}
             * has_watermark : true
             * play_addr_lowbr : {"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["http://v6-dy.ixigua.com/d7956e651fa169306a4a3821163ed149/5e453c39/video/tos/cn/tos-cn-ve-15/9b9a16dafc714fe3968ae56f0f9d0eed/?a=1128&br=0&bt=1983&cr=3&cs=0&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=0&rc=M3lsOGdzNjRqczMzPGkzM0ApZjw5aDplNGQ0Nzg8NzpmPGdwZS9uMmBzZy9fLS1fLS9zcy8vNGBhLzM2LzZeNjYyLTU6Yw%3D%3D","http://v26-dy.ixigua.com/236b6d304dbb7f0c4ef4467dba6fd9ac/5e453c39/video/tos/cn/tos-cn-ve-15/9b9a16dafc714fe3968ae56f0f9d0eed/?a=1128&br=0&bt=1983&cr=3&cs=0&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=0&rc=M3lsOGdzNjRqczMzPGkzM0ApZjw5aDplNGQ0Nzg8NzpmPGdwZS9uMmBzZy9fLS1fLS9zcy8vNGBhLzM2LzZeNjYyLTU6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720,"height":720,"url_key":"v0200fb90000bp2gj1v3cp5dq52ihvs0_h264_540p_2031448","data_size":25803209}
             * bit_rate : [{"gear_name":"adapt_540","quality_type":28,"bit_rate":1337256,"play_addr":{"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["http://v6-dy.ixigua.com/61c15b8a19b3b7433e19d06386e1967b/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","http://v26-dy.ixigua.com/7754733861bff327b4c3926ac93cb5ab/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720,"height":720,"url_key":"v0200fb90000bp2gj1v3cp5dq52ihvs0_h265_540p_1337256","data_size":16985671},"is_h265":1,"play_addr_265":{"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["http://v6-dy.ixigua.com/61c15b8a19b3b7433e19d06386e1967b/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","http://v26-dy.ixigua.com/7754733861bff327b4c3926ac93cb5ab/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720,"height":720,"url_key":"v0200fb90000bp2gj1v3cp5dq52ihvs0_h265_540p_1337256","data_size":16985671}}]
             * duration : 101610
             * play_addr_265 : {"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["http://v6-dy.ixigua.com/61c15b8a19b3b7433e19d06386e1967b/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","http://v26-dy.ixigua.com/7754733861bff327b4c3926ac93cb5ab/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720,"height":720,"url_key":"v0200fb90000bp2gj1v3cp5dq52ihvs0_h265_540p_1337256","data_size":16985671}
             * is_h265 : 0
             * play_addr_h264 : {"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED"],"width":720,"height":720,"url_key":"v0200fb90000bp2gj1v3cp5dq52ihvs0_h264_540p_2031448","data_size":25803209}
             * cdn_url_expired : 0
             */

            private PlayAddrBean play_addr;
            private CoverBean cover;
            private int height;
            private int width;
            private DynamicCoverBean dynamic_cover;
            private OriginCoverBean origin_cover;
            private String ratio;
            private DownloadAddrBean download_addr;
            private boolean has_watermark;
            private PlayAddrLowbrBean play_addr_lowbr;
            private int duration;
            private PlayAddr265Bean play_addr_265;
            private int is_h265;
            private PlayAddrH264Bean play_addr_h264;
            private int cdn_url_expired;
            private List<BitRateBean> bit_rate;

            public PlayAddrBean getPlay_addr() {
                return play_addr;
            }

            public void setPlay_addr(PlayAddrBean play_addr) {
                this.play_addr = play_addr;
            }

            public CoverBean getCover() {
                return cover;
            }

            public void setCover(CoverBean cover) {
                this.cover = cover;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public DynamicCoverBean getDynamic_cover() {
                return dynamic_cover;
            }

            public void setDynamic_cover(DynamicCoverBean dynamic_cover) {
                this.dynamic_cover = dynamic_cover;
            }

            public OriginCoverBean getOrigin_cover() {
                return origin_cover;
            }

            public void setOrigin_cover(OriginCoverBean origin_cover) {
                this.origin_cover = origin_cover;
            }

            public String getRatio() {
                return ratio;
            }

            public void setRatio(String ratio) {
                this.ratio = ratio;
            }

            public DownloadAddrBean getDownload_addr() {
                return download_addr;
            }

            public void setDownload_addr(DownloadAddrBean download_addr) {
                this.download_addr = download_addr;
            }

            public boolean isHas_watermark() {
                return has_watermark;
            }

            public void setHas_watermark(boolean has_watermark) {
                this.has_watermark = has_watermark;
            }

            public PlayAddrLowbrBean getPlay_addr_lowbr() {
                return play_addr_lowbr;
            }

            public void setPlay_addr_lowbr(PlayAddrLowbrBean play_addr_lowbr) {
                this.play_addr_lowbr = play_addr_lowbr;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public PlayAddr265Bean getPlay_addr_265() {
                return play_addr_265;
            }

            public void setPlay_addr_265(PlayAddr265Bean play_addr_265) {
                this.play_addr_265 = play_addr_265;
            }

            public int getIs_h265() {
                return is_h265;
            }

            public void setIs_h265(int is_h265) {
                this.is_h265 = is_h265;
            }

            public PlayAddrH264Bean getPlay_addr_h264() {
                return play_addr_h264;
            }

            public void setPlay_addr_h264(PlayAddrH264Bean play_addr_h264) {
                this.play_addr_h264 = play_addr_h264;
            }

            public int getCdn_url_expired() {
                return cdn_url_expired;
            }

            public void setCdn_url_expired(int cdn_url_expired) {
                this.cdn_url_expired = cdn_url_expired;
            }

            public List<BitRateBean> getBit_rate() {
                return bit_rate;
            }

            public void setBit_rate(List<BitRateBean> bit_rate) {
                this.bit_rate = bit_rate;
            }

            public static class PlayAddrBean {
                /**
                 * uri : v0200fb90000bp2gj1v3cp5dq52ihvs0
                 * url_list : ["http://v6-dy.ixigua.com/d7956e651fa169306a4a3821163ed149/5e453c39/video/tos/cn/tos-cn-ve-15/9b9a16dafc714fe3968ae56f0f9d0eed/?a=1128&br=0&bt=1983&cr=3&cs=0&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=0&rc=M3lsOGdzNjRqczMzPGkzM0ApZjw5aDplNGQ0Nzg8NzpmPGdwZS9uMmBzZy9fLS1fLS9zcy8vNGBhLzM2LzZeNjYyLTU6Yw%3D%3D","http://v26-dy.ixigua.com/236b6d304dbb7f0c4ef4467dba6fd9ac/5e453c39/video/tos/cn/tos-cn-ve-15/9b9a16dafc714fe3968ae56f0f9d0eed/?a=1128&br=0&bt=1983&cr=3&cs=0&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=0&rc=M3lsOGdzNjRqczMzPGkzM0ApZjw5aDplNGQ0Nzg8NzpmPGdwZS9uMmBzZy9fLS1fLS9zcy8vNGBhLzM2LzZeNjYyLTU6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"]
                 * width : 720
                 * height : 720
                 * url_key : v0200fb90000bp2gj1v3cp5dq52ihvs0_h264_540p_2031448
                 * data_size : 25803209
                 */

                private String uri;
                private int width;
                private int height;
                private String url_key;
                private int data_size;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUrl_key() {
                    return url_key;
                }

                public void setUrl_key(String url_key) {
                    this.url_key = url_key;
                }

                public int getData_size() {
                    return data_size;
                }

                public void setData_size(int data_size) {
                    this.data_size = data_size;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverBean {
                /**
                 * uri : large/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976
                 * url_list : ["http://p9-dy.byteimg.com/large/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976.jpeg?from=2563711402","http://p1-dy.byteimg.com/large/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976.jpeg?from=2563711402","http://p3-dy.byteimg.com/large/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976.jpeg?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-p-0015/aa68dbdc8889404d8d1e4e29b6d66805_1581582976~tplv-dy-360p.jpeg?from=2563711402_360p"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class DynamicCoverBean {
                /**
                 * uri : tos-cn-p-0015/30630670e5234418a67ce03fc9123ff9_1581582927
                 * url_list : ["https://p3-dy.byteimg.com/obj/tos-cn-p-0015/30630670e5234418a67ce03fc9123ff9_1581582927?from=2563711402","https://p1-dy.byteimg.com/obj/tos-cn-p-0015/30630670e5234418a67ce03fc9123ff9_1581582927?from=2563711402","https://p9-dy.byteimg.com/obj/tos-cn-p-0015/30630670e5234418a67ce03fc9123ff9_1581582927?from=2563711402"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class OriginCoverBean {
                /**
                 * uri : large/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926
                 * url_list : ["http://p9-dy.byteimg.com/large/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926.jpeg?from=2563711402","http://p1-dy.byteimg.com/large/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926.jpeg?from=2563711402","http://p3-dy.byteimg.com/large/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926.jpeg?from=2563711402","https://p3-dy.byteimg.com/img/tos-cn-p-0015/27dd71188dcf465b989802916c79dbf4_1581582926~tplv-dy-360p.jpeg?from=2563711402_360p"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class DownloadAddrBean {
                /**
                 * uri : v0200fb90000bp2gj1v3cp5dq52ihvs0
                 * url_list : ["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&quality_type=11&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&quality_type=11&source=PackSourceEnum_FEED"]
                 * width : 720
                 * height : 720
                 * data_size : 41910005
                 */

                private String uri;
                private int width;
                private int height;
                private int data_size;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getData_size() {
                    return data_size;
                }

                public void setData_size(int data_size) {
                    this.data_size = data_size;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class PlayAddrLowbrBean {
                /**
                 * uri : v0200fb90000bp2gj1v3cp5dq52ihvs0
                 * url_list : ["http://v6-dy.ixigua.com/d7956e651fa169306a4a3821163ed149/5e453c39/video/tos/cn/tos-cn-ve-15/9b9a16dafc714fe3968ae56f0f9d0eed/?a=1128&br=0&bt=1983&cr=3&cs=0&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=0&rc=M3lsOGdzNjRqczMzPGkzM0ApZjw5aDplNGQ0Nzg8NzpmPGdwZS9uMmBzZy9fLS1fLS9zcy8vNGBhLzM2LzZeNjYyLTU6Yw%3D%3D","http://v26-dy.ixigua.com/236b6d304dbb7f0c4ef4467dba6fd9ac/5e453c39/video/tos/cn/tos-cn-ve-15/9b9a16dafc714fe3968ae56f0f9d0eed/?a=1128&br=0&bt=1983&cr=3&cs=0&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=0&rc=M3lsOGdzNjRqczMzPGkzM0ApZjw5aDplNGQ0Nzg8NzpmPGdwZS9uMmBzZy9fLS1fLS9zcy8vNGBhLzM2LzZeNjYyLTU6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"]
                 * width : 720
                 * height : 720
                 * url_key : v0200fb90000bp2gj1v3cp5dq52ihvs0_h264_540p_2031448
                 * data_size : 25803209
                 */

                private String uri;
                private int width;
                private int height;
                private String url_key;
                private int data_size;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUrl_key() {
                    return url_key;
                }

                public void setUrl_key(String url_key) {
                    this.url_key = url_key;
                }

                public int getData_size() {
                    return data_size;
                }

                public void setData_size(int data_size) {
                    this.data_size = data_size;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class PlayAddr265Bean {
                /**
                 * uri : v0200fb90000bp2gj1v3cp5dq52ihvs0
                 * url_list : ["http://v6-dy.ixigua.com/61c15b8a19b3b7433e19d06386e1967b/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","http://v26-dy.ixigua.com/7754733861bff327b4c3926ac93cb5ab/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"]
                 * width : 720
                 * height : 720
                 * url_key : v0200fb90000bp2gj1v3cp5dq52ihvs0_h265_540p_1337256
                 * data_size : 16985671
                 */

                private String uri;
                private int width;
                private int height;
                private String url_key;
                private int data_size;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUrl_key() {
                    return url_key;
                }

                public void setUrl_key(String url_key) {
                    this.url_key = url_key;
                }

                public int getData_size() {
                    return data_size;
                }

                public void setData_size(int data_size) {
                    this.data_size = data_size;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class PlayAddrH264Bean {
                /**
                 * uri : v0200fb90000bp2gj1v3cp5dq52ihvs0
                 * url_list : ["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED"]
                 * width : 720
                 * height : 720
                 * url_key : v0200fb90000bp2gj1v3cp5dq52ihvs0_h264_540p_2031448
                 * data_size : 25803209
                 */

                private String uri;
                private int width;
                private int height;
                private String url_key;
                private int data_size;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUrl_key() {
                    return url_key;
                }

                public void setUrl_key(String url_key) {
                    this.url_key = url_key;
                }

                public int getData_size() {
                    return data_size;
                }

                public void setData_size(int data_size) {
                    this.data_size = data_size;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class BitRateBean {
                /**
                 * gear_name : adapt_540
                 * quality_type : 28
                 * bit_rate : 1337256
                 * play_addr : {"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["http://v6-dy.ixigua.com/61c15b8a19b3b7433e19d06386e1967b/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","http://v26-dy.ixigua.com/7754733861bff327b4c3926ac93cb5ab/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720,"height":720,"url_key":"v0200fb90000bp2gj1v3cp5dq52ihvs0_h265_540p_1337256","data_size":16985671}
                 * is_h265 : 1
                 * play_addr_265 : {"uri":"v0200fb90000bp2gj1v3cp5dq52ihvs0","url_list":["http://v6-dy.ixigua.com/61c15b8a19b3b7433e19d06386e1967b/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","http://v26-dy.ixigua.com/7754733861bff327b4c3926ac93cb5ab/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720,"height":720,"url_key":"v0200fb90000bp2gj1v3cp5dq52ihvs0_h265_540p_1337256","data_size":16985671}
                 */

                private String gear_name;
                private int quality_type;
                private int bit_rate;
                private PlayAddrBeanX play_addr;
                private int is_h265;
                private PlayAddr265BeanX play_addr_265;

                public String getGear_name() {
                    return gear_name;
                }

                public void setGear_name(String gear_name) {
                    this.gear_name = gear_name;
                }

                public int getQuality_type() {
                    return quality_type;
                }

                public void setQuality_type(int quality_type) {
                    this.quality_type = quality_type;
                }

                public int getBit_rate() {
                    return bit_rate;
                }

                public void setBit_rate(int bit_rate) {
                    this.bit_rate = bit_rate;
                }

                public PlayAddrBeanX getPlay_addr() {
                    return play_addr;
                }

                public void setPlay_addr(PlayAddrBeanX play_addr) {
                    this.play_addr = play_addr;
                }

                public int getIs_h265() {
                    return is_h265;
                }

                public void setIs_h265(int is_h265) {
                    this.is_h265 = is_h265;
                }

                public PlayAddr265BeanX getPlay_addr_265() {
                    return play_addr_265;
                }

                public void setPlay_addr_265(PlayAddr265BeanX play_addr_265) {
                    this.play_addr_265 = play_addr_265;
                }

                public static class PlayAddrBeanX {
                    /**
                     * uri : v0200fb90000bp2gj1v3cp5dq52ihvs0
                     * url_list : ["http://v6-dy.ixigua.com/61c15b8a19b3b7433e19d06386e1967b/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","http://v26-dy.ixigua.com/7754733861bff327b4c3926ac93cb5ab/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"]
                     * width : 720
                     * height : 720
                     * url_key : v0200fb90000bp2gj1v3cp5dq52ihvs0_h265_540p_1337256
                     * data_size : 16985671
                     */

                    private String uri;
                    private int width;
                    private int height;
                    private String url_key;
                    private int data_size;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getUrl_key() {
                        return url_key;
                    }

                    public void setUrl_key(String url_key) {
                        this.url_key = url_key;
                    }

                    public int getData_size() {
                        return data_size;
                    }

                    public void setData_size(int data_size) {
                        this.data_size = data_size;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class PlayAddr265BeanX {
                    /**
                     * uri : v0200fb90000bp2gj1v3cp5dq52ihvs0
                     * url_list : ["http://v6-dy.ixigua.com/61c15b8a19b3b7433e19d06386e1967b/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","http://v26-dy.ixigua.com/7754733861bff327b4c3926ac93cb5ab/5e453c39/video/tos/cn/tos-cn-ve-15/445d73c756a04278a39bdb1006c8bc1e/?a=1128&br=0&bt=1305&cr=3&cs=2&dr=0&ds=6&er=&l=202002131906430100260781490827E832&lr=&qs=11&rc=M3lsOGdzNjRqczMzPGkzM0ApNTM1N2UzZDxkN2dmOjU4ZGdwZS9uMmBzZy9fLS1fLS9zczAuMjAvYmBhYzRfYWJeY2I6Yw%3D%3D","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200fb90000bp2gj1v3cp5dq52ihvs0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&h265=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"]
                     * width : 720
                     * height : 720
                     * url_key : v0200fb90000bp2gj1v3cp5dq52ihvs0_h265_540p_1337256
                     * data_size : 16985671
                     */

                    private String uri;
                    private int width;
                    private int height;
                    private String url_key;
                    private int data_size;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getUrl_key() {
                        return url_key;
                    }

                    public void setUrl_key(String url_key) {
                        this.url_key = url_key;
                    }

                    public int getData_size() {
                        return data_size;
                    }

                    public void setData_size(int data_size) {
                        this.data_size = data_size;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }
            }
        }

        public static class StatisticsBean {
            /**
             * aweme_id : 6792846210706312461
             * comment_count : 10824
             * digg_count : 341737
             * download_count : 2192
             * play_count : 0
             * share_count : 1821
             * forward_count : 8
             * lose_count : 0
             * lose_comment_count : 0
             */

            private String aweme_id;
            private int comment_count;
            private int digg_count;
            private int download_count;
            private int play_count;
            private int share_count;
            private int forward_count;
            private int lose_count;
            private int lose_comment_count;

            public String getAweme_id() {
                return aweme_id;
            }

            public void setAweme_id(String aweme_id) {
                this.aweme_id = aweme_id;
            }

            public int getComment_count() {
                return comment_count;
            }

            public void setComment_count(int comment_count) {
                this.comment_count = comment_count;
            }

            public int getDigg_count() {
                return digg_count;
            }

            public void setDigg_count(int digg_count) {
                this.digg_count = digg_count;
            }

            public int getDownload_count() {
                return download_count;
            }

            public void setDownload_count(int download_count) {
                this.download_count = download_count;
            }

            public int getPlay_count() {
                return play_count;
            }

            public void setPlay_count(int play_count) {
                this.play_count = play_count;
            }

            public int getShare_count() {
                return share_count;
            }

            public void setShare_count(int share_count) {
                this.share_count = share_count;
            }

            public int getForward_count() {
                return forward_count;
            }

            public void setForward_count(int forward_count) {
                this.forward_count = forward_count;
            }

            public int getLose_count() {
                return lose_count;
            }

            public void setLose_count(int lose_count) {
                this.lose_count = lose_count;
            }

            public int getLose_comment_count() {
                return lose_comment_count;
            }

            public void setLose_comment_count(int lose_comment_count) {
                this.lose_comment_count = lose_comment_count;
            }
        }

        public static class StatusBean {
            /**
             * aweme_id : 6792846210706312461
             * is_delete : false
             * allow_share : true
             * allow_comment : true
             * is_private : false
             * with_goods : false
             * private_status : 0
             * with_fusion_goods : false
             * in_reviewing : false
             * reviewed : 1
             * self_see : false
             * is_prohibited : false
             * download_status : 0
             */

            private String aweme_id;
            private boolean is_delete;
            private boolean allow_share;
            private boolean allow_comment;
            private boolean is_private;
            private boolean with_goods;
            private int private_status;
            private boolean with_fusion_goods;
            private boolean in_reviewing;
            private int reviewed;
            private boolean self_see;
            private boolean is_prohibited;
            private int download_status;

            public String getAweme_id() {
                return aweme_id;
            }

            public void setAweme_id(String aweme_id) {
                this.aweme_id = aweme_id;
            }

            public boolean isIs_delete() {
                return is_delete;
            }

            public void setIs_delete(boolean is_delete) {
                this.is_delete = is_delete;
            }

            public boolean isAllow_share() {
                return allow_share;
            }

            public void setAllow_share(boolean allow_share) {
                this.allow_share = allow_share;
            }

            public boolean isAllow_comment() {
                return allow_comment;
            }

            public void setAllow_comment(boolean allow_comment) {
                this.allow_comment = allow_comment;
            }

            public boolean isIs_private() {
                return is_private;
            }

            public void setIs_private(boolean is_private) {
                this.is_private = is_private;
            }

            public boolean isWith_goods() {
                return with_goods;
            }

            public void setWith_goods(boolean with_goods) {
                this.with_goods = with_goods;
            }

            public int getPrivate_status() {
                return private_status;
            }

            public void setPrivate_status(int private_status) {
                this.private_status = private_status;
            }

            public boolean isWith_fusion_goods() {
                return with_fusion_goods;
            }

            public void setWith_fusion_goods(boolean with_fusion_goods) {
                this.with_fusion_goods = with_fusion_goods;
            }

            public boolean isIn_reviewing() {
                return in_reviewing;
            }

            public void setIn_reviewing(boolean in_reviewing) {
                this.in_reviewing = in_reviewing;
            }

            public int getReviewed() {
                return reviewed;
            }

            public void setReviewed(int reviewed) {
                this.reviewed = reviewed;
            }

            public boolean isSelf_see() {
                return self_see;
            }

            public void setSelf_see(boolean self_see) {
                this.self_see = self_see;
            }

            public boolean isIs_prohibited() {
                return is_prohibited;
            }

            public void setIs_prohibited(boolean is_prohibited) {
                this.is_prohibited = is_prohibited;
            }

            public int getDownload_status() {
                return download_status;
            }

            public void setDownload_status(int download_status) {
                this.download_status = download_status;
            }
        }

        public static class LabelTopBean {
            /**
             * uri : c150000f34767e2cb56
             * url_list : ["https://p9-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p1-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p3-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402"]
             * width : 720
             * height : 720
             */

            private String uri;
            private int width;
            private int height;
            private List<String> url_list;

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public List<String> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<String> url_list) {
                this.url_list = url_list;
            }
        }

        public static class ShareInfoBeanX {
            /**
             * share_url : https://www.iesdouyin.com/share/video/6792846210706312461/?region=CN&mid=6792832286218357511&u_code=11hm6d42m&titleType=title
             * share_weibo_desc : #在抖音，记录美好生活#(2/12/20)其实是昨天应该发的视频 #酱式vlog
             * share_desc : 在抖音，记录美好生活
             * share_title : (2/12/20)其实是昨天应该发的视频 #酱式vlog
             * bool_persist : 0
             * share_title_myself :
             * share_title_other :
             * share_link_desc : #在抖音，记录美好生活#(2/12/20)其实是昨天应该发的视频 #酱式vlog %s 复制此链接，打开【抖音短视频】，直接观看视频！
             * share_signature_url : https://tiktokv.com/
             * share_signature_desc : TikTok: Make Every Second Count
             * share_quote :
             */

            private String share_url;
            private String share_weibo_desc;
            private String share_desc;
            private String share_title;
            private int bool_persist;
            private String share_title_myself;
            private String share_title_other;
            private String share_link_desc;
            private String share_signature_url;
            private String share_signature_desc;
            private String share_quote;

            public String getShare_url() {
                return share_url;
            }

            public void setShare_url(String share_url) {
                this.share_url = share_url;
            }

            public String getShare_weibo_desc() {
                return share_weibo_desc;
            }

            public void setShare_weibo_desc(String share_weibo_desc) {
                this.share_weibo_desc = share_weibo_desc;
            }

            public String getShare_desc() {
                return share_desc;
            }

            public void setShare_desc(String share_desc) {
                this.share_desc = share_desc;
            }

            public String getShare_title() {
                return share_title;
            }

            public void setShare_title(String share_title) {
                this.share_title = share_title;
            }

            public int getBool_persist() {
                return bool_persist;
            }

            public void setBool_persist(int bool_persist) {
                this.bool_persist = bool_persist;
            }

            public String getShare_title_myself() {
                return share_title_myself;
            }

            public void setShare_title_myself(String share_title_myself) {
                this.share_title_myself = share_title_myself;
            }

            public String getShare_title_other() {
                return share_title_other;
            }

            public void setShare_title_other(String share_title_other) {
                this.share_title_other = share_title_other;
            }

            public String getShare_link_desc() {
                return share_link_desc;
            }

            public void setShare_link_desc(String share_link_desc) {
                this.share_link_desc = share_link_desc;
            }

            public String getShare_signature_url() {
                return share_signature_url;
            }

            public void setShare_signature_url(String share_signature_url) {
                this.share_signature_url = share_signature_url;
            }

            public String getShare_signature_desc() {
                return share_signature_desc;
            }

            public void setShare_signature_desc(String share_signature_desc) {
                this.share_signature_desc = share_signature_desc;
            }

            public String getShare_quote() {
                return share_quote;
            }

            public void setShare_quote(String share_quote) {
                this.share_quote = share_quote;
            }
        }

        public static class RiskInfosBean {
            /**
             * vote : false
             * warn : false
             * risk_sink : false
             * type : 0
             * content :
             */

            private boolean vote;
            private boolean warn;
            private boolean risk_sink;
            private int type;
            private String content;

            public boolean isVote() {
                return vote;
            }

            public void setVote(boolean vote) {
                this.vote = vote;
            }

            public boolean isWarn() {
                return warn;
            }

            public void setWarn(boolean warn) {
                this.warn = warn;
            }

            public boolean isRisk_sink() {
                return risk_sink;
            }

            public void setRisk_sink(boolean risk_sink) {
                this.risk_sink = risk_sink;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }

        public static class XiguaTaskBean {
            /**
             * is_xigua_task : false
             */

            private boolean is_xigua_task;

            public boolean isIs_xigua_task() {
                return is_xigua_task;
            }

            public void setIs_xigua_task(boolean is_xigua_task) {
                this.is_xigua_task = is_xigua_task;
            }
        }

        public static class VideoControlBean {
            /**
             * allow_download : true
             * share_type : 1
             * show_progress_bar : 1
             * draft_progress_bar : 1
             * allow_duet : false
             * allow_react : false
             * prevent_download_type : 0
             * allow_dynamic_wallpaper : false
             * timer_status : 1
             */

            private boolean allow_download;
            private int share_type;
            private int show_progress_bar;
            private int draft_progress_bar;
            private boolean allow_duet;
            private boolean allow_react;
            private int prevent_download_type;
            private boolean allow_dynamic_wallpaper;
            private int timer_status;

            public boolean isAllow_download() {
                return allow_download;
            }

            public void setAllow_download(boolean allow_download) {
                this.allow_download = allow_download;
            }

            public int getShare_type() {
                return share_type;
            }

            public void setShare_type(int share_type) {
                this.share_type = share_type;
            }

            public int getShow_progress_bar() {
                return show_progress_bar;
            }

            public void setShow_progress_bar(int show_progress_bar) {
                this.show_progress_bar = show_progress_bar;
            }

            public int getDraft_progress_bar() {
                return draft_progress_bar;
            }

            public void setDraft_progress_bar(int draft_progress_bar) {
                this.draft_progress_bar = draft_progress_bar;
            }

            public boolean isAllow_duet() {
                return allow_duet;
            }

            public void setAllow_duet(boolean allow_duet) {
                this.allow_duet = allow_duet;
            }

            public boolean isAllow_react() {
                return allow_react;
            }

            public void setAllow_react(boolean allow_react) {
                this.allow_react = allow_react;
            }

            public int getPrevent_download_type() {
                return prevent_download_type;
            }

            public void setPrevent_download_type(int prevent_download_type) {
                this.prevent_download_type = prevent_download_type;
            }

            public boolean isAllow_dynamic_wallpaper() {
                return allow_dynamic_wallpaper;
            }

            public void setAllow_dynamic_wallpaper(boolean allow_dynamic_wallpaper) {
                this.allow_dynamic_wallpaper = allow_dynamic_wallpaper;
            }

            public int getTimer_status() {
                return timer_status;
            }

            public void setTimer_status(int timer_status) {
                this.timer_status = timer_status;
            }
        }

        public static class AwemeControlBean {
            /**
             * can_forward : true
             * can_share : true
             * can_comment : true
             * can_show_comment : true
             */

            private boolean can_forward;
            private boolean can_share;
            private boolean can_comment;
            private boolean can_show_comment;

            public boolean isCan_forward() {
                return can_forward;
            }

            public void setCan_forward(boolean can_forward) {
                this.can_forward = can_forward;
            }

            public boolean isCan_share() {
                return can_share;
            }

            public void setCan_share(boolean can_share) {
                this.can_share = can_share;
            }

            public boolean isCan_comment() {
                return can_comment;
            }

            public void setCan_comment(boolean can_comment) {
                this.can_comment = can_comment;
            }

            public boolean isCan_show_comment() {
                return can_show_comment;
            }

            public void setCan_show_comment(boolean can_show_comment) {
                this.can_show_comment = can_show_comment;
            }
        }

        public static class DescendantsBean {
            /**
             * platforms : ["toutiao"]
             * notify_msg : 头条
             */

            private String notify_msg;
            private List<String> platforms;

            public String getNotify_msg() {
                return notify_msg;
            }

            public void setNotify_msg(String notify_msg) {
                this.notify_msg = notify_msg;
            }

            public List<String> getPlatforms() {
                return platforms;
            }

            public void setPlatforms(List<String> platforms) {
                this.platforms = platforms;
            }
        }

        public static class StarAtlasInfoBean {
            /**
             * link_info : {"id":"10102","title":"找小姐姐打游戏，就上比心APP","sub_title":"比心APP","avatar_icon":{"uri":"daea0011e9c832dd395c","url_list":["https://p9-dy.byteimg.com/obj/daea0011e9c832dd395c?from=2563711402","https://p29-dy.byteimg.com/obj/daea0011e9c832dd395c?from=2563711402","https://p1-dy.byteimg.com/obj/daea0011e9c832dd395c?from=2563711402"],"width":720,"height":720},"web_url":"https://h5.hibixin.com/pandora/152","open_url":""}
             */

            private LinkInfoBean link_info;

            public LinkInfoBean getLink_info() {
                return link_info;
            }

            public void setLink_info(LinkInfoBean link_info) {
                this.link_info = link_info;
            }

            public static class LinkInfoBean {
                /**
                 * id : 10102
                 * title : 找小姐姐打游戏，就上比心APP
                 * sub_title : 比心APP
                 * avatar_icon : {"uri":"daea0011e9c832dd395c","url_list":["https://p9-dy.byteimg.com/obj/daea0011e9c832dd395c?from=2563711402","https://p29-dy.byteimg.com/obj/daea0011e9c832dd395c?from=2563711402","https://p1-dy.byteimg.com/obj/daea0011e9c832dd395c?from=2563711402"],"width":720,"height":720}
                 * web_url : https://h5.hibixin.com/pandora/152
                 * open_url :
                 */

                private String id;
                private String title;
                private String sub_title;
                private AvatarIconBean avatar_icon;
                private String web_url;
                private String open_url;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getSub_title() {
                    return sub_title;
                }

                public void setSub_title(String sub_title) {
                    this.sub_title = sub_title;
                }

                public AvatarIconBean getAvatar_icon() {
                    return avatar_icon;
                }

                public void setAvatar_icon(AvatarIconBean avatar_icon) {
                    this.avatar_icon = avatar_icon;
                }

                public String getWeb_url() {
                    return web_url;
                }

                public void setWeb_url(String web_url) {
                    this.web_url = web_url;
                }

                public String getOpen_url() {
                    return open_url;
                }

                public void setOpen_url(String open_url) {
                    this.open_url = open_url;
                }

                public static class AvatarIconBean {
                    /**
                     * uri : daea0011e9c832dd395c
                     * url_list : ["https://p9-dy.byteimg.com/obj/daea0011e9c832dd395c?from=2563711402","https://p29-dy.byteimg.com/obj/daea0011e9c832dd395c?from=2563711402","https://p1-dy.byteimg.com/obj/daea0011e9c832dd395c?from=2563711402"]
                     * width : 720
                     * height : 720
                     */

                    private String uri;
                    private int width;
                    private int height;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }
            }
        }

        public static class CommerceInfoBean {
            /**
             * avoid_global_pendant : true
             */

            private boolean avoid_global_pendant;

            public boolean isAvoid_global_pendant() {
                return avoid_global_pendant;
            }

            public void setAvoid_global_pendant(boolean avoid_global_pendant) {
                this.avoid_global_pendant = avoid_global_pendant;
            }
        }

        public static class RawAdDataBean {
            /**
             * ad_id : 1658301421427739
             * ad_source_type : 1
             * ad_tag_position : 2
             * animation_type : 1
             * avatar_url : http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202002115d0df4ff3f000aa24210a30a?from=ad
             * button_style : 1
             * button_text : 查看详情
             * click_track_url_list : {"uri":"","url_list":["http://e.cn.miaozhen.com/r/k=2155995&p=7X69X&dx=__IPDX__&rt=2&ns=106.121.137.174&ni=__IESID__&v=__LOC__&xa=__ADPLATFORM__&tr=202002131906430100260781490827E832&mo=0&m0=a03f240705e409ad&m0a=__DUID__&m1=a03f240705e409ad&m1a=9dea8fbe57a7382e825f0d19014c1a1f&m2=d817477c00e5c39344e361da7f7c400e&m4=__AAID__&m5=__IDFA__&m6=07c3d4db3ea7ef4c72f0aeefe25cd5ec&m6a=2ba10f5753f7e0736097f3c96ae0424a&m11=__OAID__&ls=40.0x116.3x100.0&o="]}
             * comment_area : {"avatar_icon":{"uri":"web.business.image/202002115d0df4ff3f000aa24210a30a","url_list":["http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202002115d0df4ff3f000aa24210a30a?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202002115d0df4ff3f000aa24210a30a?from=ad","http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202002115d0df4ff3f000aa24210a30a?from=ad"]},"button_text":"查看详情","comment_info":"跟NTC教练一起，把运动练到家。\n点击按钮预约健身直播课。2/12-2/18每晚8点见。","comment_nickname":"NIKE，把运动练到家","comment_time":1581523200,"show_button_number":10,"source":"NIKE，把运动练到家","title":"跟NTC教练一起，把运动练到家。\n点击按钮预约健身直播课。2/12-2/18每晚8点见。"}
             * comment_area_switch : true
             * creative_id : 1658301533509639
             * disable_show_ad_link : true
             * effective_play_time : 0
             * group_id : 6792109482185886984
             * is_preview : false
             * is_real_author : true
             * label : {"color":"#14FFFFFF","color_text":"#7FFFFFFF","text":"广告","type":4}
             * learn_more_bg_color : #8BCC00
             * log_extra : {"component_ids":[8,9,13,38],"convert_component_suspend":0,"convert_id":0,"is_pack_v2":true,"orit":40001,"placement":"unknown","req_id":"202002131906430100260781490827E832","rit":40001,"style_id":4916,"style_ids":[4916],"van_package":-1}
             * report_enable : true
             * show_button_seconds : 3
             * show_mask_times : 2
             * source : NIKE，把运动练到家
             * title : 跟NTC教练一起，把运动练到家。
             * 点击按钮预约健身直播课。2/12-2/18每晚8点见。
             * track_url_list : {"uri":"","url_list":["http://g.cn.miaozhen.com/x/k=2155995&p=7X69X&dx=__IPDX__&rt=2&ns=106.121.137.174&ni=__IESID__&v=__LOC__&xa=__ADPLATFORM__&tr=202002131906430100260781490827E832&vg=__AUTOPLAY__&nh=__AUTOREFRESH__&mo=0&m0=a03f240705e409ad&m0a=__DUID__&m1=a03f240705e409ad&m1a=9dea8fbe57a7382e825f0d19014c1a1f&m2=d817477c00e5c39344e361da7f7c400e&m4=__AAID__&m5=__IDFA__&m6=07c3d4db3ea7ef4c72f0aeefe25cd5ec&m6a=2ba10f5753f7e0736097f3c96ae0424a&m11=__OAID__&ls=40.0x116.3x100.0&o="]}
             * type : web
             * use_ordinary_web : true
             * video_transpose : 0
             * web_title : NIKE，把运动练到家
             * web_url : https://aweme.snssdk.com/magic/page/ejs/5e3ea590c3e6d5026a7a9d49?appType=douyin
             */

            private long ad_id;
            private int ad_source_type;
            private int ad_tag_position;
            private int animation_type;
            private String avatar_url;
            private int button_style;
            private String button_text;
            private ClickTrackUrlListBean click_track_url_list;
            private CommentAreaBean comment_area;
            private boolean comment_area_switch;
            private long creative_id;
            private boolean disable_show_ad_link;
            private int effective_play_time;
            private long group_id;
            private boolean is_preview;
            private boolean is_real_author;
            private LabelBean label;
            private String learn_more_bg_color;
            private String log_extra;
            private boolean report_enable;
            private int show_button_seconds;
            private int show_mask_times;
            private String source;
            private String title;
            private TrackUrlListBean track_url_list;
            private String type;
            private boolean use_ordinary_web;
            private int video_transpose;
            private String web_title;
            private String web_url;

            public long getAd_id() {
                return ad_id;
            }

            public void setAd_id(long ad_id) {
                this.ad_id = ad_id;
            }

            public int getAd_source_type() {
                return ad_source_type;
            }

            public void setAd_source_type(int ad_source_type) {
                this.ad_source_type = ad_source_type;
            }

            public int getAd_tag_position() {
                return ad_tag_position;
            }

            public void setAd_tag_position(int ad_tag_position) {
                this.ad_tag_position = ad_tag_position;
            }

            public int getAnimation_type() {
                return animation_type;
            }

            public void setAnimation_type(int animation_type) {
                this.animation_type = animation_type;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public int getButton_style() {
                return button_style;
            }

            public void setButton_style(int button_style) {
                this.button_style = button_style;
            }

            public String getButton_text() {
                return button_text;
            }

            public void setButton_text(String button_text) {
                this.button_text = button_text;
            }

            public ClickTrackUrlListBean getClick_track_url_list() {
                return click_track_url_list;
            }

            public void setClick_track_url_list(ClickTrackUrlListBean click_track_url_list) {
                this.click_track_url_list = click_track_url_list;
            }

            public CommentAreaBean getComment_area() {
                return comment_area;
            }

            public void setComment_area(CommentAreaBean comment_area) {
                this.comment_area = comment_area;
            }

            public boolean isComment_area_switch() {
                return comment_area_switch;
            }

            public void setComment_area_switch(boolean comment_area_switch) {
                this.comment_area_switch = comment_area_switch;
            }

            public long getCreative_id() {
                return creative_id;
            }

            public void setCreative_id(long creative_id) {
                this.creative_id = creative_id;
            }

            public boolean isDisable_show_ad_link() {
                return disable_show_ad_link;
            }

            public void setDisable_show_ad_link(boolean disable_show_ad_link) {
                this.disable_show_ad_link = disable_show_ad_link;
            }

            public int getEffective_play_time() {
                return effective_play_time;
            }

            public void setEffective_play_time(int effective_play_time) {
                this.effective_play_time = effective_play_time;
            }

            public long getGroup_id() {
                return group_id;
            }

            public void setGroup_id(long group_id) {
                this.group_id = group_id;
            }

            public boolean isIs_preview() {
                return is_preview;
            }

            public void setIs_preview(boolean is_preview) {
                this.is_preview = is_preview;
            }

            public boolean isIs_real_author() {
                return is_real_author;
            }

            public void setIs_real_author(boolean is_real_author) {
                this.is_real_author = is_real_author;
            }

            public LabelBean getLabel() {
                return label;
            }

            public void setLabel(LabelBean label) {
                this.label = label;
            }

            public String getLearn_more_bg_color() {
                return learn_more_bg_color;
            }

            public void setLearn_more_bg_color(String learn_more_bg_color) {
                this.learn_more_bg_color = learn_more_bg_color;
            }

            public String getLog_extra() {
                return log_extra;
            }

            public void setLog_extra(String log_extra) {
                this.log_extra = log_extra;
            }

            public boolean isReport_enable() {
                return report_enable;
            }

            public void setReport_enable(boolean report_enable) {
                this.report_enable = report_enable;
            }

            public int getShow_button_seconds() {
                return show_button_seconds;
            }

            public void setShow_button_seconds(int show_button_seconds) {
                this.show_button_seconds = show_button_seconds;
            }

            public int getShow_mask_times() {
                return show_mask_times;
            }

            public void setShow_mask_times(int show_mask_times) {
                this.show_mask_times = show_mask_times;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public TrackUrlListBean getTrack_url_list() {
                return track_url_list;
            }

            public void setTrack_url_list(TrackUrlListBean track_url_list) {
                this.track_url_list = track_url_list;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public boolean isUse_ordinary_web() {
                return use_ordinary_web;
            }

            public void setUse_ordinary_web(boolean use_ordinary_web) {
                this.use_ordinary_web = use_ordinary_web;
            }

            public int getVideo_transpose() {
                return video_transpose;
            }

            public void setVideo_transpose(int video_transpose) {
                this.video_transpose = video_transpose;
            }

            public String getWeb_title() {
                return web_title;
            }

            public void setWeb_title(String web_title) {
                this.web_title = web_title;
            }

            public String getWeb_url() {
                return web_url;
            }

            public void setWeb_url(String web_url) {
                this.web_url = web_url;
            }

            public static class ClickTrackUrlListBean {
                /**
                 * uri :
                 * url_list : ["http://e.cn.miaozhen.com/r/k=2155995&p=7X69X&dx=__IPDX__&rt=2&ns=106.121.137.174&ni=__IESID__&v=__LOC__&xa=__ADPLATFORM__&tr=202002131906430100260781490827E832&mo=0&m0=a03f240705e409ad&m0a=__DUID__&m1=a03f240705e409ad&m1a=9dea8fbe57a7382e825f0d19014c1a1f&m2=d817477c00e5c39344e361da7f7c400e&m4=__AAID__&m5=__IDFA__&m6=07c3d4db3ea7ef4c72f0aeefe25cd5ec&m6a=2ba10f5753f7e0736097f3c96ae0424a&m11=__OAID__&ls=40.0x116.3x100.0&o="]
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CommentAreaBean {
                /**
                 * avatar_icon : {"uri":"web.business.image/202002115d0df4ff3f000aa24210a30a","url_list":["http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202002115d0df4ff3f000aa24210a30a?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202002115d0df4ff3f000aa24210a30a?from=ad","http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202002115d0df4ff3f000aa24210a30a?from=ad"]}
                 * button_text : 查看详情
                 * comment_info : 跟NTC教练一起，把运动练到家。
                 * 点击按钮预约健身直播课。2/12-2/18每晚8点见。
                 * comment_nickname : NIKE，把运动练到家
                 * comment_time : 1581523200
                 * show_button_number : 10
                 * source : NIKE，把运动练到家
                 * title : 跟NTC教练一起，把运动练到家。
                 * 点击按钮预约健身直播课。2/12-2/18每晚8点见。
                 */

                private AvatarIconBeanX avatar_icon;
                private String button_text;
                private String comment_info;
                private String comment_nickname;
                private int comment_time;
                private int show_button_number;
                private String source;
                private String title;

                public AvatarIconBeanX getAvatar_icon() {
                    return avatar_icon;
                }

                public void setAvatar_icon(AvatarIconBeanX avatar_icon) {
                    this.avatar_icon = avatar_icon;
                }

                public String getButton_text() {
                    return button_text;
                }

                public void setButton_text(String button_text) {
                    this.button_text = button_text;
                }

                public String getComment_info() {
                    return comment_info;
                }

                public void setComment_info(String comment_info) {
                    this.comment_info = comment_info;
                }

                public String getComment_nickname() {
                    return comment_nickname;
                }

                public void setComment_nickname(String comment_nickname) {
                    this.comment_nickname = comment_nickname;
                }

                public int getComment_time() {
                    return comment_time;
                }

                public void setComment_time(int comment_time) {
                    this.comment_time = comment_time;
                }

                public int getShow_button_number() {
                    return show_button_number;
                }

                public void setShow_button_number(int show_button_number) {
                    this.show_button_number = show_button_number;
                }

                public String getSource() {
                    return source;
                }

                public void setSource(String source) {
                    this.source = source;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public static class AvatarIconBeanX {
                    /**
                     * uri : web.business.image/202002115d0df4ff3f000aa24210a30a
                     * url_list : ["http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202002115d0df4ff3f000aa24210a30a?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202002115d0df4ff3f000aa24210a30a?from=ad","http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202002115d0df4ff3f000aa24210a30a?from=ad"]
                     */

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }
            }

            public static class LabelBean {
                /**
                 * color : #14FFFFFF
                 * color_text : #7FFFFFFF
                 * text : 广告
                 * type : 4
                 */

                private String color;
                private String color_text;
                private String text;
                private int type;

                public String getColor() {
                    return color;
                }

                public void setColor(String color) {
                    this.color = color;
                }

                public String getColor_text() {
                    return color_text;
                }

                public void setColor_text(String color_text) {
                    this.color_text = color_text;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
            }

            public static class TrackUrlListBean {
                /**
                 * uri :
                 * url_list : ["http://g.cn.miaozhen.com/x/k=2155995&p=7X69X&dx=__IPDX__&rt=2&ns=106.121.137.174&ni=__IESID__&v=__LOC__&xa=__ADPLATFORM__&tr=202002131906430100260781490827E832&vg=__AUTOPLAY__&nh=__AUTOREFRESH__&mo=0&m0=a03f240705e409ad&m0a=__DUID__&m1=a03f240705e409ad&m1a=9dea8fbe57a7382e825f0d19014c1a1f&m2=d817477c00e5c39344e361da7f7c400e&m4=__AAID__&m5=__IDFA__&m6=07c3d4db3ea7ef4c72f0aeefe25cd5ec&m6a=2ba10f5753f7e0736097f3c96ae0424a&m11=__OAID__&ls=40.0x116.3x100.0&o="]
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }
        }

        public static class OpenPlatformInfoBean {
            /**
             * raw_data : {"base":{"app_icon":"https://sf1-dycdn-tos.pstatp.com/obj/douyin-web-image/b22313de3911b1169d1064198d589bc1","client_key":"aw7c4z4ej0o3efzd","app_name":"剪映-抖音出品"}}
             */

            private String raw_data;

            public String getRaw_data() {
                return raw_data;
            }

            public void setRaw_data(String raw_data) {
                this.raw_data = raw_data;
            }
        }

        public static class RelationLabelBean {
            /**
             * label_info : 你的关注
             */

            private String label_info;

            public String getLabel_info() {
                return label_info;
            }

            public void setLabel_info(String label_info) {
                this.label_info = label_info;
            }
        }

        public static class MicroAppInfoBean {
            /**
             * app_id : tt768b0036e9a14874
             * app_name : 天天台球
             * icon : https://sf3-ttcdn-tos.pstatp.com/img/developer/app/tt768b0036e9a14874/iconb2794d3~144x144.jpeg
             * orientation : 1
             * schema : sslocal://microgame?app_id=tt768b0036e9a14874&extra=%7B%22event_extra%22%3A%7B%22group_id%22%3A6792792803148598542%7D%7D&meta=%7B%22icon%22%3A%22https%3A%2F%2Fsf3-ttcdn-tos.pstatp.com%2Fimg%2Fdeveloper%2Fapp%2Ftt768b0036e9a14874%2Ficonb2794d3~144x144.jpeg%22%2C%22name%22%3A%22%E5%A4%A9%E5%A4%A9%E5%8F%B0%E7%90%83%22%2C%22orientation%22%3A1%7D&query=%7B%22introducerId%22%3A%22529e559f-eb14-4549-91d1-689aa2b020f6%22%2C%22originalMaterialId%22%3A%22529e559f-eb14-4549-91d1-689aa2b020f6%22%2C%22currentMaterialId%22%3A%22529e559f-eb14-4549-91d1-689aa2b020f6%22%7D
             * state : 1
             * summary : 天天台球，无限撞击，激情对对碰！
             * type : 2
             * description : 体验一杆清台的爽感
             * title : 天天台球，一杆清台
             * card : {"image_url":"https://sf3-ttcdn-tos.pstatp.com/img/developer/app/tt768b0036e9a14874/si838f2c0~noop.image","text":"553w人玩过","wait_time":3}
             */

            private String app_id;
            private String app_name;
            private String icon;
            private int orientation;
            private String schema;
            private int state;
            private String summary;
            private int type;
            private String description;
            private String title;
            private CardBean card;

            public String getApp_id() {
                return app_id;
            }

            public void setApp_id(String app_id) {
                this.app_id = app_id;
            }

            public String getApp_name() {
                return app_name;
            }

            public void setApp_name(String app_name) {
                this.app_name = app_name;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public int getOrientation() {
                return orientation;
            }

            public void setOrientation(int orientation) {
                this.orientation = orientation;
            }

            public String getSchema() {
                return schema;
            }

            public void setSchema(String schema) {
                this.schema = schema;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public CardBean getCard() {
                return card;
            }

            public void setCard(CardBean card) {
                this.card = card;
            }

            public static class CardBean {
                /**
                 * image_url : https://sf3-ttcdn-tos.pstatp.com/img/developer/app/tt768b0036e9a14874/si838f2c0~noop.image
                 * text : 553w人玩过
                 * wait_time : 3
                 */

                private String image_url;
                private String text;
                private int wait_time;

                public String getImage_url() {
                    return image_url;
                }

                public void setImage_url(String image_url) {
                    this.image_url = image_url;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getWait_time() {
                    return wait_time;
                }

                public void setWait_time(int wait_time) {
                    this.wait_time = wait_time;
                }
            }
        }

        public static class MixInfoBean {
            /**
             * mix_id : 6792861205561083918
             * mix_name : 斯诺克不可思议系列
             * cover_url : {"uri":"tos-cn-i-0813/cd3b0dffd4c64b1d84ae1bcb598e37ba","url_list":["https://p3-dy.byteimg.com/obj/tos-cn-i-0813/cd3b0dffd4c64b1d84ae1bcb598e37ba?from=2563711402","https://p29-dy.byteimg.com/obj/tos-cn-i-0813/cd3b0dffd4c64b1d84ae1bcb598e37ba?from=2563711402","https://p9-dy.byteimg.com/obj/tos-cn-i-0813/cd3b0dffd4c64b1d84ae1bcb598e37ba?from=2563711402"],"width":720,"height":720}
             * status : {"status":2,"is_collected":0}
             * statis : {"play_vv":0,"collect_vv":0,"current_episode":1,"updated_to_episode":13}
             * desc : 这里收录的那些斯诺克力神奇的进球，解球，那些搞笑的瞬间！
             * extra : {"first_reviewed":1,"next_info":{"cover":"tos-cn-i-0813/cd3b0dffd4c64b1d84ae1bcb598e37ba","desc":"这里收录的那些斯诺克力神奇的进球，解球，那些搞笑的瞬间！","name":"斯诺克不可思议系列"}}
             * share_info : {"share_url":"https://www.iesdouyin.com/share/mix/detail/6792861205561083918/?schema_type=24&object_id=6792861205561083918","share_weibo_desc":"这么有趣的合集，不能只有我一个人知道吧","share_desc":"在抖音，记录美好生活","share_title":"这么有趣的合集，不能只有我一个人知道吧","share_title_myself":"","share_title_other":""}
             */

            private String mix_id;
            private String mix_name;
            private CoverUrlBeanX cover_url;
            private StatusBeanX status;
            private StatisBean statis;
            private String desc;
            private String extra;
            private ShareInfoBeanXX share_info;

            public String getMix_id() {
                return mix_id;
            }

            public void setMix_id(String mix_id) {
                this.mix_id = mix_id;
            }

            public String getMix_name() {
                return mix_name;
            }

            public void setMix_name(String mix_name) {
                this.mix_name = mix_name;
            }

            public CoverUrlBeanX getCover_url() {
                return cover_url;
            }

            public void setCover_url(CoverUrlBeanX cover_url) {
                this.cover_url = cover_url;
            }

            public StatusBeanX getStatus() {
                return status;
            }

            public void setStatus(StatusBeanX status) {
                this.status = status;
            }

            public StatisBean getStatis() {
                return statis;
            }

            public void setStatis(StatisBean statis) {
                this.statis = statis;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getExtra() {
                return extra;
            }

            public void setExtra(String extra) {
                this.extra = extra;
            }

            public ShareInfoBeanXX getShare_info() {
                return share_info;
            }

            public void setShare_info(ShareInfoBeanXX share_info) {
                this.share_info = share_info;
            }

            public static class CoverUrlBeanX {
                /**
                 * uri : tos-cn-i-0813/cd3b0dffd4c64b1d84ae1bcb598e37ba
                 * url_list : ["https://p3-dy.byteimg.com/obj/tos-cn-i-0813/cd3b0dffd4c64b1d84ae1bcb598e37ba?from=2563711402","https://p29-dy.byteimg.com/obj/tos-cn-i-0813/cd3b0dffd4c64b1d84ae1bcb598e37ba?from=2563711402","https://p9-dy.byteimg.com/obj/tos-cn-i-0813/cd3b0dffd4c64b1d84ae1bcb598e37ba?from=2563711402"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class StatusBeanX {
                /**
                 * status : 2
                 * is_collected : 0
                 */

                private int status;
                private int is_collected;

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public int getIs_collected() {
                    return is_collected;
                }

                public void setIs_collected(int is_collected) {
                    this.is_collected = is_collected;
                }
            }

            public static class StatisBean {
                /**
                 * play_vv : 0
                 * collect_vv : 0
                 * current_episode : 1
                 * updated_to_episode : 13
                 */

                private int play_vv;
                private int collect_vv;
                private int current_episode;
                private int updated_to_episode;

                public int getPlay_vv() {
                    return play_vv;
                }

                public void setPlay_vv(int play_vv) {
                    this.play_vv = play_vv;
                }

                public int getCollect_vv() {
                    return collect_vv;
                }

                public void setCollect_vv(int collect_vv) {
                    this.collect_vv = collect_vv;
                }

                public int getCurrent_episode() {
                    return current_episode;
                }

                public void setCurrent_episode(int current_episode) {
                    this.current_episode = current_episode;
                }

                public int getUpdated_to_episode() {
                    return updated_to_episode;
                }

                public void setUpdated_to_episode(int updated_to_episode) {
                    this.updated_to_episode = updated_to_episode;
                }
            }

            public static class ShareInfoBeanXX {
                /**
                 * share_url : https://www.iesdouyin.com/share/mix/detail/6792861205561083918/?schema_type=24&object_id=6792861205561083918
                 * share_weibo_desc : 这么有趣的合集，不能只有我一个人知道吧
                 * share_desc : 在抖音，记录美好生活
                 * share_title : 这么有趣的合集，不能只有我一个人知道吧
                 * share_title_myself :
                 * share_title_other :
                 */

                private String share_url;
                private String share_weibo_desc;
                private String share_desc;
                private String share_title;
                private String share_title_myself;
                private String share_title_other;

                public String getShare_url() {
                    return share_url;
                }

                public void setShare_url(String share_url) {
                    this.share_url = share_url;
                }

                public String getShare_weibo_desc() {
                    return share_weibo_desc;
                }

                public void setShare_weibo_desc(String share_weibo_desc) {
                    this.share_weibo_desc = share_weibo_desc;
                }

                public String getShare_desc() {
                    return share_desc;
                }

                public void setShare_desc(String share_desc) {
                    this.share_desc = share_desc;
                }

                public String getShare_title() {
                    return share_title;
                }

                public void setShare_title(String share_title) {
                    this.share_title = share_title;
                }

                public String getShare_title_myself() {
                    return share_title_myself;
                }

                public void setShare_title_myself(String share_title_myself) {
                    this.share_title_myself = share_title_myself;
                }

                public String getShare_title_other() {
                    return share_title_other;
                }

                public void setShare_title_other(String share_title_other) {
                    this.share_title_other = share_title_other;
                }
            }
        }

        public static class ChaListBean {
            /**
             * cid : 1631946134816775
             * cha_name : 酱式vlog
             * desc :
             * schema : aweme://aweme/challenge/detail?cid=1631946134816775
             * author : {"followers_detail":null,"platform_sync_info":null,"geofencing":null,"cover_url":null,"item_list":null,"new_story_cover":null,"type_label":null,"ad_cover_url":null,"relative_users":null,"cha_list":null,"need_points":null,"homepage_bottom_toast":null}
             * user_count : 0
             * share_info : {"share_url":"https://www.iesdouyin.com/share/challenge/1631946134816775/?u_code=11hm6d42m","share_weibo_desc":"我在抖音参加#酱式vlog，超多有趣音乐短视频！赶快来玩！戳这里>>","share_desc":"在抖音，记录美好生活","share_title":"我在抖音参加#酱式vlog，超多有趣音乐短视频！赶快来玩！戳这里>>","bool_persist":0,"share_title_myself":"","share_title_other":"","share_signature_url":"https://tiktokv.com/","share_signature_desc":"TikTok: Make Every Second Count","share_quote":""}
             * connect_music : []
             * type : 1
             * sub_type : 0
             * is_pgcshow : false
             * collect_stat : 0
             * is_challenge : 0
             * view_count : 0
             * is_commerce : false
             * hashtag_profile : 2cef200010f74273533c9
             * cha_attrs : null
             */

            private String cid;
            private String cha_name;
            private String desc;
            private String schema;
            private AuthorBeanX author;
            private int user_count;
            private ShareInfoBeanXXX share_info;
            private int type;
            private int sub_type;
            private boolean is_pgcshow;
            private int collect_stat;
            private int is_challenge;
            private int view_count;
            private boolean is_commerce;
            private String hashtag_profile;
            private Object cha_attrs;
            private List<?> connect_music;

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getCha_name() {
                return cha_name;
            }

            public void setCha_name(String cha_name) {
                this.cha_name = cha_name;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getSchema() {
                return schema;
            }

            public void setSchema(String schema) {
                this.schema = schema;
            }

            public AuthorBeanX getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBeanX author) {
                this.author = author;
            }

            public int getUser_count() {
                return user_count;
            }

            public void setUser_count(int user_count) {
                this.user_count = user_count;
            }

            public ShareInfoBeanXXX getShare_info() {
                return share_info;
            }

            public void setShare_info(ShareInfoBeanXXX share_info) {
                this.share_info = share_info;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getSub_type() {
                return sub_type;
            }

            public void setSub_type(int sub_type) {
                this.sub_type = sub_type;
            }

            public boolean isIs_pgcshow() {
                return is_pgcshow;
            }

            public void setIs_pgcshow(boolean is_pgcshow) {
                this.is_pgcshow = is_pgcshow;
            }

            public int getCollect_stat() {
                return collect_stat;
            }

            public void setCollect_stat(int collect_stat) {
                this.collect_stat = collect_stat;
            }

            public int getIs_challenge() {
                return is_challenge;
            }

            public void setIs_challenge(int is_challenge) {
                this.is_challenge = is_challenge;
            }

            public int getView_count() {
                return view_count;
            }

            public void setView_count(int view_count) {
                this.view_count = view_count;
            }

            public boolean isIs_commerce() {
                return is_commerce;
            }

            public void setIs_commerce(boolean is_commerce) {
                this.is_commerce = is_commerce;
            }

            public String getHashtag_profile() {
                return hashtag_profile;
            }

            public void setHashtag_profile(String hashtag_profile) {
                this.hashtag_profile = hashtag_profile;
            }

            public Object getCha_attrs() {
                return cha_attrs;
            }

            public void setCha_attrs(Object cha_attrs) {
                this.cha_attrs = cha_attrs;
            }

            public List<?> getConnect_music() {
                return connect_music;
            }

            public void setConnect_music(List<?> connect_music) {
                this.connect_music = connect_music;
            }

            public static class AuthorBeanX {
                /**
                 * followers_detail : null
                 * platform_sync_info : null
                 * geofencing : null
                 * cover_url : null
                 * item_list : null
                 * new_story_cover : null
                 * type_label : null
                 * ad_cover_url : null
                 * relative_users : null
                 * cha_list : null
                 * need_points : null
                 * homepage_bottom_toast : null
                 */

                private Object followers_detail;
                private Object platform_sync_info;
                private Object geofencing;
                private Object cover_url;
                private Object item_list;
                private Object new_story_cover;
                private Object type_label;
                private Object ad_cover_url;
                private Object relative_users;
                private Object cha_list;
                private Object need_points;
                private Object homepage_bottom_toast;

                public Object getFollowers_detail() {
                    return followers_detail;
                }

                public void setFollowers_detail(Object followers_detail) {
                    this.followers_detail = followers_detail;
                }

                public Object getPlatform_sync_info() {
                    return platform_sync_info;
                }

                public void setPlatform_sync_info(Object platform_sync_info) {
                    this.platform_sync_info = platform_sync_info;
                }

                public Object getGeofencing() {
                    return geofencing;
                }

                public void setGeofencing(Object geofencing) {
                    this.geofencing = geofencing;
                }

                public Object getCover_url() {
                    return cover_url;
                }

                public void setCover_url(Object cover_url) {
                    this.cover_url = cover_url;
                }

                public Object getItem_list() {
                    return item_list;
                }

                public void setItem_list(Object item_list) {
                    this.item_list = item_list;
                }

                public Object getNew_story_cover() {
                    return new_story_cover;
                }

                public void setNew_story_cover(Object new_story_cover) {
                    this.new_story_cover = new_story_cover;
                }

                public Object getType_label() {
                    return type_label;
                }

                public void setType_label(Object type_label) {
                    this.type_label = type_label;
                }

                public Object getAd_cover_url() {
                    return ad_cover_url;
                }

                public void setAd_cover_url(Object ad_cover_url) {
                    this.ad_cover_url = ad_cover_url;
                }

                public Object getRelative_users() {
                    return relative_users;
                }

                public void setRelative_users(Object relative_users) {
                    this.relative_users = relative_users;
                }

                public Object getCha_list() {
                    return cha_list;
                }

                public void setCha_list(Object cha_list) {
                    this.cha_list = cha_list;
                }

                public Object getNeed_points() {
                    return need_points;
                }

                public void setNeed_points(Object need_points) {
                    this.need_points = need_points;
                }

                public Object getHomepage_bottom_toast() {
                    return homepage_bottom_toast;
                }

                public void setHomepage_bottom_toast(Object homepage_bottom_toast) {
                    this.homepage_bottom_toast = homepage_bottom_toast;
                }
            }

            public static class ShareInfoBeanXXX {
                /**
                 * share_url : https://www.iesdouyin.com/share/challenge/1631946134816775/?u_code=11hm6d42m
                 * share_weibo_desc : 我在抖音参加#酱式vlog，超多有趣音乐短视频！赶快来玩！戳这里>>
                 * share_desc : 在抖音，记录美好生活
                 * share_title : 我在抖音参加#酱式vlog，超多有趣音乐短视频！赶快来玩！戳这里>>
                 * bool_persist : 0
                 * share_title_myself :
                 * share_title_other :
                 * share_signature_url : https://tiktokv.com/
                 * share_signature_desc : TikTok: Make Every Second Count
                 * share_quote :
                 */

                private String share_url;
                private String share_weibo_desc;
                private String share_desc;
                private String share_title;
                private int bool_persist;
                private String share_title_myself;
                private String share_title_other;
                private String share_signature_url;
                private String share_signature_desc;
                private String share_quote;

                public String getShare_url() {
                    return share_url;
                }

                public void setShare_url(String share_url) {
                    this.share_url = share_url;
                }

                public String getShare_weibo_desc() {
                    return share_weibo_desc;
                }

                public void setShare_weibo_desc(String share_weibo_desc) {
                    this.share_weibo_desc = share_weibo_desc;
                }

                public String getShare_desc() {
                    return share_desc;
                }

                public void setShare_desc(String share_desc) {
                    this.share_desc = share_desc;
                }

                public String getShare_title() {
                    return share_title;
                }

                public void setShare_title(String share_title) {
                    this.share_title = share_title;
                }

                public int getBool_persist() {
                    return bool_persist;
                }

                public void setBool_persist(int bool_persist) {
                    this.bool_persist = bool_persist;
                }

                public String getShare_title_myself() {
                    return share_title_myself;
                }

                public void setShare_title_myself(String share_title_myself) {
                    this.share_title_myself = share_title_myself;
                }

                public String getShare_title_other() {
                    return share_title_other;
                }

                public void setShare_title_other(String share_title_other) {
                    this.share_title_other = share_title_other;
                }

                public String getShare_signature_url() {
                    return share_signature_url;
                }

                public void setShare_signature_url(String share_signature_url) {
                    this.share_signature_url = share_signature_url;
                }

                public String getShare_signature_desc() {
                    return share_signature_desc;
                }

                public void setShare_signature_desc(String share_signature_desc) {
                    this.share_signature_desc = share_signature_desc;
                }

                public String getShare_quote() {
                    return share_quote;
                }

                public void setShare_quote(String share_quote) {
                    this.share_quote = share_quote;
                }
            }
        }

        public static class TextExtraBean {
            /**
             * start : 21
             * end : 28
             * type : 1
             * hashtag_name : 酱式vlog
             * hashtag_id : 1631946134816775
             * is_commerce : false
             */

            private int start;
            private int end;
            private int type;
            private String hashtag_name;
            private String hashtag_id;
            private boolean is_commerce;

            public int getStart() {
                return start;
            }

            public void setStart(int start) {
                this.start = start;
            }

            public int getEnd() {
                return end;
            }

            public void setEnd(int end) {
                this.end = end;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getHashtag_name() {
                return hashtag_name;
            }

            public void setHashtag_name(String hashtag_name) {
                this.hashtag_name = hashtag_name;
            }

            public String getHashtag_id() {
                return hashtag_id;
            }

            public void setHashtag_id(String hashtag_id) {
                this.hashtag_id = hashtag_id;
            }

            public boolean isIs_commerce() {
                return is_commerce;
            }

            public void setIs_commerce(boolean is_commerce) {
                this.is_commerce = is_commerce;
            }
        }
    }
}

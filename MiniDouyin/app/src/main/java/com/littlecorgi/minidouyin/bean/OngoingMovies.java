package com.littlecorgi.minidouyin.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 正在上映的电影
 *
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-08 21:44
 */
public class OngoingMovies {

    /**
     * bImg : http://img5.mtime.cn/mg/2018/09/04/124630.14485487.jpg
     * date : 2020-02-03
     * hasPromo : false
     * lid : 290
     * ms : [{"NearestCinemaCount":1,"NearestDay":1580630400,"NearestShowtimeCount":1,"aN1":"巩俐","aN2":"黄渤","actors":"巩俐 / 黄渤 / 吴刚 / 彭昱畅","cC":1,"commonSpecial":"中国女排拼搏奋进的热血历程","d":"135","dN":"陈可辛","def":0,"id":254336,"img":"http://img5.mtime.cn/mt/2020/01/19/095651.33942967_1280X720X2.jpg","is3D":false,"isDMAX":true,"isFilter":false,"isHasTrailer":true,"isHot":false,"isIMAX":true,"isIMAX3D":false,"isNew":false,"isTicket":true,"m":"","movieId":254336,"movieType":"剧情 / 运动","p":["剧情运动"],"preferentialFlag":false,"r":-1,"rc":0,"rd":"0","rsC":0,"sC":0,"t":"夺冠","tCn":"夺冠","tEn":"Duo Guan","ua":-1,"versions":[{"enum":1,"version":"2D"},{"enum":3,"version":"IMAX"},{"enum":6,"version":"中国巨幕"}],"wantedCount":1636,"year":"2020"},{"NearestCinemaCount":1,"NearestDay":1580630400,"NearestShowtimeCount":1,"aN1":"徐峥","aN2":"黄梅莹","actors":"徐峥 / 黄梅莹 / 袁泉 / 贾冰","cC":1,"commonSpecial":"徐峥与母亲的俄罗斯囧途","d":"126","dN":"徐峥","def":0,"id":262895,"img":"http://img5.mtime.cn/mt/2020/01/13/144906.94615802_1280X720X2.jpg","is3D":false,"isDMAX":true,"isFilter":false,"isHasTrailer":true,"isHot":false,"isIMAX":true,"isIMAX3D":false,"isNew":false,"isTicket":true,"m":"","movieId":262895,"movieType":"剧情 / 喜剧","p":["剧情喜剧"],"preferentialFlag":false,"r":6.3,"rc":0,"rd":"20200125","rsC":0,"sC":0,"t":"囧妈","tCn":"囧妈","tEn":"Lost In Russia","ua":-1,"versions":[{"enum":1,"version":"2D"},{"enum":3,"version":"IMAX"},{"enum":6,"version":"中国巨幕"}],"wantedCount":1937,"year":"2020"},{"NearestCinemaCount":1,"NearestDay":1580630400,"NearestShowtimeCount":1,"aN1":"王宝强","aN2":"刘昊然","actors":"王宝强 / 刘昊然 / 妻夫木聪 / 托尼·贾","cC":1,"commonSpecial":"王宝强刘昊然空降东京破案","d":"136","dN":"陈思诚","def":0,"id":254785,"img":"http://img5.mtime.cn/mt/2019/12/18/101618.39683289_1280X720X2.jpg","is3D":false,"isDMAX":true,"isFilter":false,"isHasTrailer":true,"isHot":false,"isIMAX":true,"isIMAX3D":false,"isNew":false,"isTicket":true,"m":"","movieId":254785,"movieType":"喜剧 / 悬疑","p":["喜剧悬疑"],"preferentialFlag":false,"r":-1,"rc":0,"rd":"0","rsC":0,"sC":0,"t":"唐人街探案3","tCn":"唐人街探案3","tEn":"Detective Chinatown 3","ua":-1,"versions":[{"enum":1,"version":"2D"},{"enum":3,"version":"IMAX"},{"enum":6,"version":"中国巨幕"}],"wantedCount":3469,"year":"2020"}]
     * newActivitiesTime : 0
     * promo : {}
     * totalComingMovie : 31
     * voucherMsg :
     */

    private String bImg;
    private String date;
    private boolean hasPromo;
    private int lid;
    private int newActivitiesTime;
    private PromoBean promo;
    private int totalComingMovie;
    private String voucherMsg;
    private List<MsBean> ms;

    public String getBImg() {
        return bImg;
    }

    public void setBImg(String bImg) {
        this.bImg = bImg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isHasPromo() {
        return hasPromo;
    }

    public void setHasPromo(boolean hasPromo) {
        this.hasPromo = hasPromo;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getNewActivitiesTime() {
        return newActivitiesTime;
    }

    public void setNewActivitiesTime(int newActivitiesTime) {
        this.newActivitiesTime = newActivitiesTime;
    }

    public PromoBean getPromo() {
        return promo;
    }

    public void setPromo(PromoBean promo) {
        this.promo = promo;
    }

    public int getTotalComingMovie() {
        return totalComingMovie;
    }

    public void setTotalComingMovie(int totalComingMovie) {
        this.totalComingMovie = totalComingMovie;
    }

    public String getVoucherMsg() {
        return voucherMsg;
    }

    public void setVoucherMsg(String voucherMsg) {
        this.voucherMsg = voucherMsg;
    }

    public List<MsBean> getMs() {
        return ms;
    }

    public void setMs(List<MsBean> ms) {
        this.ms = ms;
    }

    public static class PromoBean {
    }

    public static class MsBean {
        /**
         * NearestCinemaCount : 1
         * NearestDay : 1580630400
         * NearestShowtimeCount : 1
         * aN1 : 巩俐
         * aN2 : 黄渤
         * actors : 巩俐 / 黄渤 / 吴刚 / 彭昱畅
         * cC : 1
         * commonSpecial : 中国女排拼搏奋进的热血历程
         * d : 135
         * dN : 陈可辛
         * def : 0
         * id : 254336
         * img : http://img5.mtime.cn/mt/2020/01/19/095651.33942967_1280X720X2.jpg
         * is3D : false
         * isDMAX : true
         * isFilter : false
         * isHasTrailer : true
         * isHot : false
         * isIMAX : true
         * isIMAX3D : false
         * isNew : false
         * isTicket : true
         * m :
         * movieId : 254336
         * movieType : 剧情 / 运动
         * p : ["剧情运动"]
         * preferentialFlag : false
         * r : -1
         * rc : 0
         * rd : 0
         * rsC : 0
         * sC : 0
         * t : 夺冠
         * tCn : 夺冠
         * tEn : Duo Guan
         * ua : -1
         * versions : [{"enum":1,"version":"2D"},{"enum":3,"version":"IMAX"},{"enum":6,"version":"中国巨幕"}]
         * wantedCount : 1636
         * year : 2020
         */

        private int NearestCinemaCount;
        private int NearestDay;
        private int NearestShowtimeCount;
        private String aN1;
        private String aN2;
        private String actors;
        private int cC;
        private String commonSpecial;
        private String d;
        private String dN;
        private int def;
        private int id;
        private String img;
        private boolean is3D;
        private boolean isDMAX;
        private boolean isFilter;
        private boolean isHasTrailer;
        private boolean isHot;
        private boolean isIMAX;
        private boolean isIMAX3D;
        private boolean isNew;
        private boolean isTicket;
        private String m;
        private int movieId;
        private String movieType;
        private boolean preferentialFlag;
        private float r;
        private int rc;
        private String rd;
        private int rsC;
        private int sC;
        private String t;
        private String tCn;
        private String tEn;
        private int ua;
        private int wantedCount;
        private String year;
        private List<String> p;
        private List<VersionsBean> versions;

        public int getNearestCinemaCount() {
            return NearestCinemaCount;
        }

        public void setNearestCinemaCount(int NearestCinemaCount) {
            this.NearestCinemaCount = NearestCinemaCount;
        }

        public int getNearestDay() {
            return NearestDay;
        }

        public void setNearestDay(int NearestDay) {
            this.NearestDay = NearestDay;
        }

        public int getNearestShowtimeCount() {
            return NearestShowtimeCount;
        }

        public void setNearestShowtimeCount(int NearestShowtimeCount) {
            this.NearestShowtimeCount = NearestShowtimeCount;
        }

        public String getAN1() {
            return aN1;
        }

        public void setAN1(String aN1) {
            this.aN1 = aN1;
        }

        public String getAN2() {
            return aN2;
        }

        public void setAN2(String aN2) {
            this.aN2 = aN2;
        }

        public String getActors() {
            return actors;
        }

        public void setActors(String actors) {
            this.actors = actors;
        }

        public int getCC() {
            return cC;
        }

        public void setCC(int cC) {
            this.cC = cC;
        }

        public String getCommonSpecial() {
            return commonSpecial;
        }

        public void setCommonSpecial(String commonSpecial) {
            this.commonSpecial = commonSpecial;
        }

        public String getD() {
            return d;
        }

        public void setD(String d) {
            this.d = d;
        }

        public String getDN() {
            return dN;
        }

        public void setDN(String dN) {
            this.dN = dN;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public boolean isIs3D() {
            return is3D;
        }

        public void setIs3D(boolean is3D) {
            this.is3D = is3D;
        }

        public boolean isIsDMAX() {
            return isDMAX;
        }

        public void setIsDMAX(boolean isDMAX) {
            this.isDMAX = isDMAX;
        }

        public boolean isIsFilter() {
            return isFilter;
        }

        public void setIsFilter(boolean isFilter) {
            this.isFilter = isFilter;
        }

        public boolean isIsHasTrailer() {
            return isHasTrailer;
        }

        public void setIsHasTrailer(boolean isHasTrailer) {
            this.isHasTrailer = isHasTrailer;
        }

        public boolean isIsHot() {
            return isHot;
        }

        public void setIsHot(boolean isHot) {
            this.isHot = isHot;
        }

        public boolean isIsIMAX() {
            return isIMAX;
        }

        public void setIsIMAX(boolean isIMAX) {
            this.isIMAX = isIMAX;
        }

        public boolean isIsIMAX3D() {
            return isIMAX3D;
        }

        public void setIsIMAX3D(boolean isIMAX3D) {
            this.isIMAX3D = isIMAX3D;
        }

        public boolean isIsNew() {
            return isNew;
        }

        public void setIsNew(boolean isNew) {
            this.isNew = isNew;
        }

        public boolean isIsTicket() {
            return isTicket;
        }

        public void setIsTicket(boolean isTicket) {
            this.isTicket = isTicket;
        }

        public String getM() {
            return m;
        }

        public void setM(String m) {
            this.m = m;
        }

        public int getMovieId() {
            return movieId;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public String getMovieType() {
            return movieType;
        }

        public void setMovieType(String movieType) {
            this.movieType = movieType;
        }

        public boolean isPreferentialFlag() {
            return preferentialFlag;
        }

        public void setPreferentialFlag(boolean preferentialFlag) {
            this.preferentialFlag = preferentialFlag;
        }

        public float getR() {
            return r;
        }

        public void setR(float r) {
            this.r = r;
        }

        public int getRc() {
            return rc;
        }

        public void setRc(int rc) {
            this.rc = rc;
        }

        public String getRd() {
            return rd;
        }

        public void setRd(String rd) {
            this.rd = rd;
        }

        public int getRsC() {
            return rsC;
        }

        public void setRsC(int rsC) {
            this.rsC = rsC;
        }

        public int getSC() {
            return sC;
        }

        public void setSC(int sC) {
            this.sC = sC;
        }

        public String getT() {
            return t;
        }

        public void setT(String t) {
            this.t = t;
        }

        public String getTCn() {
            return tCn;
        }

        public void setTCn(String tCn) {
            this.tCn = tCn;
        }

        public String getTEn() {
            return tEn;
        }

        public void setTEn(String tEn) {
            this.tEn = tEn;
        }

        public int getUa() {
            return ua;
        }

        public void setUa(int ua) {
            this.ua = ua;
        }

        public int getWantedCount() {
            return wantedCount;
        }

        public void setWantedCount(int wantedCount) {
            this.wantedCount = wantedCount;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public List<String> getP() {
            return p;
        }

        public void setP(List<String> p) {
            this.p = p;
        }

        public List<VersionsBean> getVersions() {
            return versions;
        }

        public void setVersions(List<VersionsBean> versions) {
            this.versions = versions;
        }

        public static class VersionsBean {
            /**
             * enum : 1
             * version : 2D
             */

            @SerializedName("enum")
            private int enumX;
            private String version;

            public int getEnumX() {
                return enumX;
            }

            public void setEnumX(int enumX) {
                this.enumX = enumX;
            }

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }
        }
    }
}

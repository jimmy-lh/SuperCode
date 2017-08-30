package com.cyhd.portalmvp.mvp.network.api;

import com.cyhd.portalmvp.mvp.beanResult.ActiveResult;
import com.cyhd.portalmvp.mvp.beanResult.AddBookMarkResult;
import com.cyhd.portalmvp.mvp.beanResult.AddFavoriteResult;
import com.cyhd.portalmvp.mvp.beanResult.AddHistoryResult;
import com.cyhd.portalmvp.mvp.beanResult.AssociateResult;
import com.cyhd.portalmvp.mvp.beanResult.AuthResult;
import com.cyhd.portalmvp.mvp.beanResult.ColumnPriceResult;
import com.cyhd.portalmvp.mvp.beanResult.DelBookMarkResult;
import com.cyhd.portalmvp.mvp.beanResult.DelFavoriteResult;
import com.cyhd.portalmvp.mvp.beanResult.ExchangeResult;
import com.cyhd.portalmvp.mvp.beanResult.FilterByContentResult;
import com.cyhd.portalmvp.mvp.beanResult.FilterGenreResult;
import com.cyhd.portalmvp.mvp.beanResult.GetAllbackProgramResult;
import com.cyhd.portalmvp.mvp.beanResult.GetAuthInfoResult;
import com.cyhd.portalmvp.mvp.beanResult.GetBTVProgramGuidesResult;
import com.cyhd.portalmvp.mvp.beanResult.GetBookMarksResult;
import com.cyhd.portalmvp.mvp.beanResult.GetColumnContentsResult;
import com.cyhd.portalmvp.mvp.beanResult.GetColumnRecommendResourceResult;
import com.cyhd.portalmvp.mvp.beanResult.GetFavoritesResult;
import com.cyhd.portalmvp.mvp.beanResult.GetItemDataResult;
import com.cyhd.portalmvp.mvp.beanResult.GetRecommendsResult;
import com.cyhd.portalmvp.mvp.beanResult.GetShelveDataResult;
import com.cyhd.portalmvp.mvp.beanResult.GetShelveVersionResult;
import com.cyhd.portalmvp.mvp.beanResult.GetTodayProgramResult;
import com.cyhd.portalmvp.mvp.beanResult.HeartBeatResult;
import com.cyhd.portalmvp.mvp.beanResult.LoginResult;
import com.cyhd.portalmvp.mvp.beanResult.LoveClickResult;
import com.cyhd.portalmvp.mvp.beanResult.ModifyOttAccountResult;
import com.cyhd.portalmvp.mvp.beanResult.OceanpaymentConfrimOrderResult;
import com.cyhd.portalmvp.mvp.beanResult.OnlineOrderResult;
import com.cyhd.portalmvp.mvp.beanResult.PriceResult;
import com.cyhd.portalmvp.mvp.beanResult.QueryLoveClickFlagResult;
import com.cyhd.portalmvp.mvp.beanResult.QueryOttAccountResult;
import com.cyhd.portalmvp.mvp.beanResult.RegisterResult;
import com.cyhd.portalmvp.mvp.beanResult.SearchByContentResult;
import com.cyhd.portalmvp.mvp.beanResult.SearchByNameResult;
import com.cyhd.portalmvp.mvp.beanResult.SearchByStarResult;
import com.cyhd.portalmvp.mvp.beanResult.StartPlayBTVResult;
import com.cyhd.portalmvp.mvp.beanResult.StartPlayLiveResult;
import com.cyhd.portalmvp.mvp.beanResult.StartPlayVODResult;
import com.cyhd.portalmvp.mvp.beanResult.UpdateBookMarkResult;
import com.cyhd.portalmvp.mvp.beanResult.UpdateFavoriteResult;
import com.cyhd.portalmvp.mvp.beanResult.UpdateOrderStatusResult;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;


public interface PortalApi {

    /**
     * 4.1.1portal_online_01：用户注册接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("register")
    Observable<RegisterResult> register(@Body String json);

    /**
     * 4.1.2portal_online_02：用户激活接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("active")
    Observable<ActiveResult> active(@Body String json);

    /**
     * 4.1.3portal_online_03：用户认证接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("login")
    Observable<LoginResult> login(@Body String json);

    /**
     * 4.1.4portal_online_04：用户心跳接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("heartbeat")
    Observable<HeartBeatResult> heartBeat(@Body String json);

    /**
     * 4.1.5portal_online_05：产品批价接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("price")
    Observable<PriceResult> price(@Body String json);

    /**
     * 4.1.6portal_online_06：用户鉴权接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("auth")
    Observable<AuthResult> auth(@Body String json);

    /**
     * 4.1.7portal_online_07：兑换码兑换接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("exchange")
    Observable<ExchangeResult> exchange(@Body String json);

    /**
     * 4.1.8portal_online_08：在线订购接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("onlineOrder")
    Observable<OnlineOrderResult> onlineOrder(@Body String json);

    /**
     * 4.1.9portal_online_09：在线订购状态更新接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("updateOrderStatus")
    Observable<UpdateOrderStatusResult> updateOrderStatus(@Body String json);

    /**
     * 4.1.10portal_online_10：钱海确认接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("oceanaymentConfrimOrder")
    Observable<OceanpaymentConfrimOrderResult> oceanpaymentConfrimOrder(@Body String json);

    /**
     * 4.1.11portal_online_11：用户信息获取接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("queryOttAccount")
    Observable<QueryOttAccountResult> queryOttAccount(@Body String json);

    /**
     * 4.1.12portal_online_12：用户信息修改接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("modifyOttAccount")
    Observable<ModifyOttAccountResult> modifyOttAccount(@Body String json);

    /**
     * 4.1.13portal_online_13：用户授权信息获取接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("getAuthInfo")
    Observable<GetAuthInfoResult> getAuthInfo(@Body String json);

    /**
     * 4.1.14portal_online_14：获取栏目信息接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("getColumnContents")
    Observable<GetColumnContentsResult> getColumnContents(@Body String json);

    /**
     * /**
     * 4.1.15portal_online_15：栏目批价接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("columnPrice")
    Observable<ColumnPriceResult> columnPrice(@Body String json);

    /**
     * 4.1.16portal_online_16：获取栏目上架数据版本号信息
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("getShelveVersion")
    Observable<GetShelveVersionResult> getShelveVersion(@Body String json);

    /**
     * 4.1.17portal_online_17：获取栏目上架数据接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("getShelveData")
    Observable<GetShelveDataResult> getShelveData(@Body String json);

    /**
     * 4.1.18portal_online_18：获取频道回看节目单接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("getBTVProgramGuides")
    Observable<GetBTVProgramGuidesResult> getBTVProgramGuides(@Body String json);

    /**
     * 4.1.19portal_online_19：获取栏目推荐信息接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("getColumnRecommendResource")
    Observable<GetColumnRecommendResourceResult> getColumnRecommendResource(@Body String json);

    /**
     * 4.1.20portal_online_20：获取剧集/节目详情接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("getItemData")
    Observable<GetItemDataResult> getItemData(@Body String json);

    /**
     * 4.1.21portal_online_21：点播鉴权接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("startPlayVOD")
    Observable<StartPlayVODResult> startPlayVOD(@Body String json);

    /**
     * 4.1.22portal_online_22：直播鉴权接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("startPlayLive")
    Observable<StartPlayLiveResult> startPlayLive(@Body String json);

    /**
     * 4.1.23portal_online_23：回看鉴权接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("startPlayBTV")
    Observable<StartPlayBTVResult> startPlayBTV(@Body String json);

    /**
     * 4.1.24portal_online_24：点赞/取消点赞接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("loveClick")
    Observable<LoveClickResult> loveClick(@Body String json);

    /**
     * 4.1.25portal_online_25：获取当前用户是否点赞接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("queryLoveClickFlag")
    Observable<QueryLoveClickFlagResult> queryLoveClickFlag(@Body String json);

    /**
     * 4.1.26portal_online_26：获取用户收藏列表
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("getFavorites")
    Observable<GetFavoritesResult> getFavorites(@Body String json);

    /**
     * 4.1.27portal_online_27：用户收藏信息新增
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("addFavorite")
    Observable<AddFavoriteResult> addFavorite(@Body String json);

    /**
     * 4.1.28portal_online_28：用户收藏信息修改
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("updateFavorite")
    Observable<UpdateFavoriteResult> updateFavorite(@Body String json);

    /**
     * 4.1.29portal_online_29：用户收藏信息删除
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("delFavorite")
    Observable<DelFavoriteResult> delFavorite(@Body String json);

    /**
     * 4.1.30portal_online_30：获取用户书签信息列表
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("getBookMarks")
    Observable<GetBookMarksResult> getBookMarks(@Body String json);

    /**
     * 4.1.31portal_online_31：用户书签信息新增
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("addBookMark")
    Observable<AddBookMarkResult> addBookMark(@Body String json);

    /**
     * 4.1.32portal_online_32：用户书签信息修改
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("updateBookMark")
    Observable<UpdateBookMarkResult> updateBookMark(@Body String json);

    /**
     * 4.1.33portal_online_33：用户书签信息删除
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("delBookMark")
    Observable<DelBookMarkResult> delBookMark(@Body String json);

    /**
     * 4.1.34portal_online_34：用户播放历史信息记录
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("addHistory")
    Observable<AddHistoryResult> addHistory(@Body String json);

    /**
     * 4.1.35portal_online_35：获取推荐位信息
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("getRecommends")
    Observable<GetRecommendsResult> getRecommends(@Body String json);

    /**
     * 4.1.36portal_online_36：影片名称搜索接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("searchByName")
    Observable<SearchByNameResult> searchByName(@Body String json);

    /**
     * 4.1.37portal_online_37：导演OR演员搜索接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("searchByStar")
    Observable<SearchByStarResult> searchByStar(@Body String json);

    /**
     * 4.1.38portal_online_38：相似影片搜索接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("searchByContent")
    Observable<SearchByContentResult> searchByContent(@Body String json);

    /**
     * 4.1.39portal_online_39：用户节目筛选接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("filterByContent")
    Observable<FilterByContentResult> filterByContent(@Body String json);

    /**
     * 4.1.40portal_online_40：获取用户节目筛选类型接口
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("filterGenre")
    Observable<FilterGenreResult> filterGenre(@Body String json);

    /**
     * 4.1.41portal_online_41：获取关键字联想
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("associate")
    Observable<AssociateResult> associate(@Body String json);

    /**
     * 4.1.42portal_online_42：获取全部上架频道当天节目单
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("getTodayProgram ")
    Observable<GetTodayProgramResult> getTodayProgram(@Body String json);

    /**
     * 4.1.43portal_online_43：获取全部上架频道7天回看节目单
     */
    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("getAllbackProgram")
    Observable<GetAllbackProgramResult> getAllbackProgram(@Body String json);


}

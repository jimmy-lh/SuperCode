package com.cyhd.portalmvp.mvp.base;

import com.cyhd.portalmvp.mvp.beanResult.ActiveResult;
import com.cyhd.portalmvp.mvp.beanResult.AddBookMarkResult;
import com.cyhd.portalmvp.mvp.beanResult.AddFavoriteResult;
import com.cyhd.portalmvp.mvp.beanResult.AddHistoryResult;
import com.cyhd.portalmvp.mvp.beanResult.DataCollectResult;
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
import com.cyhd.portalmvp.mvp.beanResult.GetIPResult;
import com.cyhd.portalmvp.mvp.beanResult.GetItemDataResult;
import com.cyhd.portalmvp.mvp.beanResult.GetLivePlayUrlResult;
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
import com.cyhd.portalmvp.mvp.beanResult.SlbBeanResult;
import com.cyhd.portalmvp.mvp.beanResult.StartPlayBTVResult;
import com.cyhd.portalmvp.mvp.beanResult.StartPlayLiveResult;
import com.cyhd.portalmvp.mvp.beanResult.StartPlayVODResult;
import com.cyhd.portalmvp.mvp.beanResult.UpdateBookMarkResult;
import com.cyhd.portalmvp.mvp.beanResult.UpdateFavoriteResult;
import com.cyhd.portalmvp.mvp.beanResult.UpdateOrderStatusResult;
import com.cyhd.portalmvp.mvp.beanResult.XmlEpgsResult;

/**
 * 请求服务器返回的bean需要在此定义接口
 * 此接口主要是为了在model实现类中统一Rxjava的onNext返回处理
 * 泛型需对应Subscriber的方法onNext中的参数
 */
public interface BaseBeanResult<T> {
    void onNext(T result);

    void onError(Throwable e);

    interface IGetIPResult extends BaseBeanResult<GetIPResult> {
    }

    interface IXmlEpgsResult extends BaseBeanResult<XmlEpgsResult> {
    }

    interface IApkPlayResult extends BaseBeanResult<DataCollectResult> {
    }

    interface IGetLivePlayUrlResult extends BaseBeanResult<GetLivePlayUrlResult> {
    }

    interface ISlbBeanResult extends BaseBeanResult<SlbBeanResult> {
    }

    ///////////////////////////////////////////////////////////////////////////////
    /////////////////   portal start
    ///////////////////////////////////////////////////////////////////////////////
    interface IRegisterResult extends BaseBeanResult<RegisterResult> {
    }

    interface IActiveResult extends BaseBeanResult<ActiveResult> {
    }

    interface ILoginResult extends BaseBeanResult<LoginResult> {
    }

    interface IHeartBeatResult extends BaseBeanResult<HeartBeatResult> {
    }

    interface IPriceResult extends BaseBeanResult<PriceResult> {
    }

    interface IAuthResult extends BaseBeanResult<AuthResult> {
    }

    interface IExchangeResult extends BaseBeanResult<ExchangeResult> {
    }

    interface IOnlineOrderResult extends BaseBeanResult<OnlineOrderResult> {
    }

    interface IUpdateOrderStatusResult extends BaseBeanResult<UpdateOrderStatusResult> {
    }

    interface IOceanpaymentConfrimOrderResult extends BaseBeanResult<OceanpaymentConfrimOrderResult> {
    }

    interface IQueryOttAccountResult extends BaseBeanResult<QueryOttAccountResult> {
    }

    interface IModifyOttAccountResult extends BaseBeanResult<ModifyOttAccountResult> {
    }

    interface IGetAuthInfoResult extends BaseBeanResult<GetAuthInfoResult> {
    }

    interface IGetColumnContentsResult extends BaseBeanResult<GetColumnContentsResult> {
    }

    interface IColumnPriceResult extends BaseBeanResult<ColumnPriceResult> {
    }

    interface IGetShelveVersionResult extends BaseBeanResult<GetShelveVersionResult> {
    }

    interface IGetShelveDataResult extends BaseBeanResult<GetShelveDataResult> {
    }

    interface IGetBTVProgramGuidesResult extends BaseBeanResult<GetBTVProgramGuidesResult> {
    }

    interface IGetColumnRecommendResourceResult extends BaseBeanResult<GetColumnRecommendResourceResult> {
    }

    interface IGetItemDataResult extends BaseBeanResult<GetItemDataResult> {
    }

    interface IStartPlayVODResult extends BaseBeanResult<StartPlayVODResult> {
    }

    interface IStartPlayLiveResult extends BaseBeanResult<StartPlayLiveResult> {
    }

    interface IStartPlayBTVResult extends BaseBeanResult<StartPlayBTVResult> {
    }

    interface ILoveClickResult extends BaseBeanResult<LoveClickResult> {
    }

    interface IQueryLoveClickFlagResult extends BaseBeanResult<QueryLoveClickFlagResult> {
    }

    interface IGetFavoritesResult extends BaseBeanResult<GetFavoritesResult> {
    }

    interface IAddFavoriteResult extends BaseBeanResult<AddFavoriteResult> {
    }

    interface IUpdateFavoriteResult extends BaseBeanResult<UpdateFavoriteResult> {
    }

    interface IDelFavoriteResult extends BaseBeanResult<DelFavoriteResult> {
    }

    interface IGetBookMarksResult extends BaseBeanResult<GetBookMarksResult> {
    }

    interface IAddBookMarkResult extends BaseBeanResult<AddBookMarkResult> {
    }

    interface IUpdateBookMarkResult extends BaseBeanResult<UpdateBookMarkResult> {
    }

    interface IDelBookMarkResult extends BaseBeanResult<DelBookMarkResult> {
    }

    interface IAddHistoryResult extends BaseBeanResult<AddHistoryResult> {
    }

    interface IGetRecommendsResult extends BaseBeanResult<GetRecommendsResult> {
    }

    interface ISearchByNameResult extends BaseBeanResult<SearchByNameResult> {
    }

    interface ISearchByStarResult extends BaseBeanResult<SearchByStarResult> {
    }

    interface ISearchByContentResult extends BaseBeanResult<SearchByContentResult> {
    }

    interface IFilterByContentResult extends BaseBeanResult<FilterByContentResult> {
    }

    interface IFilterGenreResult extends BaseBeanResult<FilterGenreResult> {
    }

    interface IAssociateResult extends BaseBeanResult<AssociateResult> {
    }

    interface IGetTodayProgramResult extends BaseBeanResult<GetTodayProgramResult> {
    }

    interface IGetAllbackProgramResult extends BaseBeanResult<GetAllbackProgramResult> {
    }
    ///////////////////////////////////////////////////////////////////////////////
    /////////////////   portal end
    ///////////////////////////////////////////////////////////////////////////////
}
